package net.denobody2.dwarven_bai.event;

import net.denobody2.dwarven_bai.Dwarven_BAI;
import net.denobody2.dwarven_bai.item.custom.DwarvenArmorItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = Dwarven_BAI.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DwarvenEvents {

    @SubscribeEvent
    public static void registerArmorMods(LivingDamageEvent event) {
        int count = 0;
        DamageSource source = event.getSource();
        float amount = event.getAmount();
        LivingEntity entity = event.getEntity();
        List<EquipmentSlot> slots = List.of(EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET);
        for (EquipmentSlot slot : slots) {
            ItemStack stack = entity.getItemBySlot(slot);
            if (stack.getItem() instanceof DwarvenArmorItem armorItem) {
                if(source.is(DamageTypes.MAGIC) || source.is(DamageTypes.INDIRECT_MAGIC) || source.is(DamageTypes.LIGHTNING_BOLT) || source.is(DamageTypes.WITHER) || source.is(DamageTypes.WITHER_SKULL) || source.is(DamageTypes.DRAGON_BREATH)) {
                    count++;
                }
            }
        }
        switch (count){
            case 1:
                event.setAmount(amount-(amount*0.1f));
                //entity.sendSystemMessage(Component.translatable("event.dwarven_bai.damagereduce1"));
                break;
            case 2:
                event.setAmount(amount-(amount*0.2f));
                //entity.sendSystemMessage(Component.translatable("event.dwarven_bai.damagereduce2"));
                break;
            case 3:
                event.setAmount(amount-(amount*0.3f));
                //entity.sendSystemMessage(Component.translatable("event.dwarven_bai.damagereduce3"));
                break;
            case 4:
                event.setAmount(amount-(amount*0.4f));
                //entity.sendSystemMessage(Component.translatable("event.dwarven_bai.damagereduce4"));
                break;
            default:
                //entity.sendSystemMessage(Component.translatable("event.dwarven_bai.damagereduce0"));
                break;
        }
    }



}

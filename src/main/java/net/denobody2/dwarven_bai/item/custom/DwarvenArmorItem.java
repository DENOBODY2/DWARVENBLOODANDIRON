package net.denobody2.dwarven_bai.item.custom;

import com.google.common.collect.ImmutableMap;
import net.denobody2.dwarven_bai.item.DwarvenArmorMaterialRegistry;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class   DwarvenArmorItem extends ArmorItem {

    public boolean on = false;
    public DwarvenArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }
    /*public static Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
                    .put(DwarvenArmorMaterialRegistry.DWARVEN, new MobEffectInstance(MobEffects.INVISIBILITY, 100, 0, false, false))
                    .build();

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        if(!level.isClientSide() && hasFullArmor(player)){
            //if(player.isCrouching()) {
            evaluateArmor(player);
            //} else {
                //on = false;
            //}
        } else {

        }
    }
    private boolean hasFullArmor(Player player){

        ItemStack helmet = player.getInventory().getArmor(3);
        ItemStack chest = player.getInventory().getArmor(2);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack boots = player.getInventory().getArmor(0);

        return !helmet.isEmpty() && !leggings.isEmpty() && !chest.isEmpty() && !boots.isEmpty();
    }
    private void evaluateArmor(Player player){
        for(Map.Entry<ArmorMaterial, MobEffectInstance> entry: MATERIAL_TO_EFFECT_MAP.entrySet()){
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapEffectInstance = entry.getValue();
            if(player.isCrouching()){
                if(hasPlayerCorrectArmor(mapArmorMaterial, player) && !on){
                    player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2, 0, false, false));
                    on = true;
                } else if (hasPlayerCorrectArmor(mapArmorMaterial, player) && on){
                    player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 2, 0, false, false));
                }
            } else {
                if(on && hasPlayerCorrectArmor(mapArmorMaterial, player)){
                    player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1, 0, false, false));
                }
                on = false;
            }


        }
    }
    private boolean hasPlayerCorrectArmor(ArmorMaterial mapArmorMaterial, Player player){
        for(ItemStack armorStack : player.getArmorSlots()){
            if(!(armorStack.getItem() instanceof ArmorItem)){
                return false;
            }
        }
        ArmorItem boots = ((ArmorItem) player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem) player.getInventory().getArmor(1).getItem());
        ArmorItem chestplate = ((ArmorItem) player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem) player.getInventory().getArmor(3).getItem());


        return boots.getMaterial() == mapArmorMaterial && leggings.getMaterial() == mapArmorMaterial && chestplate.getMaterial() == mapArmorMaterial && helmet.getMaterial() == mapArmorMaterial;
    }
    private void addEffect(Player player, MobEffectInstance mobEffectInstance){
        boolean hasPlayerEffect = player.hasEffect(mobEffectInstance.getEffect());
        if(!hasPlayerEffect){
            player.addEffect(new MobEffectInstance(mobEffectInstance.getEffect(), mobEffectInstance.getDuration(), mobEffectInstance.getAmplifier()));
        }
    }

    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        if(on && (slot.equals(EquipmentSlot.CHEST) || slot.equals(EquipmentSlot.HEAD))){
            return "dwarven_bai:textures/models/armor/dwarven_layer_1_empty.png";
        } else if(!on && (slot.equals(EquipmentSlot.CHEST) || slot.equals(EquipmentSlot.HEAD))) {
            return "dwarven_bai:textures/models/armor/dwarven_layer_1.png";
        } else if(!on && (slot.equals(EquipmentSlot.LEGS))) {
            return "dwarven_bai:textures/models/armor/dwarven_layer_2.png";
        } else if(on && (slot.equals(EquipmentSlot.LEGS) || slot.equals(EquipmentSlot.FEET))) {
            return "dwarven_bai:textures/models/armor/dwarven_layer_2_empty.png";
        } else if (!on && (slot.equals(EquipmentSlot.FEET))){
            return super.getArmorTexture(stack, entity, slot, type);
        }

        return super.getArmorTexture(stack, entity, slot, type);
    }*/
}

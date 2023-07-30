package net.denobody2.dwarven_bai.item;

import net.denobody2.dwarven_bai.Dwarven_BAI;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class DwarvenCreativeTabsRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Dwarven_BAI.MOD_ID);
    public static final RegistryObject<CreativeModeTab> DWARVEN_TAB = CREATIVE_MODE_TABS.register("dwarven_items", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(DwarvenItemRegistry.DWARVEN_STEEL.get())).title(Component.translatable("dwarventab.dwarven_tab")).displayItems((pParameters, pOutput) -> {
                pOutput.accept(DwarvenItemRegistry.DWARVEN_STEEL.get());
                pOutput.accept(DwarvenItemRegistry.DWARVEN_STEEL_HELMET.get());
                pOutput.accept(DwarvenItemRegistry.DWARVEN_STEEL_CHESTPLATE.get());
                pOutput.accept(DwarvenItemRegistry.DWARVEN_STEEL_LEGGINGS.get());
                pOutput.accept(DwarvenItemRegistry.DWARVEN_STEEL_BOOTS.get());

            }).build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

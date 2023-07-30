package net.denobody2.dwarven_bai.item;

import net.denobody2.dwarven_bai.Dwarven_BAI;
import net.denobody2.dwarven_bai.item.custom.DwarvenArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DwarvenItemRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Dwarven_BAI.MOD_ID);


    public static final RegistryObject<Item> DWARVEN_ARMOR_PARTS = ITEMS.register("dwarven_steel", () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> DWARVEN_STEEL_HELMET = ITEMS.register("dwarven_steel_helmet",
            () -> new DwarvenArmorItem(DwarvenArmorMaterialRegistry.DWARVEN, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> DWARVEN_STEEL_CHESTPLATE = ITEMS.register("dwarven_steel_chestplate",
            () -> new DwarvenArmorItem(DwarvenArmorMaterialRegistry.DWARVEN, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> DWARVEN_STEEL_LEGGINGS = ITEMS.register("dwarven_steel_leggings",
            () -> new DwarvenArmorItem(DwarvenArmorMaterialRegistry.DWARVEN, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> DWARVEN_STEEL_BOOTS = ITEMS.register("dwarven_steel_boots",
            () -> new DwarvenArmorItem(DwarvenArmorMaterialRegistry.DWARVEN, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}

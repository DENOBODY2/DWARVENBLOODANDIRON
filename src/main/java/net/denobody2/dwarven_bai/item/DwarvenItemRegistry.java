package net.denobody2.dwarven_bai.item;

import net.denobody2.dwarven_bai.Dwarven_BAI;
import net.denobody2.dwarven_bai.item.custom.DwarvenArmorItem;
import net.denobody2.dwarven_bai.item.custom.InvisArmorItem;
import net.denobody2.dwarven_bai.item.custom.OceanArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DwarvenItemRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Dwarven_BAI.MOD_ID);


    public static final RegistryObject<Item> DWARVEN_ARMOR_PARTS = ITEMS.register("dwarven_armor_parts", () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> DWARVEN_STEEL_HELMET = ITEMS.register("dwarven_steel_helmet",
            () -> new DwarvenArmorItem(DwarvenArmorMaterialRegistry.DWARVEN, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> DWARVEN_STEEL_CHESTPLATE = ITEMS.register("dwarven_steel_chestplate",
            () -> new DwarvenArmorItem(DwarvenArmorMaterialRegistry.DWARVEN, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> DWARVEN_STEEL_LEGGINGS = ITEMS.register("dwarven_steel_leggings",
            () -> new DwarvenArmorItem(DwarvenArmorMaterialRegistry.DWARVEN, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> DWARVEN_STEEL_BOOTS = ITEMS.register("dwarven_steel_boots",
            () -> new DwarvenArmorItem(DwarvenArmorMaterialRegistry.DWARVEN, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> INVIS_HELMET = ITEMS.register("invis_helmet",
            () -> new InvisArmorItem(DwarvenArmorMaterialRegistry.INVIS, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> INVIS_CHESTPLATE = ITEMS.register("invis_chestplate",
            () -> new InvisArmorItem(DwarvenArmorMaterialRegistry.INVIS, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> INVIS_LEGGINGS = ITEMS.register("invis_leggings",
            () -> new InvisArmorItem(DwarvenArmorMaterialRegistry.INVIS, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> INVIS_BOOTS = ITEMS.register("invis_boots",
            () -> new InvisArmorItem(DwarvenArmorMaterialRegistry.INVIS, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> OCEAN_HELMET = ITEMS.register("ocean_helmet",
            () -> new OceanArmorItem(DwarvenArmorMaterialRegistry.OCEAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OCEAN_CHESTPLATE = ITEMS.register("ocean_chestplate",
            () -> new OceanArmorItem(DwarvenArmorMaterialRegistry.OCEAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> OCEAN_LEGGINGS = ITEMS.register("ocean_leggings",
            () -> new OceanArmorItem(DwarvenArmorMaterialRegistry.OCEAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> OCEAN_BOOTS = ITEMS.register("ocean_boots",
            () -> new OceanArmorItem(DwarvenArmorMaterialRegistry.OCEAN, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_CLOTH = ITEMS.register("magic_cloth", () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}

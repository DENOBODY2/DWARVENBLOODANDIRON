package net.denobody2.dwarven_bai.util;

import net.denobody2.dwarven_bai.Dwarven_BAI;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DwarvenTagRegistry {
    public static class Items {


        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(Dwarven_BAI.MOD_ID, name));
        }
        private static TagKey<Item> forgeTag(String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {



        public static final TagKey<Block> NEEDS_DWARVEN_TOOL = tag("needs_dwarven_tool");
        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(Dwarven_BAI.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }



    }
}

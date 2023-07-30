package net.denobody2.dwarven_bai.item;

import net.denobody2.dwarven_bai.Dwarven_BAI;
import net.denobody2.dwarven_bai.item.DwarvenItemRegistry;
import net.denobody2.dwarven_bai.util.DwarvenTagRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class DwarvenToolTierRegistry {
    public static final Tier DWARVEN = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 9F, 4.0F, 20,
                    DwarvenTagRegistry.Blocks.NEEDS_DWARVEN_TOOL, () -> Ingredient.of(DwarvenItemRegistry.DWARVEN_STEEL.get())),
            new ResourceLocation(Dwarven_BAI.MOD_ID, "dwarven"), List.of(Tiers.NETHERITE), List.of()
    );

}

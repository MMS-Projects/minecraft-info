package net.mms_projects.minecraft_info.items.decoration;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByTwo;

public class GlassPanes extends Item {

    public GlassPanes() {
        this.addCraftingIngredient(GlassBlock.class, 6);
        this.setCraftedAmount(16);
        this.setCraftingGrid(new ThreeByTwo(
            GlassBlock.class, GlassBlock.class, GlassBlock.class,
            GlassBlock.class, GlassBlock.class, GlassBlock.class
        ));
    }
}

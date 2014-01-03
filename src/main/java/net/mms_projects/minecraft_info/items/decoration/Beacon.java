package net.mms_projects.minecraft_info.items.decoration;

import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.blocks.NetherStar;
import net.mms_projects.minecraft_info.items.blocks.Obsidian;

public class Beacon extends Block {

    public Beacon() {
        this.addCraftingIngredient(GlassBlock.class, 5);
        this.addCraftingIngredient(Obsidian.class, 3);
        this.addCraftingIngredient(NetherStar.class);
        this.setCraftingGrid(new ThreeByThree(
            GlassBlock.class, GlassBlock.class, GlassBlock.class,
            GlassBlock.class, NetherStar.class, GlassBlock.class,
            Obsidian.class, Obsidian.class, Obsidian.class
        ));
    }
}

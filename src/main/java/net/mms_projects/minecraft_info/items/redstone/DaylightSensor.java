package net.mms_projects.minecraft_info.items.redstone;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.decoration.GlassBlock;
import net.mms_projects.minecraft_info.items.fake.WoodenSlab;
import net.mms_projects.minecraft_info.items.materials.NetherQuartz;

public class DaylightSensor extends Item {

    public DaylightSensor() {
        this.addCraftingIngredient(GlassBlock.class, 3);
        this.addCraftingIngredient(NetherQuartz.class, 3);
        this.addCraftingIngredient(WoodenSlab.class, 3);
        this.setCraftingGrid(new ThreeByThree(
            GlassBlock.class, GlassBlock.class, GlassBlock.class,
            NetherQuartz.class, NetherQuartz.class, NetherQuartz.class,
            WoodenSlab.class, WoodenSlab.class, WoodenSlab.class
        ));
    }
}

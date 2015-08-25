package net.mms_projects.minecraft_info.buildcraft.items;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.decoration.GlassBlock;
import net.mms_projects.minecraft_info.ways.Crafting;

public class Tank extends Item {

    public Tank() {
        this.addWay(new Crafting(new ThreeByThree(
            GlassBlock.class, GlassBlock.class, GlassBlock.class,
            GlassBlock.class, null, GlassBlock.class,
            GlassBlock.class, GlassBlock.class, GlassBlock.class
        )));
    }
}

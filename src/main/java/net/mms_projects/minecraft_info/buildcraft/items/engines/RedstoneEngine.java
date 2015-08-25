package net.mms_projects.minecraft_info.buildcraft.items.engines;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.buildcraft.items.gears.IronGear;
import net.mms_projects.minecraft_info.buildcraft.items.gears.WoodenGear;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.decoration.GlassBlock;
import net.mms_projects.minecraft_info.items.fake.Wood;
import net.mms_projects.minecraft_info.items.materials.IronIngot;
import net.mms_projects.minecraft_info.items.redstone.Piston;
import net.mms_projects.minecraft_info.ways.Crafting;

public class RedstoneEngine extends Item {

    public RedstoneEngine() {
        this.addWay(new Crafting(new ThreeByThree(
                Wood.class, Wood.class, Wood.class,
                null, GlassBlock.class, null,
                WoodenGear.class, Piston.class, WoodenGear.class
        )));
    }
}

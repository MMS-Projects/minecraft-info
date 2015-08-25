package net.mms_projects.minecraft_info.buildcraft.items;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.buildcraft.items.gears.DiamondGear;
import net.mms_projects.minecraft_info.buildcraft.items.gears.IronGear;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.crafting.grids.TwoByThree;
import net.mms_projects.minecraft_info.items.materials.IronIngot;
import net.mms_projects.minecraft_info.items.materials.Redstone;
import net.mms_projects.minecraft_info.items.redstone.RedstoneTorch;
import net.mms_projects.minecraft_info.items.tools.iron.IronPickaxe;
import net.mms_projects.minecraft_info.ways.Crafting;

public class Refinery extends Item {

    public Refinery() {
        this.addWay(new Crafting(new TwoByThree(
            RedstoneTorch.class, Tank.class, RedstoneTorch.class,
            Tank.class, DiamondGear.class, Tank.class
        )));
    }
}

package net.mms_projects.minecraft_info.buildcraft.items.engines;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.buildcraft.items.gears.StoneGear;
import net.mms_projects.minecraft_info.buildcraft.items.gears.WoodenGear;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.blocks.Stone;
import net.mms_projects.minecraft_info.items.decoration.GlassBlock;
import net.mms_projects.minecraft_info.items.fake.Wood;
import net.mms_projects.minecraft_info.items.redstone.Piston;
import net.mms_projects.minecraft_info.ways.Crafting;

public class StirlingEngine extends Item {

    public StirlingEngine() {
        this.addWay(new Crafting(new ThreeByThree(
                Stone.class, Stone.class, Stone.class,
                null, GlassBlock.class, null,
                StoneGear.class, Piston.class, StoneGear.class
        )));
    }
}

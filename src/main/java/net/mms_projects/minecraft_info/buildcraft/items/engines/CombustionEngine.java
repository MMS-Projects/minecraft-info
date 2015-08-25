package net.mms_projects.minecraft_info.buildcraft.items.engines;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.buildcraft.items.gears.IronGear;
import net.mms_projects.minecraft_info.items.decoration.GlassBlock;
import net.mms_projects.minecraft_info.items.materials.IronIngot;
import net.mms_projects.minecraft_info.items.redstone.Piston;
import net.mms_projects.minecraft_info.ways.Crafting;

public class CombustionEngine extends Item {

    public CombustionEngine() {
        this.addWay(new Crafting(new ThreeByThree(
                IronIngot.class, IronIngot.class, IronIngot.class,
                null, GlassBlock.class, null,
                IronGear.class, Piston.class, IronGear.class
        )));
    }
}

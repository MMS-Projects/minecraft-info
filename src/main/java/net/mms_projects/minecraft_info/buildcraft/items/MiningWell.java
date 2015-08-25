package net.mms_projects.minecraft_info.buildcraft.items;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.buildcraft.items.gears.IronGear;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.materials.IronIngot;
import net.mms_projects.minecraft_info.items.materials.Redstone;
import net.mms_projects.minecraft_info.items.tools.iron.IronPickaxe;
import net.mms_projects.minecraft_info.ways.Crafting;

public class MiningWell extends Item {

    public MiningWell() {
        this.addWay(new Crafting(new ThreeByThree(
                IronIngot.class, Redstone.class, IronIngot.class,
                IronIngot.class, IronGear.class, IronIngot.class,
                IronIngot.class, IronPickaxe.class, IronIngot.class
        )));
    }
}

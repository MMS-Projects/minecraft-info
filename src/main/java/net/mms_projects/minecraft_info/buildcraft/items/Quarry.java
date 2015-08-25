package net.mms_projects.minecraft_info.buildcraft.items;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.buildcraft.items.gears.DiamondGear;
import net.mms_projects.minecraft_info.buildcraft.items.gears.GoldGear;
import net.mms_projects.minecraft_info.buildcraft.items.gears.IronGear;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.materials.Redstone;
import net.mms_projects.minecraft_info.items.tools.diamond.DiamondPickaxe;
import net.mms_projects.minecraft_info.ways.Crafting;

public class Quarry extends Item {

    public Quarry() {
        this.addWay(new Crafting(new ThreeByThree(
                IronGear.class, Redstone.class, IronGear.class,
                GoldGear.class, IronGear.class, GoldGear.class,
                DiamondGear.class, DiamondPickaxe.class, DiamondGear.class
        )));
    }
}

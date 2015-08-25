package net.mms_projects.minecraft_info.buildcraft.items;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.buildcraft.items.gears.DiamondGear;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.blocks.Obsidian;
import net.mms_projects.minecraft_info.items.materials.Diamond;
import net.mms_projects.minecraft_info.items.materials.Redstone;
import net.mms_projects.minecraft_info.ways.Crafting;

public class AssemblyTable extends Item {

    public AssemblyTable() {
        this.addWay(new Crafting(new ThreeByThree(
            Obsidian.class, Redstone.class, Obsidian.class,
            Obsidian.class, Diamond.class, Obsidian.class,
            Obsidian.class, DiamondGear.class, Obsidian.class
        )));
    }
}

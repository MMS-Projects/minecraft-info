package net.mms_projects.minecraft_info.buildcraft.items;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.blocks.Obsidian;
import net.mms_projects.minecraft_info.items.materials.Diamond;
import net.mms_projects.minecraft_info.items.materials.Redstone;
import net.mms_projects.minecraft_info.ways.Crafting;

public class Laser extends Item {

    public Laser() {
        this.addWay(new Crafting(new ThreeByThree(
            Obsidian.class, Redstone.class, Redstone.class,
            Diamond.class, Diamond.class, Redstone.class,
            Obsidian.class, Redstone.class, Redstone.class
        )));
    }
}

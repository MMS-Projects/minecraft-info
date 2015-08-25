package net.mms_projects.minecraft_info.items.redstone;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.blocks.Cobblestone;
import net.mms_projects.minecraft_info.items.fake.Planks;
import net.mms_projects.minecraft_info.items.materials.IronIngot;
import net.mms_projects.minecraft_info.items.materials.Redstone;
import net.mms_projects.minecraft_info.ways.Crafting;

public class Piston extends Item {

    public Piston() {
        this.addWay(new Crafting(new ThreeByThree(
            Planks.class, Planks.class, Planks.class,
            Cobblestone.class, IronIngot.class, Cobblestone.class,
            Cobblestone.class, Redstone.class, Cobblestone.class
        )));
    }
}

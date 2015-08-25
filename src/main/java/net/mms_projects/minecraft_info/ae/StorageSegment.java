package net.mms_projects.minecraft_info.ae;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.decoration.GlassBlock;
import net.mms_projects.minecraft_info.items.materials.Redstone;
import net.mms_projects.minecraft_info.ways.Crafting;

public class StorageSegment extends Item {

    public StorageSegment() {
        this.addWay(new Crafting(new ThreeByThree(
            Redstone.class, MeBasicProcessor.class, Redstone.class,
            StorageCell.class, GlassBlock.class, StorageCell.class,
            Redstone.class, StorageCell.class, Redstone.class
        )));
    }
}

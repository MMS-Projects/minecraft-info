package net.mms_projects.minecraft_info.ae.storage;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.ae.StorageBlock;
import net.mms_projects.minecraft_info.ae.StorageSegment;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.decoration.GlassBlock;
import net.mms_projects.minecraft_info.items.materials.IronIngot;
import net.mms_projects.minecraft_info.items.materials.Redstone;
import net.mms_projects.minecraft_info.ways.Crafting;

public class Storage4k extends Item {

    public Storage4k() {
        this.addWay(new Crafting(new ThreeByThree(
            GlassBlock.class, Redstone.class, GlassBlock.class,
            Redstone.class, StorageSegment.class, Redstone.class,
            IronIngot.class, IronIngot.class, IronIngot.class
        )));
    }
}

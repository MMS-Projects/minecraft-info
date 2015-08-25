package net.mms_projects.minecraft_info.ae.storage;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.ae.StorageBlock;
import net.mms_projects.minecraft_info.ae.StorageCluster;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.decoration.GlassBlock;
import net.mms_projects.minecraft_info.items.materials.IronIngot;
import net.mms_projects.minecraft_info.items.materials.Redstone;
import net.mms_projects.minecraft_info.ways.Crafting;

public class Storage16k extends Item {

    public Storage16k() {
        this.addWay(new Crafting(new ThreeByThree(
            GlassBlock.class, Redstone.class, GlassBlock.class,
            Redstone.class, StorageBlock.class, Redstone.class,
            IronIngot.class, IronIngot.class, IronIngot.class
        )));
    }
}

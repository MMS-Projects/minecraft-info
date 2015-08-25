package net.mms_projects.minecraft_info.ae;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.decoration.GlassBlock;
import net.mms_projects.minecraft_info.items.materials.GlowstoneDust;
import net.mms_projects.minecraft_info.ways.Crafting;

public class StorageCluster extends Item {

    public StorageCluster() {
        this.addWay(new Crafting(new ThreeByThree(
            GlowstoneDust.class, MeAdvancedProcessor.class, GlowstoneDust.class,
            StorageBlock.class, GlassBlock.class, StorageBlock.class,
            GlowstoneDust.class, StorageBlock.class, GlowstoneDust.class
        )));
    }
}

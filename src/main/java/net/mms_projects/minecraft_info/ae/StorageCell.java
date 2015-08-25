package net.mms_projects.minecraft_info.ae;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.materials.Redstone;
import net.mms_projects.minecraft_info.ways.Crafting;

public class StorageCell extends Item {

    public StorageCell() {
        this.addWay(new Crafting(new ThreeByThree(
            Redstone.class, CertusQuartz.class, Redstone.class,
            CertusQuartz.class, MeBasicProcessor.class, CertusQuartz.class,
            Redstone.class, CertusQuartz.class, Redstone.class
        )));
    }
}

package net.mms_projects.minecraft_info.te.items.materials;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.te.ways.Pulverize;

public class PulverizedCopper extends Item {

    public PulverizedCopper() {
        this.addWay(new Pulverize(CopperOre.class));
    }
}

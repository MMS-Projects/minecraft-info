package net.mms_projects.minecraft_info.te.items.materials;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.ways.Smelting;

public class CopperIngot extends Item {

    public CopperIngot() {
        this.addWay(new Smelting(PulverizedCopper.class));
    }
}

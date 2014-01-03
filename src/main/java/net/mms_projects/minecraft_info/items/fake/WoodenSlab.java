package net.mms_projects.minecraft_info.items.fake;

import net.mms_projects.minecraft_info.items.MultiItem;
import net.mms_projects.minecraft_info.items.decoration.slabs.wooden.OakWoodSlab;

public class WoodenSlab extends MultiItem {

    public WoodenSlab() {
        this.setId(44, "wooden_slab");
        this.setDataValue(2);

        this.addActualItem(OakWoodSlab.class);
    }
}

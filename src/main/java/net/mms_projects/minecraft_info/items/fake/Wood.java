package net.mms_projects.minecraft_info.items.fake;

import net.mms_projects.minecraft_info.items.MultiItem;
import net.mms_projects.minecraft_info.items.blocks.wood.logs.OakWood;

public class Wood extends MultiItem {

    public Wood() {
        this.setChoppable(true);
        this.addActualItem(OakWood.class);
    }
}

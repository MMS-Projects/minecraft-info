package net.mms_projects.minecraft_info.items.fake;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.blocks.wool.BlackWool;
import net.mms_projects.minecraft_info.items.blocks.wool.GreenWool;
import net.mms_projects.minecraft_info.items.blocks.wool.Wool;

public class WoolCollection extends Block {

    public WoolCollection() {
        this.addActualItem(Wool.class);
        this.addActualItem(BlackWool.class);
        this.addActualItem(GreenWool.class);
    }
}

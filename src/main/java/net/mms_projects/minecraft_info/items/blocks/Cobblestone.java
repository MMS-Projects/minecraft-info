package net.mms_projects.minecraft_info.items.blocks;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.ways.Mining;

public class Cobblestone extends Block {

    public Cobblestone() {
        this.addWay(new Mining(Stone.class));
    }

}

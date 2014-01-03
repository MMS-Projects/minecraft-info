package net.mms_projects.minecraft_info.items.blocks;

import net.mms_projects.minecraft_info.items.Block;

public class Cobblestone extends Block {

    public Cobblestone() {
        this.addMinedSourceBlock(Stone.class);
    }

}

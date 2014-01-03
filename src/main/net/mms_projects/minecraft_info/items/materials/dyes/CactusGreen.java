package net.mms_projects.minecraft_info.items.materials.dyes;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.blocks.Cactus;

public class CactusGreen extends Item {

    public CactusGreen() {
        this.addSmeltingSourceItem(Cactus.class);
    }
}

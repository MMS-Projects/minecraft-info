package net.mms_projects.minecraft_info.items.materials;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.blocks.ores.NetherQuartzOre;

public class NetherQuartz extends Item {

    public NetherQuartz() {
        this.addSmeltingSourceItem(NetherQuartzOre.class);
    }
}

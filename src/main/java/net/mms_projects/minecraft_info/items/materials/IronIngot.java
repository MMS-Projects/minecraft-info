package net.mms_projects.minecraft_info.items.materials;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.blocks.ores.IronOre;

public class IronIngot extends Item {

    public IronIngot() {
        this.addSmeltingSourceItem(IronOre.class);
    }

}

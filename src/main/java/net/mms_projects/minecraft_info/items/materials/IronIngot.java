package net.mms_projects.minecraft_info.items.materials;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.blocks.ores.IronOre;
import net.mms_projects.minecraft_info.items.materials.ingots.Ingot;
import net.mms_projects.minecraft_info.ways.Smelting;

public class IronIngot extends Ingot {

    public IronIngot() {
        this.addWay(new Smelting(IronOre.class));
    }
}

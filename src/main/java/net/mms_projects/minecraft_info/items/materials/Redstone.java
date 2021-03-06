package net.mms_projects.minecraft_info.items.materials;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.blocks.ores.RedstoneOre;
import net.mms_projects.minecraft_info.ways.Mining;

import java.math.BigDecimal;

public class Redstone extends Item {

    public Redstone() {
        this.addWay(new Mining(RedstoneOre.class, 4, 5));
    }
}

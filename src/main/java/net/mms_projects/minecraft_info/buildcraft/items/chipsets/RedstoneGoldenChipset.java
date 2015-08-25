package net.mms_projects.minecraft_info.buildcraft.items.chipsets;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.buildcraft.ways.Assemble;
import net.mms_projects.minecraft_info.items.materials.GoldIngot;
import net.mms_projects.minecraft_info.items.materials.Redstone;

public class RedstoneGoldenChipset extends Item {

    public RedstoneGoldenChipset() {
        this.addWay(new Assemble(40000, Redstone.class, GoldIngot.class));
    }
}

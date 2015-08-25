package net.mms_projects.minecraft_info.buildcraft.items.chipsets;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.buildcraft.ways.Assemble;
import net.mms_projects.minecraft_info.items.materials.Diamond;
import net.mms_projects.minecraft_info.items.materials.Redstone;

public class RedstoneDiamondChipset extends Item {

    public RedstoneDiamondChipset() {
        this.addWay(new Assemble(80000, Redstone.class, Diamond.class));
    }
}

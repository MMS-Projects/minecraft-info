package net.mms_projects.minecraft_info.buildcraft.items;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.TwoByTwo;
import net.mms_projects.minecraft_info.ways.Crafting;

public class Pump extends Item {

    public Pump() {
        this.addWay(new Crafting(new TwoByTwo(
            Tank.class, null,
            MiningWell.class, null
        )));
    }
}

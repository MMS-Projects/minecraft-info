package net.mms_projects.minecraft_info.items;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.TwoByTwo;
import net.mms_projects.minecraft_info.items.fake.Wood;
import net.mms_projects.minecraft_info.ways.Crafting;

public class CraftingTable extends Item {

    public CraftingTable() {
        this.addWay(new Crafting(new TwoByTwo(
            Wood.class, Wood.class,
            Wood.class, Wood.class
        )));
    }
}

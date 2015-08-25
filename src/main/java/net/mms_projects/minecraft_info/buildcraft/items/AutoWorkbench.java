package net.mms_projects.minecraft_info.buildcraft.items;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.buildcraft.items.gears.WoodenGear;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.CraftingTable;
import net.mms_projects.minecraft_info.ways.Crafting;

public class AutoWorkbench extends Item {

    public AutoWorkbench() {
        this.addWay(new Crafting(new ThreeByThree(
            null, WoodenGear.class, null,
            WoodenGear.class, CraftingTable.class, WoodenGear.class,
            null, WoodenGear.class, null
        )));
    }
}

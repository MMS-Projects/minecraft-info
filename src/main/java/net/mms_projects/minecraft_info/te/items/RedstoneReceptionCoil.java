package net.mms_projects.minecraft_info.te.items;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.materials.GoldIngot;
import net.mms_projects.minecraft_info.items.materials.Redstone;
import net.mms_projects.minecraft_info.ways.Crafting;

public class RedstoneReceptionCoil extends Item {

    public RedstoneReceptionCoil() {
        this.addWay(new Crafting(new ThreeByThree(
            null, null, Redstone.class,
            null, GoldIngot.class, null,
            Redstone.class, null, null
        )));
    }
}

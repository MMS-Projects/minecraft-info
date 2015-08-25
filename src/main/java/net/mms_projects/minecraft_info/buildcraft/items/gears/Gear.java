package net.mms_projects.minecraft_info.buildcraft.items.gears;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.ways.Crafting;

/**
 * Created by marlinc on 24-8-15.
 */
public class Gear extends Item {

    public Gear(Class<? extends Item> material) {
        this.addWay(new Crafting(new ThreeByThree(
                null, material, null,
                material, null, material,
                null, material, null
        )));
    }

    public Gear(Class<? extends Item> material, Class<? extends Gear> previousGear) {
        this.addWay(new Crafting(new ThreeByThree(
            null, material, null,
            material, previousGear, material,
            null, material, null
        )));
    }

}

package net.mms_projects.minecraft_info.items.decoration;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByTwo;
import net.mms_projects.minecraft_info.items.materials.IronIngot;
import net.mms_projects.minecraft_info.ways.Crafting;

public class IronBars extends Item {

    public IronBars() {
        this.addWay(new Crafting(new ThreeByTwo(
            IronIngot.class, IronIngot.class, IronIngot.class,
            IronIngot.class, IronIngot.class, IronIngot.class
        ), 16));
    }
}

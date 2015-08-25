package net.mms_projects.minecraft_info.ae;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.decoration.IronBars;
import net.mms_projects.minecraft_info.items.materials.GoldIngot;
import net.mms_projects.minecraft_info.items.materials.IronIngot;
import net.mms_projects.minecraft_info.ways.Crafting;

public class MeHeatVent extends Item {

    public MeHeatVent() {
        this.addWay(new Crafting(new ThreeByThree(
            IronIngot.class, IronBars.class, IronIngot.class,
            IronBars.class, MeCable.class, IronBars.class,
            IronIngot.class, IronBars.class, IronIngot.class
        )));
    }
}

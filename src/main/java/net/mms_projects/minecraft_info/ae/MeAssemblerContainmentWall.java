package net.mms_projects.minecraft_info.ae;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.materials.GoldIngot;
import net.mms_projects.minecraft_info.items.materials.IronIngot;
import net.mms_projects.minecraft_info.ways.Crafting;

public class MeAssemblerContainmentWall extends Item {

    public MeAssemblerContainmentWall() {
        this.addWay(new Crafting(new ThreeByThree(
            IronIngot.class, GoldIngot.class, IronIngot.class,
            GoldIngot.class, CertusQuartz.class, GoldIngot.class,
            IronIngot.class, GoldIngot.class, IronIngot.class
        )));
    }
}

package net.mms_projects.minecraft_info.ae;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.TwoByTwo;
import net.mms_projects.minecraft_info.items.materials.Redstone;
import net.mms_projects.minecraft_info.ways.Crafting;

public class FluixDust extends Item {

    public FluixDust() {
        this.addWay(new Crafting(new TwoByTwo(
            CertusQuartzDust.class, NetherQuartzDust.class,
            Redstone.class, null
        )));
    }
}

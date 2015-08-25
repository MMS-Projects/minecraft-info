package net.mms_projects.minecraft_info.ae;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.ways.Smelting;

public class Silicon extends Item {

    public Silicon() {
        this.addWay(new Smelting(NetherQuartzDust.class));
    }
}

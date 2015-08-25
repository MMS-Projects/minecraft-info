package net.mms_projects.minecraft_info.ae;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.materials.NetherQuartz;
import net.mms_projects.minecraft_info.te.ways.Pulverize;

public class NetherQuartzDust extends Item {

    public NetherQuartzDust() {
        this.addWay(new Pulverize(NetherQuartz.class));
    }
}

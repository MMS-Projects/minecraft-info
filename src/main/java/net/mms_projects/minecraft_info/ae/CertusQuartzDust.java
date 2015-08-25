package net.mms_projects.minecraft_info.ae;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.te.ways.Pulverize;

public class CertusQuartzDust extends Item {

    public CertusQuartzDust() {
        this.addWay(new Pulverize(CertusQuartz.class));
    }
}

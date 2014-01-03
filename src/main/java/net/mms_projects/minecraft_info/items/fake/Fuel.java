package net.mms_projects.minecraft_info.items.fake;

import net.mms_projects.minecraft_info.items.MultiItem;
import net.mms_projects.minecraft_info.items.materials.Charcoal;
import net.mms_projects.minecraft_info.items.materials.Coal;

public class Fuel extends MultiItem {

    public Fuel() {
        this.addActualItem(Planks.class);
        this.addActualItem(Wood.class);
        this.addActualItem(Coal.class);
        //this.addActualItem(Charcoal.class);
    }
}

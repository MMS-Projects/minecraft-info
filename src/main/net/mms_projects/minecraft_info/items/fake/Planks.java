package net.mms_projects.minecraft_info.items.fake;

import net.mms_projects.minecraft_info.items.MultiItem;
import net.mms_projects.minecraft_info.items.blocks.wood.planks.*;

public class Planks extends MultiItem {

    public Planks() {
        this.addActualItem(OakWoodPlanks.class);
        this.addActualItem(SpruceWoodPlanks.class);
        this.addActualItem(BirchWoodPlanks.class);
        this.addActualItem(SpruceWoodPlanks.class);
        this.addActualItem(AcaciaWoodPlanks.class);
        this.addActualItem(DarkOakWoodPlanks.class);
    }
}

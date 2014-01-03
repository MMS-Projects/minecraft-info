package net.mms_projects.minecraft_info.items.fake;

import net.mms_projects.minecraft_info.items.MultiItem;
import net.mms_projects.minecraft_info.items.blocks.wood.logs.*;

public class Wood extends MultiItem {

    public Wood() {
        this.addActualItem(OakWood.class);
        this.addActualItem(SpruceWood.class);
        this.addActualItem(BirchWood.class);
        this.addActualItem(JungleWood.class);
        this.addActualItem(AcaciaWood.class);
        this.addActualItem(DarkOakWood.class);
    }
}

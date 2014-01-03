package net.mms_projects.minecraft_info.items.materials;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.fake.Planks;
import net.mms_projects.minecraft_info.items.fake.Wood;

public class Charcoal extends Item {

    public Charcoal() {
        this.addSmeltingSourceItem(Wood.class);
        this.addSmeltingSourceItem(Planks.class);
    }
}

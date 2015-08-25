package net.mms_projects.minecraft_info.items.materials;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.ways.Crafting;
import net.mms_projects.minecraft_info.ways.Mining;

public class GlowstoneDust extends Item {

    public GlowstoneDust() {
        this.addWay(new Mining(Glowstone.class));
    }
}

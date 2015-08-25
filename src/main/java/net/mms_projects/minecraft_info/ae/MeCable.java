package net.mms_projects.minecraft_info.ae;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.decoration.GlassBlock;
import net.mms_projects.minecraft_info.ways.Crafting;

public class MeCable extends Item {

    public MeCable() {
        this.addWay(new Crafting(new ThreeByThree(
            GlassBlock.class, GlassBlock.class, GlassBlock.class,
            FluixDust.class, FluixDust.class, FluixDust.class,
            GlassBlock.class, GlassBlock.class, GlassBlock.class
        )));
    }
}

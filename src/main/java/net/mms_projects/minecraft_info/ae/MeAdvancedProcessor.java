package net.mms_projects.minecraft_info.ae;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.buildcraft.items.chipsets.RedstoneDiamondChipset;
import net.mms_projects.minecraft_info.crafting.grids.TwoByTwo;
import net.mms_projects.minecraft_info.ways.Crafting;

public class MeAdvancedProcessor extends Item {

    public MeAdvancedProcessor() {
        this.addWay(new Crafting(new TwoByTwo(
            Silicon.class, RedstoneDiamondChipset.class,
            FluixDust.class, null
        )));
    }
}

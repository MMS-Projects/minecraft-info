package net.mms_projects.minecraft_info.crafting.grids;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.Grid;

public class TwoHigh extends Grid {

    public TwoHigh(Class<? extends Item>... itemGrid) {
        super(1, 2, new int[]{1, 2}, itemGrid);
    }
}

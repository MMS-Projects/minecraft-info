package net.mms_projects.minecraft_info.crafting.grids;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.Grid;

public class ThreeByTwo extends Grid {

    public ThreeByTwo(Class<? extends Item>... itemGrid) {
        super(2, 3, new int[]{1, 2, 3, 4, 5, 6}, itemGrid);
    }
}

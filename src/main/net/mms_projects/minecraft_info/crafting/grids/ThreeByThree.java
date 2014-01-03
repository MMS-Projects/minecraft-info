package net.mms_projects.minecraft_info.crafting.grids;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.Grid;

public class ThreeByThree extends Grid {

    public static int LEFT = 1;
    public static int RIGHT = 1;

    public ThreeByThree(Class<? extends Item>... itemGrid) {
        super(3, 3, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, itemGrid);
    }
}

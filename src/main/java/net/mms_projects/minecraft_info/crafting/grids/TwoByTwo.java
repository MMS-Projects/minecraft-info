package net.mms_projects.minecraft_info.crafting.grids;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.Grid;

public class TwoByTwo extends Grid {

    public static int TOP_LEFT = 1;
    public static int TOP_RIGHT = 2;
    public static int BOTTOM_LEFT = 3;
    public static int BOTTOM_RIGHT = 4;

    public TwoByTwo(Class<? extends Item>... itemGrid) {
        super(2, 2, new int[]{TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT}, itemGrid);
    }

}

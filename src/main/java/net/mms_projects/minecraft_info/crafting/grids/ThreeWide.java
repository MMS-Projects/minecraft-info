package net.mms_projects.minecraft_info.crafting.grids;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.Grid;

public class ThreeWide extends Grid {

    public ThreeWide(Class<? extends Item>... itemGrid) {
        super(3, 1, new int[]{1, 2, 3}, itemGrid);
    }
}

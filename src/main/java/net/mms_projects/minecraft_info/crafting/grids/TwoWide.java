package net.mms_projects.minecraft_info.crafting.grids;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.Grid;

import java.util.List;

public class TwoWide extends Grid {

    public static int LEFT = 1;
    public static int RIGHT = 1;

    public TwoWide(Class<? extends Item>... itemGrid) {
        super(2, 1, new int[]{LEFT, RIGHT}, itemGrid);
    }

    @Override
    public String toString() {
        List<Class<? extends Item>> items = this.getItems();

        String bla = "";

        for (Class<? extends Item> item : items) {
            bla += item.getSimpleName() + "\n";
        }
        return bla;
    }
}

package net.mms_projects.minecraft_info.crafting;

import net.mms_projects.minecraft_info.Item;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    private final int heigth;
    private final int width;

    private int[] grid;

    private Class<? extends Item>[] itemGrid;

    protected Grid(int heigth, int width, int[] grid, Class<? extends Item>[] itemGrid) {
        this.grid = grid;
        this.heigth = heigth;
        this.width = width;
        this.itemGrid = itemGrid;

        if (heigth * width != grid.length) {
            throw new IllegalArgumentException("The grid needs to be same size as the x multiplied by y");
        }

        if (itemGrid.length != grid.length) {
            throw new IllegalArgumentException("The items in the grid should be the same amount as the grid size");
        }
    }

    public List<Class<? extends Item>> getItems() {
        List<Class<? extends Item>> items = new ArrayList<Class<? extends Item>>();

        for (Class<? extends Item> genericItem : this.itemGrid) {
            if (genericItem == null) {
                continue;
            }

            items.add(genericItem);
        }

        return items;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeigth() {
        return this.heigth;
    }

    public Class<? extends Item>[] getItemGrid() {
        return itemGrid;
    }
}

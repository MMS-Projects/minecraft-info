package net.mms_projects.minecraft_info.items.blocks;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.materials.IronIngot;

public class BlockOfIron extends Block {

    public BlockOfIron() {
        this.addCraftingIngredient(IronIngot.class, 9);
    }
}

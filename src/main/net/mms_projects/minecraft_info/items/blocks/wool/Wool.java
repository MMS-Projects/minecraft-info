package net.mms_projects.minecraft_info.items.blocks.wool;

import net.mms_projects.minecraft_info.items.Block;

public class Wool extends Block {

    public Wool() {
        this.setId(35, "wool");

        this.addCraftingIngredient(net.mms_projects.minecraft_info.items.materials.String.class, 3);
    }
}

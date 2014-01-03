package net.mms_projects.minecraft_info.items.blocks.wool;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.materials.dyes.CactusGreen;

public class GreenWool extends Block {

    public GreenWool() {
        this.setId(35, "wool");
        this.setDataValue(13);

        this.addCraftingIngredient(CactusGreen.class);
        this.addCraftingIngredient(Wool.class);
    }
}

package net.mms_projects.minecraft_info.items.blocks.wool;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.materials.dyes.InkSac;

public class BlackWool extends Block {

    public BlackWool() {
        this.setId(35, "wool");
        this.setDataValue(15);

        this.addCraftingIngredient(Wool.class);
        this.addCraftingIngredient(InkSac.class);
    }
}

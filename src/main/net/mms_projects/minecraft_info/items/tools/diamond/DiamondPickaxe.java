package net.mms_projects.minecraft_info.items.tools.diamond;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.materials.Diamond;
import net.mms_projects.minecraft_info.items.materials.Stick;

public class DiamondPickaxe extends Item {

    public DiamondPickaxe() {
        this.addCraftingIngredient(Diamond.class, 3);
        this.addCraftingIngredient(Stick.class, 2);
    }

}

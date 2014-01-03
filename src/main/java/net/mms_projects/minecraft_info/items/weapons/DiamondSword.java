package net.mms_projects.minecraft_info.items.weapons;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.materials.Diamond;
import net.mms_projects.minecraft_info.items.materials.Stick;

public class DiamondSword extends Item {

    public DiamondSword() {
        this.addCraftingIngredient(Stick.class);
        this.addCraftingIngredient(Diamond.class, 2);
    }

}

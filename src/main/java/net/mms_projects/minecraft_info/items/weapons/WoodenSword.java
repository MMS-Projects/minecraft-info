package net.mms_projects.minecraft_info.items.weapons;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.fake.Planks;
import net.mms_projects.minecraft_info.items.materials.Stick;

public class WoodenSword extends Item {

    public WoodenSword() {
        this.addCraftingIngredient(Stick.class);
        this.addCraftingIngredient(Planks.class, 2);
    }

}

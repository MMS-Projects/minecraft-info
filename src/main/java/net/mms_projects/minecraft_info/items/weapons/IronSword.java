package net.mms_projects.minecraft_info.items.weapons;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.materials.IronIngot;
import net.mms_projects.minecraft_info.items.materials.Stick;

public class IronSword extends Item {

    public IronSword() {
        this.addCraftingIngredient(Stick.class);
        this.addCraftingIngredient(IronIngot.class, 2);
    }

}

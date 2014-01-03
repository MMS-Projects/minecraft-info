package net.mms_projects.minecraft_info.items.tools.iron;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.materials.IronIngot;
import net.mms_projects.minecraft_info.items.materials.Stick;

public class IronAxe extends Item {

    public IronAxe() {
        this.addCraftingIngredient(IronIngot.class, 3);
        this.addCraftingIngredient(Stick.class, 2);
    }

}

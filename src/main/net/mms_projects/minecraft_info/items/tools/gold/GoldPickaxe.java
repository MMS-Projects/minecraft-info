package net.mms_projects.minecraft_info.items.tools.gold;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.materials.Diamond;
import net.mms_projects.minecraft_info.items.materials.Stick;

public class GoldPickaxe extends Item {

    public GoldPickaxe() {
        this.addCraftingIngredient(Diamond.class, 3);
        this.addCraftingIngredient(Stick.class, 2);
    }

}

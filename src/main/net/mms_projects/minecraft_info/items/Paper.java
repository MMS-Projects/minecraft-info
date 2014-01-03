package net.mms_projects.minecraft_info.items;

import net.mms_projects.minecraft_info.Item;

public class Paper extends Item {

    public Paper() {
        this.addCraftingIngredient(Sugercane.class, 3);
        this.setCraftedAmount(3);
    }

}

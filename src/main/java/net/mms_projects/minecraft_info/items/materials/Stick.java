package net.mms_projects.minecraft_info.items.materials;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.fake.Planks;

public class Stick extends Item {

    public Stick() {
        this.addCraftingIngredient(Planks.class, 2);
        this.setCraftedAmount(4);
    }

}

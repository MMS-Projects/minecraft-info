package net.mms_projects.minecraft_info.items.armor.diamond;

import net.mms_projects.minecraft_info.items.armor.Helmet;
import net.mms_projects.minecraft_info.items.materials.Diamond;


public class DiamondHelmet extends Helmet {

    public DiamondHelmet() {
        super(Diamond.class);

        this.setId(310, "diamond_helmet");
    }
}

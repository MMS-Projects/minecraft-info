package net.mms_projects.minecraft_info.items.blocks;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.tools.diamond.DiamondPickaxe;

import java.math.BigDecimal;

public class Obsidian extends Item {

    public Obsidian() {
        this.setMineable(true);
        this.setRequiredMiningPickaxe(DiamondPickaxe.class);

        this.setBasePrice(BigDecimal.valueOf(40));
    }

}

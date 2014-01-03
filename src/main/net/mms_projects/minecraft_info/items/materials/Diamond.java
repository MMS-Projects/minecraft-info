package net.mms_projects.minecraft_info.items.materials;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.blocks.ores.DiamondOre;
import net.mms_projects.minecraft_info.items.tools.iron.IronPickaxe;

import java.math.BigDecimal;

public class Diamond extends Item {

    public Diamond() {
        this.addMinedSourceBlock(DiamondOre.class);
        this.addSmeltingSourceItem(DiamondOre.class);
    }

}

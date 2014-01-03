package net.mms_projects.minecraft_info.items.blocks.ores;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.tools.iron.IronPickaxe;

public class DiamondOre extends Block {

    public DiamondOre() {
        this.setMineable(true);
        this.setRequiredMiningPickaxe(IronPickaxe.class);
        this.setChunkAppearancePercentage(0.12f);
    }

}

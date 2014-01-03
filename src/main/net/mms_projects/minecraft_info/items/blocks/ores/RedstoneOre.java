package net.mms_projects.minecraft_info.items.blocks.ores;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.tools.iron.IronPickaxe;

public class RedstoneOre extends Block {

    public RedstoneOre() {
        this.setMineable(true);
        this.setRequiredMiningPickaxe(IronPickaxe.class);
        this.setChunkAppearancePercentage(0.98f);
    }
}

package net.mms_projects.minecraft_info.items.blocks.ores;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.tools.stone.StonePickaxe;

public class IronOre extends Block {

    public IronOre() {
        this.setMineable(true);
        this.setRequiredMiningPickaxe(StonePickaxe.class);
        //this.addMinedSourceBlock(IronOre.class);
        this.setChunkAppearancePercentage(0.68f);
    }
}

package net.mms_projects.minecraft_info.items.decoration;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.blocks.Sand;

import java.math.BigDecimal;

public class GlassBlock extends Block {

    public GlassBlock() {
        this.setBasePrice(BigDecimal.valueOf(5));
        this.addSmeltingSourceItem(Sand.class);
    }
}

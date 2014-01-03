package net.mms_projects.minecraft_info.items.blocks.wood.logs;

import net.mms_projects.minecraft_info.items.Block;

import java.math.BigDecimal;

public class SpruceWood extends Block {

    public SpruceWood() {
        this.setBasePrice(BigDecimal.valueOf(1));
        this.setChoppable(true);
    }
}

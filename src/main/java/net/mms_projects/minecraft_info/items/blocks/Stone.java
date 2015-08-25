package net.mms_projects.minecraft_info.items.blocks;

import net.mms_projects.minecraft_info.items.Block;

import java.math.BigDecimal;

public class Stone extends Block {

    public Stone() {
        this.setBasePrice(BigDecimal.valueOf(0.1));
        //this.addSmeltingSourceItem(Cobblestone.class);
    }

}

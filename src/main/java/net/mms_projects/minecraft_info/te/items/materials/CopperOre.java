package net.mms_projects.minecraft_info.te.items.materials;

import net.mms_projects.minecraft_info.Item;

import java.math.BigDecimal;

public class CopperOre extends Item {

    public CopperOre() {
        this.setMineable(true);
        this.setBasePrice(BigDecimal.valueOf(10));
    }
}

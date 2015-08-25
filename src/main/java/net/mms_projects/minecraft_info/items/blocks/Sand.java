package net.mms_projects.minecraft_info.items.blocks;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.te.ways.Pulverize;
import net.mms_projects.minecraft_info.ways.Smelting;

import java.math.BigDecimal;

public class Sand extends Block {

    public Sand() {
        this.addWay(new Pulverize(Cobblestone.class));
    }
}

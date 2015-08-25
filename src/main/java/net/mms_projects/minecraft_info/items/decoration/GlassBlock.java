package net.mms_projects.minecraft_info.items.decoration;

import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.blocks.Sand;
import net.mms_projects.minecraft_info.ways.Smelting;

import java.math.BigDecimal;

public class GlassBlock extends Block {

    public GlassBlock() {
        this.addWay(new Smelting(Sand.class));
    }
}

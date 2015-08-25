package net.mms_projects.minecraft_info.ae;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.decoration.GlassBlock;
import net.mms_projects.minecraft_info.items.materials.Glowstone;
import net.mms_projects.minecraft_info.items.materials.GlowstoneDust;
import net.mms_projects.minecraft_info.items.materials.IronIngot;
import net.mms_projects.minecraft_info.ways.Crafting;

public class BlankPattern extends Item {

    public BlankPattern() {
        this.addWay(new Crafting(new ThreeByThree(
            GlassBlock.class, GlowstoneDust.class, GlassBlock.class,
            Glowstone.class, CertusQuartz.class, GlowstoneDust.class,
            IronIngot.class, IronIngot.class, IronIngot.class
        )));
    }
}

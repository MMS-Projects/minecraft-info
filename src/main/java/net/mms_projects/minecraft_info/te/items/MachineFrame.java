package net.mms_projects.minecraft_info.te.items;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.decoration.GlassBlock;
import net.mms_projects.minecraft_info.items.materials.GoldIngot;
import net.mms_projects.minecraft_info.items.materials.IronIngot;
import net.mms_projects.minecraft_info.ways.Crafting;

public class MachineFrame extends Item {

    public MachineFrame() {
        this.addWay(new Crafting(new ThreeByThree(
            IronIngot.class, GlassBlock.class, IronIngot.class,
            GlassBlock.class, GoldIngot.class, GlassBlock.class,
            IronIngot.class, GlassBlock.class, IronIngot.class
        )));
    }
}

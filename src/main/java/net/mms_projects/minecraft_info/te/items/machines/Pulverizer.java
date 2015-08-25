package net.mms_projects.minecraft_info.te.items.machines;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.items.materials.Flint;
import net.mms_projects.minecraft_info.items.redstone.Piston;
import net.mms_projects.minecraft_info.te.items.MachineFrame;
import net.mms_projects.minecraft_info.te.items.RedstoneReceptionCoil;
import net.mms_projects.minecraft_info.te.items.materials.CopperIngot;
import net.mms_projects.minecraft_info.ways.Crafting;

public class Pulverizer extends Item {

    public Pulverizer() {
        this.addWay(new Crafting(new ThreeByThree(
            null, Piston.class, null,
            Flint.class, MachineFrame.class, Flint.class,
            CopperIngot.class, RedstoneReceptionCoil.class, CopperIngot.class
        )));
    }
}

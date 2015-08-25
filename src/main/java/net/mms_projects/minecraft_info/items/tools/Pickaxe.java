package net.mms_projects.minecraft_info.items.tools;

import net.mms_projects.minecraft_info.items.MultiItem;
import net.mms_projects.minecraft_info.items.tools.diamond.DiamondPickaxe;
import net.mms_projects.minecraft_info.items.tools.gold.GoldPickaxe;
import net.mms_projects.minecraft_info.items.tools.iron.IronPickaxe;
import net.mms_projects.minecraft_info.items.tools.stone.StonePickaxe;
import net.mms_projects.minecraft_info.items.tools.wood.WoodenPickaxe;

public class Pickaxe extends MultiItem {

    public Pickaxe() {
        this.addActualItem(WoodenPickaxe.class);
        this.addActualItem(StonePickaxe.class);
        this.addActualItem(IronPickaxe.class);
        this.addActualItem(GoldPickaxe.class);
        this.addActualItem(DiamondPickaxe.class);
    }
}

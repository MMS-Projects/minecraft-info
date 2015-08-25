package net.mms_projects.minecraft_info.items.fake;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.items.blocks.ores.CoalOre;
import net.mms_projects.minecraft_info.items.blocks.ores.DiamondOre;
import net.mms_projects.minecraft_info.items.blocks.ores.IronOre;
import net.mms_projects.minecraft_info.items.blocks.ores.RedstoneOre;
import net.mms_projects.minecraft_info.items.blocks.wood.logs.*;
import net.mms_projects.minecraft_info.items.blocks.wood.planks.*;
import net.mms_projects.minecraft_info.items.blocks.wool.BlackWool;
import net.mms_projects.minecraft_info.items.blocks.wool.GreenWool;
import net.mms_projects.minecraft_info.items.blocks.wool.Wool;
import net.mms_projects.minecraft_info.items.materials.*;
import net.mms_projects.minecraft_info.items.materials.dyes.CactusGreen;
import net.mms_projects.minecraft_info.items.materials.dyes.InkSac;
import net.mms_projects.minecraft_info.items.tools.diamond.DiamondAxe;
import net.mms_projects.minecraft_info.items.tools.diamond.DiamondHoe;
import net.mms_projects.minecraft_info.items.tools.diamond.DiamondPickaxe;
import net.mms_projects.minecraft_info.items.tools.diamond.DiamondShovel;
import net.mms_projects.minecraft_info.items.tools.gold.GoldPickaxe;
import net.mms_projects.minecraft_info.items.tools.iron.IronAxe;
import net.mms_projects.minecraft_info.items.tools.iron.IronHoe;
import net.mms_projects.minecraft_info.items.tools.iron.IronPickaxe;
import net.mms_projects.minecraft_info.items.tools.iron.IronShovel;
import net.mms_projects.minecraft_info.items.tools.stone.StoneAxe;
import net.mms_projects.minecraft_info.items.tools.stone.StoneHoe;
import net.mms_projects.minecraft_info.items.tools.stone.StonePickaxe;
import net.mms_projects.minecraft_info.items.tools.stone.StoneShovel;
import net.mms_projects.minecraft_info.items.tools.wood.WoodenAxe;
import net.mms_projects.minecraft_info.items.tools.wood.WoodenHoe;
import net.mms_projects.minecraft_info.items.tools.wood.WoodenPickaxe;
import net.mms_projects.minecraft_info.items.tools.wood.WoodenShovel;
import net.mms_projects.minecraft_info.items.weapons.*;

public class Everything extends Item {

    public Everything() {
        this.addActualItem(AcaciaWood.class);
        this.addActualItem(BirchWood.class);
        this.addActualItem(DarkOakWood.class);
        this.addActualItem(JungleWood.class);
        this.addActualItem(OakWood.class);
        this.addActualItem(SpruceWood.class);

        this.addActualItem(AcaciaWoodPlanks.class);
        this.addActualItem(BirchWoodPlanks.class);
        this.addActualItem(DarkOakWoodPlanks.class);
        this.addActualItem(JungleWoodPlanks.class);
        this.addActualItem(OakWoodPlanks.class);
        this.addActualItem(SpruceWoodPlanks.class);

        this.addActualItem(Wool.class);
        this.addActualItem(GreenWool.class);
        this.addActualItem(BlackWool.class);

        this.addActualItem(CoalOre.class);
        this.addActualItem(IronOre.class);
        this.addActualItem(RedstoneOre.class);
        this.addActualItem(DiamondOre.class);

        this.addActualItem(CactusGreen.class);
        this.addActualItem(InkSac.class);

        this.addActualItem(Coal.class);
        this.addActualItem(Diamond.class);
        this.addActualItem(IronIngot.class);
        this.addActualItem(GoldIngot.class);
        this.addActualItem(Redstone.class);
        this.addActualItem(Charcoal.class);

        this.addActualItem(DiamondAxe.class);
        this.addActualItem(DiamondHoe.class);
        this.addActualItem(DiamondPickaxe.class);
        this.addActualItem(DiamondShovel.class);

        this.addActualItem(GoldPickaxe.class);

        this.addActualItem(IronAxe.class);
        this.addActualItem(IronHoe.class);
        this.addActualItem(IronPickaxe.class);
        this.addActualItem(IronShovel.class);

        this.addActualItem(StoneAxe.class);
        this.addActualItem(StoneHoe.class);
        this.addActualItem(StonePickaxe.class);
        this.addActualItem(StoneShovel.class);

        this.addActualItem(WoodenAxe.class);
        this.addActualItem(WoodenHoe.class);
        this.addActualItem(WoodenPickaxe.class);
        this.addActualItem(WoodenShovel.class);

        this.addActualItem(Bow.class);
        this.addActualItem(WoodenSword.class);
        this.addActualItem(StoneSword.class);
        this.addActualItem(IronSword.class);
        this.addActualItem(DiamondSword.class);
    }

    @Override
    protected void addActualItem(Class<? extends Item> genericItem) {
        super.addActualItem(genericItem);

        Item item = null;
        try {
            item = genericItem.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        for (Class<? extends Item> genericIngredient : item.getCraftingIngredients().keySet()) {
            this.addActualItem(genericIngredient);
        }
    }
}

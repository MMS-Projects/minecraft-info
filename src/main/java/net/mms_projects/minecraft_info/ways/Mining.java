package net.mms_projects.minecraft_info.ways;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.ItemInfo;
import net.mms_projects.minecraft_info.PriceCalculator;
import net.mms_projects.minecraft_info.Way;

import java.math.BigDecimal;

public class Mining extends Way {

    private Class<? extends Item> minedItem;
    private int minimumDrops = 1;
    private int maxiumumDrops = 1;

    public Mining(Class<? extends Item> minedItem) {
        this.minedItem = minedItem;
    }

    public Mining(Class<? extends Item> minedItem, int minimumDrops, int maximumDrops) {
        this.minedItem = minedItem;
        this.minimumDrops = minimumDrops;
        this.maxiumumDrops = maximumDrops;
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal price = BigDecimal.ZERO;

        Item item = null;
        try {
            item = this.getMinedItem().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        price = price.add(PriceCalculator.calculateItemPrice(item.getRequiredMiningPickaxe()));

        price = price.add(PriceCalculator.calculateItemPrice(this.getMinedItem()));

        price = price.divide(BigDecimal.valueOf(this.minimumDrops));

        return price;
    }

    @Override
    public void printDescription(Item item, String indentation, int indentationLength) {
        System.out.println(indentation + "Het is te krijgen door het minen van de volgende item: " + this.getMinedItem());
        ItemInfo.showItemInfo(this.getMinedItem(), indentationLength + 4);
        System.out.println(indentation + " Dit maakt het ¤ " + this.getPrice() + " duurder");
    }

    public Class<? extends Item> getMinedItem() {
        return minedItem;
    }
}

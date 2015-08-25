package net.mms_projects.minecraft_info.ways;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.ItemInfo;
import net.mms_projects.minecraft_info.PriceCalculator;
import net.mms_projects.minecraft_info.Way;
import net.mms_projects.minecraft_info.items.fake.Fuel;

import java.math.BigDecimal;

public class Smelting extends Way {

    private Class<? extends Item> smeltedItem;

    public Smelting(Class<? extends Item> smeltedItem) {
        this.smeltedItem = smeltedItem;
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal price = BigDecimal.ZERO;

        price = price.add(PriceCalculator.calculateItemPrice(Fuel.class));
        //System.out.println(item.toString() + " kan je krijgen met smelten met " + item.requiredSmeltingItem);
        price = price.add(PriceCalculator.calculateItemPrice(this.getSmeltedItem()));
        //System.out.println("Smelt kosten: " + calculatePrice(item.requiredSmeltingItem));

        return price;
    }

    @Override
    public void printDescription(Item item, String indentation, int indentationLength) {
        System.out.println(indentation + "Het is te krijgen door het smelten van de volgende item: " + this.getSmeltedItem().getSimpleName());
        ItemInfo.showItemInfo(this.getSmeltedItem(), indentationLength + 4);
        System.out.println(indentation + "De brandstof kost ¤ " + PriceCalculator.calculateItemPrice(Fuel.class));
    }

    public Class<? extends Item> getSmeltedItem() {
        return smeltedItem;
    }
}

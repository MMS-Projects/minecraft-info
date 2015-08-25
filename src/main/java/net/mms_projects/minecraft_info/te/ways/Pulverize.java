package net.mms_projects.minecraft_info.te.ways;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.ItemInfo;
import net.mms_projects.minecraft_info.PriceCalculator;
import net.mms_projects.minecraft_info.Way;
import net.mms_projects.minecraft_info.ae.CertusQuartz;

import java.math.BigDecimal;

public class Pulverize extends Way {

    private final Class<? extends Item> requiredItem;

    public Pulverize(Class<? extends Item> requiredItem) {
        this.requiredItem = requiredItem;
    }

    @Override
    public void printDescription(Item item, String indentation, int indentationLength) {
        System.out.println(indentation + "Het is te verkrijgen door het pulverizen van : " + this.requiredItem.getSimpleName());
        ItemInfo.showItemInfo(this.requiredItem, indentationLength + 4);
    }

    @Override
    public BigDecimal getPrice() {
        return PriceCalculator.calculateItemPrice(requiredItem).add(BigDecimal.valueOf(0.5));
    }
}

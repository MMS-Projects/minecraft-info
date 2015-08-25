package net.mms_projects.minecraft_info.buildcraft.ways;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.PriceCalculator;
import net.mms_projects.minecraft_info.Way;
import net.mms_projects.minecraft_info.items.materials.Diamond;
import net.mms_projects.minecraft_info.items.materials.Redstone;

import java.math.BigDecimal;

public class Assemble extends Way {

    private final int mjRequired;
    private final Class<? extends Item>[] requiredItems;

    public Assemble(int mjRequired, Class<? extends Item>... requiredItems) {
        this.mjRequired = mjRequired;
        this.requiredItems = requiredItems;
    }

    @Override
    public void printDescription(Item item, String indentation, int indentationLength) {
        System.out.println(indentation + "Dit item wordt gemaakt met een assembly table en heeft de volgende items nodig:");

        for (Class<? extends Item> requiredItem : this.requiredItems) {
            System.out.println(indentation + " - " + requiredItem.getSimpleName());
        }

        System.out.println(indentation + "Het kost " + this.mjRequired + " MJ om dit item te maken");
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal price = BigDecimal.ZERO;

        price = price.add(this.getMjPrice());

        for (Class<? extends Item> requiredItem : this.requiredItems) {
            price = price.add(PriceCalculator.calculateItemPrice(requiredItem));
        }

        return price;
    }

    private BigDecimal getMjPrice() {
        return BigDecimal.valueOf(mjRequired).divide(BigDecimal.valueOf(1000));
    }
}

package net.mms_projects.minecraft_info;

import net.mms_projects.minecraft_info.items.fake.Fuel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class PriceCalculator {

    private static Logger logger = LoggerFactory.getLogger(PriceCalculator.class);

    static public BigDecimal calculateItemPrice(Class<? extends Item> genericItem) {
        BigDecimal price = BigDecimal.ZERO;

        Item item = getItem(genericItem);

        if (item.hasBasePrice()) {
            price = price.add(item.getBasePrice());
        }

        if (item.isMultiItem()) {
            price = price.add(calculateMultiItemPrice(genericItem));
        }

        if (!(item.isObtainableThroughMining()) || (item.isObtainableThroughSmelting())) {
            if (item.isCraftable()) {
                price = price.add(calculateCraftingPrice(genericItem));
            }
        }

        for (Way way : item.getWays()) {
            price = price.add(way.getPrice());
        }

        if (item.isMineable()) {
            price = price.add(calculateMiningPrice(genericItem));
        }

        if (item.isObtainableThroughMining()) {
            price = price.add(calculateMinedPrice(genericItem));
        }

        if (item.isObtainableThroughSmelting()) {
            price = price.add(calculateSmeltedPrice(genericItem));
        }

        return price;
    }

    static public BigDecimal calculateMultiItemPrice(Class<? extends Item> genericItem) {
        BigDecimal price = BigDecimal.ZERO;

        Item item = getItem(genericItem);

        if (item.isMultiItem()) {
            Map<Class<? extends Item>, BigDecimal> prices = new HashMap<Class<? extends Item>, BigDecimal>();

            for (Class<? extends Item> genericResource : item.getActualItems()) {
                prices.put(genericResource, calculateItemPrice(genericResource));
            }

            price = price.add(prices.get(getCheapest(prices)));
        }

        return price;
    }

    static public BigDecimal calculateCraftingPrice(Class<? extends Item> genericItem) {
        BigDecimal price = BigDecimal.ZERO;

        Item item = getItem(genericItem);

        Map<Class<? extends Item>, Integer> ingredients = item.getCraftingIngredients();
        for (Class<? extends Item> genericIngredient : ingredients.keySet()) {
            int amount = ingredients.get(genericIngredient);

            BigDecimal ingredientPrice = calculateItemPrice(genericIngredient);
            ingredientPrice = ingredientPrice.multiply(BigDecimal.valueOf(amount));

            price = price.add(ingredientPrice);

        }

        // Voeg een soort belasting van 5% bovenop de prijs erbij
        //price = price.add(price.multiply(BigDecimal.valueOf(5)).divide(BigDecimal.valueOf(100)));

        price = price.divide(BigDecimal.valueOf(item.getCraftedAmount()));

        return price;
    }

    static public BigDecimal calculateMiningPrice(Class<? extends Item> genericItem) {
        BigDecimal price = BigDecimal.ZERO;

        Item item = getItem(genericItem);

        BigDecimal pickaxePrice = calculateItemPrice(item.getRequiredMiningPickaxe());
        int divisor = 50;

        BigDecimal pickaxeUsagePrice = pickaxePrice.divide(BigDecimal.valueOf(divisor));

        price = price.add(pickaxeUsagePrice);

        logger.debug(item.getClass() + " is mineable with a " + item.getRequiredMiningPickaxe());
        logger.trace("This pickaxe costs: " + pickaxePrice + " which adds a extra cost of " + pickaxeUsagePrice);

        if (item.hasChunkAppearancePercentage()) {
            int blockBasePrice = 10;
            int multiplier = 20;
            double priceMultiplier = Math.abs(multiplier - (item.getChunkAppearancePercentage() * multiplier)) / 100;

            price = price.add(BigDecimal.valueOf(blockBasePrice * priceMultiplier));
        }

        return price;
    }

    static public BigDecimal calculateSmeltedPrice(Class<? extends Item> genericItem) {
        BigDecimal price = BigDecimal.ZERO;

        Item item = getItem(genericItem);

        if (item.isObtainableThroughSmelting()) {
            price = price.add(calculateItemPrice(Fuel.class));
            //System.out.println(item.toString() + " kan je krijgen met smelten met " + item.requiredSmeltingItem);
            price = price.add(calculateItemPrice(item.getSmeltingSourceItems().get(0)));
            //System.out.println("Smelt kosten: " + calculatePrice(item.requiredSmeltingItem));
        }

        return price;
    }

    static public BigDecimal calculateMinedPrice(Class<? extends Item> genericItem) {
        BigDecimal price = BigDecimal.ZERO;

        Item item = getItem(genericItem);

        //System.out.println(item.toString() + " is mijnbaar met  " + item.getRequiredMiningPickaxe());
        //price = price.add(calculatePrice(item.getRequiredMiningPickaxe()));
        //System.out.println("Mijn kosten: " + calculatePrice(item.getRequiredMiningPickaxe()));

        if (item.isObtainableThroughMining()) {
            for (Class<? extends Item> genericResource : item.getMiningSourceItems()) {
                //System.out.println(item.toString() + " kan je krijgen door " + genericResource + " te minen");
                //System.out.println(genericResource + " - " + calculatePrice(genericResource));
                price = price.add(calculateItemPrice(genericResource));
            }
            //System.out.println(item.toString() + " kan je krijgen met smelten met " + item.get);
            //System.out.println("Smelt kosten: " + calculatePrice(item.requiredSmeltingItem));
        }

        return price;
    }

    static private Item getItem(Class<? extends Item> genericItem) {
        Item item = null;
        try {
            item = genericItem.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return item;
    }

    static public <Type> Type getCheapest(Map<Type, BigDecimal> prices) {
        Type cheapest = prices.keySet().iterator().next();
        BigDecimal cheapestPrice = prices.get(cheapest);
        for (Type index : prices.keySet()) {
            BigDecimal price = prices.get(index);
            if (price.compareTo(cheapestPrice) == -1) {
                cheapest = index;
            }
        }

        return cheapest;
    }
}

package net.mms_projects.minecraft_info.items;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.PriceCalculator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MultiItem extends Item {

    @Override
    public boolean isCraftable() {
        return this.getCheapestItem().isCraftable();
    }

    @Override
    public Map<Class<? extends Item>, Integer> getCraftingIngredients() {
        return this.getCheapestItem().getCraftingIngredients();
    }

    @Override
    public int getCraftedAmount() {
        return this.getCheapestItem().getCraftedAmount();
    }

    @Override
    public boolean isMineable() {
        return  this.getCheapestItem().isMineable();
    }

    @Override
    public Class<? extends Item> getRequiredMiningPickaxe() {
        return this.getCheapestItem().getRequiredMiningPickaxe();
    }

    private Item getCheapestItem() {
        Map<Class<? extends Item>, BigDecimal> prices = new HashMap<Class<? extends Item>, BigDecimal>();

        for (Class<? extends Item> genericResource : this.getActualItems()) {
            prices.put(genericResource, PriceCalculator.calculateItemPrice(genericResource));
        }

        try {
            return PriceCalculator.getCheapest(prices).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}

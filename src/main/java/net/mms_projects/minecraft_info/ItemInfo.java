package net.mms_projects.minecraft_info;

import net.mms_projects.minecraft_info.ae.storage.Storage64k;
import net.mms_projects.minecraft_info.buildcraft.items.*;
import net.mms_projects.minecraft_info.buildcraft.items.engines.CombustionEngine;
import net.mms_projects.minecraft_info.buildcraft.items.engines.RedstoneEngine;
import net.mms_projects.minecraft_info.buildcraft.items.engines.StirlingEngine;
import net.mms_projects.minecraft_info.te.items.machines.Pulverizer;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

public class ItemInfo {

    public static void main(String[] args) {
//        showItemInfo(DiamondHelmet.class);
//        showItemInfo(DiamondChestplate.class);
//        showItemInfo(DiamondHelmet.class);
//        showItemInfo(DiamondLeggings.class);
//        showItemInfo(EnchantmentTable.class);
//        showItemInfo(CombustionEngine.class);
//        showItemInfo(Storage64k.class);
//        showItemInfo(Storage16k.class);
//        showItemInfo(MeAssemblerContainmentWall.class);
//        showItemInfo(MeHeatVent.class);
//        showItemInfo(RedstoneEngine.class);
//        showItemInfo(StirlingEngine.class);
//        showItemInfo(CombustionEngine.class);
//        showItemInfo(Quarry.class);
//        showItemInfo(MiningWell.class);
//        showItemInfo(Pump.class);
//        showItemInfo(Refinery.class);
//        showItemInfo(Tank.class);
//        showItemInfo(Laser.class);
//        showItemInfo(AssemblyTable.class);
//        showItemInfo(AutoWorkbench.class);
        showItemInfo(Pulverizer.class);
    }

    static void showPrice(Class<? extends Item> genericItem) {
        System.out.println("Prijs van " + genericItem.getSimpleName() + " is: " + PriceCalculator.calculateItemPrice(genericItem));
    }

    static void showItemInfo(Class<? extends Item> genericItem) {
        showItemInfo(genericItem, 0);
    }

    public static void showItemInfo(Class<? extends Item> genericItem, int indentLength) {
        String indentation = "";
        for (int i = 0; i < indentLength; ++i) {
            indentation += " ";
        }
        System.out.println(indentation + "--- Begin " + genericItem.getSimpleName());
        Item item = null;
        try {
            item = genericItem.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(indentation + "Informatie over: " + genericItem.getSimpleName());
        if (item.isMultiItem()) {
            System.out.println(indentation + "Het item is verzameling van andere items namelijk de volgende:");
            for (Class<? extends Item> genericResource : item.getActualItems()) {
                System.out.println(indentation + " - " + genericResource.getSimpleName() + " - " + PriceCalculator.calculateItemPrice(genericResource));
                //showItemInfo(genericResource, indentLength + 4);
            }
            System.out.println(indentation + "Dit kost daarom ¤ " + PriceCalculator.calculateMultiItemPrice(genericItem));
        }
        if (item.isMineable()) {
            System.out.println(indentation + "Het item te halen uit een mijn en vereist een "
                    + item.getRequiredMiningPickaxe().getSimpleName());
        }
        if (item.isChoppable()) {
            System.out.println(indentation + "Het item te hakken met een axe");
        }
//        if (item.isObtainableThroughMining()) {
//            System.out.println(indentation + "Het is te krijgen door het minen van de volgende blokken:");
//            for (Class<? extends Item> ingredient : item.getMiningSourceItems()) {
//                System.out.println(indentation + " - " + ingredient.getSimpleName());
//                showItemInfo(ingredient, indentLength + 4);
//            }
//            System.out.println(indentation + " Dit maakt het ¤ " + PriceCalculator.calculateMinedPrice(genericItem) + " duurder");
//        }
//        if (item.isObtainableThroughSmelting()) {
//            System.out.println(indentation + "Het is te krijgen door het smelten van de volgende blokken:");
//            for (Class<? extends Item> ingredient : item.getSmeltingSourceItems()) {
//                System.out.println(indentation + " - " + ingredient.getSimpleName());
//                showItemInfo(ingredient, indentLength + 4);
//            }
//            System.out.println(indentation + "De brandstof kost ¤ " + PriceCalculator.calculateItemPrice(Fuel.class));
//        }
        for (Way way : item.getWays()) {
            way.printDescription(item, indentation, indentLength);
        }
//        if (item.isCraftable()) {
//            System.out.println(indentation + "Het is maakbaar met het volgende recept:");
//            if (item.hasCraftingGrid()) {
//                showItemGrid(item.getCraftingGrid());
//            }
//            for (Class<? extends Item> ingredient : item.getCraftingIngredients().keySet()) {
//                int amount = item.getCraftingIngredients().get(ingredient);
//                System.out.println(indentation + "  " + amount + " - " + ingredient.getSimpleName());
//                showItemInfo(ingredient, indentLength + 4);
//            }
//            System.out.println(indentation + "  Je krijgt het item " + item.getCraftedAmount() + " keer bij het maken");
//            System.out.println(indentation + "  Het wordt hierdoor ¤ " + PriceCalculator.calculateCraftingPrice(genericItem) + " duurder");
//        }
        if (item.hasChunkAppearancePercentage()) {
            System.out.println(indentation + "Het lijkt voor te komen op " + item.getChunkAppearancePercentage() + "% van een chunk");
        }
        BigDecimal calculatedPrice = PriceCalculator.calculateItemPrice(genericItem);
        BigDecimal tax = calculatedPrice.multiply(BigDecimal.valueOf(0.08));

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        df.setGroupingUsed(false);

        System.out.println(indentation + "De prijs is: ¤ " + df.format(calculatedPrice));
        System.out.println(indentation + "De BTW is: ¤ " + df.format(tax));
        System.out.println(indentation + "De totaal prijs is: ¤ " + df.format(calculatedPrice.add(tax)));
        System.out.println(indentation + "--- Eind " + genericItem.getSimpleName());
    }

    /*static Map<Class<? extends Item>, Integer> calculateItems(Class<? extends Item> genericItem) {
        Map<Class<? extends Item>, Integer> items = new HashMap<Class<? extends Item>, Integer>();

        Item item = null;
        try {
            item = genericItem.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        if (!(item.isMineable) || (item.isObtainableThroughSmelting)) {
            if (!item.recipe.isEmpty()) {
                for (Class<? extends Item> genericIngredient : item.recipe.keySet()) {
                    int amount = item.recipe.get(genericIngredient);

                    for (int i = 0; i < amount; ++i) {
                        items = combineItems(calculateItems(genericIngredient), items);
                    }

                    //System.out.println(genericIngredient + " * " + amount);
                }
            }
        }

        items.put(genericItem, 1);

        return items;
    }*/

    private static <Type> Map<Type, Integer> combineItems(Map<Type, Integer> firstItems, Map<Type, Integer> secondItems) {
        for (Type secondItem : secondItems.keySet()) {
            int addingAmount = secondItems.get(secondItem);
            if (firstItems.containsKey(secondItem)) {
                int currentAmount = firstItems.get(secondItem);

                firstItems.put(secondItem, currentAmount + addingAmount);
            } else {
                firstItems.put(secondItem, addingAmount);
            }
        }

        return firstItems;
    }

}

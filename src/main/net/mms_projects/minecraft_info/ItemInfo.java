package net.mms_projects.minecraft_info;

import net.mms_projects.minecraft_info.crafting.Grid;
import net.mms_projects.minecraft_info.crafting.grids.ThreeByThree;
import net.mms_projects.minecraft_info.crafting.grids.TwoWide;
import net.mms_projects.minecraft_info.items.blocks.Stone;
import net.mms_projects.minecraft_info.items.blocks.ores.IronOre;
import net.mms_projects.minecraft_info.items.blocks.wool.BlackWool;
import net.mms_projects.minecraft_info.items.blocks.wool.GreenWool;
import net.mms_projects.minecraft_info.items.decoration.*;
import net.mms_projects.minecraft_info.items.fake.Everything;
import net.mms_projects.minecraft_info.items.fake.Fuel;
import net.mms_projects.minecraft_info.items.fake.Planks;
import net.mms_projects.minecraft_info.items.materials.Diamond;
import net.mms_projects.minecraft_info.items.redstone.PressurePlate;
import net.mms_projects.minecraft_info.items.redstone.RedstoneRepeater;
import net.mms_projects.minecraft_info.items.tools.wood.WoodenPickaxe;

import java.math.BigDecimal;
import java.util.*;

public class ItemInfo {

    public static void main(String[] args) {
//         showPrice(WoodenPickaxe.class);
//         showPrice(WoodenHoe.class);
//         showPrice(Stick.class);
//         showPrice(DiamondSword.class);
        //showPrice(EnchantmentTable.class);
//         showPrice(StonePickaxe.class);
//         showPrice(Bookshelf.class);
//         showPrice(StoneButton.class);
//         showPrice(BlockOfCoal.class);
//         showPrice(Coal.class);
        //showPrice(Diamond.class);
//         showPrice(DiamondOre.class);
//         showPrice(CoalOre.class);
        //showPrice(RedstoneRepeater.class);
        //showPrice(Redstone.class);
        //showPrice(CoalOre.class);
        //showPrice(DiamondOre.class);
        //showPrice(IronOre.class);
        //showPrice(RedstoneOre.class);
        //showPrice(GlassPanes.class);
        //showPrice(WoodenDoor.class);

         /*Map<Class<? extends Item>, Integer> items = calculateItems(RedstoneRepeater.class);
         for (Class<? extends Item> genericItem : items.keySet()) {
             int amount = items.get(genericItem);
             System.out.println(genericItem + " * " + amount);
         } */

         //showItemInfo(IronOre.class);
//         showItemInfo(Coal.class);
//         showItemInfo(Wood.class);
        //showItemInfo(RedstoneRepeater.class);
        //  showItemInfo(IronOre.class);
        //showItemInfo(EnchantmentTable.class);
//         showItemInfo(RedstoneRepeater.class);
//         showItemInfo(Diamond.class);
//         showItemInfo(WoodenPickaxe.class);
//         showItemInfo(Beacon.class);
//         showItemInfo(GlassPanes.class);
        //showItemInfo(Fuel.class);
//         showItemInfo(DarkOakWoodStairs.class);
        //showItemInfo(Bed.class);
        //showItemInfo(Fuel.class);
        //showItemInfo(Anvil.class);
        //showItemInfo(Chest.class);
        //showItemInfo(Bed.class);
//        showItemInfo(Beacon.class);
//        showItemInfo(WoodenDoor.class);
//        showItemInfo(RedstoneRepeater.class);
        showItemInfo(Everything.class);
    }

    static void showPrice(Class<? extends Item> genericItem) {
        System.out.println("Prijs van " + genericItem.getSimpleName() + " is: " + PriceCalculator.calculateItemPrice(genericItem));
    }

    static void showItemGrid(Grid itemGrid) {
        List<Character> symbols = new ArrayList<Character>(Arrays.asList(
            new Character[]{'*', '-', '+', '/', ';', ':', '&'})
        );

        Class<? extends Item>[] items = itemGrid.getItems();

        Map<Class<? extends Item>, Character> itemSymbolMapping = new HashMap<Class<? extends Item>, Character>();
        for (Class<? extends Item> item : items) {
            if (item == null) {
                continue;
            }
            if (!itemSymbolMapping.containsKey(item)) {
                int symbolIndex = new Random().nextInt(symbols.size());
                char symbol = symbols.remove(symbolIndex);
                itemSymbolMapping.put(item, symbol);
            }
        }

        int itemIndex = 0;

        for (Class<? extends Item> item : itemSymbolMapping.keySet()) {
            char symbol = itemSymbolMapping.get(item);
            System.out.println(symbol+ " = " + item.getSimpleName());
        }
        System.out.println();

        for (int ii = 1; ii <= itemGrid.getWidth(); ii++) {
            if (ii == 1) {
                System.out.print("|");
            }
            System.out.print("---");
            if (ii != itemGrid.getWidth()) {
                System.out.print("|");
            }
            if (ii == itemGrid.getWidth()) {
                System.out.println("|");
            }
        }
        for (int i = 1; i <= itemGrid.getHeigth(); i++) {
            for (int ii = 1; ii <= itemGrid.getWidth(); ii++) {
                char symbol;
                Class<? extends Item> item = items[itemIndex];
                if (item != null) {
                    symbol = itemSymbolMapping.get(item);
                } else {
                    symbol = ' ';
                }

                if (ii == 1) {
                    System.out.print("|");
                }
                System.out.print(" " + symbol + " ");
                if (ii != itemGrid.getWidth()) {
                    System.out.print("|");
                }
                if (ii == itemGrid.getWidth()) {
                    System.out.println("|");
                }

                itemIndex++;
            }
            for (int ii = 1; ii <= itemGrid.getWidth(); ii++) {
                if (ii == 1) {
                    System.out.print("|");
                }
                System.out.print("---");
                if (ii != itemGrid.getWidth()) {
                    System.out.print("|");
                }
                if (ii == itemGrid.getWidth()) {
                    System.out.println("|");
                }
            }
        }
    }

    static void showItemInfo(Class<? extends Item> genericItem) {
        showItemInfo(genericItem, 0);
    }

    static void showItemInfo(Class<? extends Item> genericItem, int indentLength) {
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
        if (item.isObtainableThroughMining()) {
            System.out.println(indentation + "Het is te krijgen door het minen van de volgende blokken:");
            for (Class<? extends Item> ingredient : item.getMiningSourceItems()) {
                System.out.println(indentation + " - " + ingredient.getSimpleName());
                showItemInfo(ingredient, indentLength + 4);
            }
            System.out.println(indentation + " Dit maakt het ¤ " + PriceCalculator.calculateMinedPrice(genericItem) + " duurder");
        }
        if (item.isObtainableThroughSmelting()) {
            System.out.println(indentation + "Het is te krijgen door het smelten van de volgende blokken:");
            for (Class<? extends Item> ingredient : item.getSmeltingSourceItems()) {
                System.out.println(indentation + " - " + ingredient.getSimpleName());
                showItemInfo(ingredient, indentLength + 4);
            }
            System.out.println(indentation + "De brandstof kost ¤ " + PriceCalculator.calculateItemPrice(Fuel.class));
        }
        if (item.isCraftable()) {
            System.out.println(indentation + "Het is maakbaar met het volgende recept:");
            if (item.hasCraftingGrid()) {
                showItemGrid(item.getCraftingGrid());
            }
            for (Class<? extends Item> ingredient : item.getCraftingIngredients().keySet()) {
                int amount = item.getCraftingIngredients().get(ingredient);
                System.out.println(indentation + "  " + amount + " - " + ingredient.getSimpleName());
                showItemInfo(ingredient, indentLength + 4);
            }
            System.out.println(indentation + "  Je krijgt het item " + item.getCraftedAmount() + " keer bij het maken");
            System.out.println(indentation + "  Het wordt hierdoor ¤ " + PriceCalculator.calculateCraftingPrice(genericItem) + " duurder");
        }
        if (item.hasChunkAppearancePercentage()) {
            System.out.println(indentation + "Het lijkt voor te komen op " + item.getChunkAppearancePercentage() + "% van een chunk");
        }
        System.out.println(indentation + "De totaal prijs is: ¤ " + PriceCalculator.calculateItemPrice(genericItem));
        System.out.println(indentation + "--- Eind " + genericItem.getSimpleName());
    }

    static BigDecimal calculatePrice(Class<? extends Item> genericItem) {
        BigDecimal price = BigDecimal.valueOf(0);

        Item item = null;
        try {
            item = genericItem.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        if (item.hasBasePrice()) {
            price = price.add(item.getBasePrice());
        }

        if (item.isMultiItem()) {
            for (Class<? extends Item> genericResource : item.getActualItems()) {
                price = price.add(calculatePrice(genericResource));
            }
        }

        if (item.isMineable()) {
            //System.out.println(item.toString() + " is mijnbaar met  " + item.getRequiredMiningPickaxe());
            //price = price.add(calculatePrice(item.getRequiredMiningPickaxe()));
            //System.out.println("Mijn kosten: " + calculatePrice(item.getRequiredMiningPickaxe()));

            if (item.hasChunkAppearancePercentage()) {
                int blockBasePrice = 10;
                int multiplier = 2000;
                double priceMultiplier = Math.abs(multiplier - (item.getChunkAppearancePercentage() * multiplier)) / 100;

                price = price.add(BigDecimal.valueOf(blockBasePrice * priceMultiplier));
            }
        }

        if (item.isObtainableThroughSmelting()) {
            //System.out.println(item.toString() + " kan je krijgen met smelten met " + item.requiredSmeltingItem);
            price = price.add(calculatePrice(item.getSmeltingSourceItems().get(0)));
            //System.out.println("Smelt kosten: " + calculatePrice(item.requiredSmeltingItem));
        }

        if (item.isObtainableThroughMining()) {
            for (Class<? extends Item> genericResource : item.getMiningSourceItems()) {
                //System.out.println(item.toString() + " kan je krijgen door " + genericResource + " te minen");
                //System.out.println(genericResource + " - " + calculatePrice(genericResource));
                price = price.add(calculatePrice(genericResource));
            }
            //System.out.println(item.toString() + " kan je krijgen met smelten met " + item.get);
            //System.out.println("Smelt kosten: " + calculatePrice(item.requiredSmeltingItem));
        }

        if (!(item.isObtainableThroughMining()) || (item.isObtainableThroughSmelting())) {
            if (item.isCraftable()) {

                Map<Class<? extends Item>, Integer> ingredients = item.getCraftingIngredients();
                for (Class<? extends Item> genericIngredient : ingredients.keySet()) {
                    int amount = ingredients.get(genericIngredient);

                    BigDecimal ingredientPrice = calculatePrice(genericIngredient);
                    ingredientPrice = ingredientPrice.multiply(BigDecimal.valueOf(amount));

                    price = price.add(ingredientPrice);

                }

                // Voeg een soort belasting van 5% bovenop de prijs erbij
                //price = price.add(price.multiply(BigDecimal.valueOf(5)).divide(BigDecimal.valueOf(100)));

                price = price.divide(BigDecimal.valueOf(item.getCraftedAmount()));
            }
        }

        return price;
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

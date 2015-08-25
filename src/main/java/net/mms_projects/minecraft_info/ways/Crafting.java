package net.mms_projects.minecraft_info.ways;

import net.mms_projects.minecraft_info.Item;
import net.mms_projects.minecraft_info.ItemInfo;
import net.mms_projects.minecraft_info.PriceCalculator;
import net.mms_projects.minecraft_info.Way;
import net.mms_projects.minecraft_info.crafting.Grid;

import java.math.BigDecimal;
import java.util.*;

public class Crafting extends Way {

    private Grid grid;
    private int amountCreated = 1;

    public Crafting(Grid grid) {
        this.grid = grid;
    }

    public Crafting(Grid grid, int amountCreated) {
        this.grid = grid;
        this.amountCreated = amountCreated;
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal price = BigDecimal.ZERO;

        List<Class<? extends Item>> ingredients = this.grid.getItems();
        for (Class<? extends Item> genericIngredient : ingredients) {
            BigDecimal ingredientPrice = PriceCalculator.calculateItemPrice(genericIngredient);

            price = price.add(ingredientPrice);

        }

        // Voeg een soort belasting van 5% bovenop de prijs erbij
        //price = price.add(price.multiply(BigDecimal.valueOf(5)).divide(BigDecimal.valueOf(100)));

        price = price.divide(BigDecimal.valueOf(this.amountCreated));

        return price;
    }

    @Override
    public void printDescription(Item item, String indentation, int indentationLength) {
        System.out.println(indentation + "Het is maakbaar met het volgende recept:");
        showItemGrid(this.getGrid(), indentation);
        for (Class<? extends Item> ingredient : this.grid.getItems()) {
//            int amount = item.getCraftingIngredients().get(ingredient);
            System.out.println(indentation + " - " + ingredient.getSimpleName());
            ItemInfo.showItemInfo(ingredient, indentationLength + 4);
        }
        System.out.println(indentation + "  Je krijgt het item " + this.amountCreated + " keer bij het maken");
        System.out.println(indentation + "  Het wordt hierdoor ¤ " + PriceCalculator.calculateCraftingPrice(item.getClass()) + " duurder");
    }

    static void showItemGrid(Grid itemGrid, String indentation) {
        List<Character> symbols = new ArrayList<Character>(Arrays.asList(
                new Character[]{'*', '-', '+', '/', ';', ':', '&'})
        );

        Class<? extends Item>[] items = itemGrid.getItemGrid();

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
            System.out.println(indentation + symbol + " = " + item.getSimpleName());
        }
        System.out.println();

        System.out.print(indentation);
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
                    System.out.print(indentation);

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
                    System.out.print(indentation);

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

    public Grid getGrid() {
        return grid;
    }
}

package net.mms_projects.minecraft_info;

import net.mms_projects.minecraft_info.crafting.Grid;
import net.mms_projects.minecraft_info.items.Block;
import net.mms_projects.minecraft_info.items.tools.wood.WoodenPickaxe;

import java.math.BigDecimal;
import java.util.*;

public class Item {

    private int id;
    private String idName;
    private int dataValue;

    private Map<Class<? extends Item>, Integer> recipe = new HashMap<Class<? extends Item>, Integer>();
    private int recipeAmount = 1;

    private boolean isMineable = false;
    private Class<? extends Item> requiredMiningPickaxe = WoodenPickaxe.class;

    private boolean isObtainableThroughMining = false;
    private List<Class<? extends Item>> requiredMiningItems = new ArrayList<Class<? extends Item>>();

    private boolean isChoppable = false;

    private List<Class<? extends Item>> requiredSmeltingItems = new ArrayList<Class<? extends Item>>();

    private float chunkAppearancePercentage;

    private BigDecimal basePrice;

    private Set<Class<? extends Item>> actualItems = new HashSet<Class<? extends Item>>();
    private Grid craftingGrid;

    protected void setId(int id, String idName) {
        this.id = id;
        this.idName = idName;
    }

    protected void setDataValue(int dataValue) {
        this.dataValue = dataValue;
    }

    public Map<Class<? extends Item>, Integer> getCraftingIngredients() {
        return this.recipe;
    }

    protected void addCraftingIngredient(Class<? extends Item> genericItem, int amount) {
        this.recipe.put(genericItem, amount);
    }

    protected void addCraftingIngredient(Class<? extends Item> genericItem) {
        this.addCraftingIngredient(genericItem, 1);
    }

    protected void setCraftedAmount(int amount) {
        this.recipeAmount = amount;
    }

    protected void setCraftingGrid(Grid grid) {
        this.craftingGrid = grid;
    }

    public Grid getCraftingGrid() {
        return this.craftingGrid;
    }

    public boolean hasCraftingGrid() {
        return this.craftingGrid != null;
    }

    public int getCraftedAmount() {
        return this.recipeAmount;
    }

    public boolean isCraftable() {
        return !this.recipe.isEmpty();
    }

    public boolean isMineable() {
        return this.isMineable;
    }

    protected void setMineable(boolean yesno) {
        this.isMineable = yesno;
    }

    public Class<? extends Item> getRequiredMiningPickaxe() {
        return this.requiredMiningPickaxe;
    }

    protected void setRequiredMiningPickaxe(Class<? extends Item> genericItem) {
        this.requiredMiningPickaxe = genericItem;
    }

    protected boolean isObtainableThroughMining() {
        return !this.requiredMiningItems.isEmpty();
    }

    protected List<Class<? extends Item>> getMiningSourceItems() {
        return this.requiredMiningItems;
    }

    protected void addMinedSourceBlock(Class<? extends Block> genericItem) {
        this.requiredMiningItems.add(genericItem);
    }

    protected boolean isObtainableThroughSmelting() {
        return !this.requiredSmeltingItems.isEmpty();
    }

    protected List<Class<? extends Item>> getSmeltingSourceItems() {
        return this.requiredSmeltingItems;
    }

    protected void addSmeltingSourceItem(Class<? extends Item> genericItem) {
        this.requiredSmeltingItems.add(genericItem);
    }

    protected boolean hasBasePrice() {
        return this.basePrice != null;
    }

    protected BigDecimal getBasePrice() {
        return this.basePrice;
    }

    protected void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    protected boolean hasChunkAppearancePercentage() {
        return this.getChunkAppearancePercentage() != 0.0;
    }

    protected float getChunkAppearancePercentage() {
        return this.chunkAppearancePercentage;
    }

    protected void setChunkAppearancePercentage(float percentage) {
        this.chunkAppearancePercentage = percentage;
    }

    protected void setChunkAppearance(int amountPerChunk) {
        this.setChunkAppearance(amountPerChunk, 16384);
    }

    protected void setChunkAppearance(int amountPerChunk, int blocksPerChunk) {
        this.setChunkAppearancePercentage((float) amountPerChunk / blocksPerChunk * 100);
    }

    public boolean isChoppable() {
        return this.isChoppable;
    }

    protected void setChoppable(boolean yesno) {
        this.isChoppable = yesno;
    }

    public boolean isMultiItem() {
        return !this.actualItems.isEmpty();
    }

    public Set<Class<? extends Item>> getActualItems() {
        return this.actualItems;
    }

    protected void addActualItem(Class<? extends Item> genericItem) {
        this.actualItems.add(genericItem);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " - " + this.idName + "(" + this.id + ")";
    }
}

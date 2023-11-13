package com.kristoffer.demo;

import java.util.*;

import static com.kristoffer.demo.InventorySlots.*;

public class Main {
    public static void main(String[] args) {

        // TODO - Difference?
        Map<String, String> capitalCities = HashMap.newHashMap(20);

        // Map<String, String> capitalCities2 = new HashMap<>(20);

        // TODO - Put both ADDS and Edits already existing keys: values
        capitalCities.put("Sweden", "Stockholm");
        capitalCities.put("England", "London");
        // capitalCities.put("Sweden", "Gothenburg"); // <-- try this one out!


        // TODO - Inventory Example
        Map<InventorySlots, Item> inventorySlots = HashMap.newHashMap(20);

        // Instantiate Items
        Item glovesOfDestruction = new Item("Gloves of Destruction", 10, 2);
        Item pantsOfWisdom = new Item("Pants of Wisdom", 20, 3);
        Item bootsOfStars = new Item("Boots of Stars", 15, 1);

        // Add items
        inventorySlots.put(GLOVES, glovesOfDestruction);
        inventorySlots.put(PANTS, pantsOfWisdom);
        inventorySlots.put(FEET, bootsOfStars);

        inventorySlots.forEach((K, V) -> System.out.println(K + " " + V)); // Looping

        // Debug
        System.out.println(inventorySlots);
        System.out.println(inventorySlots.get(GLOVES).getPrice());

        System.out.println(capitalCities.get("Sweden"));
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());




    }
}

package org.scrum.classes;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Equipment, Integer> stockLevels;


    public Inventory() {
        stockLevels = new HashMap<>();
    }


    public void addOrUpdateEquipment(Equipment equipment, int quantity) {
        stockLevels.put(equipment, stockLevels.getOrDefault(equipment, 0) + quantity);
    }


    public boolean removeEquipment(Equipment equipment, int quantity) {
        if (stockLevels.containsKey(equipment) && stockLevels.get(equipment) >= quantity) {
            stockLevels.put(equipment, stockLevels.get(equipment) - quantity);
            return true;
        }
        return false;
    }


    public int getStockLevel(Equipment equipment) {
        return stockLevels.getOrDefault(equipment, 0);
    }


    public Map<Equipment, Integer> getStockLevels() { return stockLevels; }
    public void setStockLevels(Map<Equipment, Integer> stockLevels) { this.stockLevels = stockLevels; }
}


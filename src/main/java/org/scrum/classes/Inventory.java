package org.scrum.classes;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Equipment, Integer> stockLevels;

    // Constructor
    public Inventory() {
        stockLevels = new HashMap<>();
    }

    // Adaugă echipament la inventar sau actualizează stocul
    public void addOrUpdateEquipment(Equipment equipment, int quantity) {
        stockLevels.put(equipment, stockLevels.getOrDefault(equipment, 0) + quantity);
    }

    // Scade cantitatea de echipament din stoc
    public boolean removeEquipment(Equipment equipment, int quantity) {
        if (stockLevels.containsKey(equipment) && stockLevels.get(equipment) >= quantity) {
            stockLevels.put(equipment, stockLevels.get(equipment) - quantity);
            return true;
        }
        return false;
    }

    // Verifică stocul disponibil pentru un echipament
    public int getStockLevel(Equipment equipment) {
        return stockLevels.getOrDefault(equipment, 0);
    }

    // Getters și Setters
    public Map<Equipment, Integer> getStockLevels() { return stockLevels; }
    public void setStockLevels(Map<Equipment, Integer> stockLevels) { this.stockLevels = stockLevels; }
}


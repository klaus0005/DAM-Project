package org.equipments.classes;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Equipment> equipments;
    private List<Integer> quantities;

    public Inventory() {
        this.equipments = new ArrayList<>();
        this.quantities = new ArrayList<>();
    }

    public void addOrUpdateEquipment(Equipment equipment, int quantity) {
        int index = equipments.indexOf(equipment);
        if (index != -1) {
            // Actualizăm cantitatea existentă
            quantities.set(index, quantities.get(index) + quantity);
        } else {
            // Adăugăm echipamentul și cantitatea
            equipments.add(equipment);
            quantities.add(quantity);
        }
    }

    public boolean removeEquipment(Equipment equipment, int quantity) {
        int index = equipments.indexOf(equipment);
        if (index != -1 && quantities.get(index) >= quantity) {
            quantities.set(index, quantities.get(index) - quantity);
            return true;
        }
        return false;
    }

    public int getStockLevel(Equipment equipment) {
        int index = equipments.indexOf(equipment);
        return (index != -1) ? quantities.get(index) : 0;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public void setInventory(List<Equipment> equipments, List<Integer> quantities) {
        if (equipments.size() != quantities.size()) {
            throw new IllegalArgumentException("Equipment and quantities lists must have the same size.");
        }
        this.equipments = equipments;
        this.quantities = quantities;
    }
}

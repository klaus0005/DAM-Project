package org.equipments.classes;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data // Generează getter, setter, toString, equals, hashCode
@NoArgsConstructor // Creează un constructor fără parametri
public class Inventory {
    private List<Equipment> equipments = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();

    // Adaugă sau actualizează echipamentul în inventar
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

    // Elimină o cantitate dintr-un echipament specificat
    public boolean removeEquipment(Equipment equipment, int quantity) {
        int index = equipments.indexOf(equipment);
        if (index != -1 && quantities.get(index) >= quantity) {
            quantities.set(index, quantities.get(index) - quantity);
            return true;
        }
        return false;
    }

    // Obține stocul curent pentru un echipament
    public int getStockLevel(Equipment equipment) {
        int index = equipments.indexOf(equipment);
        return (index != -1) ? quantities.get(index) : 0;
    }

    // Setează inventarul complet
    public void setInventory(List<Equipment> equipments, List<Integer> quantities) {
        if (equipments.size() != quantities.size()) {
            throw new IllegalArgumentException("Equipment and quantities lists must have the same size.");
        }
        this.equipments = equipments;
        this.quantities = quantities;
    }
}

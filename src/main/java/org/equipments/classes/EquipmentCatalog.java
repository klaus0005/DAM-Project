package org.equipments.classes;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data // Generează getter, setter, toString, equals, hashCode
@NoArgsConstructor // Creează un constructor fără parametri
public class EquipmentCatalog {
    private List<Equipment> equipmentList = new ArrayList<>();

    // Adaugă un echipament în catalog
    public void addEquipment(Equipment equipment) {
        equipmentList.add(equipment);
    }

    // Caută echipamentele după tip
    public List<Equipment> searchByType(String type) {
        List<Equipment> result = new ArrayList<>();
        for (Equipment equipment : equipmentList) {
            if (equipment.getType().equals(type)) {
                result.add(equipment);
            }
        }
        return result;
    }

    // Obține echipamentele disponibile
    public List<Equipment> getAvailableEquipment() {
        List<Equipment> result = new ArrayList<>();
        for (Equipment equipment : equipmentList) {
            if ("Available".equals(equipment.getStatus())) {
                result.add(equipment);
            }
        }
        return result;
    }
}

package org.scrum.classes;

import java.util.ArrayList;
import java.util.List;

public class EquipmentCatalog {
    private List<Equipment> equipmentList;

    // Constructor
    public EquipmentCatalog() {
        equipmentList = new ArrayList<>();
    }

    // Adaugă un echipament în catalog
    public void addEquipment(Equipment equipment) {
        equipmentList.add(equipment);
    }

    // Caută echipamente după tip
    public List<Equipment> searchByType(String type) {
        List<Equipment> result = new ArrayList<>();
        for (Equipment equipment : equipmentList) {
            if (equipment.getType().equals(type)) {
                result.add(equipment);
            }
        }
        return result;
    }

    // Obține echipamentele disponibile (cu statusul „Available”)
    public List<Equipment> getAvailableEquipment() {
        List<Equipment> result = new ArrayList<>();
        for (Equipment equipment : equipmentList) {
            if ("Available".equals(equipment.getStatus())) {
                result.add(equipment);
            }
        }
        return result;
    }

    // Getters și Setters
    public List<Equipment> getEquipmentList() { return equipmentList; }
    public void setEquipmentList(List<Equipment> equipmentList) { this.equipmentList = equipmentList; }
}

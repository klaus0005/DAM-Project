package org.equipments.classes;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class EquipmentCatalog {
    private List<Equipment> equipmentList = new ArrayList<>();


    public void addEquipment(Equipment equipment) {
        equipmentList.add(equipment);
    }


    public List<Equipment> searchByType(String type) {
        List<Equipment> result = new ArrayList<>();
        for (Equipment equipment : equipmentList) {
            if (equipment.getType().equals(type)) {
                result.add(equipment);
            }
        }
        return result;
    }


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

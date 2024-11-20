package org.equipments.domain.services;

import org.equipments.classes.Equipment;
import java.util.List;

public interface EquipmentService {
    List<Equipment> getAllEquipment();
    Equipment getEquipmentById(int id);
    Equipment addEquipment(Equipment equipment);
    Equipment updateEquipment(int id, Equipment equipment);
    void deleteEquipment(int id);
}
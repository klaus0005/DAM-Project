package org.equipments.domain.services;

import org.equipments.classes.Equipment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class EquipmentRepositoryTest {

    @Autowired
    private EquipmentRepository equipmentRepository;

    @BeforeEach
    public void setUp() {
        // Adaugă câteva echipamente în baza de date pentru testare
        equipmentRepository.save(new Equipment(1, "Excavator", "Heavy Machinery", "Available", "Warehouse A", 10000.0));
        equipmentRepository.save(new Equipment(2, "Bulldozer", "Heavy Machinery", "In Use", "Warehouse B", 15000.0));
        equipmentRepository.save(new Equipment(3, "Forklift", "Light Machinery", "Available", "Warehouse C", 8000.0));
    }

    @Test
    public void testFindByStatus() {
        // Găsește echipamentele disponibile
        List<Equipment> availableEquipments = equipmentRepository.findByStatus("Available");
        assertEquals(2, availableEquipments.size(), "Numărul de echipamente disponibile este incorect!");

        //Verificam primul echip.
        Equipment equipment = availableEquipments.get(0);
        assertEquals("Excavator", equipment.getName(), "Primul echipament disponibil are numele incorect!");
    }

    @Test
    public void testFindByType() {
        // Cauta
        List<Equipment> heavyMachinery = equipmentRepository.findByType("Heavy Machinery");
        assertEquals(2, heavyMachinery.size(), "Numărul de echipamente de tip 'Heavy Machinery' este incorect!");

        // Verifică un echipament
        Equipment equipment = heavyMachinery.get(1);
        assertEquals("Bulldozer", equipment.getName(), "Numele echipamentului de tip 'Heavy Machinery' este incorect!");
    }

    @Test
    public void testSaveAndFindById() {
        // Creeaza/salveaza un echipament
        Equipment newEquipment = new Equipment(4, "Crane", "Heavy Machinery", "Maintenance", "Warehouse D", 20000.0);
        equipmentRepository.save(newEquipment);

        // G
        Equipment foundEquipment = equipmentRepository.findById(4).orElse(null);
        assertNotNull(foundEquipment, "Echipamentul nu a fost găsit după ID!");
        assertEquals("Crane", foundEquipment.getName(), "Numele echipamentului găsit este incorect!");
    }
}

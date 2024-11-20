package org.equipments.domain.services;

import org.equipments.classes.Equipment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EquipmentFactoryUnitTest {

    @Test
    public void testCreateEquipment() {
        EquipmentFactory factory = new EquipmentFactoryImpl();

        Equipment equipment = factory.createEquipment(1, "Excavator", "Heavy Machinery", "Available", "Site A", 10000.0);

        assertNotNull(equipment, "Equipment nu a fost creat!");
        assertEquals(1, equipment.getId());
        assertEquals("Excavator", equipment.getName());
        assertEquals("Heavy Machinery", equipment.getType());
        assertEquals("Available", equipment.getStatus());
        assertEquals("Site A", equipment.getLocation());
        assertEquals(10000.0, equipment.getPrice());
    }
}

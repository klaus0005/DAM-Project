package org.equipments.classes;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceSchedule {
    private List<EquipmentMaintenance> schedule;

    public MaintenanceSchedule() {
        schedule = new ArrayList<>();
    }

    public List<EquipmentMaintenance> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<EquipmentMaintenance> schedule) {
        this.schedule = schedule;
    }

    public void addMaintenance(Equipment equipment, Maintenance maintenance) {
        EquipmentMaintenance equipmentMaintenance = findOrCreateEquipmentMaintenance(equipment);
        equipmentMaintenance.getMaintenances().add(maintenance);
    }

    public List<Maintenance> getScheduleForEquipment(Equipment equipment) {
        for (EquipmentMaintenance em : schedule) {
            if (em.getEquipment().equals(equipment)) {
                return em.getMaintenances();
            }
        }
        return new ArrayList<>();
    }

    private EquipmentMaintenance findOrCreateEquipmentMaintenance(Equipment equipment) {
        for (EquipmentMaintenance em : schedule) {
            if (em.getEquipment().equals(equipment)) {
                return em;
            }
        }
        EquipmentMaintenance newEntry = new EquipmentMaintenance(equipment, new ArrayList<>());
        schedule.add(newEntry);
        return newEntry;
    }

    // Nested class to represent the relationship between Equipment and its Maintenances
    public static class EquipmentMaintenance {
        private Equipment equipment;
        private List<Maintenance> maintenances;

        public EquipmentMaintenance(Equipment equipment, List<Maintenance> maintenances) {
            this.equipment = equipment;
            this.maintenances = maintenances;
        }

        public Equipment getEquipment() {
            return equipment;
        }

        public void setEquipment(Equipment equipment) {
            this.equipment = equipment;
        }

        public List<Maintenance> getMaintenances() {
            return maintenances;
        }

        public void setMaintenances(List<Maintenance> maintenances) {
            this.maintenances = maintenances;
        }
    }
}

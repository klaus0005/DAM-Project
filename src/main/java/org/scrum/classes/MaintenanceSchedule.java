package org.scrum.classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaintenanceSchedule {
    private Map<Equipment, List<Maintenance>> schedule;

    // Constructor
    public MaintenanceSchedule() {
        schedule = new HashMap<>();
    }

    // Getters și Setters
    public Map<Equipment, List<Maintenance>> getSchedule() { return schedule; }
    public void setSchedule(Map<Equipment, List<Maintenance>> schedule) { this.schedule = schedule; }

    public void addMaintenance(Equipment equipment, Maintenance maintenance) {
        schedule.computeIfAbsent(equipment, k -> new java.util.ArrayList<>()).add(maintenance);
    }

    public List<Maintenance> getScheduleForEquipment(Equipment equipment) {
        return schedule.get(equipment);
    }
}

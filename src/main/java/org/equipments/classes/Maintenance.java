package org.equipments.classes;

import java.util.Date;

public class Maintenance {
    private int maintenanceId;
    private Equipment equipment;
    private Date maintenanceDate;
    private String maintenanceType;
    private String description;


    public Maintenance(int maintenanceId, Equipment equipment, Date maintenanceDate, String maintenanceType, String description) {
        this.maintenanceId = maintenanceId;
        this.equipment = equipment;
        this.maintenanceDate = maintenanceDate;
        this.maintenanceType = maintenanceType;
        this.description = description;
    }


    public int getMaintenanceId() { return maintenanceId; }
    public void setMaintenanceId(int maintenanceId) { this.maintenanceId = maintenanceId; }

    public Equipment getEquipment() { return equipment; }
    public void setEquipment(Equipment equipment) { this.equipment = equipment; }

    public Date getMaintenanceDate() { return maintenanceDate; }
    public void setMaintenanceDate(Date maintenanceDate) { this.maintenanceDate = maintenanceDate; }

    public String getMaintenanceType() { return maintenanceType; }
    public void setMaintenanceType(String maintenanceType) { this.maintenanceType = maintenanceType; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}

package org.scrum.classes;

import java.util.Date;
import java.util.List;

public class Equipment {
    private int id;
    private String name;
    private String type;
    private String status;
    private Date acquisitionDate;
    private double price;
    private String location;
    private List<Maintenance> maintenanceHistory;
    private List<RepairRequest> repairHistory;

    // Constructor
    public Equipment(int id, String name, String type, String status, Date acquisitionDate, double price, String location) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.acquisitionDate = acquisitionDate;
        this.price = price;
        this.location = location;
    }

    // Getters și Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Date getAcquisitionDate() { return acquisitionDate; }
    public void setAcquisitionDate(Date acquisitionDate) { this.acquisitionDate = acquisitionDate; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public List<Maintenance> getMaintenanceHistory() { return maintenanceHistory; }
    public void setMaintenanceHistory(List<Maintenance> maintenanceHistory) { this.maintenanceHistory = maintenanceHistory; }

    public List<RepairRequest> getRepairHistory() { return repairHistory; }
    public void setRepairHistory(List<RepairRequest> repairHistory) { this.repairHistory = repairHistory; }
}


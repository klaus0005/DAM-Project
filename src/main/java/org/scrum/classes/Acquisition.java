package org.scrum.classes;

import java.util.Date;
import java.util.List;

public class Acquisition {
    private int acquisitionId;
    private Date acquisitionDate;
    private double totalAmount;
    private List<Equipment> equipmentList;

    // Constructor
    public Acquisition(int acquisitionId, Date acquisitionDate, double totalAmount, List<Equipment> equipmentList) {
        this.acquisitionId = acquisitionId;
        this.acquisitionDate = acquisitionDate;
        this.totalAmount = totalAmount;
        this.equipmentList = equipmentList;
    }

    // Getters și Setters
    public int getAcquisitionId() { return acquisitionId; }
    public void setAcquisitionId(int acquisitionId) { this.acquisitionId = acquisitionId; }

    public Date getAcquisitionDate() { return acquisitionDate; }
    public void setAcquisitionDate(Date acquisitionDate) { this.acquisitionDate = acquisitionDate; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public List<Equipment> getEquipmentList() { return equipmentList; }
    public void setEquipmentList(List<Equipment> equipmentList) { this.equipmentList = equipmentList; }
}

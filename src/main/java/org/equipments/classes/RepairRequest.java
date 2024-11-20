package org.equipments.classes;

import java.util.Date;
import java.util.List;

public class RepairRequest {
    private int requestId;
    private Equipment equipment;
    private String issueDescription;
    private Date requestDate;
    private String status;
    private User technician;
    private List<String> repairActivities;


    public RepairRequest(int requestId, Equipment equipment, String issueDescription, Date requestDate, String status, User technician) {
        this.requestId = requestId;
        this.equipment = equipment;
        this.issueDescription = issueDescription;
        this.requestDate = requestDate;
        this.status = status;
        this.technician = technician;
    }


    public int getRequestId() { return requestId; }
    public void setRequestId(int requestId) { this.requestId = requestId; }

    public Equipment getEquipment() { return equipment; }
    public void setEquipment(Equipment equipment) { this.equipment = equipment; }

    public String getIssueDescription() { return issueDescription; }
    public void setIssueDescription(String issueDescription) { this.issueDescription = issueDescription; }

    public Date getRequestDate() { return requestDate; }
    public void setRequestDate(Date requestDate) { this.requestDate = requestDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public User getTechnician() { return technician; }
    public void setTechnician(User technician) { this.technician = technician; }

    public List<String> getRepairActivities() { return repairActivities; }
    public void setRepairActivities(List<String> repairActivities) { this.repairActivities = repairActivities; }
}

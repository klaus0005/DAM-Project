package org.scrum.classes;

import java.util.Date;
import java.util.List;

public class Report {
    private int reportId;
    private String reportType; // de exemplu: "Equipment Report", "Repair Report"
    private Date generatedDate;
    private String content;
    private List<Equipment> equipmentList;

    // Constructor
    public Report(int reportId, String reportType, Date generatedDate, String content, List<Equipment> equipmentList) {
        this.reportId = reportId;
        this.reportType = reportType;
        this.generatedDate = generatedDate;
        this.content = content;
        this.equipmentList = equipmentList;
    }

    // Getters și Setters
    public int getReportId() { return reportId; }
    public void setReportId(int reportId) { this.reportId = reportId; }

    public String getReportType() { return reportType; }
    public void setReportType(String reportType) { this.reportType = reportType; }

    public Date getGeneratedDate() { return generatedDate; }
    public void setGeneratedDate(Date generatedDate) { this.generatedDate = generatedDate; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public List<Equipment> getEquipmentList() { return equipmentList; }
    public void setEquipmentList(List<Equipment> equipmentList) { this.equipmentList = equipmentList; }
}

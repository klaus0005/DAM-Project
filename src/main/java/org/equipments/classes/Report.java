package org.equipments.classes;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

import java.util.Date;
import java.util.List;

@Data // Generează getter, setter, toString, equals, hashCode
@AllArgsConstructor // Constructor cu toți parametrii
@NoArgsConstructor // Constructor fără parametri
@Builder // Permite utilizarea unui builder pattern
public class Report {
    private int reportId;
    private String reportType; // de exemplu: "Equipment Report", "Repair Report"
    private Date generatedDate;
    private String content;
    private List<Equipment> equipmentList;
}

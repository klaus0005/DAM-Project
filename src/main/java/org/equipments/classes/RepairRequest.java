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
public class RepairRequest {
    private int requestId;
    private Equipment equipment;
    private String issueDescription;
    private Date requestDate;
    private String status;
    private User technician;
    private List<String> repairActivities;
}

package org.equipments.classes;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RepairRequest {
    @Id @GeneratedValue
    private int requestId;
    private Equipment equipment;
    private String issueDescription;
    private Date requestDate;
    private String status;
    private User technician;
    private List<String> repairActivities;
}

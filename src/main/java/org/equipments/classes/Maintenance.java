package org.equipments.classes;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Maintenance {
    private int maintenanceId;
    private Equipment equipment;
    private Date maintenanceDate;
    private String maintenanceType;
    private String description;
}

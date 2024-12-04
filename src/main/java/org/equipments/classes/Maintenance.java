package org.equipments.classes;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data // Generează getter, setter, toString, equals, hashCode
@AllArgsConstructor // Creează un constructor cu toți parametrii
@NoArgsConstructor // Creează un constructor fără parametri
public class Maintenance {
    private int maintenanceId;
    private Equipment equipment;
    private Date maintenanceDate;
    private String maintenanceType;
    private String description;
}

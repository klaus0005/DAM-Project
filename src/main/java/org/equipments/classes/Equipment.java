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
}

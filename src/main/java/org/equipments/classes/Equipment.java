package org.equipments.classes;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class Equipment {
    @Id @GeneratedValue
    private int id;
    private String name;
    private String type;
    private String status;
    private Date acquisitionDate;
    private double price;
    private String location;
    private List<Maintenance> maintenanceHistory;
    private List<RepairRequest> repairHistory;

    public Equipment(int id, String name, String type, String status, String location, double price) {
    }
}

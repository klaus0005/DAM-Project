package org.equipments.classes;

import jakarta.persistence.*;
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
@Entity
public class Equipment {
    @Id @GeneratedValue
    private int equipmentId;
    private String name;
    private String type;
    private String status;
    private Date acquisitionDate;
    private double price;
    private String location;
    private List<Maintenance> maintenanceHistory;
    private List<RepairRequest> repairHistory;

    @ManyToOne
    @JoinColumn(name = "id_acquisition")
    private Acquisition acquisition;

    public Equipment(int equipmentId, String name, String type, String status, String location, double price) {
    }
}

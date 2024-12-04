package org.equipments.classes;

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
public class Acquisition {
    private int acquisitionId;
    private Date acquisitionDate;
    private double totalAmount;
    private List<Equipment> equipmentList;
}

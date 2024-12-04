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
public class Report {
    private int reportId;
    private String reportType;
    private Date generatedDate;
    private String content;
    private List<Equipment> equipmentList;
}

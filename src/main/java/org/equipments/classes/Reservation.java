package org.equipments.classes;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reservation {
    private int reservationId;
    private Equipment equipment;
    private User user;
    private Date reservationDate;
    private Date returnDate;
}

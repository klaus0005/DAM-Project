package org.equipments.classes;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
    @Id @GeneratedValue
    private int reservationId;
    private Equipment equipment;
    private User user;
    private Date reservationDate;
    private Date returnDate;
}

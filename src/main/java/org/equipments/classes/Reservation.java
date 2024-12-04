package org.equipments.classes;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

import java.util.Date;

@Data // Generează getter, setter, toString, equals, hashCode
@AllArgsConstructor // Constructor cu toți parametrii
@NoArgsConstructor // Constructor fără parametri
@Builder // Permite utilizarea unui builder pattern
public class Reservation {
    private int reservationId;
    private Equipment equipment;
    private User user;
    private Date reservationDate;
    private Date returnDate;
}

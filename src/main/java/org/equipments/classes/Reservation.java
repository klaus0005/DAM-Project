package org.equipments.classes;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
@Entity
public class Reservation {
    @Id @GeneratedValue
    private int reservationId;
    @ManyToOne
    @JoinColumn(name = "equipment_id", referencedColumnName = "equipmentId")
    private Equipment equipment;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private User user;

    private Date reservationDate;
    private Date returnDate;
}

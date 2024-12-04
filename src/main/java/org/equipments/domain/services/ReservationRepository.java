package org.equipments.domain.services;
import org.equipments.classes.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationRepository {
    void save(Reservation reservation);
    void delete(int reservationId);
    Optional<Reservation> findById(int reservationId);
    List<Reservation> findAll();
}
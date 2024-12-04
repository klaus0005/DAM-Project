package org.equipments.domain.services;

import org.equipments.classes.Reservation;

import java.util.List;

public interface ReservationService {
    void createReservation(Reservation reservation);
    void cancelReservation(int reservationId);
    Reservation getReservationDetails(int reservationId);
    List<Reservation> getAllReservations();
    long calculateReservationDuration(int reservationId);
}
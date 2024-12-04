package org.equipments.domain.services;

import org.equipments.classes.Reservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReservationRepositoryImpl implements ReservationRepository {
    private final List<Reservation> reservations = new ArrayList<>();

    @Override
    public void save(Reservation reservation) {
        reservations.add(reservation);
    }

    @Override
    public void delete(int reservationId) {
        reservations.removeIf(reservation -> reservation.getReservationId() == reservationId);
    }

    @Override
    public Optional<Reservation> findById(int reservationId) {
        return reservations.stream()
                .filter(reservation -> reservation.getReservationId() == reservationId)
                .findFirst();
    }

    @Override
    public List<Reservation> findAll() {
        return new ArrayList<>(reservations);
    }
}
package org.equipments.domain.services;
import org.equipments.classes.Reservation;

import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

public class ReservationServiceImpl implements ReservationService {
    private final ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void createReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    @Override
    public void cancelReservation(int reservationId) {
        reservationRepository.delete(reservationId);
    }

    @Override
    public Reservation getReservationDetails(int reservationId) {
        return reservationRepository.findById(reservationId)
                .orElseThrow(() -> new IllegalArgumentException("Reservation not found with ID: " + reservationId));
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public long calculateReservationDuration(int reservationId) {
        Reservation reservation = getReservationDetails(reservationId);
        return ChronoUnit.DAYS.between(
                reservation.getReservationDate().toInstant(),
                reservation.getReturnDate().toInstant()
        );}}
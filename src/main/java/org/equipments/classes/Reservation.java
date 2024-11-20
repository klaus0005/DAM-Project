package org.equipments.classes;

import java.util.Date;

public class Reservation {
    private int reservationId;
    private Equipment equipment;
    private User user;
    private Date reservationDate;
    private Date returnDate;


    public Reservation(int reservationId, Equipment equipment, User user, Date reservationDate, Date returnDate) {
        this.reservationId = reservationId;
        this.equipment = equipment;
        this.user = user;
        this.reservationDate = reservationDate;
        this.returnDate = returnDate;
    }


    public int getReservationId() { return reservationId; }
    public void setReservationId(int reservationId) { this.reservationId = reservationId; }

    public Equipment getEquipment() { return equipment; }
    public void setEquipment(Equipment equipment) { this.equipment = equipment; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Date getReservationDate() { return reservationDate; }
    public void setReservationDate(Date reservationDate) { this.reservationDate = reservationDate; }

    public Date getReturnDate() { return returnDate; }
    public void setReturnDate(Date returnDate) { this.returnDate = returnDate; }
}

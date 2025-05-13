package ru.itis.inf403.lab2_07.booking;

import java.util.Date;

public class Booking {
    private Integer id;
    private Date arrivaldate;
    private Date stayingdate;
    private Date departuredate;
    private Hotel hotel;
    private Person person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(Date arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Date getStayingdate() {
        return stayingdate;
    }

    public void setStayingdate(Date stayingdate) {
        this.stayingdate = stayingdate;
    }

    public Date getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(Date departuredate) {
        this.departuredate = departuredate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

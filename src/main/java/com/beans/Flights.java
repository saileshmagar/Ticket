package com.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flights {
    @Id
    @Column(name="flight_id")
    private int flightId;
    @Column(name="start_date")
    private String startDate;
    @Column(name="return_Date")
    private String returnDate;
    @Column(name="leave_from")
    private String leaveFrom;
    @Column(name="where_to")
    private String whereTo;
    @Column(name="price")
    private float price;

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getLeaveFrom() {
        return leaveFrom;
    }

    public void setLeaveFrom(String leaveFrom) {
        this.leaveFrom = leaveFrom;
    }

    public String getWhereTo() {
        return whereTo;
    }

    public void setWhereTo(String whereTo) {
        this.whereTo = whereTo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

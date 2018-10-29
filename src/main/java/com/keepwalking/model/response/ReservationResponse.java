package com.keepwalking.model.response;

import com.keepwalking.model.Links;

public class ReservationResponse {

    private Long id;
    private Integer roomNumber;
    private Integer price;
    private Links links;


    public ReservationResponse() {
    }

    public ReservationResponse(Integer roomNumber, Integer price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Long getId() {
        return id;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public Links getLinks() {
        return links;
    }

}

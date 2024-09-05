package com.udea.vueloudea.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Flight implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origin;
    private String destination;
    private LocalDate date;
    private double price;

    private String baggageType; // Nuevo campo para el tipo de equipaje
    private String classType;   // Nuevo campo para el tipo de clase
    private int availableSeats; // Nuevo campo para el número de asientos disponibles

    public Flight() {
    }

    public Flight(Long id, String origin, String destination, LocalDate date, double price, String baggageType, String classType, int availableSeats) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.price = price;
        this.baggageType = baggageType;
        this.classType = classType;
        this.availableSeats = availableSeats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBaggageType() {
        return baggageType;
    }

    public void setBaggageType(String baggageType) {
        this.baggageType = baggageType;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight flight)) return false;
        return Objects.equals(getId(), flight.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

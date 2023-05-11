package com.food.ordering.system.order.service.domain.valueobject;

import java.util.Objects;
import java.util.UUID;

public class StreetAddress {
    private final UUID id;
    private final String city;
    private final String postalCode;
    private final String street;

    public StreetAddress(UUID id, String city, String postalCode, String street) {
        this.id = id;
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
    }

    public UUID getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreetAddress that = (StreetAddress) o;
        return getCity().equals(that.getCity()) && getPostalCode().equals(that.getPostalCode())
                && getStreet().equals(that.getStreet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getPostalCode(), getStreet());
    }
}

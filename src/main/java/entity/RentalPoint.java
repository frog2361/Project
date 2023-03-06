package entity;

import java.util.Objects;

public class RentalPoint {

    private Long id;

    private String location;

    private RentalPointStatus rentalPointStatus;

    public RentalPoint() {
    }

    public RentalPoint(Long id, String location, RentalPointStatus rentalPointStatus) {
        this.id = id;
        this.location = location;
        this.rentalPointStatus = rentalPointStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public RentalPointStatus getRentalPointStatus() {
        return rentalPointStatus;
    }

    public void setRentalPointStatus(RentalPointStatus rentalPointStatus) {
        this.rentalPointStatus = rentalPointStatus;
    }

    @Override
    public String toString() {
        return "RentalPoint{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", rentalPointStatus=" + rentalPointStatus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentalPoint that = (RentalPoint) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

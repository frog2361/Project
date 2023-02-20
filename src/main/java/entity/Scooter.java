package entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Scooter {
    private Long id;

    private ScooterStatus scooterStatus;

    private BigDecimal pricePerMinute;

    private RentalPoint rentalPoint;

    private Model model;

    private User user;

    public Scooter() {
    }

    public Scooter(Long id, ScooterStatus scooterStatus, BigDecimal pricePerMinute, RentalPoint rentalPoint, Model model, User user) {
        this.id = id;
        this.scooterStatus = scooterStatus;
        this.pricePerMinute = pricePerMinute;
        this.rentalPoint = rentalPoint;
        this.model = model;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ScooterStatus getScooterStatus() {
        return scooterStatus;
    }

    public void setScooterStatus(ScooterStatus scooterStatus) {
        this.scooterStatus = scooterStatus;
    }

    public BigDecimal getPricePerMinute() {
        return pricePerMinute;
    }

    public void setPricePerMinute(BigDecimal pricePerMinute) {
        this.pricePerMinute = pricePerMinute;
    }

    public RentalPoint getRentalPoint() {
        return rentalPoint;
    }

    public void setRentalPoint(RentalPoint rentalPoint) {
        this.rentalPoint = rentalPoint;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "id=" + id +
                ", scooterStatus=" + scooterStatus +
                ", pricePerMinute=" + pricePerMinute +
                ", rentalPoint=" + rentalPoint +
                ", model=" + model +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scooter scooter = (Scooter) o;
        return Objects.equals(id, scooter.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

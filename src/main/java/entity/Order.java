package entity;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Order {

    private Long id;

    private LocalDateTime orderStarted;

    private LocalDateTime orderFinished;

    private BigDecimal rentPrice;

    private Scooter scooter;

    private User user;

    private RentalPoint rentalPoint;

    public Order() {
    }

    public Order(Long id, LocalDateTime orderStarted, LocalDateTime orderFinished, BigDecimal rentPrice, Scooter scooter, User user, RentalPoint rentalPoint) {
        this.id = id;
        this.orderStarted = orderStarted;
        this.orderFinished = orderFinished;
        this.rentPrice = rentPrice;
        this.scooter = scooter;
        this.user = user;
        this.rentalPoint = rentalPoint;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getOrderStarted() {
        return orderStarted;
    }

    public void setOrderStarted(LocalDateTime orderStarted) {
        this.orderStarted = orderStarted;
    }

    public LocalDateTime getOrderFinished() {
        return orderFinished;
    }

    public void setOrderFinished(LocalDateTime orderFinished) {
        this.orderFinished = orderFinished;
    }

    public BigDecimal getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(BigDecimal rentPrice) {
        this.rentPrice = rentPrice;
    }

    public Scooter getScooter() {
        return scooter;
    }

    public void setScooter(Scooter scooter) {
        this.scooter = scooter;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RentalPoint getRentalPoint() {
        return rentalPoint;
    }

    public void setRentalPoint(RentalPoint rentalPoint) {
        this.rentalPoint = rentalPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderStarted=" + orderStarted +
                ", orderFinished=" + orderFinished +
                ", rentPrice=" + rentPrice +
                ", scooter=" + scooter +
                ", user=" + user +
                ", rentalPoint=" + rentalPoint +
                '}';
    }
}

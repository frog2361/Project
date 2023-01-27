package entity;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Order {

    public BigDecimal countOrderPrice(LocalDateTime startRideAt, LocalDateTime finishRideAt, BigDecimal price) {
        Long start = startRideAt.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond();
        Long finish = finishRideAt.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond();
        return price.multiply(BigDecimal.valueOf((finish - start)));
    }
}

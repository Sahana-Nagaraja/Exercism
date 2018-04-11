import java.time.LocalDate;
import java.time.LocalDateTime;


public class Gigasecond {

    private LocalDateTime localDateTime;

    public Gigasecond(LocalDate of) {
        this.localDateTime = LocalDateTime.of(of.getYear(),of.getMonth(),of.getDayOfMonth(),0,0,0);

    }

    public Gigasecond(LocalDateTime of) {
        this.localDateTime = LocalDateTime.of(of.getYear(),of.getMonth(),of.getDayOfMonth(),of.getHour(),of.getMinute(),of.getSecond());
    }

    public LocalDateTime getDate() {
        localDateTime =  localDateTime.plusSeconds(1000000000);
        return localDateTime;
    }
}

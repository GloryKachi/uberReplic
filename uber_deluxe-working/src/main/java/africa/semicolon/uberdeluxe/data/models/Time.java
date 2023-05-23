package africa.semicolon.uberdeluxe.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Time {
    @Id
    private long id;
    private int seconds;
    private int minute;
    private int hour;
    private long rideId;

public void increaseSeconds(){
    seconds++;
}

public void increaseMinutes(){
    minute++;
}

}

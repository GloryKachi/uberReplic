package africa.semicolon.uberdeluxe.data.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Ride {
    @Id
    private long id;
    private String payment;
    private RideStatus rideStatus;
    private long driverId;
    private long passengerId;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Passenger passenger;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private GeoLocation location;
    private String destination;
    private String pickUpLocation;
    private LocalDateTime startTripTime = LocalDateTime.now();
    private long timeId;
}

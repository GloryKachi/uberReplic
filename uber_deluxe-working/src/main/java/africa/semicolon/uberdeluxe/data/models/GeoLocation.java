package africa.semicolon.uberdeluxe.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class GeoLocation {
    @Id
    private long id;
    private String countryCode  = "755-89";
    private String countryName = "nigeria ";
    private String region = " zsa33mm";
    private String city = "LAGOS-CITY";
    private String zipCode  = " vv333m";
    private double latitude = 68744;
    private double longitude = 90000;
    private String streetName = "sabo-street";



}

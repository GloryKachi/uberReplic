package africa.semicolon.uberdeluxe.service;

import africa.semicolon.uberdeluxe.data.dto.response.GeoCodeResponse;
import africa.semicolon.uberdeluxe.data.dto.response.GeoLocationResponse;
import africa.semicolon.uberdeluxe.data.models.Driver;
import africa.semicolon.uberdeluxe.data.models.Passenger;

public class BookRideService {

    ToolsService tools = new ToolsService();

    double lan = tools.generateLantitude();
    double lon = tools.generateLongtitude();




}

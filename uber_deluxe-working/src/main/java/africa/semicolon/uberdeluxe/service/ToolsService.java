package africa.semicolon.uberdeluxe.service;

import java.security.SecureRandom;

public class ToolsService {
SecureRandom random = new SecureRandom();
    public double generateLantitude(){
      double lat = random.nextInt(4000,4100);
      return lat;
    }
    public double generateLongtitude(){
      double lat = random.nextInt(4000,4100);
      return lat;
    }

}

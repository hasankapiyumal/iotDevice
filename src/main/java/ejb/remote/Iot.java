package ejb.remote;

import jakarta.ejb.Remote;

@Remote
public interface Iot {
 public Iot simulateRandomData();
 public double getVehicleSpeed();

 public void setVehicleSpeed(double vehicleSpeed);

 public boolean isTrafficLightStatus() ;

 public void setTrafficLightStatus(boolean trafficLightStatus);
 public double getLatitude();

 public void setLatitude(double latitude);

 public double getLongitude() ;
 public void setLongitude(double longitude);
}

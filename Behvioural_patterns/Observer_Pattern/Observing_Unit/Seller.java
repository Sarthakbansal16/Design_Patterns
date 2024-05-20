package Behvioural_patterns.Observer_Pattern.Observing_Unit;

import Behvioural_patterns.Observer_Pattern.Observing_person;

public class Seller implements Observing_person{
    private String location;
  
    @Override
    public void update(String location)
    {
        this.location = location;
        showLocation();
    }

    public void showLocation()
    {
        System.out.println("Notification at Seller - Current Location: " + location);
    }
}

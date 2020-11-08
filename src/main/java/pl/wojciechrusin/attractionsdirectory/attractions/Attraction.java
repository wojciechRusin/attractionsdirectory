package pl.wojciechrusin.attractionsdirectory.attractions;

import pl.wojciechrusin.attractionsdirectory.locations.City;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Attraction {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    private City city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

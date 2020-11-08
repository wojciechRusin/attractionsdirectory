package pl.wojciechrusin.attractionsdirectory.locations;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Region extends Location {

    @ManyToOne
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}

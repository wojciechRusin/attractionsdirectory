package pl.wojciechrusin.attractionsdirectory.locations;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class City extends Location {

    @ManyToOne
    private Region region;

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}

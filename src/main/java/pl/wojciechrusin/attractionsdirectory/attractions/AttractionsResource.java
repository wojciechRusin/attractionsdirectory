package pl.wojciechrusin.attractionsdirectory.attractions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttractionsResource {

    private AttractionsRepository attractionsRepository;

    public AttractionsResource(AttractionsRepository attractionsRepository) {
        this.attractionsRepository = attractionsRepository;
    }
    //http:localhost:8080/attractions
    @GetMapping("attractions")
    public Iterable<Attraction> getAttractions(){
        return attractionsRepository.findAll();

    }
}

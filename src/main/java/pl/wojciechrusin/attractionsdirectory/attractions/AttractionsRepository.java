package pl.wojciechrusin.attractionsdirectory.attractions;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttractionsRepository extends CrudRepository<Attraction, Long> {

}

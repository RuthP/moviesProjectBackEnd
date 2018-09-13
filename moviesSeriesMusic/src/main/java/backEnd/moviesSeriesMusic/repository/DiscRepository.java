package backEnd.moviesSeriesMusic.repository;

import backEnd.moviesSeriesMusic.domain.Disc;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author rpalomino
 */
public interface DiscRepository extends MongoRepository<Disc,String>{
}

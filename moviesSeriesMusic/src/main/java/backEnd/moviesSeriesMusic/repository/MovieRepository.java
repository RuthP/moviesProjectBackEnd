package backEnd.moviesSeriesMusic.repository;

import backEnd.moviesSeriesMusic.domain.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author rpalomino
 */
public interface MovieRepository extends MongoRepository<Movie, String> {
}

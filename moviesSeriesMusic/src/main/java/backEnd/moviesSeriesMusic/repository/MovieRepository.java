package backEnd.moviesSeriesMusic.repository;

import backEnd.moviesSeriesMusic.domain.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @author rpalomino
 */
public interface MovieRepository extends MongoRepository<Movie, String> {

  List<Movie> findByName (String name);

  @Query(value="{ 'idMovie' : ?0 }")
  Movie findMovieById(String idMovie);

}

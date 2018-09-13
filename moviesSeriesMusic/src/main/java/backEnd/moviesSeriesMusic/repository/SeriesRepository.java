package backEnd.moviesSeriesMusic.repository;

import backEnd.moviesSeriesMusic.domain.Series;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author rpalomino
 */
public interface SeriesRepository extends MongoRepository<Series,String> {
}

package backEnd.moviesSeriesMusic.service;

import backEnd.moviesSeriesMusic.domain.Movie;
import backEnd.moviesSeriesMusic.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rpalomino
 */
@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public List<Movie> listAllMovies (){

        List<Movie> listMovies = movieRepository.findAll();
        return listMovies;
    }

    public Movie saveMovie (Movie movie){

        return movieRepository.save(movie);
    }


}

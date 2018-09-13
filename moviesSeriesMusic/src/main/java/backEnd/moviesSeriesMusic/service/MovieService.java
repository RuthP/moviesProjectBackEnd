package backEnd.moviesSeriesMusic.service;

import backEnd.moviesSeriesMusic.domain.Movie;
import backEnd.moviesSeriesMusic.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author rpalomino
 */
@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public List<Movie> listAllMovies (){
        return movieRepository.findAll();
    }

    public Movie saveMovie (Movie movie){
        return movieRepository.save(movie);
    }

    public Movie findMovieById (String id){

      Optional<Movie> movie = movieRepository.findById(id);

      if(movie.isPresent()){
       return movie.get();
      }else {
        return new Movie();
      }

    }

    public void deleteMovie (String id){

      Movie movieDelete = findMovieById(id);

      movieRepository.delete(movieDelete);

    }

    public Movie updateMovie (String id, Movie movie){

      Movie movieUpdate = findMovieById(id);
      movieUpdate.setName(movie.getName());
      movieUpdate.setGender(movie.getGender());
      movieUpdate.setYear(movie.getYear());
      movieUpdate.setCoverPage(movie.getCoverPage());
      movieUpdate.setSecondCover(movie.getSecondCover());

      return movieRepository.save(movieUpdate);

    }


}

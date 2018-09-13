package backEnd.moviesSeriesMusic.controller;

import backEnd.moviesSeriesMusic.domain.Movie;
import backEnd.moviesSeriesMusic.service.MovieService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author rpalomino
 */
@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;


    @RequestMapping(
            method = RequestMethod.POST
    )
    public Movie saveMovie (@RequestBody Movie movie){
        return movieService.saveMovie(movie);
    }

    @RequestMapping(
            method = RequestMethod.GET
    )
    public List<Movie> getAllMovies (){
        return movieService.listAllMovies();
    }

    @RequestMapping(
      value = "/{id}",
      method = RequestMethod.GET
    )
    public Movie getMovieById (@PathVariable String id){
      return movieService.findMovieById(id);
    }

    @RequestMapping(
      value = "/{id}",
      method = RequestMethod.POST
    )
    public Movie updateMovie (@PathVariable String id, @RequestBody Movie movie){
      return movieService.updateMovie(id, movie);
    }

    @RequestMapping(
      value = "/{id}",
      method = RequestMethod.PUT
    )
    public void deleteMovieById (@PathVariable String id){
      movieService.deleteMovie(id);
    }

}

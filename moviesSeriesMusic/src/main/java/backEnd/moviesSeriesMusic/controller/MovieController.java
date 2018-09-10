package backEnd.moviesSeriesMusic.controller;

import backEnd.moviesSeriesMusic.domain.Movie;
import backEnd.moviesSeriesMusic.service.MovieService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rpalomino
 */
@RestController
@RequestMapping("/movies")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class MovieController {

    @Autowired
    private MovieService movieService;


    @RequestMapping(
            method = RequestMethod.POST
    )
    public Movie saveMovie (@RequestBody Movie movie){


        return movieService.saveMovie(movie);


    }



}

package backEnd.moviesSeriesMusic.controller;

import backEnd.moviesSeriesMusic.domain.Series;
import backEnd.moviesSeriesMusic.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author rpalomino
 */
@RestController
@RequestMapping("/series")
public class SeriesController {

    @Autowired
    SeriesService seriesService;

    @RequestMapping(
      method = RequestMethod.POST
    )
    public Series saveSeries (@RequestBody Series series){
      return seriesService.saveSeries(series);
    }

    @RequestMapping(
      method = RequestMethod.GET
    )
    public List<Series> getAllSeries () {
      return seriesService.listAllSeries();
    }

    @RequestMapping(
      value = "/id",
      method = RequestMethod.GET
    )
    public Series getSeriesById (@PathVariable String id){
      return seriesService.findSeriesById(id);
    }

    @RequestMapping(
      value = "/id",
      method = RequestMethod.POST
    )
    public Series updateSeries (@PathVariable String id,@RequestBody Series series){
      return seriesService.updateSeries(id,series);
    }

    @RequestMapping(
      value = "/{id}",
      method = RequestMethod.PUT
    )
    public void deleteSeriesById (@PathVariable String id){
      seriesService.deleteSeries(id);
    }


}

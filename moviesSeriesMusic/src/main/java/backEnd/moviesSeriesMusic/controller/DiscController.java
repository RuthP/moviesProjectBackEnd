package backEnd.moviesSeriesMusic.controller;

import backEnd.moviesSeriesMusic.domain.Disc;
import backEnd.moviesSeriesMusic.service.DiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author rpalomino
 */
@RestController
@RequestMapping("/Discs")
public class DiscController {

  @Autowired
  private DiscService discService;

  @RequestMapping(
    method = RequestMethod.POST
  )
  public Disc saveDisc (@RequestBody Disc disc){
    return discService.saveDisc(disc);
  }

  @RequestMapping(
    method = RequestMethod.GET
  )
  public List<Disc> getAllDiscs (){
    return discService.listAllDisc();
  }

  @RequestMapping(
    value = "/{id}",
    method = RequestMethod.GET
  )
  public Disc getDiscById (@PathVariable String id){
    return discService.findDiscById(id);
  }

  @RequestMapping(
    value = "/{id}",
    method = RequestMethod.POST
  )
  public Disc updateDisc (@PathVariable String id, @RequestBody Disc disc){
    return discService.updateDisc(id,disc);
  }

  @RequestMapping(
    value = "/{id}",
    method = RequestMethod.PUT
  )
  public void deleteDiscById (@PathVariable String id){
    discService.deleteDisc(id);
  }


}

package backEnd.moviesSeriesMusic.service;

import backEnd.moviesSeriesMusic.domain.Disc;
import backEnd.moviesSeriesMusic.repository.DiscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author rpalomino
 */
@Service
public class DiscService {

  @Autowired
  private DiscRepository discRepository;

  public List<Disc> listAllDisc () {
    return discRepository.findAll();
  }

  public Disc saveDisc (Disc disc) {
    return discRepository.save(disc);
  }

  public Disc findDiscById(String id){

    Optional<Disc> disc = discRepository.findById(id);

    if(disc.isPresent()){
      return disc.get();
    }else {
      return new Disc();
    }

  }

  public void deleteDisc (String id) {

    Disc discDelete = findDiscById(id);

    discRepository.delete(discDelete);

  }

  public Disc updateDisc (String id, Disc disc){

    Disc discUpdate = findDiscById(id);
    discUpdate.setNameDisc(disc.getNameDisc());
    discUpdate.setNumber(disc.getNumber());
    discUpdate.setType(disc.getType());

    return discRepository.save(discUpdate);

  }
}

package backEnd.moviesSeriesMusic.service;

import backEnd.moviesSeriesMusic.domain.Series;
import backEnd.moviesSeriesMusic.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author rpalomino
 */
@Service
public class SeriesService {

    @Autowired
    SeriesRepository seriesRepository;

    public List<Series> listAllSeries () {
      return seriesRepository.findAll();
    }

    public Series saveSeries (Series series){
      return seriesRepository.save(series);
    }

    public Series findSeriesById (String id){

      Optional<Series> series = seriesRepository.findById(id);

      if(series.isPresent()){
        return series.get();
      }else {
        return new Series();
      }

    }

    public void deleteSeries (String id){

      Series seriesDelete = findSeriesById(id);

      seriesRepository.delete(seriesDelete);

    }

    public Series updateSeries (String id, Series series){

      Series seriesUpdate = findSeriesById(id);
      seriesUpdate.setName(series.getName());
      seriesUpdate.setSeason(series.getSeason());
      seriesUpdate.setYear(series.getYear());
      seriesUpdate.setGender(series.getGender());
      seriesUpdate.setPart(series.getPart());
      seriesUpdate.setCoverPage(series.getCoverPage());
      seriesUpdate.setSecondCover(series.getSecondCover());

      return seriesRepository.save(seriesUpdate);

    }


}

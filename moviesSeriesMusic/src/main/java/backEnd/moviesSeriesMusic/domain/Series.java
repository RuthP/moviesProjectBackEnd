package backEnd.moviesSeriesMusic.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author rpalomino
 */
@Document
public class Series {

    @Id
    private String idSeries;

    private String name;

    private Integer season;

    private Integer year;

    private String coverPage;

    private String secondCover;

    private String gender;

    private Integer part;

    public Series(){

    }

    public Series(String idSeries, String name, Integer season, Integer year, String coverPage, String secondCover, String gender, Integer part) {
      this.idSeries = idSeries;
      this.name = name;
      this.season = season;
      this.year = year;
      this.coverPage = coverPage;
      this.secondCover = secondCover;
      this.gender = gender;
      this.part = part;
    }

    public String getIdSeries() {
      return idSeries;
    }

    public void setIdSeries(String idSeries) {
      this.idSeries = idSeries;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Integer getSeason() {
      return season;
    }

    public void setSeason(Integer season) {
      this.season = season;
    }

    public Integer getYear() {
      return year;
    }

    public void setYear(Integer year) {
      this.year = year;
    }

    public String getCoverPage() {
      return coverPage;
    }

    public void setCoverPage(String coverPage) {
      this.coverPage = coverPage;
    }

    public String getSecondCover() {
      return secondCover;
    }

    public void setSecondCover(String secondCover) {
      this.secondCover = secondCover;
    }

    public String getGender() {
      return gender;
    }

    public void setGender(String gender) {
      this.gender = gender;
    }

    public Integer getPart() {
      return part;
    }

    public void setPart(Integer part) {
      this.part = part;
    }
}

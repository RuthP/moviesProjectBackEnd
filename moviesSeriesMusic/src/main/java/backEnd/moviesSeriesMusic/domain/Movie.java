package backEnd.moviesSeriesMusic.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author rpalomino
 */
@Document
public class Movie {

    @Id
    private String idMovie;

    private String name;

    private Integer year;

    private String coverPage;

    private String secondCover;

    private String gender;

    public Movie (){

    }

    public Movie(String idMovie, String name, Integer year, String coverPage, String secondCover, String gender) {
        this.idMovie = idMovie;
        this.name = name;
        this.year = year;
        this.coverPage = coverPage;
        this.secondCover = secondCover;
        this.gender = gender;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}

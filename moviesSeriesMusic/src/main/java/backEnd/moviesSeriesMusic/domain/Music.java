package backEnd.moviesSeriesMusic.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author rpalomino
 */
@Document
public class Music {

    @Id
    private String idMusic;

    private String nameArtistGroup;

    private String nameAlbum;

    private String yearAlbum;

    private String coverPage;

    private String secondCover;

    private String gender;

    private Integer part;

    public Music(){

    }

    public Music(String idMusic, String nameArtistGroup, String nameAlbum, String yearAlbum, String coverPage, String secondCover, String gender, Integer part) {
      this.idMusic = idMusic;
      this.nameArtistGroup = nameArtistGroup;
      this.nameAlbum = nameAlbum;
      this.yearAlbum = yearAlbum;
      this.coverPage = coverPage;
      this.secondCover = secondCover;
      this.gender = gender;
      this.part = part;
    }

    public String getIdMusic() {
      return idMusic;
    }

    public void setIdMusic(String idMusic) {
      this.idMusic = idMusic;
    }

    public String getNameArtistGroup() {
      return nameArtistGroup;
    }

    public void setNameArtistGroup(String nameArtistGroup) {
      this.nameArtistGroup = nameArtistGroup;
    }

    public String getNameAlbum() {
      return nameAlbum;
    }

    public void setNameAlbum(String nameAlbum) {
      this.nameAlbum = nameAlbum;
    }

    public String getYearAlbum() {
      return yearAlbum;
    }

    public void setYearAlbum(String yearAlbum) {
      this.yearAlbum = yearAlbum;
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

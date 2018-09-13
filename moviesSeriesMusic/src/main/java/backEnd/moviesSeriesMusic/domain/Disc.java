package backEnd.moviesSeriesMusic.domain;

import org.springframework.data.annotation.Id;

/**
 * @author rpalomino
 */
public class Disc {

    @Id
    private String idDisc;

    private Integer number;

    private String type;

    private String nameDisc;

    public Disc(){

    }

    public Disc(String idDisc, Integer number, String type, String nameDisc) {
      this.idDisc = idDisc;
      this.number = number;
      this.type = type;
      this.nameDisc = nameDisc;
    }

    public String getIdDisc() {
      return idDisc;
    }

    public void setIdDisc(String idDisc) {
      this.idDisc = idDisc;
    }

    public Integer getNumber() {
      return number;
    }

    public void setNumber(Integer number) {
      this.number = number;
    }

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }

    public String getNameDisc() {
      return nameDisc;
    }

    public void setNameDisc(String nameDisc) {
      this.nameDisc = nameDisc;
    }
}

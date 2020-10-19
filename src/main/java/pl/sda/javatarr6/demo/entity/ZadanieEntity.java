package pl.sda.javatarr6.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

//encja
@Entity
public class ZadanieEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String opis;
    //@Temporal(TemporalType.DATE)
    //private String dataUtworzenia;
    //@Temporal(TemporalType.DATE)
    //private String dataZamkniecia;
    //private boolean ukonczone;

    //Gettery Settery


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public ZadanieEntity(String opis) {

        this.opis = opis;
    }

    public ZadanieEntity() {
    }
}


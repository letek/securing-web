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
    private String dataUtworzenia;
    //@Temporal(TemporalType.DATE)
    private String dataZamkniecia;
    private boolean ukonczone;

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

    public String getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setDataUtworzenia(String dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
    }

    public String getDataZamkniecia() {
        return dataZamkniecia;
    }

    public void setDataZamkniecia(String dataZamkniecia) {
        this.dataZamkniecia = dataZamkniecia;
    }

    public boolean isUkonczone() {
        return ukonczone;
    }

    public void setUkonczone(boolean ukonczone) {
        this.ukonczone = ukonczone;
    }


    //konstruktory
    public ZadanieEntity() {
        System.out.println("sout z zadanieentity bez argumentowy");
    }

    public ZadanieEntity(long id, String opis, String dataUtworzenia, String dataZamkniecia, boolean ukonczone) {
        this.id = id;
        this.opis = opis;
        this.dataUtworzenia = dataUtworzenia;
        this.dataZamkniecia = dataZamkniecia;
        this.ukonczone = ukonczone;
        System.out.println("sout z Zadanieentity full kondtruktor");
    }

}


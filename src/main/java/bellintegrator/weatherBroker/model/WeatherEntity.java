package bellintegrator.weatherBroker.model;

import javax.persistence.*;

@Entity
@Table(name = "weather")
public class WeatherEntity {

        @Id
        @GeneratedValue
        @Column(name = "id")
        private Long id;

        /**
         * Служебное поле hibernate
         */
        @Version
        private Integer version;

        /**
         * Наименование города
         */
        @Column(name = "city", nullable = true, length = 50)
        private String city;

        /**
         * Температура
         */
        @Column(name = "temperature", nullable = true)
        private Integer temp;

        /**
         * Дата
         */
        @Column(name = "date", nullable = true, length = 50)
        private String date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

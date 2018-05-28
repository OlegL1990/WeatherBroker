package bellintegrator.weatherBroker.model;

import bellintegrator.weatherBroker.view.WeatherView;

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
        @Column(name = "temp", nullable = true,length = 50)
        private String temp;

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

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public WeatherEntity(WeatherView weatherView){
        this.city = weatherView.getQuery().getResults().getChannel().getLocation().getCity();
        this.temp = weatherView.getQuery().getResults().getChannel().getItem().getCondition().getTemp();
        this.date = weatherView.getQuery().getResults().getChannel().getItem().getCondition().getDate();
    }
}

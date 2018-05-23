
package bellintegrator.weatherBroker.controller;

import bellintegrator.weatherBroker.service.WeatherService;
import bellintegrator.weatherBroker.view.WeatherView;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;



@Controller
public  class WeatherRequest {
    @Autowired
    WeatherService weatherService;

    private static   String buildQuery(String city){
        StringBuilder query = new StringBuilder();
        query.append("https://query.yahooapis.com/v1/public/yql?q=select%20item.condition%20from%20weather.forecast%20where%20%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22");
        query.append(city);
        query.append("%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys");
        return query.toString();
    }

    public static   WeatherView request(String city)throws IOException {
        String query = buildQuery(city);
        URL url = new URL(query);
        URLConnection connection = url.openConnection();
        InputStream is = connection.getInputStream();
        ObjectMapper objectMapper = new ObjectMapper();
        WeatherView wv = objectMapper.readValue(is, WeatherView.class);
        return wv;
        }

    public  void sendToTopic(WeatherView wv){
        weatherService.send(wv);
    }

    }



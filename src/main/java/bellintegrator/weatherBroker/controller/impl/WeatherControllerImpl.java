
package bellintegrator.weatherBroker.controller.impl;

import bellintegrator.weatherBroker.controller.WeatherController;
import bellintegrator.weatherBroker.model.WeatherEntity;
import bellintegrator.weatherBroker.service.impl.WeatherServiceImpl;
import bellintegrator.weatherBroker.view.WeatherView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public  class WeatherControllerImpl implements WeatherController {

    @Autowired
    WeatherServiceImpl weatherService;




    /*public static   WeatherView request(String city)throws IOException {
        String query = buildQuery(city);
        URL url = new URL(query);
        URLConnection connection = url.openConnection();
        InputStream is = connection.getInputStream();
        ObjectMapper objectMapper = new ObjectMapper();
        WeatherView wv = objectMapper.readValue(is, WeatherView.class);
        return wv;
        }
      */

    @RequestMapping(value = "/submit")
    public ResponseEntity<Void> submitWeatherForCity(@RequestParam String city) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://query.yahooapis.com/v1/public/yql?q=select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"" + city + ", ak\")&format=json&env=store://datatables.org/alltableswithkeys";
        WeatherView weatherView = restTemplate.getForObject(url, WeatherView.class);
        weatherService.send(weatherView);
        return new ResponseEntity<Void>(HttpStatus.OK);

    }

    @GetMapping(value = "/{city}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<WeatherEntity>> getWeatherForCity(@PathVariable("city") String city) {
        List<WeatherEntity> list = weatherService.loadByCity(city);
        return new ResponseEntity<List<WeatherEntity>>(list, HttpStatus.OK);
    }
}



package bellintegrator.weatherBroker.view;

import java.io.Serializable;

public class WeatherView implements Serializable {
    Query QueryObject;

    @Override
    public String toString() {
        return "view{" +
                "QueryObject=" + QueryObject +
                '}';
    }
// Getter Methods

    public Query getQuery() {
        return QueryObject;
    }

    // Setter Methods

    public void setQuery(Query queryObject) {
        this.QueryObject = queryObject;
    }
}

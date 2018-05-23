package bellintegrator.weatherBroker.WeatherJSON;
public class WeatherJSON {
    Query QueryObject;

    @Override
    public String toString() {
        return "WeatherJSON{" +
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

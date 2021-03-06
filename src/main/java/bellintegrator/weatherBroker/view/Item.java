package bellintegrator.weatherBroker.view;


public class Item
{
    private Guid guid;

    private String pubDate;

    private String title;

    private Forecast[] forecast;

    private Condition condition;

    private String description;

    private String link;

    private String longg;

    private String lat;

    public Guid getGuid ()
    {
        return guid;
    }

    public void setGuid (Guid guid)
    {
        this.guid = guid;
    }

    public String getPubDate ()
    {
        return pubDate;
    }

    public void setPubDate (String pubDate)
    {
        this.pubDate = pubDate;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public Forecast[] getForecast ()
    {
        return forecast;
    }

    public void setForecast (Forecast[] forecast)
    {
        this.forecast = forecast;
    }

    public void setCondition (Condition condition){
        this.condition = condition;
    }

    public Condition getCondition (){
        return condition;
    }



    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getLink ()
    {
        return link;
    }

    public void setLink (String link)
    {
        this.link = link;
    }

    public String getLong ()
    {
        return longg;
    }

    public void setLong (String longg)
    {
        this.longg = longg;
    }

    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [guid = "+guid+", pubDate = "+pubDate+", title = "+title+", forecast = "+forecast+", condition = "+condition+", description = "+description+", link = "+link+", long = "+longg+", lat = "+lat+"]";
    }
}
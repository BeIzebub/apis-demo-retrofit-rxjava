package com.kg.apis;


import java.util.List;

public class CityInfo
{
    private String sun_set;

//    private Parent parent;

//    private Sources[] sources;

    private String latt_long;

    private String timezone;

    private String timezone_name;

    private int woeid;

    private String sun_rise;

    private List<Consolidated_weather> consolidated_weather;

    private String time;

    private String title;

    private String location_type;

    public String getSun_set ()
    {
        return sun_set;
    }

    public void setSun_set (String sun_set)
    {
        this.sun_set = sun_set;
    }

//    public Parent getParent ()
//    {
//        return parent;
//    }
//
//    public void setParent (Parent parent)
//    {
//        this.parent = parent;
//    }
//
//    public Sources[] getSources ()
//    {
//        return sources;
//    }
//
//    public void setSources (Sources[] sources)
//    {
//        this.sources = sources;
//    }

    public String getLatt_long ()
    {
        return latt_long;
    }

    public void setLatt_long (String latt_long)
    {
        this.latt_long = latt_long;
    }

    public String getTimezone ()
    {
        return timezone;
    }

    public void setTimezone (String timezone)
    {
        this.timezone = timezone;
    }

    public String getTimezone_name ()
    {
        return timezone_name;
    }

    public void setTimezone_name (String timezone_name)
    {
        this.timezone_name = timezone_name;
    }

    public int getWoeid ()
    {
        return woeid;
    }

    public void setWoeid (int woeid)
    {
        this.woeid = woeid;
    }

    public String getSun_rise ()
    {
        return sun_rise;
    }

    public void setSun_rise (String sun_rise)
    {
        this.sun_rise = sun_rise;
    }




    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getLocation_type ()
    {
        return location_type;
    }

    public void setLocation_type (String location_type)
    {
        this.location_type = location_type;
    }

    public List<Consolidated_weather> getConsolidated_weather() {
        return consolidated_weather;
    }

    public void setConsolidated_weather(List<Consolidated_weather> consolidated_weather) {
        this.consolidated_weather = consolidated_weather;
    }
}
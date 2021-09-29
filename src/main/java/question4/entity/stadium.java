package question4.entity;

public class stadium {
    private int stadiumId ;
    private String name ;
    private String cityName ;

    public stadium(int stadiumId, String name, String cityName) {
        this.stadiumId = stadiumId;
        this.name = name;
        this.cityName = cityName;
    }

    public int getStadiumId() {
        return stadiumId;
    }

    public void setStadiumId(int stadiumId) {
        this.stadiumId = stadiumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}

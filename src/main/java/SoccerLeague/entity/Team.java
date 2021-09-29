package SoccerLeague.entity;

public class Team {
    private int teamId;
    private String name ;
    private String cityName;

    public Team(int teamId, String name, String cityName) {
        this.teamId = teamId;
        this.name = name;
        this.cityName = cityName;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
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

package cricbuzz.models;

import cricbuzz.models.deliveryresult.Event;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;
    private TeamExtras teamExtras;
    private TeamState teamState;

    private final List<Observer> subscribers = new ArrayList<>();


    public Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public void update(Event event){
        this.subscribers.addAll(players);
        this.subscribers.add(teamState);
        this.subscribers.add(teamExtras);
        subscribers.forEach(subscriber ->  subscriber.update(event));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public TeamExtras getTeamExtras() {
        return teamExtras;
    }

    public void setTeamExtras(TeamExtras teamExtras) {
        this.teamExtras = teamExtras;
    }

    public TeamState getTeamState() {
        return teamState;
    }

    public void setTeamState(TeamState teamState) {
        this.teamState = teamState;
    }
}

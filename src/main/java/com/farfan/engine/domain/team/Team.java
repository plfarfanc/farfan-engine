package com.farfan.engine.domain.team;

public final class Team {
    private final TeamId id;
    private final String name;
    private final String country;

    public Team(TeamId id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public TeamId id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String country() {
        return country;
    }
}

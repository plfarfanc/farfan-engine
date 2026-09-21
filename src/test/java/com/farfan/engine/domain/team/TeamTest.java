package com.farfan.engine.domain.team;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class TeamTest {
    @Test
    void teamCanBeCreatedWithTeamId() {
        TeamId teamId = new TeamId("team-1");

        Team team = new Team(teamId, "Colombia", "Colombia");

        assertSame(teamId, team.id());
    }

    @Test
    void teamExposesName() {
        Team team = new Team(new TeamId("team-1"), "Colombia", "Colombia");

        assertEquals("Colombia", team.name());
    }

    @Test
    void teamExposesCountry() {
        Team team = new Team(new TeamId("team-1"), "Colombia", "Colombia");

        assertEquals("Colombia", team.country());
    }

    @Test
    void teamsWithDifferentTeamIdsRepresentDifferentEntities() {
        Team firstTeam = new Team(new TeamId("team-1"), "Colombia", "Colombia");
        Team secondTeam = new Team(new TeamId("team-2"), "Argentina", "Argentina");

        assertNotEquals(firstTeam.id(), secondTeam.id());
    }

    @Test
    void teamIdEqualityIsBasedOnValue() {
        TeamId firstTeamId = new TeamId("team-1");
        TeamId secondTeamId = new TeamId("team-1");

        assertEquals(firstTeamId, secondTeamId);
    }
}

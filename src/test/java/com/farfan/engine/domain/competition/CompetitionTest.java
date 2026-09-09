package com.farfan.engine.domain.competition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class CompetitionTest {
    @Test
    void competitionContainsTournamentEditions() {
        Competition competition = new Competition();

        TournamentEdition firstEdition = competition.createTournamentEdition();
        TournamentEdition secondEdition = competition.createTournamentEdition();

        assertEquals(2, competition.tournamentEditions().size());
        assertSame(firstEdition, competition.tournamentEditions().get(0));
        assertSame(secondEdition, competition.tournamentEditions().get(1));
    }

    @Test
    void tournamentEditionBelongsToExactlyOneCompetition() {
        Competition competition = new Competition();

        TournamentEdition tournamentEdition = competition.createTournamentEdition();

        assertSame(competition, tournamentEdition.competition());
    }
}

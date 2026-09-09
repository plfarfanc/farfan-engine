package com.farfan.engine.domain.competition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class TournamentEditionTest {
    @Test
    void tournamentEditionContainsStages() {
        Competition competition = new Competition();
        TournamentEdition tournamentEdition = competition.createTournamentEdition();

        Stage firstStage = tournamentEdition.createStage();
        Stage secondStage = tournamentEdition.createStage();

        assertEquals(2, tournamentEdition.stages().size());
        assertSame(firstStage, tournamentEdition.stages().get(0));
        assertSame(secondStage, tournamentEdition.stages().get(1));
    }

    @Test
    void stageBelongsToSpecificTournamentEdition() {
        Competition competition = new Competition();
        TournamentEdition tournamentEdition = competition.createTournamentEdition();

        Stage stage = tournamentEdition.createStage();

        assertSame(tournamentEdition, stage.tournamentEdition());
    }
}

package com.farfan.engine.domain.competition;

public final class Stage {
    private final TournamentEdition tournamentEdition;

    Stage(TournamentEdition tournamentEdition) {
        this.tournamentEdition = tournamentEdition;
    }

    public TournamentEdition tournamentEdition() {
        return tournamentEdition;
    }
}

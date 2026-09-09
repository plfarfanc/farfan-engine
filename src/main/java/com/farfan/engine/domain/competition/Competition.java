package com.farfan.engine.domain.competition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Competition {
    private final List<TournamentEdition> tournamentEditions = new ArrayList<>();

    public TournamentEdition createTournamentEdition() {
        TournamentEdition tournamentEdition = new TournamentEdition(this);
        tournamentEditions.add(tournamentEdition);
        return tournamentEdition;
    }

    public List<TournamentEdition> tournamentEditions() {
        return Collections.unmodifiableList(tournamentEditions);
    }
}

package com.farfan.engine.domain.competition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class TournamentEdition {
    private final Competition competition;
    private final List<Stage> stages = new ArrayList<>();

    TournamentEdition(Competition competition) {
        this.competition = competition;
    }

    public Competition competition() {
        return competition;
    }

    public Stage createStage() {
        Stage stage = new Stage(this);
        stages.add(stage);
        return stage;
    }

    public List<Stage> stages() {
        return Collections.unmodifiableList(stages);
    }
}

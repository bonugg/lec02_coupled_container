package com.example.democoupledcontainer.lec01.tightlycoupled.steam;

import com.example.democoupledcontainer.lec01.tightlycoupled.games.AssassinsCreed;
import com.example.democoupledcontainer.lec01.tightlycoupled.games.CounterStrike;

public class Steam {
    public void launchGame(AssassinsCreed assassinsCreed) {
        assassinsCreed.launch();
    }

    public void launchGame(CounterStrike counterStrike) {
        counterStrike.launch();
    }
}

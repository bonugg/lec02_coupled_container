package com.example.democoupledcontainer.lec01.loselyCoupled.steam;

import com.example.democoupledcontainer.lec01.loselyCoupled.games.Game;

public class Steam {
    public void launchGame(Game game){
        game.launch();
    }
}

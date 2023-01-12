package com.example.democoupledcontainer.lec02.wayofspring.steam;

import com.example.democoupledcontainer.lec01.loselyCoupled.games.Game;
import org.springframework.stereotype.Service;

@Service
public class Steam {
    public void launchGame(Game game){
        game.launch();
    }
}

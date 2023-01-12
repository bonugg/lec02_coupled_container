package com.example.democoupledcontainer.lec02.springWeb.steam;

import com.example.democoupledcontainer.lec02.springWeb.games.Game;
import org.springframework.stereotype.Service;

@Service
public class Steam {
    public void launchGame(Game game){
        game.launch();
    }
}

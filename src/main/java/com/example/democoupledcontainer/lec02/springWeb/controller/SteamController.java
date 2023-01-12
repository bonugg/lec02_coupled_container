package com.example.democoupledcontainer.lec02.springWeb.controller;

import com.example.democoupledcontainer.lec02.springWeb.games.AssassinsCreed;
import com.example.democoupledcontainer.lec02.springWeb.games.CounterStrike;
import com.example.democoupledcontainer.lec02.springWeb.controller.dto.GameRequest;
import com.example.democoupledcontainer.lec02.springWeb.steam.Steam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("steam")
public class SteamController {

    @Autowired
    private Steam steam;

    @PostMapping("launch")
    public void launchGame(@RequestBody GameRequest request){
        switch (request.name()){
            case "assassins-creed":
                steam.launchGame(new AssassinsCreed());
                break;
            case "counter-strike":
                steam.launchGame(new CounterStrike());
                break;
            default: throw new NoSuchElementException("No such game");
        }
    }
}

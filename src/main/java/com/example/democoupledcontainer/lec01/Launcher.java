package com.example.democoupledcontainer.lec01;

import com.example.democoupledcontainer.lec01.tightlycoupled.steam.Steam;
import com.example.democoupledcontainer.lec01.tightlycoupled.games.AssassinsCreed;
import com.example.democoupledcontainer.lec01.tightlycoupled.games.CounterStrike;

public class Launcher {
    public static void main(String[] args) {
        var steam = new Steam();

        System.out.println("Steam is running..");

        var assassinsCreed = new AssassinsCreed();

        steam.launchGame(assassinsCreed);

        var counterStrike = new CounterStrike();
        steam.launchGame(counterStrike);

        System.out.println("Steam is shutting down...");
    }
}

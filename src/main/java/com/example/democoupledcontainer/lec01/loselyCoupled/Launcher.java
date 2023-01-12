package com.example.democoupledcontainer.lec01.loselyCoupled;

import com.example.democoupledcontainer.lec01.tightlycoupled.games.AssassinsCreed;
import com.example.democoupledcontainer.lec01.tightlycoupled.games.CounterStrike;
import com.example.democoupledcontainer.lec01.tightlycoupled.steam.Steam;

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

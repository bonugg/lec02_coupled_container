package com.example.democoupledcontainer.lec02;

import com.example.democoupledcontainer.lec01.loselyCoupled.games.AssassinsCreed;
import com.example.democoupledcontainer.lec01.loselyCoupled.games.CounterStrike;
import com.example.democoupledcontainer.lec02.wayofspring.steam.Steam;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Steam.class);
        var steam = context.getBean(Steam.class);

        System.out.println("Steam is running...");
        steam.launchGame(new AssassinsCreed());
        steam.launchGame(new CounterStrike());
        System.out.println("Steam is shutting down...");
    }
}

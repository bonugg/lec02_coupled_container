package com.example.democoupledcontainer.lec02.springWeb;

import com.example.democoupledcontainer.lec01.loselyCoupled.games.AssassinsCreed;
import com.example.democoupledcontainer.lec01.loselyCoupled.games.CounterStrike;
import com.example.democoupledcontainer.lec02.wayofspring.steam.Steam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

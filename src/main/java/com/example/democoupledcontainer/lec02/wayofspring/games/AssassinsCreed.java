package com.example.democoupledcontainer.lec02.wayofspring.games;

public class AssassinsCreed implements Game {
    public void launch() {
        System.out.println("Launching Assassins Creed...");
        loadGame();
        keyUp();
        keyDown();
        keyLeft();
        keyRight();
    }

    public void loadGame() {
        System.out.println("Loading Assassins Creed game...");
    }

    public void keyUp() {
        System.out.println("Assassins Creed key up...");
    }

    public void keyDown() {
        System.out.println("Assassins Creed key down...");
    }

    public void keyLeft() {
        System.out.println("Assassins Creed key left...");
    }

    public void keyRight() {
        System.out.println("Assassins Creed key right...");
    }

}

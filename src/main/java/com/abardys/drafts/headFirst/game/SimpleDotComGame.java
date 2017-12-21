package com.abardys.drafts.headFirst.game;

import java.util.ArrayList;

public class SimpleDotComGame {
    private GameHelper helper = new GameHelper();
    private ArrayList<SimpleDotCom> dotComsList = new ArrayList<SimpleDotCom>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        SimpleDotCom one = new SimpleDotCom();
        one.setName("Pets.com");
        SimpleDotCom two = new SimpleDotCom();
        two.setName("eToys.com");
        SimpleDotCom three = new SimpleDotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("3 sites");
        System.out.println("Pets.com, eToys.com, Go2.com");


        for(SimpleDotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Сделай ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "Мимо";
        for(SimpleDotCom dotComToTest : dotComsList){
            result = dotComToTest.checkYourself(userGuess);
            if(result.equals("Попал")){
                break;
            }
            if(result.equals("Потопил")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("WIN");
        if(numOfGuesses <= 18){
            System.out.println(numOfGuesses + " tries.");
            System.out.println("Good");
        }else{
            System.out.println("Long time " + numOfGuesses + " tries.");

        }
    }

    public static void main(String[] args) {
        SimpleDotComGame game = new SimpleDotComGame();
        game.setUpGame();
        game.startPlaying();
    }
}


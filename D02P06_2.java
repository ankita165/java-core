package com.learning.core.day2session1;

class CricketRating {
    private String playerName;
    private float avgRating;
    private String coins;

    public CricketRating(String playerName, float critic1, float critic2) {
        this.playerName = playerName;
        avgRating = (critic1 + critic2) / 2;
        coins = calculateCoins();
    }

    private String calculateCoins() {
        if (avgRating >= 7) {
            return "Gold";
        } else if (avgRating >= 5) {
            return "Silver";
        } else if (avgRating >= 2) {
            return "Copper";
        } else {
            return "NotEligible";
        }
    }

    public void display() {
        System.out.println(playerName + " " + avgRating + " " + coins);
    }
}

public class D02P06_2 {
    public static void main(String[] args) {
        CricketRating player1 = new CricketRating("John", 9.3f, 9.67f);
        player1.display(); // Output: John 9.485 Gold
        
        CricketRating player2 = new CricketRating("Henry", 1.5f, 1.5f);
        player2.display(); // Output: Henry 1.5 NotEligible
    }
}


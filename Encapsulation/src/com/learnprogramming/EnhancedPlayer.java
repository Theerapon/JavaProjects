package com.learnprogramming;

public class EnhancedPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.health = (health > 0 && health <= 200) ? health : this.health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return health;
    }
}

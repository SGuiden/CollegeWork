package org.example;

public class Player {
    private String name;
    private String position;
    private int age;
    private int playerid;

    public Player() {
        name = "";
        position = "";
        age = -1;
        playerid = -1;
    }
    public Player(String name, String pos, int id, int playerCount) {
        this.name = name;
        position = pos;
        age = age;
        playerid = playerid + 2;
    }

    public String getName(String name) {
        return name;
    }

    public String getPosition(String position) {
        return position;
    }

    public int getPlayerid(int playerid) {
        return playerid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean setPosition(String position) {
        boolean valid = false;
        String [] ValidPositons = {"Goalkeeper","Defense","Attack","Midfield"};
        for(int i = 0; i < (ValidPositons.length); i++){
            if (position.equalsIgnoreCase(ValidPositons[i])){
                this.position = position;
                valid = true;
            }
        }
        return valid;

    }

    public boolean setAge(int age) {
        boolean done = false;
        if (age >= 18 && age<= 48) {
            this.age = age;
            done = true;
        }
        return done;
    }

    public boolean setPlayerid(int playerid) {
        boolean set = false;
        int playerCount;
        if(playerCount == 0){
            this.playerid = 1234;
            playerCount++;
            set = true;
        }
        else {
            this.playerid = playerid[playerCount] + 2;
            playerCount++;
            set = true;
        }
        return set;

        public boolean increaseAge(int incAge){
            boolean passed = false;
            // should have been < 45
            if (this.age+incAge > 45 && this.age+incAge >18){
                this.age = age + incAge;
                passed = true;
            }
            return passed;
        }

    }
}


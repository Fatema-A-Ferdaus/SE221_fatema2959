/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football_management_database;

/**
 *
 * @author Lenovo
 */
public class Player {
    String PlayerID;
    String PlayerName;
    String PlayerCountry;
    String PlayerPosition;
    int PlayerAge;
    int PlayerIncome;
    int PlayerBonus;

    public Player(String PlayerID, String PlayerName, String PlayerCountry,int PlayerAge,String PlayerPosition,int PlayerIncome, int PlayerBonus) {
        this.PlayerID = PlayerID;
        this.PlayerName = PlayerName;
        this.PlayerCountry = PlayerCountry;
        this.PlayerPosition = PlayerPosition;
        this.PlayerAge = PlayerAge;
        this.PlayerIncome = PlayerIncome;
        this.PlayerBonus = PlayerBonus;
    }

    public Player() {
    }

    public Player(String PlayerID, String PlayerName, String PlayerCountry, int PlayerAge, String PlayerPosition) {
        this.PlayerID = PlayerID;
        this.PlayerName = PlayerName;
        this.PlayerCountry = PlayerCountry;
        this.PlayerPosition = PlayerPosition;
        this.PlayerAge = PlayerAge;
    }

    public Player(int PlayerIncome, int PlayerBonus) {
        this.PlayerIncome = PlayerIncome;
        this.PlayerBonus = PlayerBonus;
    }

    
    public String getPlayerID() {
        return PlayerID;
    }

    public void setPlayerID(String PlayerID) {
        this.PlayerID = PlayerID;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String PlayerName) {
        this.PlayerName = PlayerName;
    }

    public String getPlayerCountry() {
        return PlayerCountry;
    }

    public void setPlayerCountry(String PlayerCountry) {
        this.PlayerCountry = PlayerCountry;
    }

    public String getPlayerPosition() {
        return PlayerPosition;
    }

    public void setPlayerPosition(String PlayerPosition) {
        this.PlayerPosition = PlayerPosition;
    }

    public int getPlayerAge() {
        return PlayerAge;
    }

    public void setPlayerAge(int PlayerAge) {
        this.PlayerAge = PlayerAge;
    }

    public int getPlayerIncome() {
        return PlayerIncome;
    }

    public void setPlayerIncome(int PlayerIncome) {
        this.PlayerIncome = PlayerIncome;
    }

    public int getPlayerBonus() {
        return PlayerBonus;
    }

    public void setPlayerBonus(int PlayerBonus) {
        this.PlayerBonus = PlayerBonus;
    }
    
    
    
}

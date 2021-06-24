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
public class Manager {
    
    String ManagerID;
    String ManagerName;
    String ManagerCountry;
    int ManagerAge;
    int ManagerIncome;
    int ManagerBonus;
    
    String G_Match_ID;
    String G_Player_ID;
    String G_Time;
    int G_No;
    
    String C_Match_ID;
    String C_Player_ID;
    String C_Time;
    String C_type;
   
    String I_Match_ID;
    String I_Player_ID;
    String I_Time;

    public Manager(String G_Match_ID, String G_Player_ID, String G_Time, int G_No, String C_Match_ID, String C_Player_ID, String C_Time, String C_type, String I_Match_ID, String I_Player_ID, String I_Time) {
        this.G_Match_ID = G_Match_ID;
        this.G_Player_ID = G_Player_ID;
        this.G_Time = G_Time;
        this.G_No = G_No;
        this.C_Match_ID = C_Match_ID;
        this.C_Player_ID = C_Player_ID;
        this.C_Time = C_Time;
        this.C_type = C_type;
        this.I_Match_ID = I_Match_ID;
        this.I_Player_ID = I_Player_ID;
        this.I_Time = I_Time;
    }



    public Manager(int ManagerIncome, int ManagerBonus) {
        this.ManagerIncome = ManagerIncome;
        this.ManagerBonus = ManagerBonus;
    }

    
    public Manager(String ManagerID, String ManagerName, String ManagerCountry, int ManagerAge) {
        this.ManagerID = ManagerID;
        this.ManagerName = ManagerName;
        this.ManagerCountry = ManagerCountry;
        this.ManagerAge = ManagerAge;
    }

    
    
    public Manager() {
    }

    public String getManagerID() {
        return ManagerID;
    }

    public void setManagerID(String ManagerID) {
        this.ManagerID = ManagerID;
    }

    public String getManagerName() {
        return ManagerName;
    }

    public void setManagerName(String ManagerName) {
        this.ManagerName = ManagerName;
    }

    public String getManagerCountry() {
        return ManagerCountry;
    }

    public void setManagerCountry(String ManagerCountry) {
        this.ManagerCountry = ManagerCountry;
    }

    public int getManagerAge() {
        return ManagerAge;
    }

    public void setManagerAge(int ManagerAge) {
        this.ManagerAge = ManagerAge;
    }

    public int getManagerIncome() {
        return ManagerIncome;
    }

    public void setManagerIncome(int ManagerIncome) {
        this.ManagerIncome = ManagerIncome;
    }

    public int getManagerBonus() {
        return ManagerBonus;
    }

    public void setManagerBonus(int ManagerBonus) {
        this.ManagerBonus = ManagerBonus;
    }

    public String getG_Match_ID() {
        return G_Match_ID;
    }

    public void setG_Match_ID(String G_Match_ID) {
        this.G_Match_ID = G_Match_ID;
    }

    public String getG_Player_ID() {
        return G_Player_ID;
    }

    public void setG_Player_ID(String G_Player_ID) {
        this.G_Player_ID = G_Player_ID;
    }

    public String getG_Time() {
        return G_Time;
    }

    public void setG_Time(String G_Time) {
        this.G_Time = G_Time;
    }

    public int getG_No() {
        return G_No;
    }

    public void setG_No(int G_No) {
        this.G_No = G_No;
    }

    public String getC_Match_ID() {
        return C_Match_ID;
    }

    public void setC_Match_ID(String C_Match_ID) {
        this.C_Match_ID = C_Match_ID;
    }

    public String getC_Player_ID() {
        return C_Player_ID;
    }

    public void setC_Player_ID(String C_Player_ID) {
        this.C_Player_ID = C_Player_ID;
    }

    public String getC_Time() {
        return C_Time;
    }

    public void setC_Time(String C_Time) {
        this.C_Time = C_Time;
    }

    public String getC_type() {
        return C_type;
    }

    public void setC_type(String C_type) {
        this.C_type = C_type;
    }

    public String getI_Match_ID() {
        return I_Match_ID;
    }

    public void setI_Match_ID(String I_Match_ID) {
        this.I_Match_ID = I_Match_ID;
    }

    public String getI_Player_ID() {
        return I_Player_ID;
    }

    public void setI_Player_ID(String I_Player_ID) {
        this.I_Player_ID = I_Player_ID;
    }

    public String getI_Time() {
        return I_Time;
    }

    public void setI_Time(String I_Time) {
        this.I_Time = I_Time;
    }
    
    

    @Override
    public String toString() {
        return "Manager{" + "ManagerID=" + ManagerID + ", ManagerName=" + ManagerName + ", ManagerCountry=" + ManagerCountry + ", ManagerAge=" + ManagerAge + ", ManagerIncome=" + ManagerIncome + ", ManagerBonus=" + ManagerBonus + ", G_Match_ID=" + G_Match_ID + ", G_Player_ID=" + G_Player_ID + ", G_Time=" + G_Time + ", G_No=" + G_No + ", C_Match_ID=" + C_Match_ID + ", C_Player_ID=" + C_Player_ID + ", C_Time=" + C_Time + ", C_type=" + C_type + ", I_Match_ID=" + I_Match_ID + ", I_Player_ID=" + I_Player_ID + ", I_Time=" + I_Time + '}';
    }

  
}

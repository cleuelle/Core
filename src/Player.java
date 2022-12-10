/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package downtothecore;
import java.util.Random;
/**
 * @note Single-person project
 * @author Caleb Leuellen
 */
public class Player {
    //Class attributes
    private int level;
    private int currentExp;
    private int totalExp;
    private int requiredExp;
    private int hp;
    private int maxHP;
    private int atk;
    private int def;
    private int luck;
    private int gold;
    private int depth;
    private float temperature;
    private int pressure;
    private int pickUpgrade;
    private int heatProtUpgrade;
    private int pressureSuitUpgrade;
    private int potionUpgrade;
    Random rand = new Random();
    
    Player() {
        //Default stats for player
        this.level = 1;
        this.currentExp = 0;
        this.totalExp = 0;
        this.requiredExp = 1;
        this.hp = 100;
        this.maxHP = 100;
        this.atk = 10;
        this.def = 10;
        this.luck = 0;
        this.gold = 0;
        this.depth = 0;
        this.temperature = 60;
        this.pressure = 10000;
        this.pickUpgrade = 0;
        this.heatProtUpgrade = 0;
        this.pressureSuitUpgrade = 0;
        this.potionUpgrade = 0;
    }
    
    //Getters
    public int getLevel() {
        return level;
    }
    public int getCurExp() {
        return currentExp;
    }
    public int getTotalExp() {
        return totalExp;
    }
    public int getRequiredExp() {
        return requiredExp;
    }
    public int getHP() {
        return hp;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getAtk() {
        return atk;
    }
    public int getDef() {
        return def;
    }
    public int getLuck() {
        return luck;
    }
    public int getGold() {
        return gold;
    }
    public int getDepth() {
        return depth;
    }
    public float getTemperature() {
        return temperature;
    }
    public int getPressure() {
        return pressure;
    }
    public int getPickUpgrade() {
        return pickUpgrade;
    }
    public int getHeatProtUpgrade() {
        return heatProtUpgrade;
    }
    public int getPressureSuitUpgrade() {
        return pressureSuitUpgrade;
    }
    public int getPotionUpgrade() {
        return potionUpgrade;
    }
    //Setters
    public void setLevel(int level) {
        this.level = level;
    }
    public void setCurExp(int currentExp) {
        this.currentExp = currentExp;
        calculateEXP();
    }
    public void setTotalExp(int totalExp) {
        this.totalExp = totalExp;
        calculateEXP();
    }
    public void setHP(int hp) {
        //HP cannot exceed maxHP
        if (hp > maxHP) {
            this.hp = maxHP;
        }
        else this.hp = hp;
        }
    public void setmaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public void setLuck(int luck) {
        this.luck = luck;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public void setPickUpgrade(int pickUpgrade) {
        this.pickUpgrade = pickUpgrade;
    }
    public void setHeatProtUpgrade(int heatProtUpgrade) {
        this.heatProtUpgrade = heatProtUpgrade;
    }
    public void setPressureSuitUpgrade(int pressureSuitUpgrade) {
        this.pressureSuitUpgrade = pressureSuitUpgrade;
    }
    public void setPotionUpgrade(int potionUpgrade) {
        this.potionUpgrade = potionUpgrade;
    }
    public void calculateEXP() {
        while (currentExp >= requiredExp) {
            //Level Up if enough EXP is gathered
            levelUp();
        //Calculates EXP needed for a level up
        this.requiredExp = level * level * 2;
        }
    }
    public void levelUp() {
        //Excess EXP carries over to next level
        int overflow = currentExp - requiredExp;
        this.currentExp = overflow;
        //Increase stats on level up
        this.level = level + 1;
        this.maxHP = maxHP + rand.nextInt(25) + (level);
        this.atk = atk + rand.nextInt(5) + (level/6);
        this.def = def + rand.nextInt(5) + (level/6);
        this.luck = luck + rand.nextInt(10) + (level/8);
    }
    }

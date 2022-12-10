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
public class Enemy {
    //Class attributes
    private int type;
    private String name;
    private int hp;
    private int maxHP;
    private int atk;
    private int def;
    private int gold;
    private int exp;
    private int numKilled = 0;
    private Item droppedItem;
    private Random random = new Random();
    
    //Constructor
    Enemy() {}
    
    //Getter
    public int getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public int getHP() {
        return hp;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getATK() {
        return atk;
    }
    public int getDEF() {
        return def;
    }
    public int getGold() {
        return gold;
    }
    public int getEXP() {
        return exp;
    }
    public int getNumKilled() {
        return numKilled;
    }
    public Item getDroppedItem() {
        return droppedItem;
    }
    
    //Setters
    
    public void setType(int type) {
        //Determine the enemy that appears based on type
        this.type = type;
        int rs = random.nextInt(6)-3;
        if (type > -1 && type < 5) {
            int itemLottery;
            this.name = "Ore";
            this.hp = 20 + 2*numKilled;
            this.maxHP = hp;
            this.atk = 0;
            this.def = 3 + 2*numKilled;
            this.gold = 5 + 3*numKilled;
            this.exp = 5 + numKilled;
            //"Ore" enemies have randomized item drops
            itemLottery = random.nextInt(100);
            if (itemLottery == 0) {
                droppedItem = new Item(12);
            }
            if (itemLottery == 1) {
                droppedItem = new Item(11);
            }
            if (itemLottery == 2) {
                droppedItem = new Item(10);
            }
            if (itemLottery == 3) {
                droppedItem = new Item(9);
            }
            if (itemLottery > 3 && itemLottery < 6) {
                droppedItem = new Item(6);
            }
            if (itemLottery > 5 && itemLottery < 11) {
                droppedItem = new Item(5);
            }
            if (itemLottery > 10 && itemLottery < 21) {
                droppedItem = new Item(4);
            }
            if (itemLottery > 20 && itemLottery < 41) {
                droppedItem = new Item(3);
            }
            if (itemLottery > 40 && itemLottery < 61) {
                droppedItem = new Item(2);
            }
            if (itemLottery > 60 && itemLottery < 101) {
                droppedItem = new Item (1);
            }
        }
        if (type > 4 && type < 10) {
            this.name = "Slime";
            this.hp = 15 + 3*numKilled + rs;
            this.maxHP = hp;
            this.atk = -5 + 3*numKilled + 2*rs;
            this.def = 8 + 2*numKilled + rs;
            this.gold = 0 + 4*numKilled + rs;
            this.exp = 1 + 2*numKilled + rs;
            droppedItem = new Item(7);
        }
        if (type > 9 && type < 15) {
            this.name = "Zombie";
            this.hp = 13 + 5*numKilled + rs;
            this.maxHP = hp;
            this.atk = 5 + 3*numKilled + rs;
            this.def = 10 + numKilled + rs;
            this.gold = 0 + 6*numKilled + rs;
            this.exp = 1 + 4*numKilled + rs;
            }
        if (type > 14 && type < 20) {
            this.name = "Skeleton";
            this.hp = 1 + 8*numKilled + rs;
            this.maxHP = hp;
            this.atk = 0 + 3*numKilled + 3*rs;
            this.def = 0 + 2*numKilled + 2*rs;
            this.gold = 2 + 5*numKilled + rs;
            this.exp = 2 + 6*numKilled + rs;
            droppedItem = new Item(8);
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHP(int hp) {
        this.hp = hp;
    }
    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
    public void setATK(int atk) {
        this.atk = atk;
    }
    public void setDEF(int def) {
        this.def = def;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public void setEXP(int exp) {
        this.exp = exp;
    }
    public void setNumKilled(int numKilled) {
        this.numKilled = numKilled;
    }
    public void setDroppedItem(Item droppedItem) {
        this.droppedItem = droppedItem;
    }
}

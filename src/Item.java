/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package downtothecore;
/**
 * @note Single-person project
 * @author Caleb Leuellen
 */
public class Item implements Comparable<Item> {
    private int type;
    private String name;
    
    //Constructor
    Item(int type) {
        //Creates item based on type
        if (type == 1) {
            this.name = "Shiny stone";
        }
        if (type == 2) {
            this.name = "Coal";
        }
        if (type == 3) {
            this.name = "Copper";
        }
        if (type == 4) {
            this.name = "Iron";
        }
        if (type == 5) {
            this.name = "Gold";
        }
        if (type == 6) {
            this.name = "Diamond";
        }
        if (type == 7) {
            this.name = "Jelly";
        }
        if (type == 8) {
            this.name = "Bone";
        }
        if (type == 9) {
            this.name = "Greed crystal";
        }
        if (type == 10) {
            this.name = "Mega potion";
        }
        if (type == 11) {
            this.name = "Dry ice";
        }
        if (type == 12) {
            this.name = "Depressurizer";
        }
    }
    
    //Getters
    public int getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    //Setters
    public void setType(int type) {
        this.type = type;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
    @Override
    //Allows sorting items in alphabetical order
    public int compareTo(Item i) {
        return this.name.compareTo(i.name);
    }
}

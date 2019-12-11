package io.moonman.emergingtechnology.helpers.custom.classes;

/**
A custom growth medium loaded from a user-defined JSON file
*/
public class CustomGrowthMedium {

    public int id;
    public String name;
    public int waterUsage;
    public int growthModifier;

    public int boostModifier;
    public boolean allPlants;
    public String[] plants;


    public CustomGrowthMedium(int id, String name, int waterUsage, int growthModifier, boolean allPlants, String[] plants, int boostModifier) {
        this.id = id;
        this.name = name;
        this.waterUsage = waterUsage;
        this.growthModifier = growthModifier;

        this.boostModifier = boostModifier;
        this.allPlants = allPlants;
        this.plants = plants;
    }
}
package com.softserveinc;

public class Task03 {
    public int MaxCups(int water, int milk, int beans){
        double enoughCups;
        double roundedWaterCups;
        double roundedMilkCups;
        double roundedBeansCups;
        roundedWaterCups = Math.floor(water/200);
        roundedMilkCups = Math.floor(milk/50);
        roundedBeansCups = Math.floor(beans/15);
        enoughCups = Math.min(roundedWaterCups,Math.min(roundedMilkCups,roundedBeansCups));
        return (int)enoughCups;
    }
}

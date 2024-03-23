package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String description = null;
        if (hasFur) {
            if (numberOfPaws == 1) {
                description = "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and a fur.";
            } else if (numberOfPaws > 1) {
                description = "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and a fur.";
            }
        } else {
            if (numberOfPaws == 1) {
                description = "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and no fur.";
            } else if (numberOfPaws > 1) {
                description = "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and no fur.";
            }
        }

        return description;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }
}

package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird() {
        super("blue", 2, false);

    }

    @Override
    public String getDescription() {
        String description = null;
        if (super.isHasFur()) {
            if (super.getNumberOfPaws() == 1) {
                description = "This animal is mostly " + super.getColor() + ". It has " + super.getNumberOfPaws() + " paw and a fur. Moreover, it has 2 wings and can fly.";
            } else if (super.getNumberOfPaws() > 1) {
                description = "This animal is mostly " + super.getColor() + ". It has " + super.getNumberOfPaws() + " paws and a fur. Moreover, it has 2 wings and can fly.";
            }
        } else {
            if (super.getNumberOfPaws() == 1) {
                description = "This animal is mostly " + super.getColor() + ". It has " + super.getNumberOfPaws() + " paw and no fur. Moreover, it has 2 wings and can fly.";
            } else if (super.getNumberOfPaws() > 1) {
                description = "This animal is mostly " + super.getColor() + ". It has " + super.getNumberOfPaws() + " paws and no fur. Moreover, it has 2 wings and can fly.";
            }
        }

        return description;
    }
}

package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;

public class Race {
    public static void main(String[] args) {
        Rabbit rabbitObject = new Rabbit();
        rabbitObject.getRabbit().start();
        Tortoise tortoiseObject= new Tortoise();
        tortoiseObject.getTortoise().start();
    }
}

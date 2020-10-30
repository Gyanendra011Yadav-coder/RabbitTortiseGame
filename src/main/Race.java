package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;

public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
        Tortoise tortoiseObject= new Tortoise();
        tortoiseObject.getTortoise().start();
    }
}

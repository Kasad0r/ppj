package cw20;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class Cw20 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.setSide(Side.Evil);
        warrior.setCapacity(10);
        warrior.setBagPack(new Stuff[warrior.getCapacity()]);
        warrior.setCharacterName("Evil Artas(PAPANIDZE)");
        warrior.setHand(new Weapon("Sword of Pain", 10, 50, 2));
        warrior.setHealthPoints(323.3);
        /**************************************/
        Monster monster = new Monster();
        monster.setCharacterName("Skeleton");
        monster.setCapacity(3);
        monster.setSide(Side.Evil);
        monster.setBagPack(new Stuff[monster.getCapacity()]);
        monster.setHand(new Weapon("Stick", 3, 30, 5));
        monster.setHealthPoints(1000);
        startFight(warrior, monster);
    }

    public static void startFight(Warrior player, Monster monster) {
        while (player.getHealthPoints() > 0 && monster.getHealthPoints() > 0) {
            System.out.println("**********************************************************");
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (step()) {
                System.out.print(player.getCharacterName() + " STEP\t");
                double attack = player.attack();
                double randomizedAttack = damageRandomizer(attack);
                System.out.println(randomizedAttack);
                monster.setHealthPoints(monster.getHealthPoints() - randomizedAttack);
            } else {
                System.out.print(monster.getCharacterName() + " STEP\t");
                double attack = monster.attack();
                double randomizedAttack = damageRandomizer(attack);
                System.out.println(randomizedAttack);
                player.setHealthPoints(player.getHealthPoints() - randomizedAttack);
            }
            System.out.println("PLAYER HP - " + player.getHealthPoints());
            System.out.println("MONSTER HP - " + monster.getHealthPoints());
        }
        System.out.println((player.getHealthPoints() <= 0 ? " MONSTER ROFLANPOMOIKA " + monster.getCharacterName() : "SOLYANOWO PLAYER " + player.getCharacterName()) + "WINS!!!!");
    }


    private static boolean step() {
        return new Random().nextBoolean();
    }

    private static double damageRandomizer(double damage) {
        double val = new Random().nextDouble();
        if (val > 0.8) {
            System.out.print("ATTACK - Critical damage: ");
            return damage * 1.5;
        } else if (val > 0.4) {
            System.out.print("ATTACK - normal damage: ");
            return damage;
        } else {
            System.out.print("ATTACK - Low damage: ");
            return damage * 0.5;
        }
    }



}

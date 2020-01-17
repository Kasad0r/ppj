package cw20;

public class Warrior extends Avatar {
    @Override
    public double attack() {
        return super.attack() * ((Weapon) super.getHand()).getBonusDamage();
    }

}

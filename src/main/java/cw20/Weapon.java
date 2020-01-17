package cw20;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Weapon extends Stuff {
    private double baseAttack;
    private double bonusDamage;

    public Weapon(String name, double weight) {
        super(name, weight);
    }

    public Weapon(String name, double weight, double baseAttack, double bonusDamage) {
        super(name, weight);
        this.baseAttack = baseAttack;
        this.bonusDamage = bonusDamage;
    }
}

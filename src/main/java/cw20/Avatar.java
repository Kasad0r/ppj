package cw20;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Avatar {
    private String characterName;
    private Side side;
    private int capacity;
    private Stuff hand;
    private Stuff[] bagPack;
    private double healthPoints;

    public void setHand(Stuff stuff) {
        if (hand == null)
            hand = stuff;
        else {
            bagPack[capacity--] = hand;
            hand = stuff;
        }
    }

    public double attack() {
        if (hand == null || hand.getClass() != Weapon.class) {
            return 0;
        } else {
            Weapon w = ((Weapon) hand);
            return w.getBaseAttack();
        }
    }

}

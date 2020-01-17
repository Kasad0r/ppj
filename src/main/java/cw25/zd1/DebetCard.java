package cw25.zd1;

public class DebetCard extends Card {
    @Override
    public double reserveMoney(double many) {
        double res = super.reserveMoney(many);
        if (res < 0) {
            super.rollBack(many);
            throw new NotEnouthFunds("On your debet card not enough money. Balance is"
                    + super.getBalance());
        } else {
            return super.getMoney(many);
        }
    }
}

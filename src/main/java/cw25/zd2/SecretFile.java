package cw25.zd2;

public class SecretFile extends File {
    @Override
    public void show() {
        String[] s = super.getText().split(" ");
        for (int i = 0, counter = 1; i < s.length; i++, counter++) {
            if (counter == 2) {
                System.out.print(s[i]);
                counter = 0;
            } else {
                System.out.print("*");
            }
        }
    }
}

package cw16;

public class Main {
    public static void main(String[] args) {

/*        MethodCurrier methodCurrier = new MethodCurrier();

        methodCurrier.setValue(12);
        methodCurrier.setValue(12.4f);
        methodCurrier.setValue('1');
        methodCurrier.setValue(0b01);


        Number number = new Number();
        number.setValue(12312);
        number.setValue(112);
        number.showValue();

        Person osoba = new Person();

        osoba.setAge(11);
        osoba.setName("John");
        osoba.setSurname("Valentine");
        System.out.println(osoba);
        Person testConstructor = new Person("TEST", "TEST", 11);
        System.out.println(testConstructor);*/


        Cplx cplx = new Cplx(3,5);
        Cplx cplx2 = new Cplx(1, 4);
        cplx.show();
        cplx.add(cplx2);
        cplx.show();
        cplx.inc();
        cplx.show();

    }
}

package study.springboot.design.decorator;

public class DecoratorMain {

    public static void main(String[] args) {

        Audi audi = new Audi(1000);
        audi.showPrice();

        //a3
        ICar audiA3 = new A3(audi, "A3");
        audiA3.showPrice();

        //a4
        ICar audiA4 = new A4(audi, "A3");
        audiA4.showPrice();

        //a5
        ICar audiA5 = new A5(audi, "A3");
        audiA5.showPrice();
    }
}

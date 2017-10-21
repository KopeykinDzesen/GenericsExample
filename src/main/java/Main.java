public class Main <T> {

    T var;

    public static void main(String[] args) {

        Main<String> main = new Main();
        main.var = "asdf";
        main.method(main.var);

        Main<Car> main1 = new Main();
        main1.var = new Car();
        main1.method(main1.var);

    }

    T method(T type){
        System.out.println(type);
        return type;
    }

}

class Car{

}
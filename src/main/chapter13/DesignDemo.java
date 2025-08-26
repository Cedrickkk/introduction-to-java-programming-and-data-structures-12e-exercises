package main.chapter13;

import java.util.List;

public class DesignDemo {
    public static void main(String[] args) {
        _Edible chicken = new _Chicken();
        eat(chicken);

        _Edible duck = new _Duck();
        eat(duck);

        _Edible broccoli = new _Broccoli();
        eat(broccoli);

        List<_Edible> edibles = List.of(chicken, duck, broccoli);
        edibles.forEach(DesignDemo::eat);
    }

    private static void eat(_Edible edible) {
        System.out.println(edible.howToEat());
    }
}

interface _Edible {
    String howToEat();
}

class _Chicken implements _Edible {
    @Override
    public String howToEat() {
        return "Fry it";
    }
}

class _Duck implements _Edible {
    @Override
    public String howToEat() {
        return "Roast it";
    }
}

class _Broccoli implements _Edible {
    @Override
    public String howToEat() {
        return "Stir-fry it";
    }
}

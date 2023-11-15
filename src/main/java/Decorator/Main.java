package Decorator;

import Christmas.ChristmasDecorationFactory;
import Halloween.HalloweenDecorationFactory;

public class Main {
    public static void main(String[] args) {
        DecorationFactoryInterface halloweenDecorationFactory = new HalloweenDecorationFactory();
        DecorationPlacer decorationPlacer = new DecorationPlacer(halloweenDecorationFactory);

        DecorationFactoryInterface christmasDecorationFactory = new ChristmasDecorationFactory();
        DecorationPlacer decorationPlacer2 = new DecorationPlacer(christmasDecorationFactory);

        System.out.println(decorationPlacer.placeDecorations());
        System.out.println(decorationPlacer2.placeDecorations());
    }
}

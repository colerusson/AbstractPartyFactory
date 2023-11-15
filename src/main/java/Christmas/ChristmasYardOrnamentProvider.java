package Christmas;

import Decorator.YardOrnamentProviderInterface;

public class ChristmasYardOrnamentProvider implements YardOrnamentProviderInterface {
    public String getOrnament() {
        return "ice-skating snowman";
    }
}

package Halloween;

import Decorator.YardOrnamentProviderInterface;

public class HalloweenYardOrnamentProvider implements YardOrnamentProviderInterface {
    public String getOrnament() {
        return "jack-o-lantern";
    }
}

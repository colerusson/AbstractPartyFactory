package Christmas;

import Decorator.WallHangingProviderInterface;

public class ChristmasWallHangingProvider implements WallHangingProviderInterface {
    public String getHanging() {
        return "giant stocking";
    }
}

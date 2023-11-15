package Halloween;

import Decorator.WallHangingProviderInterface;

public class HalloweenWallHangingProvider implements WallHangingProviderInterface {
    public String getHanging() {
        return "spider-web";
    }
}

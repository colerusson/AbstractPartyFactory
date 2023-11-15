package Christmas;

import Decorator.DecorationFactoryInterface;
import Decorator.TableclothPatternProviderInterface;
import Decorator.WallHangingProviderInterface;
import Decorator.YardOrnamentProviderInterface;

public class ChristmasDecorationFactory implements DecorationFactoryInterface {
    public TableclothPatternProviderInterface getTableclothPattern() {
        return new ChristmasTableclothPatternProvider();
    }

    public WallHangingProviderInterface getWallHanging() {
        return new ChristmasWallHangingProvider();
    }

    public YardOrnamentProviderInterface getYardOrnament() {
        return new ChristmasYardOrnamentProvider();
    }
}

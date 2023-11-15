package Halloween;

import Decorator.DecorationFactoryInterface;
import Decorator.TableclothPatternProviderInterface;
import Decorator.WallHangingProviderInterface;
import Decorator.YardOrnamentProviderInterface;

public class HalloweenDecorationFactory implements DecorationFactoryInterface {
        @Override
        public TableclothPatternProviderInterface getTableclothPattern() {
            return new HalloweenTableclothPatternProvider();
        }

        @Override
        public WallHangingProviderInterface getWallHanging() {
            return new HalloweenWallHangingProvider();
        }

        @Override
        public YardOrnamentProviderInterface getYardOrnament() {
            return new HalloweenYardOrnamentProvider();
        }
}

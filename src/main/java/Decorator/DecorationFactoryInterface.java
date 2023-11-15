package Decorator;

public interface DecorationFactoryInterface {
    TableclothPatternProviderInterface getTableclothPattern();
    WallHangingProviderInterface getWallHanging();
    YardOrnamentProviderInterface getYardOrnament();
}

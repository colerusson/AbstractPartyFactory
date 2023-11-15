package Decorator;

public class DecorationPlacer {

    // FIXME use dependency inversion to remove these hard-coded dependencies
    private final TableclothPatternProviderInterface tableclothPattern;
    private final WallHangingProviderInterface wallHanging;
    private final YardOrnamentProviderInterface yardOrnament;

    public DecorationPlacer(DecorationFactoryInterface decorationFactory) {
        this.tableclothPattern = decorationFactory.getTableclothPattern();
        this.wallHanging = decorationFactory.getWallHanging();
        this.yardOrnament = decorationFactory.getYardOrnament();
    }

    public String placeDecorations() {
        return "Everything was ready for the party. The " + yardOrnament.getOrnament()
                + " was in front of the house, the " + wallHanging.getHanging()
                + " was hanging on the wall, and the tablecloth with " + tableclothPattern.getTablecloth()
                + " was spread over the table.";
    }
}

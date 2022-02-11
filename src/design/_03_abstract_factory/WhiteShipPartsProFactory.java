package design._03_abstract_factory;

public class WhiteShipPartsProFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();

    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}

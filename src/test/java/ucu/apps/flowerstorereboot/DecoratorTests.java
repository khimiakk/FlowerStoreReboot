package ucu.apps.flowerstorereboot;

import static org.junit.jupiter.api.Assertions.*;

import ucu.apps.flowerstorereboot.decorators.BasketDecorator;
import ucu.apps.flowerstorereboot.decorators.PaperDecorator;
import ucu.apps.flowerstorereboot.decorators.RibbonDecorator;
import ucu.apps.flowerstorereboot.model.Flower;
import ucu.apps.flowerstorereboot.model.Item;

import org.junit.jupiter.api.Test;

public class DecoratorTests {

   @Test
    public void testPaperDecorator() {
        Item flower = new Flower("Rose", "Red", 10.0, true);
        Item decoratedFlower = new PaperDecorator(flower);
        assertEquals(
            "Flower of type Rose with color Red, available true in paper.",
            decoratedFlower.getDescription());
        assertEquals(23.0, decoratedFlower.price());
    }

    @Test
    public void testRibbonDecorator() {
        Item flower = new Flower("Tulip", "Yellow", 12.0, true);
        Item decoratedFlower = new RibbonDecorator(flower);
        assertEquals(
            "Flower of type Tulip with color Yellow, available true with ribbon.",
            decoratedFlower.getDescription());
        assertEquals(52.0, decoratedFlower.price());
    }

    @Test
    public void testBasketDecorator() {
        Item flower = new Flower("Lily", "White", 15.0, true);
        Item decoratedFlower = new BasketDecorator(flower);
        assertEquals(
            "Flower of type Lily with color White, available true in a basket.",
            decoratedFlower.getDescription());
        assertEquals(19.0, decoratedFlower.price());
    }

    @Test
    public void testMultipleDecorators() {
        Item flower = new Flower("Orchid", "Purple", 20.0, true);
        Item decoratedFlower =
            new PaperDecorator(new RibbonDecorator(new BasketDecorator(flower)));

        assertEquals(
            "Flower of type Orchid with color Purple, available true in a basket. with ribbon. in paper.",
            decoratedFlower.getDescription());

        assertEquals(77.0, decoratedFlower.price());
    }

}
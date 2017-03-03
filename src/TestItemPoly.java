/**
 * Created by ThomasBowers on 02/03/2017.
 */
public class TestItemPoly {
    public static void main(String[] args) {
        Item[] polyArray = {
                new Item("baked beans", 0.3),
                new ItemByWeight("bananas", 0.4, 0.7),
                new Item("cake", 1.0),
                new ItemByWeight("apples", 0.2, 0.8),
        };
        for (int i = polyArray.length-1; i >= 0; i--) {
            System.out.println(polyArray[i].toString());
        }
    }
}


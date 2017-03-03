/**
 * Created by ThomasBowers on 02/03/2017.
 */
public class TestItemEquals {

    public static void main( String[] args){
        Item[] test = {
                new Item("baked beans",0.3),
                new ItemByWeight("bananas",0.4,0.7),
                new Item("cake",1.0),
                new ItemByWeight("cake",1.0,0.7),
                new ItemByWeight("apples",0.2,0.8),
        };
        if(test[3].equals(test[2])){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    }

import java.util.LinkedHashMap;
import java.util.Map;

public class TraversingLinkedHashmap {

    public static void main(String[] args) {

        //Initialization of LinkedHashmap using Generics
        LinkedHashMap<String,String>lm = new LinkedHashMap<>(3);
        lm.put("tejas","laugh");
        lm.put("Simar","don't");
        lm.put("dOMINIKA","HAPPY");

        //fOR-each loop for traversel over the Map

        for(Map.Entry<String,String>mapElement:
              lm.entrySet()){

            String key = mapElement.getKey();

            //Finding the value using getvalue method
            String value = mapElement.getValue();

            //Printing the key value pair
            System.out.println("\n" +key  + "\n" +value);
        }

    }
}

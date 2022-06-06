import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Cats {

    static int greatest;

    public static void main(String[] args) {
        // of string and integer type
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList list = new ArrayList();
        list.add(map);
        map.put(1,4);
        map.put(4,6);
        map.put(5,8);

        System.out.println(map);
        Iterator<Map.Entry<Integer,Integer>> new_Iterator = map.entrySet().iterator();

        while (new_Iterator.hasNext()){
            Map.Entry<Integer,Integer> new_map = (Map.Entry<Integer,Integer>)
                                                 new_Iterator.next();

            if(new_map.getKey()>new_map.getValue()){
                greatest = new_map.getKey();
                System.out.println(greatest);
            } else if (new_map.getKey()<new_map.getValue()) {
                greatest = new_map.getValue();
                System.out.println(greatest);
            }

        }

        map.entrySet().stream().forEach(
                input -> {
                    if (input.getKey()>input.getValue()) {
                        greatest = input.getKey();
                        System.out.println(greatest);
                    }else {
                        greatest = input.getValue();
                        System.out.println(greatest);
                    }
                }
        );
    }
}

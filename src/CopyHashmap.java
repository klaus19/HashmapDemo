import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CopyHashmap {

    public static void main(String[] args) {

        HashMap<String,Integer> map1 = new HashMap<>(3);
        List k = new ArrayList<>();
        map1.put("ABC",1);
        map1.put("dfg",2);
        map1.put("late",3);

        k.add(map1);

        HashMap<String,Integer>map2 = new HashMap<>(3);
        map2.put("dgf",4);
        map2.put("fgd",5);
        map2.put("fhs",6);

        map2.putAll(map1);
        System.out.println(map2);



    }
}

import java.util.LinkedHashMap;

public class LinkedHashmapdEMOO {

    public static void main(String[] args) {

        LinkedHashMap<String,String> lm = new LinkedHashMap<>(3);
        lm.put("ASJ","FA");
        lm.put("ghs","wfw");
        lm.put("dj","awf");

        System.out.println(lm);

        System.out.println(lm.get("ASJ"));

        System.out.println(lm.size());

        lm.put("ghs","gh").codePointAt(1);

        System.out.println(lm);

    }
}

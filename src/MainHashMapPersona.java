import java.util.Map;
import java.util.HashMap;
public class MainHashMapPersona {
    public static void main(String[] args) {
        Map<String, Integer> personas = new HashMap<>();

        personas.put("Red", 20);
        personas.put("Tyler", 22);
        personas.put("Mania", 31);
        personas.put("Hugo", 19);
        personas.put("Hector", 21);

        System.out.println("Edad de Mania: " + personas.get("Mania"));
    }
}
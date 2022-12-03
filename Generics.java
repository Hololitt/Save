package JC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class Generics {
    public static void main(String[] args) {
        List<String> people = new ArrayList<String>();
        people.add("UHFISFHWIF");
        people.add("kxbcsjdh");
        for(int i = 0; i< people.size(); i++){
            System.out.println(people.get(i));

        }
    }
}

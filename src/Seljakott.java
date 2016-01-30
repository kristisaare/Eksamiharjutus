import java.util.ArrayList;

/**
 * Created by kristi on 30/01/16.
 */
public class Seljakott {

    String name;
    ArrayList items = new ArrayList();

        public Seljakott(String nimi){
            name = nimi;

        }
    public void lisaAsi(String item){
        items.add(item);


    }

    public void eemaldaAsi(String item){
        items.remove(item);

    }
    public String misOnKotis(){
        return items.toString();

    }
    public int mituAsjaOnKotis(){
        return items.size();
    }
    public String omanikuNimi(){
        return name;
    }
    public void rebene(){
        items.clear();

    }
}

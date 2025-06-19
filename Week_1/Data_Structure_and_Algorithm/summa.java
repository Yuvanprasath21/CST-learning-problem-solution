package Data_Structure_and_Algorithm;

import java.util.Arrays;
import java.util.Comparator;

class onli{
    
    String prname;
    int id;
    String cat;
    onli(int id,String prname, String cat){
        this.id= id;
        this.prname=prname;
        this.cat=cat;
    }
}
public class summa {
    public static int linear(onli[] line,String name){
        for(int i=0;i<line.length;i++){
            if(line[i].prname.equals(name)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        onli[] line = {
            new onli(1, "Laptop", "Electronics"),
            new onli(2, "Mouse", "Electronics"),
            new onli(3, "Keyboard", "Electronics"),
            new onli(4, "Monitor", "Electronics")
        };
        Arrays.sort(line, Comparator.comparing(l -> l.prname));
        System.out.println(linear(line, "Mouse"));
    }
}

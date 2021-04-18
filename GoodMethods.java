import java.util.*;

public class GoodMethods {
    public static OBJECT obj = new OBJECT();
    public static void ListMethods() {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();
        
        list.addAll(list2);
        
        list.clear();

        list2 = (LinkedList) list.clone();

        list.contains(obj);

        
    }



}
class OBJECT {
    public OBJECT(){}

}
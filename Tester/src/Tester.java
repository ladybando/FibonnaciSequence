import java.util.*;
import java.io.*;

public class Tester {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter entry amount ");
        int n = in.nextInt();

        Map<String, Long> mapEntry = new HashMap<>();
        for(int i = 0; i < n; i++){
            System.out.print("Enter name ");
            String name = in.next();
            System.out.print("Enter phone ");
            long phone = in.nextLong();
            mapEntry.put(name,phone);
        }
        while(in.hasNext()){
            System.out.println("Search for name ");
            String s = in.next();
            for(Map.Entry<String, Long> element : mapEntry.entrySet()){//because entry size is 2, prints not found for each entry
                if(element.getKey().equalsIgnoreCase(s)){
                    System.out.println(element.getKey() + "=" +element.getValue());
                }else if(!element.getKey().equalsIgnoreCase(s)){
                    System.out.println("Not found");
                }
            }
            in.close();
        }
    }
}

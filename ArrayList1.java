package NewProject;


import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList1 {

	public static void main(String[] args) {
		 ArrayList<String> lista =new ArrayList <String> ();
         ArrayList<String> listb =new ArrayList <String>();

         lista.add("Mumbai");
         lista.add("Banglore");
         lista.add("Delhi");
         lista.add("Chennai");

         listb.add("Pune");
         listb.add("Mumbai");
         listb.add("Delhi");

        
         ArrayList<String> listapluslistb = new ArrayList<String>(lista);    
         listapluslistb.addAll(listb);

        
         HashSet<String> listaunionlistb =new HashSet<String>(lista);
         listaunionlistb.addAll(listb);

         for(String s:listaunionlistb)
         {
             listapluslistb.remove(s);
         }
         System.out.println(listapluslistb);

	}

}

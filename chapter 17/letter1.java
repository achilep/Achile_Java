//Exo  17.13 b
import java.util.List;
import java.util.Arrays; 
import java.util.LinkedList;
import java.util.ListIterator;
import java.security.SecureRandom;
import java.util.stream.Collectors;
public class letter1{
 public static void main (String[] args) {
	SecureRandom ran=new SecureRandom();
  String[] ch={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
  int i;
  List<String>la= new  LinkedList();
  String[]cho=new String[30];
  for(i=0;i<30;i++){
	  int j=ran.nextInt(25);
	  la.add(i,ch[j]);
  }
   ListIterator li = la.listIterator();
  
      while(li.hasNext())
		  System.out.println(li.next());
	  for(int k=0;k<cho.length;k++){
	   cho[k]=la.get(k);
   }
	  System.out.printf("strings greater than m sorted ascending: %s%n",Arrays.stream(cho).sorted().collect(Collectors.toList())); 
   	List<String> cha =new LinkedList(Arrays.stream(cho).sorted().collect(Collectors.toList()));
	List <String> lo=new LinkedList();
	    int j =cha.size();
    while (j>0){
		j--;
		String u=cha.get(j);
			lo.add(u);
	}
	ListIterator <String>lu = lo.listIterator();
	while(lu.hasNext()) 
	  System.out.println(lu.next());
}
} 
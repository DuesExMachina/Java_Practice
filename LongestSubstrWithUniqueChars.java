import java.util.*;
import java.util.Map;  
import java.util.HashMap;  
import java.util.TreeMap;

public class Main
{
	static boolean check(String s){
	  int freq[]=new int[28];
	  //int n=s.length();
	  for(int i=0;i<s.length();i++){
	      freq[s.charAt(i)-'a']++;
	  }
	  
	  for(int i=0;i<28;i++){
	      if(freq[i]>1){
	          return false;
	      }
	  }
	  
	  return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter your string: ");
		String s,substr;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		
		int n=s.length();
		Map<Integer,String> map = new HashMap<Integer,String>(); 
		
		for(int i=n-1;i!=0;i--){
		    for(int j=0;j<=n-i;j++){
		        substr=s.substring(j,j+i);
		        //System.out.print(substr+"\t");
		        if(check(substr)){
		            //System.out.print(substr+"\t");
		            map.put(i,substr);
		        }
		    }
		}
		int maxSize=0;
		for(Map.Entry<Integer, String>entry: map.entrySet()){
        //cout<<itr->first<<" "<<itr->second<<"\n";
	if(entry.getKey()>maxSize){
        maxSize=entry.getKey();}
    }
    
    for(Map.Entry<Integer, String>entry: map.entrySet()){
        //cout<<itr->first<<" "<<itr->second<<"\n";
        if(entry.getKey()==maxSize){
            System.out.print(entry.getValue()+"\t");
        }
    }	
	}
}

import java.util.*;
public class Main
{
	
	
	public static void main(String[] args) {
		System.out.println("Enter your string: ");
		String s,substr;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		
		int n=s.length();
		
		for(int i=n-1;i!=0;i--){
		    for(int j=0;j<=n-i;j++){
		        substr=s.substring(j,j+i);
		        System.out.print(substr+"\t");
		    }
		}
	}
}

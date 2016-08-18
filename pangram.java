import java.util.Scanner;


public class pangram {

	public static int pan(String str){
		for(char c='a';c<='z';c++){
			if(!str.contains(c+"")){
				return -1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
        if( pan(str.toLowerCase())!=-1)
        	System.out.println("pangram");
        else
        System.out.println("not pangram");
	


}}

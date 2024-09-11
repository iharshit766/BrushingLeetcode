import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Please enter tye array of size 5: ");
	    for(int i=0;i<arr.length;i++){
	        arr[i]=sc.nextInt();
	    }
	boolean answer=	possiblejump(arr);
		System.out.println(answer);
	}

	public static boolean possiblejump(int[] arr) {
	int maxjump=0;
	for(int i=0;i<arr.length;i++){
	    if(i>maxjump){
	        return false;
	    }
	   maxjump=max(maxjump, i + arr[i]);
	}
	return true;
    
	}

}
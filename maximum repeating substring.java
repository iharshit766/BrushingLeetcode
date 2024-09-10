import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String string=sc.next();
        System.out.println("Please enter the word to search as a substring: ");
        String word=sc.next();
        
        int answer=maximumsubstring(string,word);
        System.out.println(answer);
    }
    
    public static int maximumsubstring(String string, String word){
        int count=0;
        
        String maxrepeated=word;
        
        while(string.contains(maxrepeated)){
            count++;
            maxrepeated+=word;
        }
        return count;
    }
    
}
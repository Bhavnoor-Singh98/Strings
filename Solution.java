import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String a1=a.toLowerCase();
        String b1=b.toLowerCase();
        int aar[]=new int[256];
        boolean ana=true;
        for(char c: a1.toCharArray())
        {
            int index=(int)c;
            aar[index]++;
        }
        for(char c: b1.toCharArray())
        {
            int index=(int)c;
            aar[index]--;
        }
        for(int i=0; i<256; i++)
        {
            if(aar[i] !=0)
            {
                ana=false;
                break;
            }
        }
        if(ana)
        {
            return true;
        }
        else{
            return false; 
        }

    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

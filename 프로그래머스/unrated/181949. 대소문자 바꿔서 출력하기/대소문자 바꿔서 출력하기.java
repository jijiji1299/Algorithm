import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] arr = a.toCharArray();
        
        for(int i=0; i<a.length(); i++) {
            if((int)arr[i] >=97) {
                arr[i]-=32;
            }
            else {
                arr[i]+=32;
            }
        }
        String b = new String(arr);
        System.out.println(b);
        
    }
}
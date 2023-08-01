import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = br.readLine().split("");
        long answer = 0;
        
        for(int i= 0; i < s.length; i++) {
            if(answer==0||answer==1||s[i]=="0"||s[i]=="1") answer = answer + Integer.parseInt(s[i]);
            else answer = answer * Integer.parseInt(s[i]);
        };
        
        System.out.println(answer);
        
    }
}

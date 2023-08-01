import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] m = br.readLine().split(" ");
        int[] member = new int[n];
        for(int i = 0; i < n; i++) {
            member[i] = Integer.parseInt(m[i]);
        };
        Arrays.sort(member);
        int presentNum = member[0];
        int answer = 0;
        int count = 0;
        
        for(int j = 0; j < n; j++) {
            if(member[j] == presentNum) {
                count++;
                if(count == presentNum) { 
                    answer++;
                    count = 0;
                }
            }
            else {
                presentNum = member[j];
                count = 1;
            }
        }
        
        System.out.println(answer);
    }
}

import java.io.*;
import java.math.*;
import java.util.*;
public class Multiples_of_Two {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int i=2;
        for(n=1;n<=10;n++)
        {
           
            System.out.println(i+"*"+n +"="+n*i);
        }

        bufferedReader.close();
    }
}

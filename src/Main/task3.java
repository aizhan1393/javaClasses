package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {
    static public void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int count = Integer.parseInt(reader.readLine());
         reader.close();

         for(int i = 0; i < count; i++){ //without \n
             System.out.print(Math.random() + " ");
         }

        for(int i = 0; i < count; i++){ //with \n
            System.out.println(Math.random());
        }
    }
}

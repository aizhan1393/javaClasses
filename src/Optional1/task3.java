package Optional1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i = 0; i < 10; i++){
            String temp = reader.readLine();
            int tempInt = Integer.parseInt(temp);
            map.put(tempInt, temp.length());
        }
        reader.close();


        List<Integer> lengthNumber = new ArrayList<>(map.values());
        Set<Integer> set = new HashSet<>(lengthNumber);
        lengthNumber.clear();
        lengthNumber.addAll(set);
        Collections.sort(lengthNumber);


        lengthNumber = new ArrayList<>(map.values());
        Collections.sort(lengthNumber);


        int sum = 0;
        for (Integer integer : lengthNumber) {
            sum = sum + integer;
        }
        int averageLength = sum / 10;

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() > averageLength)
                System.out.println(pair.getKey() + " has the length bigger than average length: " + pair.getValue());
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() < averageLength)
                System.out.println(pair.getKey() + " has the length smaller than average length: " + pair.getValue());
        }
    }
}

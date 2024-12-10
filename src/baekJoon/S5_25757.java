package baekJoon;

import java.io.*;
import java.util.*;

public class S5_25757 {
    public static void main(String[] aa) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new HashMap<>();
        map.put("Y", 2);
        map.put("F", 3);
        map.put("O", 4);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String game = st.nextToken();

        List<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            arr.add(s);
        }

        int max = map.get(game);
        List<String> chk = new ArrayList<>();
        int count = 1;
        int answer = 0;

        for (String name : arr) {
            if (chk.contains(name)) {
                continue;
            }
            else {
                count++;
                chk.add(name);
            }

            if (count == max) {
                answer++;
                count = 1;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}

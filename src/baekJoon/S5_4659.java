package baekJoon;

import java.io.*;

/*
baekjoon 4659
24-12-04
 */
public class S5_4659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("end")) {

            boolean flag = false;
            int count = 0;
            char prev = '.';

            for (char c : s.toCharArray()) {
                if (chk(c)) flag = true;

                if (chk(c) != chk(prev)) count = 1;
                else count++;

                if (count > 2 || (prev == c && (prev != 'e' && prev != 'o'))){
                    flag = false;
                    break;
                }

                prev = c;
            }

            if (flag) bw.write("<" + s + "> is acceptable.\n");
            else bw.write("<" + s + "> is not acceptable.\n");
        }

        bw.flush();
        bw.close();
    }

    static public boolean chk(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}


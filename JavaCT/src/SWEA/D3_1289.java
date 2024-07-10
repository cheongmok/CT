package SWEA;

import java.util.Scanner;
class D3_1289
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            String memory_value;
            memory_value = sc.next();

            int cnt = 0;
            char current_bit = '0';
            for (int i = 0 ; i < memory_value.length(); ++i) {
                if (current_bit != memory_value.charAt(i)) {
                    cnt++;
                }
                current_bit = memory_value.charAt(i);
            }

            System.out.println("#" + test_case + " " + cnt);
        }
    }
}
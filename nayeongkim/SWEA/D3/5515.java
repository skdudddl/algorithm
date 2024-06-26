import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 class Solution5515 {
    static int[] days ={0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int[] date = {3, 4, 5, 6, 0, 1, 2};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int sum = d;
            for (int i = 0; i < m; i++) {
                sum += days[i];
            }
            System.out.println("#"+ t+ " "+ date[sum % 7]);
        }
    }
}

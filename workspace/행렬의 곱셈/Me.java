import java.util.Arrays;

public class Me {
    public static void main(String[] args) {
        Me me = new Me();

        int[][] arr1 = {
            {1, 4},
            {3, 2},
            {4, 1}
        };
        int[][] arr2 = {
            {3, 3},
            {3, 3}
        };

        int[][] output = me.solution(arr1, arr2);
        System.out.println(Arrays.deepToString(output));
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int arr1X = arr1[0].length;
        int arr1Y = arr1.length;
        
        int arr2X = arr2[0].length;

        int[][] answer = new int[arr1Y][arr2X];
        int sizeX = answer[0].length;
        int sizeY = answer.length;

        for(int y = 0; y < sizeY; y++) {
            for(int x = 0; x < sizeX; x++) {
                int sum = 0;

                for(int i = 0; i < arr1X; i++) {
                    sum += arr1[y][i] * arr2[i][x];
                }
                answer[y][x] = sum;
            }
        }
        return answer;
    }
}

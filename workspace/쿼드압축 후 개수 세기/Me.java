import java.util.Arrays;

// 실패
public class Me {
    public static void main(String[] args) {
        Me me = new Me();

        int[][] arr = {{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        int[] output = me.solution(arr);

        System.out.println(Arrays.toString(output));
    }
    public int[] solution(int[][] arr) {
        int x1 = 1;
        int y1 = 1;
        int x2 = arr.length;
        int y2 = arr.length;

        return calc(x1, y1, x2, y2, arr);
    }

    public int[] calc(int x1, int y1, int x2, int y2, int[][] arr) {
        if(x1 > x2 || y1 > y2) {
            int[] result = {0, 0};
            return result;
        }
        int indexX1 = x1 - 1;
        int indexY1 = y1 - 1;
        int indexX2 = x2 - 1;
        int indexY2 = y2 - 1;
        System.out.println(indexX1);
        System.out.println(indexY1);
        System.out.println(indexX2);
        System.out.println(indexY2);
        System.out.println("-----------------");
        if(indexX1 == indexX2) {
            if(arr[indexY1][indexX1] == 0) {
                int[] result = {1, 0};
                return result;
            }
            else {
                int[] result = {0, 1};
                return result;
            }
        }

        int[] a = getCountIfSame(indexX1, indexY1, indexX2, indexY2, arr);
        if(a[0] == 0 && a[1] == 0) {
            int newX = x2/2;
            int newY = y2/2;

            int[] b;
            b = calc(x1, y1, newX, newY, arr);
            a[0] += b[0];
            a[1] += b[1];

            b = calc(newX + 1, y1, x2, newY, arr);
            a[0] += b[0];
            a[1] += b[1];

            b = calc(x1, newY + 1, newX, y2, arr);
            a[0] += b[0];
            a[1] += b[1];

            b = calc(newX + 1, newY + 1, x2, y2, arr);
            a[0] += b[0];
            a[1] += b[1];
        }
        return a;
    }

    public int[] getCountIfSame(int x1, int y1, int x2, int y2, int[][] arr) {
        int init = arr[y1][x1];

        for(int x = x1; x <= x2; x++) {
            for(int y = y1; y <= y2; y++) {
                if(init != arr[y][x]) {
                    int[] count = {0, 0};
                    return count;
                }
            }
        }

        if(init == 0) {
            int[] count = {1, 0};        
            return count;
        }
        else {
            int[] count = {0, 1};        
            return count;
        }
    }
}
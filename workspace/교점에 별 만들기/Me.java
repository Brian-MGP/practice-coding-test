import java.util.Arrays;

public class Me {
    public static void main(String[] args) {
        Me test = new Me();

        // int[][] input = {
        //     {0, 1, -1},
        //     {1, 0, -1},
        //     {1, 0, 1}
        // };

        // int[][] input = {
        //     {2, -1, 4},
        //     {-2, -1, 4},
        //     {0, -1, 1},
        //     {5, -8, -12},
        //     {5, 8, 12}
        // };

        int[][] input = {
            {1, -1, 0},
            {2, -1, 0}
        };

        String[] output = test.solution(input);
        System.out.println(Arrays.toString(output));
    }

    public String[] solution(int[][] total) {
        int totalLength = total.length;
        String[][] star = new String[1001][1001];
        int minX = 500;
        int maxX = 500;

        int minY = 500;
        int maxY = 500;

        for(int i = 0; i < totalLength; i++) {
            for(int j = 0; j < totalLength; j++) {
                if(i == j) {
                    continue;
                }
                double A = total[i][0];
                double B = total[i][1];
                double E = total[i][2];

                double C = total[j][0];
                double D = total[j][1];
                double F = total[j][2];

                double mother = A*D - B*C;
                if(0 == mother) {
                    continue;
                }
                double doubleX = (B*F - E*D)/mother;
                if(doubleX != (int) doubleX){
                    continue;
                }
                double doubleY = (E*C - A*F)/mother;
                if(doubleY != (int) doubleY) {
                    continue;
                }
                int X = 500 - ((int)doubleX);
                int Y = 500 - ((int)doubleY);

                star[Y][X] = "*";

                if(X < minX) {
                    minX = X;
                }
                if(X > maxX) {
                    maxX = X;
                }

                if(Y < minY) {
                    minY = Y;
                }
                if(Y > maxY) {
                    maxY = Y;
                }
            }
        }

        System.out.println(maxX);
        System.out.println(maxY);
        System.out.println(minX);
        System.out.println(minY);

        int lengthY = maxY - minY + 1;
        String[] result = new String[lengthY];
        int resultIndex = 0;

        for(int starY = minY; starY <= maxY; starY++) {
            StringBuilder sb = new StringBuilder();
            for(int starX = minX; starX <= maxX; starX++) {

                if(star[starY][starX] == null) {
                    sb.append(".");
                }
                else {
                    sb.append("*");
                }
            }
            result[resultIndex++] = sb.toString();
        }

        return result;
    }
}

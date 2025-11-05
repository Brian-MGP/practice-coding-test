import java.util.Arrays;

public class Me {
    public static void main(String[] args) {
        Me me = new Me();

        int[] result = me.solution(8);

        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int n) {
        Snail snail = new Snail(n);

        while (true) {
            snail.writeIndexToSnail();
            if(snail.isNext()) {
                snail.move();
            }
            else {
                snail.changeDirection();
                if(snail.isNext()) {
                    snail.move();
                }
                else {
                    break;
                }
            }
        }

        return snail.print();
    }

    private static class Snail {
        // 0: 아래, 1: 왼쪽, 2: 대각선
        int currentDirection = 0;
        int currentX = 0;
        int currentY = 0;
        int nextIndex = 1;

        int width;
        int height;
        int length;
        int[][] result;

        public Snail(int arrayLength) {
            this.length = arrayLength;
            this.width = this.length - 1;
            this.height = this.length - 1;
            this.result = new int[this.length][this.length];
            for(int[] a : result) {
                Arrays.fill(a, 0);
            }
        }

        boolean isNext() {
            int x = this.getNextX(this.currentDirection);
            int y = this.getNextY(this.currentDirection);

            if(isAbleToMove(x, y, this.currentDirection)) {
                return true;
            }
            return false;
        }

        boolean isAbleToMove(int x, int y, int direction) {
            if(direction == 0) {
                if(y > height) {
                    return false;
                }
            }
            else if(direction == 1) {
                if(x > width) {
                    return false;
                }
            }
            else if(direction == 2) {
                if(x < 0 || y < 0) {
                    return false;
                }
            }
            if(this.result[y][x] != 0) {
                return false;
            }
            return true;
        }

        void changeDirection() {
            this.currentDirection = this.getNextDirection(this.currentDirection);
        }

        int getNextDirection(int direction) {
            return (direction + 1) % 3;
        }

        void move() {
            this.currentX = this.getNextX(this.currentDirection);
            this.currentY = this.getNextY(this.currentDirection);
        }

        int getNextX(int direction) {
            if(direction == 1) {
                return this.currentX + 1;
            }
            else if(direction == 2) {
                return this.currentX - 1;
            }
            return this.currentX;
        }

        int getNextY(int direction) {
            if(direction == 0) {
                return this.currentY + 1;
            }
            else if(direction == 2) {
                return this.currentY - 1;
            }
            return this.currentY;
        }

        void writeIndexToSnail() {
            this.result[currentY][currentX] = this.nextIndex;
            nextIndex++;
        }

        int[] print() {
            int sum = 0;
            for(int i = length; i >= 0; i--) {
                sum += i;
            }
            int[] output = new int[sum];
            int index = 0;
            for(int y = 0; y <= height; y++) {
                for(int x = 0; x <= y; x++) {
                    output[index++] = this.result[y][x];
                }
            }

            return output;
        }
    }
}

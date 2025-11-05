import java.util.Arrays;

public class Me {
    public static void main(String[] args) {
        Me me = new Me();
        String[][] places = 
            {
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
            };

        int[] output = me.solution(places);

        System.out.println(Arrays.toString(output));
    }
    final int maxRoom = 5;

    public int[] solution(String[][] places) {
        int[] result = new int[maxRoom];
        int index = 0;

        for(String[] place : places) {
            Room room = new Room(place);
            int distanceResult = room.getDistanceResult();
            result[index++] = distanceResult;
        }

        return result;
    }

    private class Room {
        char[][] room;

        public Room(String[] place) {
            this.room = new char[maxRoom][maxRoom];
            for(int i = 0; i < maxRoom; i++) {
                room[i] = place[i].toCharArray();
            }
        }

        public int getDistanceResult(){
            for(int y = 0; y < maxRoom; y++) {
                for(int x = 0; x < maxRoom; x++) {
                    if(isPerson(x, y) == false) {
                        continue;
                    }
                    if(isAroundPerson(x, y)) {
                        return 0;
                    }
                    if(isPersonIfAroundTable(x, y)) {
                        return 0;
                    }
                }
            }
            return 1;
        }

        public boolean isPerson(int x, int y) {
            return isCharLike(x, y, 'P');
        }

        public boolean isAroundPerson(int x, int y) {
            if(isRightSide(x, y, 'P')) {
                return true;
            }
            if(isDownSide(x, y, 'P')) {
                return true;
            }
            
            return false;
        }

        public boolean isPersonIfAroundTable(int x, int y) {
            if(isRightSide(x, y, 'O')) {
                int rightX = getRightSideX(x);
                if(isAroundPerson(rightX, y)) {
                  return true;
                }
            }
            if(isDownSide(x, y, 'O')) {
                int downY = getDownSideY(y);
                if(isAroundPerson(x, downY)) {
                  return true;
                }
            }
            return false;
        }

        public int getRightSideX(int x) {
            return x + 1;
        }

        public int getDownSideY(int y) {
            return y + 1;
        }

        public boolean isRightSide(int x, int y, char something) {
            x = getRightSideX(x);
            return isCharLike(x, y, something);
        }

        public boolean isDownSide(int x, int y, char something) {
            y = getDownSideY(y);
            return isCharLike(x, y, something);
        }

        public boolean isCharLike(int x, int y, char something) {
            if(x > maxRoom - 1) {
                return false;
            }
            if(y > maxRoom - 1) {
                return false;
            }
            return room[y][x] == something;
        }
    }
}

package java_stduy_11;

class NestedLoopTest {

    public static void main(String[] args) {
        int dan = 2;
        int count = 1;

        for (int i = dan; i <= 9; i++) {
            for (int j = count; j <= 9; j++) {
                System.out.println(dan + "X" + count + "=" + dan * count);
            }
            System.out.println("\n");
        }

        dan = 2;
        while (dan <= 9) {
            count = 1;
            while (count <= 9) {
                System.out.println(dan + "X" + count + "=" + dan * count);
                count++;
            }
            dan++;
            System.out.println("\n");
        }
    }

}
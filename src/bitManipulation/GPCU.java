package bitManipulation;

public class GPCU {

    public static void main(String[] args) {
        System.out.println("Get bit of postion 2->" + getBit(10, 2));
        System.out.println("Set bit of postion 2->" + setBit(10, 2));
        System.out.println("Clear bit of postion 2->" + setClear(10, 1));
        System.out.println("update bit of postion 2->" + update(10, 1, false));
    }

    // Get BIT. 10 ->1010 2 position is 0
    public static int getBit(int a, int postion) {
        int bitMask = 1 << postion;
        if ((bitMask & a) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Get SET. 10 ->1010 2 position is 1110
    public static int setBit(int a, int postion) {
        int bitMask = 1 << postion;
        return (bitMask | a);
    }

    // Get Clear. 10 ->1010 1 position is 1110
    public static int setClear(int a, int postion) {
        int bitMask = 1 << postion;
        return (~bitMask & a);
    }

    // Get Clear. 10 ->1010 1 position is 1110
    public static int update(int a, int postion, boolean isOne) {
        int bitMask = 1 << postion;
        if (isOne) {
            return (bitMask | a);
        } else {
            return (~bitMask & a);
        }

    }

}

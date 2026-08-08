public class ClearBit {
    public static void main(String[] args){
        int n =5;
        int pos = 2;
        int bitmask = 1<<pos;
        int notbitmask = ~(bitmask);

        int new_number = n & notbitmask;
        System.out.println(new_number);

    }
}

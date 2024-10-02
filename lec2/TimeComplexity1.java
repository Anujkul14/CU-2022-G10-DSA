package lec2;

public class TimeComplexity1 {
    public static void main(String[] args) {
        int start = (int) System.currentTimeMillis();
        int count = 0;
        for(int i = 0;i < 100000;i++)
        {
            //running a loop
            count++;
        }
        int end = (int) System.currentTimeMillis();
        System.out.println(end - start);
    }
}

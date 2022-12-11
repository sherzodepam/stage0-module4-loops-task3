package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void main(String[] args){
    }
    public void calculateSum(int lengthOfLastNumber) {
        int sum=9;
        int n=9;
        for (int i = 1; i < lengthOfLastNumber; i++) {
            n=n*10+9;
            sum+=n;
        }

    }
}

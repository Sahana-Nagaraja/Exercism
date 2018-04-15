public class NaturalNumber {
    private final int number;

    public NaturalNumber(int number) {
        this.number = number;
        if (number <= 0) throw new IllegalArgumentException("You must supply a natural number (positive integer)");
    }

    public Classification getClassification() {
        int sum = 0;
        sum = getSum(sum);
        if(sum == number) return Classification.PERFECT;
        if(sum > number) return Classification.ABUNDANT;
        return Classification.DEFICIENT;
    }

    private int getSum(int sum) {
        for( int i = 1; i < this.number; i++){
            if(number % i == 0) sum += i;
        }
        return sum;
    }
}

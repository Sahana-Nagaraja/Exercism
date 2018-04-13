public class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(int i) {
        int sum = 0;
        for (int a = 1; a <= i; a++){
            sum += a;
        }
        return sum*sum;
    }

    public int computeSumOfSquaresTo(int i) {
        int sum = 0;
        for (int a = 1; a <= i; a++){
            sum += a*a;
        }
        return sum;
    }

    public int computeDifferenceOfSquares(int i) {
        return computeSquareOfSumTo(i)-computeSumOfSquaresTo(i);
    }
}

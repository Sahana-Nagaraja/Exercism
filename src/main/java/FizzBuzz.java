
public class FizzBuzz {

    private String display(int input) {
        String output = "";

        if (input % 3 == 0) {
            output = "Fizz";
        }
        if (input % 5 == 0) {
            output += "Buzz";
        }
        return output.isEmpty() ? Integer.toString(input) : output;

    }

    public String[] displayForRange(int[] input){
        String[] output=new String[input.length];
        for(int i=0;i<input.length;i++){
            output[i]=display(input[i]);
        }
        return output;
    }

}

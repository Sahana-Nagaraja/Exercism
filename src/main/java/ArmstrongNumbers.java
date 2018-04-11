public class ArmstrongNumbers {
    public boolean isArmstrongNumber(int input) {
        int output = input,digit=0,i,remainder,result=0;
        while(output>0)
        {
            output /= 10;
            digit++;
        }
        output = input;
        i = digit;
        while(digit>0)
        {
            remainder = output%10;
            output /= 10;
            result += Math.pow(remainder,i);
            digit--;
        }
        return result == input;
    }
    }

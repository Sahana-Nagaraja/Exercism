public class ReverseString {
    public String reverse(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(s);
        stringBuffer = stringBuffer.reverse();
        return stringBuffer.toString();
    }
}

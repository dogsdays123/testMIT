
class codetest1 {

    public static void main(String[] args) {
        short sMin = -32768, sMax = 32767;
        char cMin = 0, cMax = 65535;

        System.out.println("sM = " + sMin);
        System.out.println("sM-1 = " + (short) (sMin - 1));
        String str = "3";
        System.out.println(str.charAt(0) - '0');
        System.out.println('3' - '0' + 1);
    }
}

public class HCFandLCM {
    public static void main(String[] args) {

        int a = 789456;
        int b = 78;
        System.out.println(HCF(a,b));
        System.out.println(LCM(a,b));
    }

    // HCF is also called GCD ie greatest common divisor

    static int HCF(int num1, int num2) {
        int min;
        int HCF = 1; // min HCF = 1

        if(num2 > num1) {
            min = num1;
        }
        else {
            min = num2;
        }

        for(int i = 1; i <= min; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                HCF = i;
            }
        }

return HCF;    }

static int LCM(int a, int b) {
        int LCM = (a * b) / HCF(a, b);
        return LCM;
}

}
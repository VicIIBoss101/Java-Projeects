public class Q2 {
    public static void main(String[] args) {
        double meter = 0;
        for (int feet = 3 ; feet <= 30 ; feet+=3){
            meter = (feet * 1.0) / 3.28;
            System.out.println(feet + " feet = " + meter + " meter");
        }
    }
}

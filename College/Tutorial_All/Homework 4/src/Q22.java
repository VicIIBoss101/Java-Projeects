public class Q22 {
    public static void main(String[] args) {
        double sum = 0 , count = 0;
        for (int i = 1 ; i <= 100 ; i+=2){
            System.out.print(i + " ");
            sum +=i;
            count++;
        }
        System.out.println("The average is " + (sum / count));
    }   
}
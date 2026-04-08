public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i >= 0; i--) {
            // \r ترجعنا للبداية في كل دورة
            System.out.print("\rTime remaining: " + i + " seconds ");

            // نوقف البرنامج لمدة ثانية واحدة (1000 مللي ثانية)
            Thread.sleep(500);
        }
        System.out.println("\nDone! ");
    }
}

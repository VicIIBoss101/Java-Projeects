public class EidSpecial {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";
    public static final String BOLD = "\u001B[1m";
    public static final String PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        System.out.println(CYAN + BOLD + "========================================" + RESET);
        System.out.println(GREEN + BOLD + "             Eid_Mubarak      " + RESET);
        System.out.println(CYAN + BOLD + "========================================" + RESET);

        String greeting = "كل عام وأنتم بخير يا مبرمجين! ✨";

        System.out.println("\n" + YELLOW + BOLD + "System Output: " + RESET + PURPLE + greeting + RESET);

        System.out.println("\n" + CYAN + "Status: " + GREEN + "Success (0 Bugs Found)" + RESET);
        System.out.println(CYAN + "Mood:   " + GREEN + "High Productivity & Happiness" + RESET);

        System.out.println("\n" + CYAN + BOLD + "----------------------------------------" + RESET);
        System.out.println(YELLOW + "أتمنى لكم سنة مليئة بالـ Success وبعيدة عن الـ Runtime Errors!" + RESET);
        System.out.println(CYAN + BOLD + "----------------------------------------" + RESET);
    }
}
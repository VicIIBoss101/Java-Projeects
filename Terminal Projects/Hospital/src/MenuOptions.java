public class MenuOptions {
    
    private String[] mainMenu = { "Select Programm mode:", "1. Employee", "2. Customer", "3. exit Programm" };
    private String[] employeeMenu = { "1. Check Available Rooms", "2. Check Patients ", "3. Add Patients",
            "4. Cancel Patient registration", "5. return to main menu" };
    private String[] managerMenu = { " " };
    private String[] custromerMenu = { "1. registration Menu", "2. Check out", "3. Cancel registration",
            "4. return to main menu" };
    private String[] registationMenu = { "1. Vip room (540$ pre night)", "2. Regular room (60$ per night)", "3. back" };

    // ======================== Print methodes ========================
    protected void printCustomMenu(String title, String[] options) {
        System.out.println("\n" + title);
        System.out.println("=".repeat(title.length()));
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println("=".repeat(title.length()));
    }

    protected void printPatientInfo(Patient p) {
        System.out.printf("%-2d|%-20s|  %-7.7s| %-7d|   %-7d|%-7s\n", p.getPatientId(), p.getPatientName(),
                p.getRoomtype(), p.getPatientRoom(), p.getDaysSpent(), p.getFRegTime());
    }

    protected void printInfoMenu() {
        System.out.printf("%-2s|%-16s|%-7s|%-7s|%-7s|%-7s \n", "ID", "\tFull Name", "Room Type", "Room Num",
                "days Spent", "registration Time");
    }

    // ======================== Menus Methods ========================
    public void showMainMenu() {
        printCustomMenu("Hospital System", mainMenu);
    }

    public void showEmployeeMenu() {
        printCustomMenu("Employee Menu", employeeMenu);
    }

    public void showManagerMenu() {
        printCustomMenu("Manager Menu", managerMenu);
    }

    public void showCustomerMenu() {
        printCustomMenu("Customer Menu", custromerMenu);
    }

    public void showRigstrationMenu() {
        printCustomMenu("Registation Menu", registationMenu);
    }

}
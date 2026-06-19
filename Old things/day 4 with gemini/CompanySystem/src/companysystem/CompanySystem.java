
package companysystem;

public class CompanySystem {

    public static void main(String[] args) {
        Employee[] team = new Employee[3];
        team[0] = new Employee("Ahmed", 300);
        team[1] = new Manager("Ali", 500, 600);
        team[2] = new Manager("Sami", 600, 700);
        for(int i = 0 ; i < team.length; i++) {
            team[i].printInfo();
            // نقطة فحص اذا كان الشخص مدير ام لا
            if (team[i] instanceof Manager) {
                Manager m = (Manager) team[i];
                m.signPaper();
            }
        }
    }
    
}

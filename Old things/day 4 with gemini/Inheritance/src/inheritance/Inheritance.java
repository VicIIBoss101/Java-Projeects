package inheritance;

public class Inheritance {

    public static void main(String[] args) {
        //Employee m1 = new Employee("ali", 1000, 400);
        // السطر الي في الاعلى ما يشتغل لانه مبرمج لياخذ قيمتين فقط وليس ثلاثة
        // يشتغل اذا اعطيناه متغيران فقط
        Employee m1 = new Manager("ali" , 100, 500);
        System.out.println("==== Manager Details ====");
        m1.printInfo();
        //==================
        //m1.signPaper();
        // البرنامج ما راح يقدر يطبع السطر الي فوق لان دالة توقيع الورقة خاصة بالمدير 
        // واحنا فوق خلينا كلاس الموظف هو المرجع الحل في السطر الي تحت 
        //===================
        ((Manager) m1).signPaper();
        // في هذا السطر اول شي حولنا المرجع من الموظف الى المدير الي يحوي
        // دالة ورقة التوقيع
        //====================
    }
}

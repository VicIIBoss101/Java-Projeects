import java.util.ArrayList;
import java.util.Scanner;

// استدعينا المكتبة اول شي هسه الاوامر الي عليها 
//==========
// للإضافة
//list.add("عنصر")
//=========
//للحذف
//list.remove(0)
//=========
//للقراءة
//list.get(2)
//=========
//للتعديل
//list.set(1, "جديد")
//يمثل مكان العنصر
//=========
//للحصول على عدد العناصر
//list.size()
//=========
//لتفريغ المصفوفة
//list.clear()
//==========
//اذا اردنا نعرف هل المصفوفة فارغة 
//list.isEmpty()
//==========
//ArrayList<String> myNumbers = new ArrayList<>();
//ArrayList<Integer> myNumbers = new ArrayList<>();
//ArrayList<Character> myNumbers = new ArrayList<>();
//ArrayList<Double> myNumbers = new ArrayList<>();
//==========
public class ArrayListMeth {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.print("\n" + "type stop to stop\n" + "Enter a name: ");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("stop")) {
                break;
            } else {
                names.add(name);
            }
        }
        for (String i : names) {
            System.out.println(i);
        }
    }
}
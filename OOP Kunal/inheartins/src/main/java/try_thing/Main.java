package try_thing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Person p1 = new Person("ali", "basrah" , 7767);
            System.out.println(p1.personInfo());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

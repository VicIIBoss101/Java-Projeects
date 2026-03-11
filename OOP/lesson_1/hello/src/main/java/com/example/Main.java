package com.example;

public class Main {
    public static void main(String[] args) {
        Car obj;
        // حجزنا مكان في الذاكرة من خلال new
        obj = new Car();
        // obj.name = "toyota";
        // obj.maxSpeed = 120;
        // اعطينا قيم للكائن اوبجيكت
        // System.out.println(obj.name);
        // نقدر نعطي و نطبع القيم من خلال الدوال
        obj.setName("tesla");
        System.out.println(obj.getName());
        // طبعا هنا اعطينا قيمة لان احنا اول شي مررنا القيمة من داخل ميثود
        // هاي الميثود موجودة داخل الكلاس
        // وبما انو فقط هذا الكلاس له وصل الها ف اشتغل الكود طبيعي اما اذا
        // obj.name = "tesla";
        // The field Car.name is not visible
        // راح يعطي هذه الايرور

    }
}
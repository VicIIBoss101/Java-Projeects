package com.example;

public class Car {

    // حاليا هذه الخصائص هيه عاة يعني اقدر اوصل الها من اي كلاس داخل هذا الباكيج
    // String name;
    // int maxSpeed;
    // float price;
    // خصائص هذا الكلاس
    private String name;
    private int maxSpeed;
    // حاليا هذه الخصائص صارت خاصه فقط في هذا الكلاس يعني اي شي خارج هذا الكلاس ما
    // يقدر يوصل لهذه الخصائص

    
    void setName(String n) {
        // دالة تخزن الاسم
        name = n;
    }

    String getName() {
        // دالة ترجع الاسم
        return name;
    }
    // طبعا الاكسيس داتا تايب لهذه الدوال المفروض يكون 
    // public 
    // حتى نقدر نوصل الها من اي مكان في المشروع
    
}

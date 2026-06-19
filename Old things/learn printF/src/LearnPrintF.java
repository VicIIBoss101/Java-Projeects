public class LearnPrintF {
    public static void main(String[] args) throws Exception {
        // s% for string
        // %d for nubmer like Int
        // %f for numbers like float or double
        // %n new line
        // اذا اردنا التحكم في عدد الفواصل العشرية
        // %.2f يعطي مرتبتين بعد الفاصلة
        String product = "Laptop";
        double price = 1250.5;
        System.out.printf("Product: %s | price: %.2f", product, price);
        // %-10s : يعني احجز 10 خانات للاسم و السالب يعني ابدا كتابه من اليسار
        // رقم 10 مثل عرض الحقل
        // % ,.2f : الفاصلة هنا للتفريق بين الالاف
        System.out.printf("\nProduct : %-10s || Prince: $%,.2f %n", product, price);
    }
}

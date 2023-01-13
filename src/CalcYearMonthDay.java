public class CalcYearMonthDay {
    public static void main(String[] args) {
        int days = 1025;
        int year = days / 365;
        int month = (days % 365) / 30;
        int day = (days % 365) % 30;

        System.out.println("Введенное число = "+days);
        System.out.println("Это "+year+" лет/годов");
        System.out.println(month+" месяца/ев");
        System.out.println(day+" день/дней");
    }
}

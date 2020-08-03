public class Seconds {
    public static void main(String[] args) {

        int seconds = 378547801;
        int secondsInMinuts = 60;
        int secondsInHours = secondsInMinuts * 60;
        int secondsInDay = secondsInHours * 24;
        int secondsInMounth = secondsInDay * 31;
        int secondsInYears = secondsInMounth *12;
        int year = seconds / secondsInYears;
        int mounth = (seconds % secondsInYears) / secondsInMounth;
        int days = ((seconds % secondsInYears) % secondsInMounth) / secondsInDay;
        int hours = (((seconds % secondsInYears) % secondsInMounth) % secondsInDay) / secondsInHours;
        int minuts = ((((seconds % secondsInYears) % secondsInMounth) % secondsInDay) % secondsInHours) / secondsInMinuts;
        int leftSeconds = (((((seconds % secondsInYears) % secondsInMounth) % secondsInDay) % secondsInHours) % secondsInMinuts);

        System.out.println("Дано общее количестов секунд:" + seconds);
        System.out.println("Это равно:");
        System.out.println("Лет:" + year);
        System.out.println("Месяцев:" + mounth);
        System.out.println("Дней:" + days);
        System.out.println("Часов:" + hours);
        System.out.println("Минут:" + minuts);
        System.out.println("Секунд:" + leftSeconds);

    }
}

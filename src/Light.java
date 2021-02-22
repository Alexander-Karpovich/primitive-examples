
//Вычислить расстояние, проходимое светом,
//используя переменные типа long
class Light {
    public static void main(String[] args) {
        int lightspeed;
        short days;
        long seconds;
        long distance;
        lightspeed = 300000; // приблизительная скорость света, километров в секунду
        days = 1000; //указать количество дней
        byte secondsInMinute = 60;
        byte minutesInHour = 60;
        byte hoursInDay = 24;
        seconds = days * hoursInDay * minutesInHour * secondsInMinute; // преобразовать в секунды
        distance = lightspeed * seconds; // вычислить расстояние
        System.out.print("Зa " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " километров.");
    }
}

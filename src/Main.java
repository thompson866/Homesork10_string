public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fulltName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fulltName);
        //task 2 test
        //System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fulltName.toUpperCase());
    }

    public static void task2() {
        String fulltName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fulltName.toUpperCase());


    }

    public static void task3() {
        String fulltName = "Иванов Семён Семёнович";
        fulltName = fulltName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fulltName);


    }
}
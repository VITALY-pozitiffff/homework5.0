public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задача 1");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else System.out.println("Неизвестная операционная система");

        //Другой рабочий способ
// Сделаем тоже самое через switch
//int clientOS=0;
        //switch (clientOS){
        //case 0:
        //System.out.println("Установите версию приложения для IOS по ссылке");
        //break;
        // case 1:
        // System.out.println("Установите версию приложения для Android по ссылке");
        // break;
//default: System.out.println("Неизвестная операционная система");
        //break;
        //}

        System.out.println("Задача 2");
        int clientDeviceYear= 2014;
        switch (clientOS) {
        case 0:
            if (clientDeviceYear<2015) {
                     System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
            } else   {System.out.println("Установите  версию приложения для IOS по ссылке.");
        }
        break;
            case 1:
                if(clientDeviceYear<2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                }else {System.out.println("Установите  версию приложения для Android по ссылке.");
                }
                break;
            default:
                System.out.println("Неизвестная операционная система");
                break;
        }
           System.out.println("Задача 3");
        int year = 2024; // задаем проверяемый год

        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Задача 4");

        int deliveryDistance = 33;

        // Проверяем условия доставки
        if (deliveryDistance > 100) {
            System.out.println("Доставка недоступна");
        } else if (deliveryDistance > 60) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance > 20) {
            System.out.println("Потребуется дней: 2");
        } else {
            System.out.println("Потребуется дней: 1");
        }
        System.out.println("Задача 5");

        int monthNumber = 6;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный номер месяца");
                break;

    }


}
}


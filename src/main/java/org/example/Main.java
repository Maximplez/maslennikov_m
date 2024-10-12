package org.example;

public class Main {
    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];


        empArray[0] = new Employee("Иванов Иван Иванович", "Инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
        empArray[1] = new Employee("Петров Петр Петрович", "Менеджер", "petrov@mailbox.com", "892312313", 40000, 28);
        empArray[2] = new Employee("Сидоров Сидор Сидорович", "Дизайнер", "sidorov@mailbox.com", "892312314", 35000, 27);
        empArray[3] = new Employee("Кузнецов Василий Абрамович", "Аналитик", "kuznetsov@mailbox.com", "892312315", 45000, 35);
        empArray[4] = new Employee("Зайцева Анна Вадимовна", "Разработчик", "zaytseva@mailbox.com", "892312316", 50000, 29);


        for (Employee emp : empArray) {
            emp.displayInfo();
        }


        Park AstonushkaPark = new Park("Астонушка", 5);
        AstonushkaPark.addAttraction(0, "Горки", "10:00 - 22:00", 500);
        AstonushkaPark.addAttraction(1, "Детская площадка", "10:00 - 20:00", 300);
        AstonushkaPark.addAttraction(2, "Колесо обозрения", "10:00 - 23:00", 700);

        AstonushkaPark.displayAttractions();
    }
}
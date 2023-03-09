package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7(999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1990;

        System.out.println("Имя: " + post.name);
        System.out.println("Пасспорт: " + post.passport);
        System.out.println("Отчество: " + post.patronymic);
        System.out.println("Номер телефона: " + post.phone);
        System.out.println("Фамилия: " + post.surname);
        System.out.println("Статус подписки: " + post.subscription);
        System.out.println("Дата рождения:");
        System.out.println("День    - " + post.birthday.day);
        System.out.println("Месяц   - " + post.birthday.month);
        System.out.println("Год     - " + post.birthday.year);



    }


}
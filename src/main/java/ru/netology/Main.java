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

        System.out.println("Имя: " + Post.name);
        System.out.println("Пасспорт: " + Post.passport);
        System.out.println("Отчество: " + Post.patronymic);
        System.out.println("Номер телефона: " + Post.phone);
        System.out.println("Фамилия: " + Post.surname);
        System.out.println("Статус подписки: " + Post.subscription);
        System.out.println("Дата рождения:");
        System.out.println("День    - " + Post.birthday.day);
        System.out.println("Месяц   - " + Post.birthday.month);
        System.out.println("Год     - " + Post.birthday.year);



    }


}
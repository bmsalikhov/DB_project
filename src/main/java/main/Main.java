package main;

import controllers.MainController;
import models.ContactsEntity;
import models.UsersEntity;

import java.util.Date;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // создаем экз главного контроллера
        MainController mainController = new MainController();

        // создаем юзера для теста
        UsersEntity user1 = new UsersEntity();
        user1.setId(1);
        user1.setName("Petya");

        // создаем контакт для теста
        ContactsEntity contact = new ContactsEntity();
        contact.setContactName("testetstets");
        contact.setPhone("777777");
        contact.setEmail("dtetetete@mail.ru");

        // создаем логи для теста
        var log = new HashMap<String, Object>();
        log.put("traceId", "8ew7q8e7wq98e78wq7eqw");
        log.put("userId", 1);
        log.put("time", new Date().getTime());

        // заносим все данные в БД и закрываем все
        mainController.addContact(user1, contact, log);
        mainController.close();
    }
}

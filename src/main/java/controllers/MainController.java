package controllers;

import models.ContactsEntity;
import models.UsersEntity;
import org.bson.Document;
import services.EntityService;
import services.LogService;

import java.io.Closeable;
import java.util.Map;

public class MainController implements Closeable {

    // лог сервис для работы с логами
    LogService logService;

    // энтити сервис для работы с энтити
    EntityService entityService;
    public MainController() {
        logService = new LogService();
        entityService = new EntityService();
    }

    // добавление контакта в таблицу contacts и логов в таблицу logs
    public void addContact(UsersEntity user, ContactsEntity contact, Map<String, Object> meta) {
        contact.setUsersByUserId(user);

        entityService.getEntityManager().getTransaction().begin();
        entityService.getEntityManager().persist(contact);
        entityService.getEntityManager().getTransaction().commit();

        meta.put("action", "createContact");
        meta.put("newContactId", contact.getId());

        logService.add(new Document(meta));

    }

    @Override
    public void close() {
        entityService.close();
        logService.close();
    }
}

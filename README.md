# Небольшой учебный проект по работе с БД

## Суть проекта
Научиться использовать несколько разных баз в одном проекте с использованием hibernate

## Dependencies
- [hibernate-core](https://mvnrepository.com/artifact/org.hibernate/hibernate-core)
- [postgresql](https://mvnrepository.com/artifact/org.postgresql/postgresql)
- [mongodb-driver-sync](https://mvnrepository.com/artifact/org.mongodb/mongodb-driver-sync)

## Что может делать приложение?
- добавлять контакт в список контактов
- добавлять логи в список логов

## Структура БД
![image](https://github.com/bmsalikhov/DB_project/assets/153372291/ee338444-7e91-4e3b-85e1-6fb3dfd687ca)

## Packages
### controllers
Здесь хранится класс MainController, который организует совместную работу LogService и EntityService
### models
Здесь хранятся модели из бд с юзерами и контактами (PostgreSQL)
### services
Здесь хранятся LogService и EntityService, с помощью которых добавляются данные в таблицу с контактами и в таблицу с логами
### main
Здесь хранитя класс Main, в котором мы запускаем MainController и тесты, для проверки работы программы

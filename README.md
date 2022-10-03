﻿### Модуль "Хранение данных и организация безопасности". Блок 2. JPA.
Решение ДЗ по теме: "ORM, Hibernate (минусы и плюсы), Entity Lifecycle, Embedding, Relationships"

* Задача 2.1 DAO слой c Hibernate. ([Условие здесь](https://github.com/netology-code/jd-homeworks/blob/master/hibernate/task1/README.md))

(При запуске приложения создаётся схема с пустой таблицей persons.
Для заполнения таблицы тестовыми данными необходимо остановить приложение.
В файле application.properties установить значение параметра spring.jpa.hibernate.ddl-auto в update
и, раскомментировав последние две строки, запустить приложение. 
После этого, если тестовые данные нужны при последующих запусках, необходимо закомментировать две последние строки.
Для получение при запуске пустой таблицы persons установить spring.jpa.hibernate.ddl-auto=create, вернув таким образом
содержание файла application.properties к исходному.)

CREATE TABLE NAVIGATION_MENU(
   ID   INT NOT NULL,
   PARENT_ID VARCHAR(255),
   NAME VARCHAR (255)  NOT NULL,
   LOCAL_NAME VARCHAR(255) NOT NULL,
   LINK VARCHAR(512)   NOT NULL,   
   PRIMARY KEY (ID)
);


INSERT INTO NAVIGATION_MENU VALUES ("0001","","Main","Главная", "http://www.google.ru");
INSERT INTO NAVIGATION_MENU VALUES ("0002","","Catalog","Каталог", "http://www.yandex.ru");
INSERT INTO NAVIGATION_MENU VALUES ("0003","","Contacts","Контакты", "http://www.vk.com");
INSERT INTO NAVIGATION_MENU VALUES ("0004","Catalog","Phones","Телефоны", "http://www.google.ru");
INSERT INTO NAVIGATION_MENU VALUES ("0005","Phones","Mobile","Мобильники", "http://www.google.ru");
INSERT INTO NAVIGATION_MENU VALUES ("0006","Phones","Home","Домашние", "#");


insert into users(name, password, email, date)
values ('Roman', 'roman', 'roman@Yandex.ru', '2023-02-13'),
       ('Ivan', 'ivan', 'ivan@Yandex.ru', '2023-02-12'),
       ('Petr', 'petr', 'petr@Yandex.ru', '2023-02-11');

insert into voices(id, plus_voice, minus_voice)
values (1, 0, 2),
       (2, 10, 5),
       (3, 100, 5),
       (4, 20, 35),
       (5, 123, 50),
       (6, 10, 35),
       (7, 1, 50),
       (8, 14, 5),
       (9, 1456, 5),
       (10, 12, 5),
       (11, 10, 55),
       (12, 10, 45),
       (13, 10, 56),
       (14, 0, 0);


insert into quotes (id, voice_id, user_email, quote, date)
values (1, 1, 'roman@Yandex.ru', 'quote1', '2023-02-13'),
       (2, 2, 'roman@Yandex.ru', 'quote2', '2023-02-13'),
       (3, 3, 'roman@Yandex.ru', 'quote3', '2023-02-13'),
       (4, 4, 'roman@Yandex.ru', 'quote4', '2023-02-13'),
       (5, 5, 'ivan@Yandex.ru', 'quote5', '2023-02-12'),
       (6, 6, 'ivan@Yandex.ru', 'quote6', '2023-02-12'),
       (7, 7, 'ivan@Yandex.ru', 'quote7', '2023-02-12'),
       (8, 8, 'ivan@Yandex.ru', 'quote8', '2023-02-12'),
       (9, 9, 'ivan@Yandex.ru', 'quote9', '2023-02-12'),
       (10, 10, 'ivan@Yandex.ru', 'quote10', '2023-02-12'),
       (11, 11, 'petr@Yandex.ru', 'quote11', '2023-02-11'),
       (12, 12, 'petr@Yandex.ru', 'quote12', '2023-02-11'),
       (13, 13, 'petr@Yandex.ru', 'quote13', '2023-02-11'),
       (14, 14, 'petr@Yandex.ru', 'quote14', '2023-02-11');



create table users
(
    name       varchar(15),
    password varchar (15),
    email varchar(20) primary key,
    date            date
);

create table voices
(
    id           integer primary key,
    plus_voice integer,
    minus_voice integer
);

create table quotes
(
    id           integer primary key,
    voice_id integer,
    user_email      varchar (20),
    quote varchar(10),
    date date,
    FOREIGN KEY (user_email) references users(email),
    FOREIGN KEY (voice_id) references voices(id)
);








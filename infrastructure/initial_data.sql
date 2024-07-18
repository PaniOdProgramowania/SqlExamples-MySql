CREATE TABLE dance_play(dance_play_id INT NOT NULL AUTO_INCREMENT, title varchar(255), primaballerina INT, PRIMARY KEY(dance_play_id));
insert into dance_play(title, primaballerina)  VALUES('Swan Lake', 1);
insert into dance_play(title, primaballerina)  VALUES('Don Kichot', 2);
insert into dance_play(title, primaballerina)  VALUES('Bolero', null);
insert into dance_play(title, primaballerina)  VALUES('Nutcracker', 3);
insert into dance_play(title, primaballerina)  VALUES('Sleeping Beauty', 1);
insert into dance_play(title, primaballerina)  VALUES('Dracula', null);


CREATE TABLE dancers(dancer_id INT NOT NULL AUTO_INCREMENT, first_name varchar(255),  PRIMARY KEY(dancer_id));

insert into dancers(first_name) VALUES('Maria');
insert into dancers(first_name) VALUES('Anna');
insert into dancers(first_name) VALUES('Olga');
insert into dancers(first_name) VALUES('Aleksandra');
insert into dancers(first_name) VALUES('Mykhail');
insert into dancers(first_name) VALUES('Patryk');

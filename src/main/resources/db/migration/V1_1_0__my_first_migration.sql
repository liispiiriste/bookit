CREATE TABLE user (
    id   long         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(255) NOT NULL,
    age  number       NOT NULL
);

INSERT INTO user (name, age)
VALUES ('kaspar', 15);
INSERT INTO user (name, age)
VALUES ('ilja', 15);
INSERT INTO user (name, age)
VALUES ('lauri', 15);
INSERT INTO user (name, age)
VALUES ('mae', 15);
INSERT INTO user (name, age)
VALUES ('raiko', 15);
INSERT INTO user (name, age)
VALUES ('reiko', 15);


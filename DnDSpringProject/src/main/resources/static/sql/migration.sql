--CREATE DATABASE IF NOT EXISTS DnDDatabase;
--
--CREATE USER user@localhost IDENTIFIED BY 'password';
--GRANT ALL ON DnDDatabase.* TO user@localhost;
--
USE DnDDatabase;


DROP TABLE IF EXISTS characters;
DROP TABLE IF EXISTS users;


CREATE TABLE users
(
    id       INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(240) NOT NULL,
    email    VARCHAR(240) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE characters
(
    id          INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id     INT UNSIGNED NOT NULL,
    character_name       VARCHAR(240) NOT NULL,
    strength	INT UNSIGNED NOT NULL,
    dexterity	INT UNSIGNED NOT NULL,
    constitution	INT UNSIGNED NOT NULL,
    intelligence	INT UNSIGNED NOT NULL,
    wisdom	INT UNSIGNED NOT NULL,
    charisma	INT UNSIGNED NOT NULL,
    character_description TEXT         NOT NULL,
--    category TEXT         NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
        ON DELETE CASCADE
);
--
--
-- );
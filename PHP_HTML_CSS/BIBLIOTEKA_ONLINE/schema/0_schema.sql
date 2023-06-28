CREATE DATABASE biblioteka;

CREATE TABLE uzytkownicy (
                       `ID` INT NOT NULL AUTO_INCREMENT,
                       `username` VARCHAR (25) NOT NULL,
                       `password` VARCHAR (50) NOT NULL,
                       PRIMARY KEY (`ID`)
);

CREATE TABLE Książki (
    `ID_Książki` INT NOT NULL AUTO_INCREMENT,
    `Tytuł` VARCHAR (50) NOT NULL,
    `Autor` VARCHAR (50) NOT NULL,
    `Gatunek` VARCHAR (15) NOT NULL,
    `Rok_wydania` YEAR NOT NULL,
    `Wypożyczone` INT(1) DEFAULT 0,
    PRIMARY KEY (`ID_Książki`)
);

CREATE TABLE Wypożyczenia
(
    `ID_Wypożyczenia` INT NOT NULL AUTO_INCREMENT,
    `ID_Użytkownika`  INT NOT NULL,
    `ID_Książki` INT NOT NULL,
    `Data_wypożyczenia` DATE NOT NULL,
    `Data_zwrotu` DATE NOT NULL,
    PRIMARY KEY (`ID_Wypożyczenia`),
    FOREIGN KEY (ID_Użytkownika) REFERENCES uzytkownicy(ID),
    FOREIGN KEY (ID_Książki) REFERENCES Książki(ID_Książki)
);
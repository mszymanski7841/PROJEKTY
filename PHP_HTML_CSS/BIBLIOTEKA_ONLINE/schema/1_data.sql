INSERT INTO `uzytkownicy`( `username`, `password`) VALUES
('admin','admin'),
('test', '123'),
('kamil', 'ślimak'),
('klient2', '123'),
('fajnekonto', '123'),
('klient1', '123'),
('klient', 'hasło');

INSERT INTO `ksiazki`(`Tytuł`, `Autor`, `Gatunek`, `Rok_wydania`) VALUES
('Harry Potter i Czara Ognia', 'Joanne Kathleen Rowling', 'Fantasy', '2000'),
('Harry Potter i Zakon Feniksa', 'Joanne Kathleen Rowling', 'Fantasy', '2003'),
('Krzyżacy', 'Henryk Sienkiewicz', 'Powieść historyczna', '2009'),
('Pułapki myślenia. O myśleniu szybkim i wolnym', 'Daniel Kahneman', 'Psychologia', '2011'),
('Później', 'Stephen King', 'Horror', '2021');
('Ziemia obiecana', 'Barack Obama', 'Literatura faktu', '2021'),
('Felix, Net i Nika oraz Gang Niewidzialnych Ludzi', 'Kosik Rafał', 'Fantasy', '2012'),
('Makbet', 'William Shakespeare', 'Tragedia', '2018'),
('Harry Potter i przeklęte dziecko', 'Joanne Kathleen Rowling', 'Fantasy', '2016'),
('Potęga podświadomości', 'Joseph Murphy', 'Psychologia', '2020'),
('Wiedźmin. Tom 1. Ostatnie życzenie', 'Andrzej Sapkowski', 'Fantasy', '2007'),
('Wiedźmin. Tom 3. Krew elfów', 'Andrzej Sapkowski', 'Fantasy', '2014'),
('Tarzan wśród małp', 'Edgar Rice Burroughs', 'Powieść przygodowa', '2016');

INSERT INTO `wypozyczenia`(`ID_Użytkownika`, `ID_Książki`, `Data_wypożyczenia`) VALUES
('6', '11', '2021-04-06'),
('4', '1', '2021-04-06');







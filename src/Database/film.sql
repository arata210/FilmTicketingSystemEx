create database film;
use film;

CREATE TABLE MOVIE (
    movieId INT PRIMARY KEY,
    movieChiName VARCHAR(200),
    movieEngName VARCHAR(200),
    movieDirector VARCHAR(100),
    movieCountry_Region VARCHAR(50),
    movieLength INT,
    showData VARCHAR(100),
    showTime VARCHAR(100),
    cinemaName VARCHAR(100),
    cinemaHall VARCHAR(100),
    cinemaAddress VARCHAR(200),
    ticket INT
);
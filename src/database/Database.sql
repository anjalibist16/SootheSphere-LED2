/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  asus
 * Created: Aug 4, 2024
 */

CREATE DATABASE Soothe;
CREATE USER 'soothe'@'localhost' IDENTIFIED BY 'soothe';
GRANT ALL PRIVILEGES ON Soothe.* TO 'soothe'@'localhost';
USE Soothe;

CREATE TABLE User (
    UserID int(10) PRIMARY KEY AUTO_INCREMENT,
    username varchar(255),
    Password varchar(255),
    Email varchar(255),
    RegistrationDate date
);
CREATE TABLE Feedback( Nmae varchar(255),Email varchar(255),Feedback text);

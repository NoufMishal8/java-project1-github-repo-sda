CREATE DATABASE NSALON;
USE  NSALON;

CREATE TABLE tbl_Admin (
UserId VARCHAR (25) NOT NULL,
Password VARCHAR (10) NOT NULL,
primary key (UserId)
);



CREATE TABLE tbl_Client (
UserId VARCHAR (25) NOT NULL,
Name VARCHAR (225) ,
Phone_Number int  ,
Email VARCHAR (225) ,
primary key (UserId)
);

CREATE TABLE tbl_Staff (
UserId VARCHAR (25) NOT NULL,
Name VARCHAR (225) ,
Phone_Number int  ,
password VARCHAR (10) ,
primary key (UserId)
);


CREATE TABLE tbl_Booking (
UserId VARCHAR (25) NOT NULL,
ServiceId varchar (225) NOT NULL,
BookingID VARCHAR (25) NOT NULL,
Date int,
Time int  ,

primary key (BookingID),
FOREIGN KEY (UserId) REFERENCES tbl_Client(UserId),
FOREIGN KEY (UserId) REFERENCES tbl_Staff(UserId),
FOREIGN KEY (ServiceId) REFERENCES tbl_Service(ServiceId)
);

CREATE TABLE tbl_Service (
ServiceId varchar (225) NOT NULL ,
Name varchar(225),
Price int,
primary key (ServiceId)
);

SELECT * FROM tbl_Booking;


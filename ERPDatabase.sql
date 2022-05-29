create database erp;
use erp;

CREATE TABLE `Admin` (
	`Sr_No.` INT NOT NULL AUTO_INCREMENT,
	`Name` VARCHAR(45),
	`User_Id` VARCHAR(45),
	`Password` VARCHAR(45),
	PRIMARY KEY (`Sr_No.`)
);

insert into Admin (Name, User_Id, Password) 
values ("Kunal", "Admin1", "Admin1");

insert into Admin (Name, User_Id, Password) 
values ("Pranav", "Admin2", "Admin2");

select * from Admin;

CREATE TABLE `Student` (
	`Sr_No` INT NOT NULL AUTO_INCREMENT,
	`Name` VARCHAR(45) DEFAULT NULL,
	`Course` VARCHAR(45) DEFAULT NULL,
	`Roll_No` VARCHAR(45) DEFAULT NULL,
	`DateOfBirth` DATE,
	`Contact` VARCHAR(45) DEFAULT NULL,
    `EmailID` VARCHAR(45) DEFAULT NULL,
	`Student_Id` VARCHAR(45) DEFAULT NULL,
	`Password` VARCHAR(45) DEFAULT NULL,
	PRIMARY KEY (`Sr_No`)
);

CREATE TABLE `Courses` (
	`Sr_No` INT NOT NULL AUTO_INCREMENT,
	`CourseCode` VARCHAR(45) DEFAULT NULL,
	`CourseName` VARCHAR(45) DEFAULT NULL,
	`SemesterorYear` VARCHAR(45) DEFAULT NULL,
	PRIMARY KEY (`Sr_No`)
);

CREATE TABLE `Feedback` (
	`Sr_No` INT NOT NULL AUTO_INCREMENT,
	`CourseName` VARCHAR(45) DEFAULT NULL,
	`Comment` VARCHAR(55) DEFAULT NULL,
	PRIMARY KEY (`Sr_No`)
);

drop table Courses;

insert into Student (Name, Course, Roll_No, DateOfBirth, Contact, EmailID, Student_Id, Password) 
values ("Omkar", "CS", "SYCOC316", "1-1-1", "12344556", "omkar@gmail.com", "Stud1", "Stud1");

DELETE FROM Courses WHERE Sr_No = 2;
ALTER table Student AUTO_INCREMENT = 3;

select * from Feedback;

Select Name, Course, Roll_No, DateOfBirth, Contact, EmailID from student;

CREATE TABLE `Course` (
	`Sr_No.` INT NOT NULL AUTO_INCREMENT,
	`Course_No.` INT,
	`Course_Name` VARCHAR(45),
	`Semester` INT,
	PRIMARY KEY (`Sr_No.`)
);

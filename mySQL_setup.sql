CREATE DATABASE college_system;
USE college_system;

CREATE TABLE users(
	username VARCHAR(50) NOT NULL PRIMARY KEY,
	PASSWORD VARCHAR(60) NOT NULL,
	enabled BOOLEAN NOT NULL);

CREATE TABLE authorities(
	username VARCHAR(50) NOT NULL,
	authority VARCHAR(50) NOT NULL,
	CONSTRAINT fk_authorities_users
	FOREIGN KEY(username) REFERENCES users(username));
	
CREATE UNIQUE INDEX idx_auth_username ON authorities(username,authority);

 /* FOR YOUR INFORMATION ONLY FOR USER PASSWORDS */ 
/* INSERT INTO users(username, PASSWORD, enabled) 
	VALUES ("mary", "secret", TRUE),
			 ("toufik", "toulaz", TRUE),
			 ("francesco", "fortnite", TRUE),
			 ("catherine", "kittykat", TRUE); */

INSERT INTO users(username, PASSWORD, enabled)
	values ("mary", "$2a$10$7b8WY79e1oqiYdhUKKMioOlInnaqI6uocAH9nCoxnbJOpu1wBMRdC", TRUE),
			("toufik", "$2a$10$j6R/5sx3yvdy9wi.KKynj.DjZ7qNIVOxEQGUKCS2BEGM4Mg56DC.2", TRUE),
			("francesco", "$2a$10$jBJHevgp7K1EV14ZYU6V.eo5DlOOW/PXVMyM6oAD12t/5iaSldWlC", TRUE),
			("catherine", "$2a$10$jCLywgIeTJQxPGwEzrrJBu99kQ5QyWmiz3vtf/RjN0DnrkKL83PjO", TRUE);
				
INSERT INTO authorities(username, authority)
	VALUES ("mary", "ROLE_ADMIN"),
			 ("toufik", "ROLE_TEACHER"),
			 ("francesco", "ROLE_STUDENT_ADMIN"),
			 ("catherine", "ROLE_PROGRAM_ADMIN");
			 
INSERT INTO authorities(username, authority)
	VALUES ("mary", "ROLE_USER"),
			 ("toufik", "ROLE_USER"),
			 ("francesco", "ROLE_USER"),
			 ("catherine", "ROLE_USER");



			 

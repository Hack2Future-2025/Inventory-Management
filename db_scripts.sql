-- create script for users table
CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(20) NOT NULL UNIQUE,
    email VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(120) NOT NULL
);

-- create script for roles table
CREATE TABLE roles (
    role_id BIGINT PRIMARY KEY,
    role_name VARCHAR(50) NOT NULL UNIQUE
);


-- insert script for roles 
INSERT INTO roles (ROLE_ID, ROLE_NAME) VALUES (1, 'Read Only User');
INSERT INTO roles (ROLE_ID, ROLE_NAME) VALUES (2, 'Moderator');
INSERT INTO roles (ROLE_ID, ROLE_NAME) VALUES (3, 'Admin');

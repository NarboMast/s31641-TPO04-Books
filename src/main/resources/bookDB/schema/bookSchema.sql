CREATE TABLE IF NOT EXISTS Book(
    id INT AUTO_INCREMENT PRIMARY KEY,
    publisher INT NOT NULL,
    title VARCHAR(255) NOT NULL,
    price double precision
);
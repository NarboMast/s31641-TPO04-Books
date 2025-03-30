CREATE TABLE IF NOT EXISTS Book(
    id INT AUTO_INCREMENT PRIMARY KEY,
    author INT NOT NULL,
    publisher INT NOT NULL,
    title VARCHAR(255) NOT NULL,
    price double precision
);
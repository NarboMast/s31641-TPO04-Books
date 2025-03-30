CREATE TABLE IF NOT EXISTS book_author (
    book_id INT NOT NULL,
    author_id INT NOT NULL,
    PRIMARY KEY (book_id, author_id)
);
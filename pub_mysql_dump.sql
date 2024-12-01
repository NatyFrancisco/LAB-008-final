CREATE TABLE Title (
    title_id VARCHAR(20) PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL
);

CREATE TABLE Sales (
    sale_id VARCHAR(20) PRIMARY KEY,
    title_id VARCHAR(20),
    store_id VARCHAR(20),
    amount DECIMAL(10, 2) NOT NULL,
    sale_date DATE NOT NULL,
    FOREIGN KEY (title_id) REFERENCES Title(title_id)
);

CREATE TABLE Authors (
    author_id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE Employee (
    employee_id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    job_id VARCHAR(20),
    FOREIGN KEY (job_id) REFERENCES Job(job_id)
);

CREATE TABLE AuthorTitle (
    author_id VARCHAR(20),
    title_id VARCHAR(20),
    PRIMARY KEY (author_id, title_id),
    FOREIGN KEY (author_id) REFERENCES Authors(author_id),
    FOREIGN KEY (title_id) REFERENCES Title(title_id)
);

CREATE TABLE Job (
    job_id VARCHAR(20) PRIMARY KEY,
    description VARCHAR(255) NOT NULL
);

CREATE TABLE Store (
    store_id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    location VARCHAR(255)
);

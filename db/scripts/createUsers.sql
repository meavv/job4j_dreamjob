CREATE TABLE USERS (
                       id SERIAL PRIMARY KEY,
                       name TEXT,
                       email TEXT,
                       password TEXT,
                       UNIQUE(email)
);
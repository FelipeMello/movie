CREATE SEQUENCE movies_id_seq
  START WITH 1
  INCREMENT BY 1
  NO MINVALUE
  MAXVALUE 2147483647
  CACHE 1;

CREATE TABLE movies(
  id INT NOT NULL DEFAULT nextval('movies_id_seq'),
  name NOT NULL VARCHAR(255),
  summary VARCHAR(500),
  year INT,
  PRIMARY KEY(id);
)

CREATE SEQUENCE ratings_id_seq
  START WITH 1
  INCREMENT BY 1
  NO MINVALUE
  MAXVALUE 2147483647
  CACHE 1;

CREATE TABLE ratings(
  id INT NOT NULL DEFAULT nextval('ratings_id_seq'),
  thumbs_up BIGINT,
  thumbs_down BIGINT,
  PRIMARY KEY(id);
)

CREATE SEQUENCE genres_id_seq
  START WITH 1
  INCREMENT BY 1
  NO MINVALUE
  MAXVALUE 2147483647
  CACHE 1;

 CREATE TABLE genres(
   id INT NOT NULL DEFAULT nextval('ratings_id_seq'),
   name,
   PRIMARY KEY(id);
 )

ALTER TABLE if EXISTS movies
ADD CONSTRAINT genres_fk
FOREIGN KEY(id) REFERENCES genres;

ALTER TABLE if EXISTS movies
ADD CONSTRAINT ratings_fk
FOREIGN KEY(id) REFERENCES ratings;



--TODO ANOTHER API.
--CREATE SEQUENCE user_id_seq
--  START WITH 1
--  INCREMENT BY 1
--  NO MINVALUE
--  MAXVALUE 2147483647
--  CACHE 1;

--CREATE TABLE users(
--  id INT NOT NULL DEFAULT nextval('user_id_seq'),
--  name VARCHAR(100)
--  email VARCHAR(100)
--  password VARCHAR(50)
--  age TIMESTAMP
--  PRIMARY KEY(id);
--)





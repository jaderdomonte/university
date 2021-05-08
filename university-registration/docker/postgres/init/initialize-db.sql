--CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

SELECT * FROM pg_extension;

CREATE TABLE course (
    id VARCHAR(200) NOT NULL PRIMARY KEY,
    name VARCHAR(200) NOT NULL
);

INSERT INTO course VALUES ((SELECT md5(random()::text || clock_timestamp()::text)::uuid), 'Portuguese Language');
INSERT INTO course VALUES ((SELECT md5(random()::text || clock_timestamp()::text)::uuid), 'Mathematics');
INSERT INTO course VALUES ((SELECT md5(random()::text || clock_timestamp()::text)::uuid), 'Systems Analysis');
INSERT INTO course VALUES ((SELECT md5(random()::text || clock_timestamp()::text)::uuid), 'Nutrition');
--INSERT INTO course VALUES ((SELECT uuid_generate_v1()), 'Nutrition');

select * from course;

CREATE TABLE student (
    id VARCHAR(200) NOT NULL PRIMARY KEY,
    name VARCHAR(200) NOT NULL,
    id_course VARCHAR(200) NOT NULL,
    CONSTRAINT fk_course FOREIGN KEY (id_course) REFERENCES course(id)
);
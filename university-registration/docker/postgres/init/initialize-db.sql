CREATE TABLE course (
    id UUID NOT NULL PRIMARY KEY,
    name VARCHAR(200) NOT NULL
);

CREATE TABLE subject (
    id UUID NOT NULL PRIMARY KEY,
    name VARCHAR(200) NOT NULL,
    period INTEGER NOT NULL,
    id_course UUID NOT NULL,
    CONSTRAINT fk_course_subject FOREIGN KEY (id_course) REFERENCES course(id)
);

CREATE TABLE student (
    id UUID NOT NULL PRIMARY KEY,
    name VARCHAR(200) NOT NULL,
    id_course UUID NOT NULL,
    CONSTRAINT fk_course_student FOREIGN KEY (id_course) REFERENCES course(id)
);
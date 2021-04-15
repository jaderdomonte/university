CREATE USER registration;
ALTER USER registration WITH PASSWORD 'registration';
GRANT ALL PRIVILEGES ON DATABASE registration TO registration;

CREATE TABLE enrolling (
    id VARCHAR(200) NOT NULL PRIMARY KEY,
    name VARCHAR(200) NOT NULL
)

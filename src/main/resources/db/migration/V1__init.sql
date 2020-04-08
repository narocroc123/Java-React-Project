DROP TABLE IF EXISTS posts;

CREATE TABLE posts (
  id bigserial PRIMARY KEY,
  content varchar(250) NOT NULL,
  timestamp TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);

DROP TABLE IF EXISTS users;

CREATE TABLE  users (
    user_id VARCHAR UNIQUE,
    name VARCHAR(40),
    email VARCHAR(60),
    password VARCHAR(80)
);

DROP TABLE IF EXISTS posts;

CREATE TABLE posts (
  id bigserial PRIMARY KEY,
  content varchar(250) NOT NULL,
  timestamp TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);

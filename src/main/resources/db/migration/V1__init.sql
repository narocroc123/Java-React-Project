DROP TABLE IF EXISTS posts;

CREATE TABLE posts (
  post_id bigserial PRIMARY KEY,
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

DROP TABLE IF EXISTS likes;

CREATE TABLE post_likes (
    post_like_id VARCHAR UNIQUE,
    post_id VARCHAR REFERENCES posts(post_id)
);

DROP TABLE IF EXISTS comments;

CREATE TABLE comments (
    comment_id VARCHAR UNIQUE,
    post_id VARCHAR REFERENCES posts(post_id),
    content VARCHAR(250) NOT NULL,
    time_stamp TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP(0)
);

DROP TABLE IF EXISTS comment_likes;

CREATE TABLE comment_likes (
    comment_like_id VARCHAR UNIQUE,
    comment_id VARCHAR REFERENCES comments(comment_id)
);
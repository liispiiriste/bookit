CREATE TABLE todo (
  id long NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name varchar (255) NOT NULL,
  description varchar (255) NOT NULL,
  done boolean NOT NULL default false
);

INSERT INTO todo (name, description, done)
VALUES ('aken', 'pesta aken korralikult', true);
INSERT INTO todo (name, description, done)
VALUES ('vaip', 'kloppida', true);
drop 
  table if exists consumer; 
drop 
  table if exists pastebin; 
  
create table consumer (
  id bigint not null,
  crt_date timestamp,
  name varchar(255),
  password varchar(255),
  username varchar(255),
  primary key (id)
);
create table pastebin (
  id bigint not null,
  body varchar(255),
  crt_date date,
  expiration_time bigint,
  user_name varchar(255),
  primary key (id)
)


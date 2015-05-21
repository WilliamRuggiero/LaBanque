# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  user_id                   bigint not null,
  last_name                 varchar(255),
  first_name                varchar(255),
  email                     varchar(255),
  password                  varchar(255),
  telephone                 varchar(255),
  releve_identite_bancaire  varchar(255),
  sex                       varchar(255),
  constraint pk_user primary key (user_id))
;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists user_seq;


# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table customer (
  customer_id               bigint not null,
  user_id                   bigint,
  genre                     varchar(255),
  last_name                 varchar(255),
  born_name                 varchar(255),
  suscribe_date             varchar(255),
  nationality               varchar(255),
  where_is_born             varchar(255),
  family_situation          varchar(255),
  fiscal_residence          varchar(255),
  know_the_bank             varchar(255),
  validate_by_admin         boolean,
  compte_courant_suscribe   boolean,
  livret_asuscribe          boolean,
  pelsuscribe               boolean,
  cartes_suscribe           boolean,
  constraint pk_customer primary key (customer_id))
;

create table user (
  user_id                   bigint not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  email                     varchar(255),
  telephone                 varchar(255),
  password                  varchar(255),
  releve_identite_bancaire  varchar(255),
  sex                       varchar(255),
  is_admin                  boolean,
  constraint pk_user primary key (user_id))
;

create sequence customer_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists customer;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists customer_seq;

drop sequence if exists user_seq;


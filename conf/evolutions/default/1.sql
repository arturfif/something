# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table session_order (
  id                        bigserial not null,
  room_id                   integer not null,
  client_name               varchar(255),
  email                     varchar(255),
  phone_number              varchar(255),
  date                      date,
  time_id                   integer,
  status                    varchar(9) not null,
  constraint ck_session_order_status check (status in ('PRE_ORDER','ORDER','INACTIVE')),
  constraint pk_session_order primary key (id))
;

create table room (
  id                        bigserial not null,
  name                      varchar(255) not null,
  weekdays_schedule_id      integer,
  weekends_schedule_id      integer,
  city                      varchar(255) not null,
  address                   varchar(255) not null,
  constraint uq_room_name unique (name),
  constraint pk_room primary key (id))
;

create table schedule (
  id                        bigserial not null,
  comment                   varchar(255),
  constraint pk_schedule primary key (id))
;

create table schedule_time (
  id                        bigserial not null,
  shedule_id                integer,
  time_id                   integer,
  constraint pk_schedule_time primary key (id))
;

create table time (
  id                        bigserial not null,
  time                      time,
  constraint pk_time primary key (id))
;




# --- !Downs

drop table if exists session_order cascade;

drop table if exists room cascade;

drop table if exists schedule cascade;

drop table if exists schedule_time cascade;

drop table if exists time cascade;


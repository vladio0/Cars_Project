DROP TABLE IF EXISTS car;
DROP TABLE IF EXISTS car_order;
DROP TABLE IF EXISTS jc_register_office;
DROP TABLE IF EXISTS jc_passport_office;
DROP TABLE IF EXISTS jc_country_struct;
DROP TABLE IF EXISTS jc_street;
DROP TABLE IF EXISTS country_struct;



CREATE TABLE jc_street
(
    street_code integer not null,
    street_name varchar(300),
    PRIMARY KEY (street_code)
);

CREATE TABLE jc_country_struct
(
    area_id char(12) not null,
    area_name varchar(200),
    PRIMARY KEY (area_id)
);

CREATE TABLE jc_passport_office
(
    p_office_id integer not null,
    p_office_area_id char(12) not null,
    p_office_name varchar(200),
    PRIMARY KEY (p_office_id),
    FOREIGN KEY (p_office_area_id) REFERENCES jc_country_struct(area_id) ON DELETE RESTRICT
);

CREATE TABLE jc_register_office
(
    r_office_id integer not null,
    r_office_area_id char(12) not null,
    r_office_name varchar(200),
    PRIMARY KEY (r_office_id),
    FOREIGN KEY (r_office_area_id) REFERENCES jc_country_struct(area_id) ON DELETE RESTRICT
);

CREATE TABLE car_order
(
    car_order_id SERIAL,
    b_sur_name varchar(100) not null,
    b_given_name varchar(100) not null,
    b_patronymic varchar(100) not null,
    b_date_of_birth date not null,
    b_passport_seria varchar(100) not null,
    b_passport_number varchar(100) not null,
    b_passport_date date not null,
    b_passport_office integer not null,
    b_post_index varchar(10),
    b_street_code integer not null,
    b_building varchar(10) not null,
    b_extension varchar(10),
    b_apartment varchar(10),
        s_sur_name varchar(100) not null,
        s_given_name varchar(100) not null,
        s_patronymic varchar(100) not null,
        s_date_of_birth date not null,
        s_passport_seria varchar(100) not null,
        s_passport_number varchar(100) not null,
        s_passport_date date not null,
        s_passport_office integer not null,
        s_post_index varchar(10),
        s_street_code integer not null,
        s_building varchar(10) not null,
        s_extension varchar(10),
        s_apartment varchar(10),
    contract_id varchar(20) not null,
    register_office_id integer not null,
    registration_date date not null,
    PRIMARY KEY (car_order_id),
        FOREIGN KEY (b_street_code) REFERENCES jc_street(street_code) ON DELETE RESTRICT,
        FOREIGN KEY (s_street_code) REFERENCES jc_street(street_code) ON DELETE RESTRICT,
        FOREIGN KEY (register_office_id) REFERENCES jc_register_office(r_office_id)
        ON DELETE RESTRICT
);

CREATE TABLE car
(
    car_id SERIAL,
    car_order_id integer not null,
    car_brand varchar(100) not null,
    car_model varchar(100) not null,
	car_year_of_release date not null,
    car_colour varchar(10) not null,
    car_price integer not null,
    car_engine_type varchar(20) not null,
    car_transmission varchar(20) not null,
    car_mileage varchar(20) not null,
	car_plate_number varchar(10) not null,
    	car_register_office_id integer not null,
        c_post_index varchar(10),
        c_street_code integer not null,
        c_building varchar(10) not null,
        c_extension varchar(10),
        c_apartment varchar(10),
    PRIMARY KEY (car_id),
        FOREIGN KEY (c_street_code) REFERENCES jc_street(street_code) ON DELETE RESTRICT,
        FOREIGN KEY (car_register_office_id) REFERENCES jc_register_office(r_office_id)
        ON DELETE RESTRICT
);
DROP TABLE IF EXISTS vehicle_owner;
DROP TABLE IF EXISTS vehicle_document;
DROP TABLE IF EXISTS truck_car;
DROP TABLE IF EXISTS passenger_car;
DROP TABLE IF EXISTS vehicle;
DROP TABLE IF EXISTS owner;
DROP TABLE IF EXISTS mvs_office;
DROP TABLE IF EXISTS offices_struct;
DROP TABLE IF EXISTS street;

CREATE TABLE street(
		street_code integer not null,
		street_name varchar(200),
		PRIMARY KEY(street_code)
);

CREATE TABLE offices_struct(
		city_id char(12) not null,
		city_name varchar(200),
		PRIMARY KEY(city_id)
);

CREATE TABLE mvs_office(
		office_id integer not null,
		office_city_id char(12) not null,
		office_name varchar(200),
		is_active boolean,
		PRIMARY KEY(office_id),
		FOREIGN KEY(office_city_id) REFERENCES offices_struct(city_id) ON DELETE RESTRICT
);

CREATE TABLE owner(
        owner_id integer not null,
        owner_name varchar(50) not null,
        owner_surname varchar(50) not null,
        birth_date date not null,
        phone varchar(20),
        email varchar(100),
        PRIMARY KEY(owner_id)
);

CREATE TABLE vehicle(
        vehicle_id integer not null,
        car_mark varchar(100) not null,
        car_model varchar(100) not null,
        car_country varchar(50) not null,
        license_plate varchar(50) not null,
        car_year integer not null,
        car_colour varchar(50) not null,
        fuel_type varchar(50) not null,
        weight integer,
        max_allowed_weight integer not null,
        PRIMARY KEY(vehicle_id)
);

CREATE TABLE passenger_car(
        passenger_car_id integer not null,
        seats integer not null,
        body_type varchar(50),
        transmission varchar(50),
        maxSpeed integer not null,
        fuel_type varchar(50),
        battery_power integer,
        PRIMARY KEY(passenger_car_id),
        FOREIGN KEY(passenger_car_id) REFERENCES vehicle(vehicle_id) ON DELETE RESTRICT

);

CREATE TABLE truck_car(
        truck_id integer not null,
        weight integer,
        max_allowed_weight integer not null,
        fuel_type varchar(50),
        PRIMARY KEY(truck_id),
        FOREIGN KEY(truck_id) REFERENCES vehicle(vehicle_id) ON DELETE RESTRICT

);

CREATE TABLE vehicle_document(
        document_id integer not null,
        vehicle_id integer not null,
        doc_type varchar(50) not null,
        issued_at date,
        expires_at date,
        is_active boolean not null default true,
        PRIMARY KEY(document_id),
        FOREIGN KEY(vehicle_id) REFERENCES vehicle(vehicle_id) ON DELETE RESTRICT
);

CREATE TABLE vehicle_owner(
        vehicle_id integer not null,
        owner_id integer not null,
        date_from date,
        date_to date,
        PRIMARY KEY (vehicle_id, owner_id, date_from),
        FOREIGN KEY (vehicle_id) REFERENCES vehicle(vehicle_id) ON DELETE RESTRICT,
        FOREIGN KEY (owner_id) REFERENCES owner(owner_id) ON DELETE RESTRICT
);

insert into country (id, name) values (1, 'Polska');
insert into region(id, name, country_id) values (1, 'Dolnoslaskie', 1), (2, 'Mazowieckie', 1);
insert into city (id, name, region_id) values (1,'Wroclaw', 1), (2, 'Warszawa',2);
insert into attraction (id, name, city_id) values (1, 'Panorama Raclawicka',1),(2,'Syrenka',2);
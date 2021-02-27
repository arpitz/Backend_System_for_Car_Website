
INSERT INTO manufacturer (code, name) values (1, 'Mercedes');
INSERT INTO manufacturer (code, name) values (2, 'Honda');
INSERT INTO manufacturer (code, name) values (3, 'Ford');

INSERT INTO car (id, createdat, modifiedat, condition,
details_body, details_model, manufacturer_code, location_lat, location_lon)
VALUES (1, '2018-02-24', '2018-06-24', 'USED', 'body', 'model',
 1, 10.56, 23.78);

INSERT INTO car (id, createdat, modifiedat, condition,
details_body, details_model, manufacturer_code, location_lat, location_lon)
VALUES (2, '2020-02-15', '2020-06-15', 'NEW', 'body', 'Civic',
2, 45.89, 66.55);

INSERT INTO car (id, createdat, modifiedat, condition,
details_body, details_model, manufacturer_code, location_lat, location_lon)
VALUES (3, '2018-02-24', '2020-08-24', 'USED', 'body', 'EcoSport',
3, 10.56, 23.78);
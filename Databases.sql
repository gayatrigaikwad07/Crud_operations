show databases;
create database FlipKart;
use FlipKart;
CREATE TABLE Product (ProductId int NOT NULL, 
    GroupName varchar(255) NOT NULL,
    Category varchar(255),
    ProductName varchar(255),
    Price int,
    PRIMARY KEY(ProductId));
select *from Product;
insert into Product values(1,'Women','Fashion','jeans',800.00);
insert into Product values(2,'Men','Fashion','Shirt',9000.00);
insert into Product values(3,'Kids','toys','Barbie',500.00);
insert into Product values(4,'Women','Accessories','HandBag',1000.00);


insert into Product values(5,'Men','Accessories','watch',1000.00);


desc Product;
create database user_managemet;

DROP TABLE Product;
select *from Product;


-- schema.sql is to create the table when running

CREATE TABLE products(
    productId integer identity NOT NULL,
    pname varchar(20) NOT NULL,         -- Course Title
    supplier varchar(20) NOT NULL,  -- Course Description
    price int NOT NULL,         -- Course landing page link
    stock int NOT NULL,         -- Course landing page link
    CONSTRAINT pk_products_productId PRIMARY KEY (productId)

);



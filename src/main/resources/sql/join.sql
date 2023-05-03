DROP DATABASE IF EXISTS JoinTest;
CREATE DATABASE JoinTest;

USE JoinTest;

CREATE TABLE Customers (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO Customers (name, email)
VALUES
    ('John Smith', 'johnsmith@example.com'),
    ('Mary Johnson', 'maryjohnson@example.com'),
    ('David Lee', 'davidlee@example.com'),
    ('Sarah Williams', 'sarahwilliams@example.com'),
    ('Thomas Brown', 'thomasbrown@example.com'),
    ('Jessica Davis', 'jessicadavis@example.com'),
    ('Kevin Lee', 'kevinlee@example.com'),
    ('Emily Wilson', 'emilywilson@example.com'),
    ('Michael Chen', 'michaelchen@example.com'),
    ('Rachel Kim', 'rachelkim@example.com'),
    ('Christopher Lee', 'christopherlee@example.com'),
    ('Laura Jones', 'laurajones@example.com'),
    ('Patrick Murphy', 'patrickmurphy@example.com'),
    ('Stephanie Davis', 'stephaniedavis@example.com'),
    ('Brandon Lee', 'brandonlee@example.com'),
    ('Amanda Wilson', 'amandawilson@example.com'),
    ('Steven Brown', 'stevenbrown@example.com'),
    ('Katherine Lee', 'katherinelee@example.com'),
    ('Nicholas Kim', 'nicholaskim@example.com'),
    ('Megan Davis', 'megandavis@example.com');

CREATE TABLE Orders (
    id INT NOT NULL AUTO_INCREMENT,
    customer_id INT NOT NULL,
    item_id INT NOT NULL,
    order_date DATE NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO Orders (customer_id, item_id, order_date) VALUES
    (1, 2, '2023-05-01'),
    (2, 3, '2023-04-30'),
    (3, 4, '2023-04-28'),
    (4, 5, '2023-04-27'),
    (5, 6, '2023-04-26'),
    (6, 7, '2023-04-25'),
    (7, 8, '2023-04-24'),
    (8, 9, '2023-04-23'),
    (9, 10, '2023-04-22'),
    (10, 11, '2023-04-21'),
    (11, 12, '2023-04-20'),
    (12, 13, '2023-04-19'),
    (13, 14, '2023-04-18'),
    (14, 15, '2023-04-17'),
    (15, 16, '2023-04-16'),
    (16, 17, '2023-04-15'),
    (17, 18, '2023-04-14'),
    (18, 19, '2023-04-13'),
    (19, 20, '2023-04-12'),
    (20, 1, '2023-04-11');

CREATE TABLE Items (
    id INT NOT NULL AUTO_INCREMENT,
    product_name VARCHAR(50) NOT NULL,
    quantity INT NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO Items (product_name, quantity, price)
VALUES
    ('Apple iPhone 13 Pro', 10, 1199.00),
    ('Samsung Galaxy S21 Ultra', 5, 1199.99),
    ('Sony WH-1000XM4 Wireless Headphones', 8, 349.99),
    ('Microsoft Surface Pro 8', 3, 1299.99),
    ('Dell XPS 13 Laptop', 6, 1099.99),
    ('Sony PlayStation 5', 2, 499.99),
    ('Apple MacBook Pro 16-inch', 4, 2399.00),
    ('Nintendo Switch OLED', 7, 349.99),
    ('Bose QuietComfort Earbuds', 5, 279.00),
    ('Google Pixel 6 Pro', 9, 899.99),
    ('Samsung QN90A QLED TV', 1, 2599.99),
    ('LG CX OLED TV', 2, 1999.99),
    ('Sony A7R IV Mirrorless Camera', 3, 3499.99),
    ('Canon EOS R5 Mirrorless Camera', 2, 3899.00),
    ('Breville Barista Express Espresso Machine', 6, 599.95),
    ('KitchenAid Stand Mixer', 4, 499.99),
    ('Le Creuset Dutch Oven', 5, 389.95),
    ('All-Clad Stainless Steel Cookware Set', 1, 1299.99),
    ('Dyson V15 Detect Vacuum Cleaner', 7, 699.99),
    ('iRobot Roomba i7+ Robot Vacuum', 4, 999.99);

-- -- Add 20 order items for the first 20 orders
-- INSERT INTO Order_Items (order_id, product_name, quantity, price)
-- SELECT o.id, CONCAT('Product ', FLOOR(RAND() * 10) + 1), FLOOR(RAND() * 10) + 1, ROUND(RAND() * 100, 2)
-- FROM Orders o
-- WHERE o.id <= 20
-- ORDER BY RAND();


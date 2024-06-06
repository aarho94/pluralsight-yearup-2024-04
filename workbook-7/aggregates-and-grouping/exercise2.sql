-- 1. How many suppliers are there?

SELECT COUNT(*) AS supplier_count
FROM Suppliers;

-- 2. What is the sum of all the employee's salaries?

SELECT SUM(Salary) AS total_salary
FROM Employees;

-- 3. What is the price of the cheapest item that Northwind sells?

SELECT MIN(UnitPrice) AS cheapest_price
FROM Products;

-- 4. What is the average price of items that Northwind sells?

SELECT AVG(UnitPrice) AS average_price
FROM Products;

-- 5. What is the price of the most expensive item that Northwind sells?

SELECT MAX(UnitPrice) AS most_expensive_price
FROM Products;

-- 6. What is the supplier ID of each supplier and the number of items they supply?

SELECT SupplierID, COUNT(*) AS num_items
FROM Products
GROUP BY SupplierID;

-- 7. What is the category ID of each category and the average price of each item in the category?

SELECT CategoryID, AVG(UnitPrice) AS avg_price
FROM Products
GROUP BY CategoryID;

-- 8. For suppliers that provide at least 5 items to Northwind, what is the supplier ID of each supplier and the number of items they supply?

SELECT SupplierID, COUNT(*) AS num_items
FROM Products
GROUP BY SupplierID
HAVING COUNT(*) >= 5;

-- 9. List the product id, product name, and inventory value (calculated by multiplying unit price by the number of units on hand). Sort the results in descending order by value. If two or more have the same value, order by product name.

SELECT ProductID, ProductName, UnitPrice * UnitsInStock AS inventory_value
FROM Products
ORDER BY inventory_value DESC, ProductName;
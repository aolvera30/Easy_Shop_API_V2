# Easy_Shop_API_V2

Easy Shop API V2

Overview
Easy Shop API V2 is an e-commerce backend API designed to manage essential features such as product categories, products, shopping carts, user profiles, and orders. This project focuses on implementing robust category and product management functionalities, as well as enhancing and debugging key features to ensure seamless operation. The API was built using Java and Spring Boot, with MySQL as the database, and thoroughly tested using Postman.

Technical Details
Implementation Steps

Phase 1: Category Management
CategoriesController and MySqlCategoriesDao Implementation

Developed the logic for all category-related methods in the CategoriesController.

Implemented the corresponding data access methods in MySqlCategoriesDao.

Ensured all CRUD operations (Create, Read, Update, Delete) were properly handled.


Postman Testing

Utilized Postman to test the following endpoints:

GET /categories

GET /categories/{id}

POST /categories

PUT /categories/{id}

DELETE /categories/{id}


Phase 2: Debugging and Enhancements
Fixing Product Search Functionality

Identified and fixed issues related to the product search functionality.


ProductController Updates

Fixed the second bug by updating the ProductController to call the correct methods for product operations.

Ensured proper handling of requests and responses.


MySqlCategoriesDao

The MySqlCategoriesDao class handles all database interactions for categories. Key implementations include:

Prepared Statements: Used prepared statements to prevent SQL injection.

CRUD Operations: Implemented methods for creating, reading, updating, and deleting categories.

MySqlProductsDao

The MySqlProductsDao class manages database operations for products. Key improvements include:

Search Functionality: Enhanced the product search functionality to handle multiple filters.

Transaction Management: Ensured proper transaction management for data integrity.


SQL Database

The database schema supports various API functionalities with efficient table structures and indexing.

Testing with Postman

Postman was used extensively to test all API endpoints. Here’s an example of how to test key functionalities:

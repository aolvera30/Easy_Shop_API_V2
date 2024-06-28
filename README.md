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

Presentation:

Good morning everyone,

Recently, my friend passed on her online easy shop business to me, and I am very thrilled to become an entrepreneur. I want to make this shop my own, so I decided to rebrand it. Once I sell out all the current items, I will convert it into an online thrift store with prices starting as low as 1 dollar. To make this shop successful, I've decided to fix some technical issues the site was experiencing. Let me tell you about some of the improvements I've made.

1. Implementing Logic in Categories Controller and MySQL Categories DAO
Problem:
Many functions were not working. Upon inspecting the back end, I discovered that all the methods in the Categories controller and the MySQL Categories DAO were empty.

What I Did:

Filled in the methods in the Categories controller to handle requests for GET, POST, PUT, and DELETE.
Updated the MySQL Categories DAO to perform database operations for these requests.
Ensured that the site could properly send and receive requests by implementing the necessary logic.
Tested everything using Postman to confirm it worked correctly.
Demonstration:
I will now demonstrate how I used Postman to test these functionalities.

2. Fixing the Search Functionality
Problem:
The search function wasn't working correctly. Users couldn't filter products by category, price, or color.

What I Did:

Started with a basic query to find all products.
Added conditions to filter products by category, minimum price, maximum price, and color.
Secured the search by using a prepared statement to handle inputs safely, preventing security issues.
Executed the search and collected the matching products into a list.

3. Updating the Product Method
Problem:
There was an issue where the system was creating a new product instead of updating an existing one.

What I Did:

In the products controller class, I changed the productDao.create method to the productDao.update method.
This change ensures that the system now updates the product information instead of creating a new product.
Now, I will demonstrate some of the website's functionalities thanks to the changes I've made, including using filters, registering a new user, and showing the updated SQL database with new users.

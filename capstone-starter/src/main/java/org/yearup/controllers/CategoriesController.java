package org.yearup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.yearup.data.CategoryDao;
import org.yearup.data.ProductDao;
import org.yearup.data.mysql.MySqlCategoryDao;
import org.yearup.models.Category;
import org.yearup.models.Product;

import java.util.List;

// add the annotations to make this a REST controller
// add the annotation to make this controller the endpoint for the following url
    // http://localhost:8080/categories
// add annotation to allow cross site origin requests


@RestController
@RequestMapping("/categories")
@CrossOrigin

public class CategoriesController
{

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private ProductDao productDao;


    // create an Autowired controller to inject the categoryDao and ProductDao

    // add the appropriate annotation for a get action
    @GetMapping
    public List<Category> getAll()
    {
        // find and return all categories
        //return null;
        return categoryDao.getAllCategories();
    }

    // add the appropriate annotation for a get action
    @GetMapping("/{id}")
    public Category getById(@PathVariable int id) {
        // get the category by id

        Category category = categoryDao.getById(id);
        if (category == null) {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        }


        return category;
    }


    // the url to return all products in category 1 would look like this
    // https://localhost:8080/categories/1/products
    @GetMapping("{categoryId}/products")
    public List<Product> getProductsById(@PathVariable int categoryId)
    {
        // get a list of product by categoryId
        return productDao.listByCategoryId(categoryId);
    }


    // add annotation to call this method for a POST action
    // add annotation to ensure that only an ADMIN can call this function

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public Category addCategory(@RequestBody Category category) {

        // insert the category

        var newCategory = categoryDao.create(category);
        return newCategory;

    }


    // add annotation to call this method for a PUT (update) action - the url path must include the categoryId
    // add annotation to ensure that only an ADMIN can call this function

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable int id, @RequestBody Category category)
    {
        Category existingCategory = categoryDao.getById(id);
        if (existingCategory != null) {
            category.setCategoryId(id);
            categoryDao.update(id, category);
            return ResponseEntity.ok(category);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        }

    }


    // add annotation to call this method for a DELETE action - the url path must include the categoryId
    // add annotation to ensure that only an ADMIN can call this function
    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<Void> deleteCategory(@PathVariable int id)
    {
        Category existingCategory = categoryDao.getById(id);
        if (existingCategory != null) {
            categoryDao.delete(id);
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); // 404 Not Found
        }
    }

}
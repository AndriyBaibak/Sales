package com.example.baibaka.salers.domain;

/**
 * Created by baibak.a on 08.10.2017.
 */

public class Category {


    private String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

package com.ecommerce.electronicscenter.exeptions;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message){super(message);}
}

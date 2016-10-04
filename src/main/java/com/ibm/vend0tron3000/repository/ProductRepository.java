package com.ibm.vend0tron3000.repository;

import com.ibm.vend0tron3000.Product;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by hermanvanderveer on 29/09/16.
 */
public class ProductRepository {
    private Connection connection;
    private ArrayList<Product> arrayList;

    public ProductRepository() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/VendingMachine";
            connection = DriverManager.getConnection(url, "root", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Product getProductByid(int id){
        Product product = null;

        try {
            //My SQL statement should get select a row by id. It doesn't yet.
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM products WHERE id = ?");
            ResultSet results = preparedStatement.getResultSet();
            preparedStatement.execute();

            preparedStatement.setInt(1,id);
            product = new Product(results.getInt("id"), results.getString("category"), results.getString("name"),
            results.getInt("amount"), results.getFloat("price"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    public ArrayList<Product> getProducts(){
        ArrayList<Product> productArrayList = new ArrayList<>();

        productArrayList.addAll(getDrinks());
        productArrayList.addAll(getCandies());
        productArrayList.addAll(getChips());

        //Iterate over the arraylist and print
//        for(Product product : productArrayList)
//            System.out.println(product.getName());

        return productArrayList;
    }

    public ArrayList<Product> getCandies() {
        ArrayList<Product> arrayCandies = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM products WHERE category = 'Candy' ");
            preparedStatement.execute();

            ResultSet results = preparedStatement.getResultSet();

            while(results.next()){
                arrayCandies.add(new Product(results.getInt("id"), results.getString("category"), results.getString("name"),
                        results.getInt("amount"), results.getFloat("price")));
            }

            //return arrayCandies;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayCandies;
    }

    public ArrayList<Product> getDrinks() {
        ArrayList<Product> arrayDrinks = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM products WHERE category = 'Drink' ");
            preparedStatement.execute();

            ResultSet results = preparedStatement.getResultSet();

            while(results.next()){
                arrayDrinks.add(new Product(results.getInt("id"), results.getString("category"), results.getString("name"),
                        results.getInt("amount"), results.getFloat("price")));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayDrinks;
    }

    public ArrayList<Product> getChips() {
        ArrayList<Product> getChips = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM products WHERE category = 'Chips' ");
            preparedStatement.execute();

            ResultSet results = preparedStatement.getResultSet();

            while(results.next()){
                getChips.add(new Product(results.getInt("id"), results.getString("category"), results.getString("name"),
                        results.getInt("amount"), results.getFloat("price")));
            }

            //return arrayCandies;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getChips;
    }

}

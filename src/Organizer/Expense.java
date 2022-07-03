package Organizer;

import java.util.stream.Stream;

public class Expense {

    //Declarando os Atributos
    private int id;
    private String name;
    private double amount;
    private String expireDate;
    private String category;

//Declarando O Método Construtor
public Expense(int id, String name, double amount, String expireDate, String category) {
    this.id = id;
    this.name = name;
    this.amount = amount;
    this.expireDate = expireDate;
    this.category = category;
}
//Declarando Os Métodos Getters
public int getId() {
    return id;
}
public String getName() {
    return name;
}
public double getAmount() {
    return amount;
}
public String getExpireDate() {
    return expireDate;
}
public String getCategory() {
    return category;
}
//Declarando Os Métodos Setters
public void setId(int id) {
    this.id = id;
}
public void setName(String name) {
    this.name = name;
}
public void setAmount(double amount) {
    this.amount = amount;
}
public void setExpireDate(String expireDate) {
    this.expireDate = expireDate;
}
public void setCategory(String category) {
    this.category = category;
}
public Stream<Expense> stream() {
    return null;
}
}







    

package Organizer;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

import java.util.Scanner;

import java.util.Comparator;


public class ExpenseStreams{
     

 
    public static void main(String[] args, Expense expensive) {
        List<Expense> expenseList = new ArrayList<Expense>();
        Scanner scanner = new Scanner(System.in);

        expenseList.add(new Expense(1, "Água", 150.00, "01/07/2022", "Gastos Fixos"));
        expenseList.add(new Expense(2, "Luz", 150.00, "05/07/2022", "Gastos Fixos"));
        expenseList.add(new Expense(3, "Internet", 150.00, "08/07/2022", "Gastos Fixos"));
        expenseList.add(new Expense(4, "Carro", 850.00, "10/07/2022", "Extra"));
        expenseList.add(new Expense(5, "Faculdade", 550.00, "15/07/2022", "Gastos Fixos"));
        expenseList.add(new Expense(6, "Lazer", 150.00, "20/07/2022", "Gastos Fixos"));


        //System.out.println("Informe a quantidade do boleto");
        // int qt = Integer.parseInt(scanner.nextLine());

        //  for (int i = 0; i < qt; i++) {
            // int id = i ;
            // System.out.println("Informe o nome do boleto"[" + i + "]:");
            //Double amount = Double.parseDouble(scanner.nextLine());
            // System.out.println("Informe o valor do boleto"[" + i + "]:");
            // String expiredate = scanner.nextLine();
            // System.out.println("Informe a categoria do boleto"[" + i + "]:");
            // String category = scanner.nextLine();
            // expenseList.add(new Expence(id, name, amount, expireDate, category){
                //Sustem.out.println(expense.getName());
                //System.out.println(expense.getAmount());
                //System.out.println(expense.getExpireDate());
                //System.out.println(expense.getCategory());

                //System.out.println();
            // });

            List<Double> amountList = expenseList
            .stream().map(Expense::getAmount)
            .collect(Collectors.toList());

            System .out.println("Lista de valores dos Boletos");
            amountList.forEach(amount -> System.out.println(amount));

            Double totalAmount = amountList.stream().reduce((double)0, (subtotal,expenseAmount) -> subtotal + expenseAmount);

            System.out.println(totalAmount);

            System.out.println("Total por categoria de despesas Fixa");

            List<Double> categoryAmountList = expenseList
            .stream()
            .filter(expense -> expense.getCategory().equals("Gastos Fixos"))
            .map(Expense::getAmount)
            .collect(Collectors.toList());

            Double categoryAmount = categoryAmountList.stream().reduce((double)0, (subtotal,expenseAmount) -> subtotal + expenseAmount);
            System.out.println(categoryAmount);

            Comparator<Expense> comparator = Comparator.comparing(Expense::getAmount);

            System .out.println("Despesas mais barata: ");
            Expense chapear = expenseList.stream().min(comparator).get();
            System.out.println(chapear.getName());

            System .out.println("Despesas mais cara: ");
            Expense cheaper = expenseList.stream().max(comparator).get();
            System.out.println(expensive.getName());

            Map<String, List<Expense>> groupedExpenses = expensive.stream()
            .collect(Collectors.groupingBy(Expense::getName, Collectors.toList()));

            System.out.println("Despesas agrupadas");
            System.out.println("groupedExpenses");


            Map < Integer, String > expenseMap = expenseList.stream()
            .collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
          
            System.out.println(expenseMap);
        
        } 

       
}


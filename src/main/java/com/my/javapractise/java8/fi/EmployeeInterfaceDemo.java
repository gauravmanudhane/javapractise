package com.my.javapractise.java8.fi;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.*;

public class EmployeeInterfaceDemo {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Gaurav",   "Backend",  120000),
                new Employee("Gunjan",    "Backend",   95000),
                new Employee("Rahul",    "DevOps",    85000),
                new Employee("Sneha",    "Frontend",  90000),
                new Employee("Vikram",   "Backend",  110000),
                new Employee("Anika",    "DevOps",    88000)
        );

        // Predicate: filter Backend engineers
        Predicate<Employee> isBackend = e -> e.department.equals("Backend");

        // Function: map to name
        Function<Employee, String> toName = e -> e.name;

        // Comparator (functional): sort by salary desc
        Comparator<Employee> bySalaryDesc = Comparator.comparingDouble((Employee e) -> e.salary).reversed();

        System.out.println("Backend engineers sorted by salary (desc):");
        employees.stream()
                .filter(isBackend)
                .sorted(bySalaryDesc)
                .map(toName)
                .forEach(name -> System.out.println("  -> " + name));

        // Supplier + Optional
        Supplier<Optional<Employee>> topEarner = () ->
                employees.stream().max(Comparator.comparingDouble(e -> e.salary));

        topEarner.get().ifPresent(e -> System.out.println("Top earner: " + e));

        // Consumer: apply 10% hike to DevOps
        Consumer<Employee> applyHike = e -> {
            if (e.department.equals("DevOps")) {
                System.out.printf("  Hike: %s  %.2f -> %.2f%n",
                        e.name, e.salary, e.salary * 1.10);
            }
        };
        System.out.println("Applying 10% hike to DevOps:");
        employees.forEach(applyHike);

        // BinaryOperator: total salary via reduce
        BinaryOperator<Double> sumSalary = Double::sum;
        double totalSalary = employees.stream()
                .map(e -> e.salary)
                .reduce(0.0, sumSalary);
        System.out.printf("Total salary bill: %.2f%n", totalSalary);

        System.out.println();
    }
}

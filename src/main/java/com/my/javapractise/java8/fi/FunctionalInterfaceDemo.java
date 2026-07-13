package com.my.javapractise.java8.fi;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        MyFunctionalInterface myFunc = (a, b) -> a + b;

        // Calling the method of the functional interface
        int result = myFunc.operation(5, 10);
        System.out.println("The sum is: " + result);

        // calling default method
        myFunc.printResult(result);

        // calling static method
        MyFunctionalInterface.showInfo();


        // ---------------------------------------------------------
        // CATEGORY 1: No input, no output  (Greeting / Runnable)
        // ---------------------------------------------------------
        System.out.println("--- Category 1: No Input, No Output (Greeting) ---");

        Greeting morningGreet = () -> System.out.println("Good Morning, Gaurav!");
        morningGreet.greet();

        // Built-in equivalent: Runnable
        Runnable runnable = () -> System.out.println("[Runnable] Task executed.");
        runnable.run();
        System.out.println();

        System.out.println("--- Category 2: Single Input, No Output (Printer / Consumer) ---");

        Printer<String> consolePrinter = value -> System.out.println("Printing: " + value);
        Printer<Integer> squarePrinter = n -> System.out.println("Square of " + n + " = " + (n * n));

        consolePrinter.print("Hello from custom Printer!");
        squarePrinter.print(7);

        // Built-in equivalent: Consumer
        Consumer<String> upperPrinter = s -> System.out.println("[Consumer] Uppercase: " + s.toUpperCase());
        upperPrinter.accept("functional interface");

        // BiConsumer — two inputs, no output
        BiConsumer<String, Integer> repeatPrinter = (s, n) -> {
            for (int i = 0; i < n; i++) System.out.print(s + " ");
            System.out.println();
        };
        repeatPrinter.accept("Java", 3);

        System.out.println();

        System.out.println("--- Category 7: Binary Operation (MathOperation / BinaryOperator) ---");

        MyFunctionalInterface add      = (a, b) -> a + b;
        MyFunctionalInterface subtract = (a, b) -> a - b;
        MyFunctionalInterface multiply = (a, b) -> a * b;
        MyFunctionalInterface power    = (a, b) -> (int) Math.pow(a, b);

        System.out.println("10 + 3  = " + add.operation(10, 3));
        System.out.println("10 - 3  = " + subtract.operation(10, 3));
        System.out.println("10 * 3  = " + multiply.operation(10, 3));
        System.out.println("2 ^ 8   = " + power.operation(2, 8));

        // Built-in: BinaryOperator
        BinaryOperator<String> concat = (a, b) -> a + " | " + b;
        System.out.println("[BinaryOperator] " + concat.apply("HSBC", "Connect"));

        // Built-in: UnaryOperator (single input same type output)
        UnaryOperator<String> shout = s -> s.toUpperCase() + "!!!";
        System.out.println("[UnaryOperator] " + shout.apply("microservices"));

        System.out.println();

        // CATEGORY 8: Composing with default & static methods (StringProcessor)
        // ---------------------------------------------------------
        System.out.println("--- Category 8: Composing via default/static methods (StringProcessor) ---");

        StringProcessor trim      = String::trim;
        StringProcessor upperCase = String::toUpperCase;
        StringProcessor exclaim   = s -> s + "!!!";

        StringProcessor pipeline  = trim.andThen(upperCase).andThen(exclaim);
        System.out.println("Pipeline result: " + pipeline.process("  event-driven architecture  "));

        StringProcessor identity = StringProcessor.identity();
        System.out.println("Identity result: " + identity.process("unchanged"));

        System.out.println();
    }
}

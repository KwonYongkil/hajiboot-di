package com.example;

import com.sun.javafx.tools.ant.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@Import(AppConfig.class)
public class App {
    public static void main( String[] args ) {
        try (ConfigurableApplicationContext context =
                     SpringApplication.run(App.class, args)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter 2 numbers like 'a b' : ");
            ArgumentResolver argumentResolver = context.getBean(ArgumentResolver.class);
            Argument argument = argumentResolver.resolve(System.in);

            Calculator calculator = context.getBean(Calculator.class);
            int result = calculator.calc(argument.getA(), argument.getB());
            System.out.print("result = " + result + "\n");
        }
    }
}

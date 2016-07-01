package com.example;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by saekil on 2016. 7. 1..
 */
public class ScannerArgumentResolver implements ArgumentResolver {
    @Override
    public Argument resolve(InputStream stream) {
        Scanner scanner = new Scanner(stream);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return new Argument(a, b);
    }
}

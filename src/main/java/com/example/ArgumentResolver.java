package com.example;

import java.io.InputStream;

/**
 * Created by saekil on 2016. 7. 1..
 */
public interface ArgumentResolver {
    Argument resolve(InputStream stream);
}

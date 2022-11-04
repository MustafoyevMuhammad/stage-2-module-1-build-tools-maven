package com.epam.demo;

import java.util.List;
import java.util.function.Predicate;

import com.epam.utils.StringUtils;
import org.apache.commons.lang3.math.*;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        return args.stream().filter(Predicate.not(StringUtils::isPositiveNumber)).findFirst().isEmpty();
       //magic happens here
    }
}
package com.ethernet.utils;

import com.ethernet.enums.PersistableEnum;

public class ConverterUtils {

    public static String enumToString(final PersistableEnum persistableEnum) {
        return persistableEnum == null ? "" : persistableEnum.toString();
    }
}

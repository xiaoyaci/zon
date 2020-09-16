package com.lvtemporary.until;

import com.lvtemporary.entity.Lvtemporary;

import java.lang.reflect.Field;

public class ReflectionAssignment {

    public static void ReflectionAssignmentToLvt(Lvtemporary lvtemporary, String property, String value) throws NoSuchFieldException, IllegalAccessException {
        int longId;
        Double doubleId;
        Field f = lvtemporary.getClass().getDeclaredField(property);
        f.setAccessible(true);
        if (property.equals("id")) {
            if (value != null) {
                doubleId = Double.parseDouble(value);
                longId = new Double(doubleId).intValue();
                long b = (int) longId;
                f.set(lvtemporary, b);
                return;
            }
        } else {
            System.out.println(value);
            f.set(lvtemporary, value);
        }
    }
}

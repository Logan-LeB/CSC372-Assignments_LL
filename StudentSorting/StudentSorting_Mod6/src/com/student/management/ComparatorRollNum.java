package com.student.management;

import java.util.Comparator;

public class ComparatorRollNum implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollnum(), s2.getRollnum());
    }
}
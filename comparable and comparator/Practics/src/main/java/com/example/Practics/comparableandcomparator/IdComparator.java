package com.example.Practics.comparableandcomparator;

import java.util.Comparator;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class IdComparator implements Comparator<Emp> {

    @Override
    public int compare(Emp o1, Emp o2) {
       return o1.getEmpId()-o2.getEmpId();
    }

   


}

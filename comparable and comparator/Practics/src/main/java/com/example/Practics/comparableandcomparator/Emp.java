package com.example.Practics.comparableandcomparator;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Emp implements Comparable<Emp>{

    private String Name;
    private int     EmpId;
    private String Gender;

  @Override                             // comparable sorting
    public int compareTo(Emp o) {
       return this.EmpId-o.EmpId;
    }

    public Emp(String Name,int EmpId,String Gender)
    {
        this.Name=Name;
        this.EmpId=EmpId;
        this.Gender=Gender;
    }

    @Override
    public String toString() {
        return "Emp [Name=" + Name + ", EmpId=" + EmpId + ", Gender=" + Gender + "]";
    }

  
        
    

}

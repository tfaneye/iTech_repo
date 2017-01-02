package collections.concepts.hashtables;

import java.util.Hashtable;

/**
 * Created by Tunde on 24/11/2016.
 */
public class Employee {
    Hashtable<String, Double> employeeRecord;

    public Employee(){

        employeeRecord = new Hashtable<String, Double>();
        employeeRecord.put("Dan", 50000.00);
        employeeRecord.put("Fred", 55000.0);
        employeeRecord.put("Nigel", 60000.0);
        employeeRecord.put("Frank", 70000.0);
    }

    public Double getEmpRecord(String empName) {
        return employeeRecord.get(empName);
    }
}

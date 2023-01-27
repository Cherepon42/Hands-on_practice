package vlad.entities;

import vlad.constraints.CustomEmail;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
    @Size(max = 10, min = 4)
    @NotBlank
    private String name;
    private String department;
    private int salary;
    private Map<String, String> departments;
    private String car;
    private Map<String, String> cars;
    private List<String> languages;
    private Map<String, String> languagesMap;
    @CustomEmail
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("map`s key, value model", "map`s value, label for html");
        departments.put("map`s key, value model1", "map`s value, label for html1");

        cars = new HashMap<>();
        cars.put("car`s key, value model", "car`s value, label for view");
        cars.put("car`s key, value model1", "car`s value, label for view1");

        languagesMap = new HashMap<>();
        languagesMap.put("EN", "English");
        languagesMap.put("FR", "French");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesMap() {
        return languagesMap;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", car='" + car + '\'' +
                ", languages=" + languages +
                '}';
    }
}

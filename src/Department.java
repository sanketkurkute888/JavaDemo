import java.util.List;

public class Department {

    String departmentName;
    List<Person> personList;

    public Department(String departmentName, List<Person> personList) {
        this.departmentName = departmentName;
        this.personList = personList;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", personList=" + personList +
                '}';
    }
}

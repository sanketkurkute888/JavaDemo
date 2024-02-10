public class Employee extends Worker {
      private int eid;
      private String hire_date;

      public Employee() {
            this(0,null);
      }

      public Employee(int eid, String hire_date) {
            this.eid = eid;
            this.hire_date = hire_date;
      }

      public Employee(String name, String birthDate, int eid, String hire_date) {
            super(name, birthDate);
            this.eid = eid;
            this.hire_date = hire_date;
      }

}

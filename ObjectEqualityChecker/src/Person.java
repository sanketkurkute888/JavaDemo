class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Getter methods for age and name

    @Override
    public boolean equals(Object obj){
//        if (this == obj) {
//            return true;
//        }

//        Person person = (Person) obj;
//    return age == person.age && name.equals(person.name);
          if(obj instanceof Person)
          {
              Person person = (Person) obj;
              return age == person.age && name.equals(person.name);
          }
          return false;
    }

}

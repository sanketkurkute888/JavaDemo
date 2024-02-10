import java.util.*;

public class Entry {
    public static void main(String[] args) {
        String[] studentName = {"Sanket", "Vaibhav", "Rohit"};

        String[] courseName = {"Java", "C", "C++", "Python"};

        Random random = new Random();
        List<Student> stringList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomStudentName = random.nextInt(0, 3);
            int randomCourseName = random.nextInt(0, 4);

            stringList.add(new Student(studentName[randomStudentName], courseName[randomCourseName], random.nextInt(2000, 2023)));
        }

        for (Student s : stringList) {
            System.out.println(s);
        }


        Collections.sort(stringList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getYear() > o2.getYear())
                {
                    return 1;
                } else if (o1.getYear() < o2.getYear()) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });

//        after the sorting

        System.out.println("after sorting");
        for (Student e:stringList) {
            System.out.println(e);
        }

    }
}
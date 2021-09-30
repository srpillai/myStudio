package exercises.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public String toString(){
        return String.format("Course: %s, Teacher: %s", this.topic, this.instructor);
    }

    public boolean equals(Object toBeCompared){
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Course theCourse = (Course) toBeCompared;
        return theCourse.instructor == instructor && theCourse.topic == topic;
    }
}

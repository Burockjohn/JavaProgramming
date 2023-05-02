package day36_Inheritance.encapsulation;

public class Student {

    private String name, schoolName;
    private char gender, grade;
    private int age;


    public Student(String name, String schoolName, char gender, char grade, int age) {
        setName(name);
        setSchoolName(schoolName);
        setGender(gender);
        setGrade(grade);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public char getGender() {
        return gender;
    }

    public char getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            return;
        }
        this.gender = gender;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')) {
            return; // exits the method
        }
        this.grade = grade;
    }

    public void setAge(int age) {
        if (age < 5 || age > 90) {
            return;
        }

        this.age = age;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                '}';
    }
}

/*

1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fileds (at least encapsulate two fields manually)
					requirments:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any chanarcter other than: 'M' and 'F'
						3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all teh fields when the object is created
						(requirments of fileds in the above must be applied)


			Methods:
				study()
				toString()


 */
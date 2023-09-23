package Sep23.inheritence.mutlilevel;

class ATB {
    // Class ATB
        private final String name;
        private final int age;

        public ATB(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age;
        }
    }

    // Subclass for Single Inheritance
    class ATBStudent extends ATB {
        private final int rollNumber;

        public ATBStudent(String name, int age, int rollNumber) {
            super(name, age);
            this.rollNumber = rollNumber;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public void displayStudentInfo() {
            super.displayInfo();
            System.out.println("Roll Number: " + rollNumber);
        }
    }

    // Subclass for Multilevel Inheritance
    class ATBGraduateStudent extends ATBStudent {
        private final String major;

        public ATBGraduateStudent(String name, int age, int rollNumber, String major) {
            super(name, age, rollNumber);
            this.major = major;
        }

        public String getMajor() {
            return major;
        }

        public void displayGraduateStudentInfo() {
            super.displayStudentInfo();
            System.out.println("Major: " + major);
        }
    }

    class main {
        public static void main(String[] args) {

            // Create an array of ATB students
            ATBStudent[] students = new ATBStudent[3];
            students[0] = new ATBStudent("Alice", 20, 101);
            students[1] = new ATBGraduateStudent("Bob", 25, 201, "Computer Science");
            students[2] = new ATBStudent("Carol", 22, 102);

            // Display information using toString method
            for (ATBStudent student : students) {
                System.out.println(student);
            }

            // Demonstrate method overloading
            ATBStudent overloadingExample = new ATBStudent("Dave", 23, 103);
            overloadingExample.displayInfo(); // Calls the displayInfo method
            overloadingExample.displayStudentInfo(); // Calls the displayStudentInfo method

            // Demonstrate method overriding
            ATBGraduateStudent overridingExample = new ATBGraduateStudent("Eve", 27, 202, "Physics");
            overridingExample.displayGraduateStudentInfo(); // Calls the overridden method
        }
    }

package Design_Patterns_and_Principles;

class Student {
    private String id;
    private String name;
    private String grade;

    // Constructor
    public Student(String id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}

class StudentView {
    public void displayStudentDetails(String id, String name, String grade) {
        System.out.println("Student Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentId(String id) {
        model.setId(id);
    }

    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    public String getStudentName() {
        return model.getName();
    }

    public String getStudentId() {
        return model.getId();
    }

    public String getStudentGrade() {
        return model.getGrade();
    }

    public void updateView() {
        view.displayStudentDetails(model.getId(), model.getName(), model.getGrade());
    }
}

class MVCPatternDemo {
    public static void main(String[] args) {
        // Create model (student)
        Student student = new Student("101", "Alice", "A");
        // Create view
        StudentView view = new StudentView();
        // Create controller
        StudentController controller = new StudentController(student, view);
        // Initial display
        controller.updateView();
        // Update student details using controller
        controller.setStudentName("Bob");
        controller.setStudentGrade("B+");
        // Display updated details
        controller.updateView();
    }
}

// Output:
// Student Details:
// ID: 101
// Name: Alice
// Grade: A

// Student Details:
// ID: 101
// Name: Bob
// Grade: B+
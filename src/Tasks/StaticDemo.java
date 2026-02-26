package Tasks;

    class StaticDemo {

        // 1️⃣ Static variable (shared among all objects)
        static String companyName;

        // 2️⃣ Non-static variable (unique for each object)
        String employeeName;

        // 3️⃣ Static block (runs only once when class loads)
        static {
            companyName = "Tech Solutions Pvt Ltd";
            System.out.println("Static block executed");
            System.out.println("Example of static code");
        }

        // Constructor
        StaticDemo(String name) {
            this.employeeName = name;
        }

        // 4️⃣ Static method (belongs to class)
        static void displayCompany() {
            System.out.println("Company Name: " + companyName);

            // ❌ Cannot access non-static variable directly
            // System.out.println(employeeName); // This will cause error
        }

        // 5️⃣ Non-static method
        void displayEmployee() {
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Company Name: " + companyName);
        }

        // 6️⃣ Main method (static because JVM calls it directly)
        public static void main(String[] args) {

            // Calling static method without object
            displayCompany();

            // Creating objects
            StaticDemo emp1 = new StaticDemo("Rahul");
            StaticDemo emp2 = new StaticDemo("Priya");

            // Calling non-static methods using objects
            emp1.displayEmployee();
            emp2.displayEmployee();
        }
    }


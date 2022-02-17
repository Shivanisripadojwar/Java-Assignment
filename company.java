package main;

public class company {
    String president;
    String Managers;
    String developers;

    public company(String poornaveer) {
        this.president = poornaveer;
    }

    public void company(String president) {
        this.president = president;
    }

    void display() {
        System.out.println("president is:" + president);
    }
}
    class Manager extends company {
        int Managers = 8;

        public Manager(String president, int managers) {
            super(president);
        }

        void display() {
            System.out.println("number of manager in each department under president:" + "Managers");
        }
    }
        class Department extends company {
            int servicenow = 3;
            int azure = 2;
            int aws = 5;
            int java = 4;
            int mulesoft = 6;

            public Department(String president, String Managers, String Department) {
                super("President");
            }

            void d1() {
                System.out.println("service now dept: " + servicenow + " " + "managers");
                System.out.println("azure: " + azure + " " + "managers");
                System.out.println("aws: " + " " + aws + " " + "managers");
                System.out.println("java: " + " " + java + " " + "managers");
                System.out.println("mulesoft: " + " " + mulesoft + " " + "managers");
                System.out.println("total number of managers: " + (servicenow + azure + aws + java + mulesoft));
            }
        }

        class developers extends company {
            int servicedevelopers = 22;
            int azuredevelopers = 14;
            int awsdevelopers = 44;
            int javadevelopers = 33;
            int mulesoftdevelopers = 22;

            developers(String president, String departments, String developers) {
                super("President");
            }
            void f1() {
                System.out.println("servicenow department: " + "   " + servicedevelopers + " " + " developers");
                System.out.println("azure department: " + "  " + azuredevelopers + " " + " developers");
                System.out.println("java department: " + "  " + javadevelopers + " " + " developers");
                System.out.println("aws department: " + "  " + awsdevelopers  + " developers");
                System.out.println("mulesoft department:" + "   " + mulesoftdevelopers + " " + " developers");
                System.out.println("total number of developers:" + (servicedevelopers + azuredevelopers +awsdevelopers +javadevelopers + mulesoftdevelopers));
            }

        }

        class main {
            public static void main(String[] args) {
                company v1 = new company("poornaveer");

                v1.display();

                Department d2 = new Department("presidents", "managers", "departments");
                d2.d1();
                developers f3 = new developers("presidents", "managers", "departments");
                f3.f1();
            }
        }









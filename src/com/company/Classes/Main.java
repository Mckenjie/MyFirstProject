package com.company.Classes;

public class Main {

    public static void main(String[] args) {

        Person firstPerson = new Person();
        Employee firstEmployee = new Employee();
        Customer firstCustomer = new Customer();

        firstPerson.setFirstname("MARK LEEN");
        firstPerson.setLastname("Mayol");
        firstPerson.setAge(22);
        firstPerson.setEmail("kramloyam@gmail.com");
        firstPerson.setUsername("Mark Mayol");
        firstPerson.setPassword("KingCobra.11");

        String fname = firstPerson.getFirstname();
        String lname = firstPerson.getLastname();
        int age = firstPerson.getAge();
        String email = firstPerson.getEmail();
        String username = firstPerson.getUsername();
        String password = firstPerson.getPassword();

        System.out.println("");
        System.out.println("*Person*");
        System.out.println("FIRSTNAME : " + fname);
        System.out.println("LASTNAME : " + lname);
        System.out.println("AGE : " + age);
        System.out.println("Email : " + email);
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);

        firstEmployee.setDepartment("Process Graphics");
        firstEmployee.setPaygrade(22);
        firstEmployee.setEmployeID(1);

        String department = firstEmployee.getDepartment();
        int paygrade = firstEmployee.getPaygrade();
        int employeID = firstEmployee.getEmployeID();

        System.out.println("");
        System.out.println("*EMPLOYEE*");
        System.out.println("DEPARTMENT : " + department);
        System.out.println("PAYGRADE : " + paygrade);
        System.out.println("EMPLOYEID : " + employeID);


        //Customer

        firstCustomer.setAddress("Mandaue City");
        firstCustomer.setTelephone(2724909);
        firstCustomer.setCustomerID("two");

        String address = firstCustomer.getAddress();
        int telephone = firstCustomer.getTelephone();
        String customerID = firstCustomer.getCustomerID();

        System.out.println("");
        System.out.println("CUSTOMER");
        System.out.println("ADDRESS : " + address);
        System.out.println("TELEPHONE : " + telephone);
        System.out.println("CUSTOMERID : " + customerID);

        //MyInformation

        System.out.println("");
        System.out.println("IntroduceYourSelf");
        System.out.println(firstPerson.introduceYourself("Mark Leen", "Mayol"));
        System.out.println(firstCustomer.introduceYourself("Mckenjie", "Suico"));
        System.out.println(firstEmployee.introduceYourself("Monsour", "Garcia"));

        //ExerciseoverLoad

        System.out.println("");
        System.out.println("overload");
        System.out.println(firstEmployee.overLoading("Mark Leen", "Mayol", 22, "kramloyam@gmail.com", "887 Pilit Cabancalan Mandaue city"));
        System.out.println(firstCustomer.overLoading("Monsour", "Mayol", 22, "Monsouor@gmail.com", "887 Pilit Cabancalan Mandaue city"));

        //setparameter to class

        Customer customer = new Customer("Mark", "Mayol");
        System.out.println(customer.getFirstname() + " " + customer.getLastname());


        //This is Array

        //While loop

        int a = 0;

        while (a < 10) {
            a++;
            System.out.print("[" + a + "]");

        }
        System.out.print("\n");
        //Do-While
        int x = 1;

        do {
            System.out.print("{" + x + "}");
            x++;


        } while (x < 11);
        System.out.print("\n");
        //forLoop

        for (int b = 1; b < 11; b++) {
            System.out.print("{" + b + "}");
        }
        System.out.print("\n");
        //Method
        int sum = 0;
        for (int q = 1; q < 7; q++) {
            sum += q;
        }
        System.out.println(sum);

        //Exercies:2
        int input = 7;
        int factor = 1;
        while(input > 0 ){
            factor = factor * input;
            input--;
        }
        System.out.println(factor);

        //Exercise:3
        int[] myList = new int[12];

                for(int even = 2;even<myList.length;even++){
            myList[even]=even;
            if(even%2==0)
                System.out.print(even);
                }

        }
    }





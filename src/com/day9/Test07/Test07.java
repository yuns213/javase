package com.day9.Test07;



public class Test07 {

    public static void main(String[] args) {

        Company company = new Company();

        Manager manager = new Manager("张小强",9000);

        Coder  coder = new Coder("李小亮",5000);

        company.paySalary(manager);
        company.paySalary(coder);

    }


}

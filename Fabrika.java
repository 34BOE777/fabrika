package com.company;

public class Fabrika {

    String name ; //Çalışanın adı ve soyadı
    double salary;  //Çalışanın maaşı
    int workHours ; //Haftalık çalışma saati
    int hireYear ; //İşe başlangıç yılı

    Fabrika(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public static double Vergi(Fabrika f1) {
        if (f1.salary < 1000)
        return 0;
        else return f1.salary*(0.03);
    }
    public static double Bonus(Fabrika f1){
        if(f1.workHours>40){
            return (f1.workHours-40)*30;
        }
        else return 0;
    }
    public static double Zam(Fabrika  f1){
        if((2021 - f1.hireYear)<10 )
            return ((f1.salary)/20);
        if((2021 - f1.hireYear>10) && (2021 - f1.hireYear<20)) return (f1.salary/10);

        if ((2021 - f1.hireYear)>20) return (f1.salary*(0.15));

        else return  0;
    }

    public static void Yazdir(Fabrika f1) {
        System.out.println("Adı : " + f1.name + "\n" +
                "Maaşı : " + f1.salary + "\n" +
                "Çalışma Saati : " + f1.workHours + "\n" +
                "Başlangıç Yılı : " + f1.hireYear + "\n" +
                "Vergi :" + Vergi(f1) + "\n" +
                "Bonus : " + Bonus(f1) + "\n" +
                "Maaş Artışı :" + Zam(f1) + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (f1.salary + Bonus(f1) + Zam(f1) - Vergi(f1)) + "\n" +
                "işlem tamamlandı");


    }
}

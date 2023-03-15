package section69.application.ex2.entities;

public class Salary {
    public String name;
    public double grossSalary;
    public double tax;

    public double  netSalary(){ //salário líquido
        return grossSalary - tax;
    }

//    public double increaseSalary(double percentage){
//        percentage = grossSalary * (percentage / 100);
//        return netSalary() + percentage;
//    }

    //correção professor
    public void increaseSalary(double percentage){//aumentar salário
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString(){
        return "Update data: "
                + name
                +", $ "
                +String.format("%.2f", netSalary()); //aqui ele chama o netSalary de novo pois o valor dele já foi sobescrito no método acima
    }
}

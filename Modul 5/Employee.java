package counter;

class Employee {
    private int monthlySalary;
    private int commission;
    private int bonus;
    private EmployeeType type;  

    public Employee(EmployeeType type, int monthlySalary, int commission, int bonus) {
        this.type = type;
        this.monthlySalary = monthlySalary;
        this.commission = commission;
        this.bonus = bonus;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public int getBonus() {
        return bonus;
    }

    public EmployeeType getType() {
        return type;
    }

    public int payAmount() {
        return type.payAmount(this);  
    }
}
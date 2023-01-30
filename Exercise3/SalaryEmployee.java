package Exercise3;

public class SalaryEmployee extends SalaryBase implements InterfaceAllowance {
    public int clcBonus(int iBase) {
        return iBase * 3;
    }

}

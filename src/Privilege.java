/**
 * Created by Junfeng on 2015/10/24.
 */
public class Privilege {

    private int maxQuota ;
    private int currentQuota ;
    private double rentFee ;
    private double renewFee ;
    private double replacementFee ;
    private double lateFee ;
    private double regFee ;

    public Privilege(int maxQuota, int currentQuota, double rentFee, double renewFee, double replacementFee, double lateFee, double regFee) {
        this.maxQuota = maxQuota;
        this.currentQuota = currentQuota;
        this.rentFee = rentFee;
        this.renewFee = renewFee;
        this.replacementFee = replacementFee;
        this.lateFee = lateFee;
        this.regFee = regFee;
    }

    public double getRenewLateFee(){
        return 0;
    }

    public int getMaxQuota() {
        return maxQuota;
    }

    public void setMaxQuota(int maxQuota) {
        this.maxQuota = maxQuota;
    }

    public int getCurrentQuota() {
        return currentQuota;
    }

    public void setCurrentQuota(int currentQuota) {
        this.currentQuota = currentQuota;
    }

    public double getRentFee() {
        return rentFee;
    }

    public void setRentFee(double rentFee) {
        this.rentFee = rentFee;
    }

    public double getRenewFee() {
        return renewFee;
    }

    public void setRenewFee(double renewFee) {
        this.renewFee = renewFee;
    }

    public double getReplacementFee() {
        return replacementFee;
    }

    public void setReplacementFee(double replacementFee) {
        this.replacementFee = replacementFee;
    }

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public double getRegFee() {
        return regFee;
    }

    public void setRegFee(double regFee) {
        this.regFee = regFee;
    }
}

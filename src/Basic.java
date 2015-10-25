/**
 * Created by Junfeng on 2015/10/25.
 */
public class Basic extends Member {
    double rentFee ;
    double renewFee ;
    double lateFee ;
    double replaceFeeDVD ;
    double replaceFeeVCD ;

    public void upgradeMem(String contactNo  ){

    }
    public Basic(String contactNo, String name, String add, double rentFee, double renewFee, double lateFee, double replaceFeeDVD, double replaceFeeVCD) {
        super(contactNo, name, add);
        this.rentFee = rentFee;
        this.renewFee = renewFee;
        this.lateFee = lateFee;
        this.replaceFeeDVD = replaceFeeDVD;
        this.replaceFeeVCD = replaceFeeVCD;
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

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public double getReplaceFeeDVD() {
        return replaceFeeDVD;
    }

    public void setReplaceFeeDVD(double replaceFeeDVD) {
        this.replaceFeeDVD = replaceFeeDVD;
    }

    public double getReplaceFeeVCD() {
        return replaceFeeVCD;
    }

    public void setReplaceFeeVCD(double replaceFeeVCD) {
        this.replaceFeeVCD = replaceFeeVCD;
    }
}

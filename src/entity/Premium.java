package entity;

import entity.Member;
import systen.Serialize;

/**
 * Created by Junfeng on 2015/10/25.
 */
public class Premium implements Serialize {
    String contactNo ;
    String name ;
    String add ;
    double rentFee ;
    double renewFee ;
    double lateFee;
    double replaceFeeDVD ;
    double replaceFeeVCD ;

    public Premium(String contactNo, String name, String add, double rentFee, double renewFee, double lateFee, double replaceFeeDVD, double replaceFeeVCD) {
        this.contactNo = contactNo;
        this.name = name;
        this.add = add;
        this.rentFee = rentFee;
        this.renewFee = renewFee;
        this.lateFee = lateFee;
        this.replaceFeeDVD = replaceFeeDVD;
        this.replaceFeeVCD = replaceFeeVCD;
    }

    public String serialize() {
        return contactNo + "|" + name + "|" + add + "|" + rentFee + "|" + renewFee + "|" + lateFee + "|" + replaceFeeDVD + "|" + replaceFeeVCD;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
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

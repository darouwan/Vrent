package entity;

import system.Serialize;

import java.util.StringTokenizer;

/**
 * Created by Junfeng on 2015/10/25.
 */
public class Premium extends Member implements Serialize {
    int id;
    String contactNo ;
    String name ;
    String add ;
    String number;
    double rentFee ;
    double renewFee ;
    double lateFee;
    double replaceFeeDVD ;
    double replaceFeeVCD ;
    String memberType = "P";

    @Override
    public String toString() {
        return
                "contactNo=" + contactNo +
                        ", name=" + name +
                        ", add=" + add +
                        ", number=" + number +
                        ", Type (B/P): " + memberType;
    }

    public static Premium getInstance(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s, "|");
        return new Premium(tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), Double.parseDouble(tokenizer.nextToken()),
                Double.parseDouble(tokenizer.nextToken()), Double.parseDouble(tokenizer.nextToken()), Double.parseDouble(tokenizer.nextToken()),
                Double.parseDouble(tokenizer.nextToken()));

    }

    public Premium(String contactNo, String name, String add, String number, double rentFee, double renewFee, double lateFee, double replaceFeeDVD, double replaceFeeVCD) {
        this.contactNo = contactNo;
        this.name = name;
        this.add = add;
        this.number = number;
        this.rentFee = rentFee;
        this.renewFee = renewFee;
        this.lateFee = lateFee;
        this.replaceFeeDVD = replaceFeeDVD;
        this.replaceFeeVCD = replaceFeeVCD;
        id = Basic.increasementID++;
    }


    public String serialize() {
        return contactNo + "|" + name + "|" + add + "|" + number + "|" + rentFee + "|" + renewFee + "|" + lateFee + "|" + replaceFeeDVD + "|" + replaceFeeVCD;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

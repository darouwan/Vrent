package entity;

import systen.Serialize;

/**
 * Created by Junfeng on 2015/10/24.
 */
public class Member implements Serialize {
    String contactNo ;
    String name;
    String add;
    double rentFee ;
    double renewFee ;
    double lateFee ;
    double replaceFeeDVD ;
    double replaceFeeVCD ;


    public Member(String contactNo  ,String name  ,String add){
        this.contactNo = contactNo;
        this.name = name;
        this.add = add;
    }
    public double computeFee(){
        return  0;
    }

    @Override
    public String serialize() {
        return contactNo + "|" + name + "|" + add;//+"|"+rentFee+"|"+renewFee+"|"+lateFee+"|"+replaceFeeDVD+"|"+replaceFeeVCD;
    }
}

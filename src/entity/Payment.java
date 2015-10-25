package entity;

import java.util.Date;
import java.util.StringTokenizer;

/**
 * Created by Junfeng on 2015/10/25.
 */
public class Payment implements Serialize {
    double amtPaid ;
    Date datePaid ;
    int type ;

    public Payment(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s, "|");
        amtPaid = Double.parseDouble(tokenizer.nextToken());
        datePaid = new Date(Long.parseLong(tokenizer.nextToken()));
        type = Integer.parseInt(tokenizer.nextToken());
    }

    public String serialize() {
        return amtPaid + "|" + datePaid.getTime() + "|" + type;
    }



    public Payment(double amtPaid, Date datePaid, int type) {
        this.amtPaid = amtPaid;
        this.datePaid = datePaid;
        this.type = type;
    }

    public double getAmtPaid() {
        return amtPaid;
    }

    public void setAmtPaid(double amtPaid) {
        this.amtPaid = amtPaid;
    }

    public Date getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(Date datePaid) {
        this.datePaid = datePaid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

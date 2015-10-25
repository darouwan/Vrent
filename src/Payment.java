import java.util.Date;

/**
 * Created by Junfeng on 2015/10/25.
 */
public class Payment {
    double amtPaid ;
    Date datePaid ;
    int type ;

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

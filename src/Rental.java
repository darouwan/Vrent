import java.util.Date;

/**
 * Created by Junfeng on 2015/10/24.
 */
public class Rental {
    private Date checkDaysOverdue;
    private Date dateToReturn;

    int checkDaysOverdue(){
        return 0;
    }

    public Date getCheckDaysOverdue() {
        return checkDaysOverdue;
    }

    public void setCheckDaysOverdue(Date checkDaysOverdue) {
        this.checkDaysOverdue = checkDaysOverdue;
    }

    public Date getDateToReturn() {
        return dateToReturn;
    }

    public void setDateToReturn(Date dateToReturn) {
        this.dateToReturn = dateToReturn;
    }
}

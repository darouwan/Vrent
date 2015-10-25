/**
 * Created by Junfeng on 2015/10/24.
 */
public class Copy {
    String format ;
    char status ;
    double cost ;

    public Copy(String format, char status, double cost) {
        this.format = format;
        this.status = status;
        this.cost = cost;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

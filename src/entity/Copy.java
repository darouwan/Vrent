package entity;

/**
 * Created by Junfeng on 2015/10/24.
 */
public class Copy {
    static int increasementID = 0;
    int id;
    String format ;
    String status;
    double cost ;

    public Copy(String format, String status, double cost) {
        this.format = format;
        this.status = status;
        this.cost = cost;

        increasementID++;
        id = increasementID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

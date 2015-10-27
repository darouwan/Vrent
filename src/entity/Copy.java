package entity;

import util.DateUtil;

import java.util.Date;
import java.util.StringTokenizer;

/**
 * Created by Junfeng on 2015/10/24.
 */
public class Copy {
    static int increasementID = 0;
    int id;
    String format ;
    String status;
    double cost ;
    Date created;

    public String serialize() {
        return id + "|" + format + "|" + status + "|" + cost + "|" + created.getTime();
    }

    public Copy(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s, "|");
        this.id = Integer.parseInt(tokenizer.nextToken());
        this.format = tokenizer.nextToken();
        this.cost = Double.parseDouble(tokenizer.nextToken());
        this.created = new Date(Long.parseLong(tokenizer.nextToken()));
    }

    public static String UNRENT = "unrented";
    public static String RENT = "RENTED";

    @Override
    public String toString() {
        return "Copy{" +
                "id=" + id +
                ", format='" + format + '\'' +
                ", status='" + status + '\'' +
                ", cost=" + cost + '\'' +
                ", Date created=" + DateUtil.format(created) + '\'' +
                '}';
    }

    public Copy(String format, String status, double cost) {
        this.format = format;
        this.status = status;
        this.cost = cost;
        this.created = new Date();
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

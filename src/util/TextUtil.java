package util;

import entity.Basic;
import entity.Movie;
import entity.Premium;
import system.VideoShop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Junfeng on 2015/10/25.
 */
public class TextUtil {
    File file = new File("a.txt");
    FileWriter fileWriter = null;
    List<Basic> basicList = new ArrayList<Basic>();
    List<Premium> premiumList = new ArrayList<Premium>();

    public TextUtil() {

    }


    public void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void init() {
        try {
            fileWriter = new FileWriter(file);


            for (Object member : VideoShop.members) {
                if (member instanceof Basic) {
                    basicList.add((Basic) member);
                } else if (member instanceof Premium) {
                    premiumList.add((Premium) member);
                }
            }

            int a = VideoShop.movieSystem.movies.size();
            int b = basicList.size();
            int c = premiumList.size();
            fileWriter.write(a + " " + b + " " + c + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void movieToText() {
        try {

            for (Movie movie : VideoShop.movieSystem.movies) {
                String sMovie = movie.serialize();
                fileWriter.write(sMovie + "\n");

            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void memberToText() {
        try {


            for (Basic basic : basicList) {
                fileWriter.write(basic.serialize() + "\n");
            }

            for (Premium premium : premiumList) {
                fileWriter.write(premium.serialize() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void readFromFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;

            // 一次读入一行，直到读入null为文件结束
            String first = reader.readLine();
            String[] l = first.split(" ");
            int a = Integer.parseInt(l[0]);
            int b = Integer.parseInt(l[1]);
            int c = Integer.parseInt(l[2]);

            System.out.println("Movie records ");
            for (int i = 0; i < a; i++) {
                tempString = reader.readLine();
                //System.out.println(tempString);
                Movie movie = new Movie(tempString);
                System.out.println(movie);
                VideoShop.movieSystem.movies.add(movie);
            }
            System.out.println("Member records ");
            System.out.println("Basic members");
            for (int i = 0; i < b; i++) {
                tempString = reader.readLine();
                //System.out.println(tempString);
                Basic basic = Basic.getInstance(tempString);
                System.out.println(basic);
                VideoShop.members.add(basic);
            }

            System.out.println("Premium members");
            for (int i = 0; i < c; i++) {
                tempString = reader.readLine();
                //System.out.println(tempString);
                Premium premium = Premium.getInstance(tempString);
                System.out.println(premium);
                VideoShop.members.add(premium);
            }


            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }

    public static void main(String[] args) {
        new TextUtil().readFromFile();
    }
}

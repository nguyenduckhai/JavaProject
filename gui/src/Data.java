import java.io.*;
import java.util.ArrayList;

public class Data{
    public static ArrayList<Course> courseList;

    public Data(){
        File f = new File("Courses.txt");
        courseList = null;
        if (f.length() != 0){
            try {
                FileInputStream fis = new FileInputStream("Courses.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                courseList = (ArrayList<Course>) ois.readObject();
                ois.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        else courseList = new ArrayList<>();
    }

    public static void save(){
        if (courseList!=null) {
            try {
                FileOutputStream fos = new FileOutputStream("Courses.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(courseList);
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

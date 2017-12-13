import java.io.Serializable;

public class Date implements Serializable   {
    int day;
    int month;

    public Date(){
    }

    public Date(int day, int month){
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return this.getDay()+"/"+this.getMonth();
    }
}

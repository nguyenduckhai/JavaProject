import java.io.Serializable;

public class Course implements Serializable{
    private int room;
    private String subject;
    private String department;
    private String lecturer;
    private Date courseDate;
    private Time startTime;
    private Time endTime;

    public Course(int room,String subject, String department, String lecturer, Date courseDate, Time startTime, Time endTime){
        this.room = room;
        this.subject = subject;
        this.department = department;
        this.lecturer = lecturer;
        this.courseDate = new Date(); this.courseDate = courseDate;
        this.startTime = new Time(); this.startTime = startTime;
        this.endTime = new Time(); this.endTime = endTime;
    }

    public String getSubject() {
        return subject;
    }

    public String getDepartment() {
        return department;
    }

    public String getLecturer() {
        return lecturer;
    }

    public Date getCourseDate() {
        return courseDate;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Subject: "+this.getSubject()+
                "\nDepartment "+this.getDepartment()+
                "\nLecturer: "+this.getLecturer()+
                "\nDate: "+this.getCourseDate()+
                "\nStart time: "+this.getStartTime()+
                "\nEnd time: "+this.getEndTime()+"\n";
    }
}

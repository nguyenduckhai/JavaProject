import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddUI2 {
    private JPanel mainPanel;
    private JButton cancelButton;
    private JButton OKButton;
    private JPanel CenterPanel;
    private JTextField subjectField;
    private JTextField lecturerField;
    private JComboBox roomField;
    private JComboBox departmentField;
    private JTextField dayField;
    private JTextField monthField;
    private JTextField startHourField;
    private JTextField startMinuteField;
    private JTextField endHourField;
    private JTextField endMinuteField;


    public AddUI2() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int room = Integer.parseInt(String.valueOf(roomField.getSelectedItem()));
                String subject = subjectField.getText();
                String lecturer = lecturerField.getText();
                String department = String.valueOf(departmentField.getSelectedItem());
                int day = Integer.parseInt(dayField.getText());
                int month = Integer.parseInt(monthField.getText());
                int startHour = Integer.parseInt(startHourField.getText());
                int startMinute = Integer.parseInt(startMinuteField.getText());
                int endHour = Integer.parseInt(endHourField.getText());
                int endMinute = Integer.parseInt(endMinuteField.getText());
                Date courseDate = new Date(day,month);
                Time startTime = new Time(startHour,startMinute);
                Time endTime = new Time(endHour,endMinute);
                Data.courseList.add(new Course(room,subject,department,lecturer,courseDate,startTime,endTime));
                Data.save();
                System.out.println(Data.courseList);
            }
        });
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Add a class");
        frame.setContentPane(new AddUI2().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

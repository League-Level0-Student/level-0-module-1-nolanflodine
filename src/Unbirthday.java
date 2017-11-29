import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
String jeff= JOptionPane.showInputDialog("When is your birthday in mm/dd/yy format?");
if (jeff.equals("11/29/17")){
	JOptionPane.showInputDialog("Happy Birthday!");
	}else { JOptionPane.showInputDialog("Have a very merry Unbirthday");

}
}
}

package J26;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class J268_memberframe extends JFrame {

	JPanel contentPane;
	JTextField textName, textID, textSex, textEmail;
	JButton buttonNext, buttonPrev, buttonEnd;

	public J268_memberframe() {
		contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(null);
		textID = new JTextField("");
		textID.setBounds(75, 60, 90, 28);
		textName = new JTextField("");
		textName.setBounds(75, 90, 90, 28);
		textSex = new JTextField("");
		textSex.setBounds(75, 120, 90, 28);
		textEmail = new JTextField("");
		textEmail.setBounds(75, 150, 90, 28);
		buttonPrev = new JButton("上一筆");
		buttonPrev.setBounds(5, 190, 80, 35);
		buttonNext = new JButton("下一筆");
		buttonNext.setBounds(90, 190, 80, 35);
		buttonEnd = new JButton("結束");
		buttonEnd.setBounds(175, 190, 80, 35);
		contentPane.add(textID);
		contentPane.add(textName);
		contentPane.add(textSex);
		contentPane.add(textEmail);
		contentPane.add(buttonPrev);
		contentPane.add(buttonNext);
		contentPane.add(buttonEnd);
		this.setBounds(200, 100, 280, 300);
		this.setTitle("會員資料");
		this.setVisible(true);
	}
}

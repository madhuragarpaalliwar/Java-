import java.awt.*; import java.awt.event.*; import javax.swing.*;

public class StudentRegistration extends JFrame implements ActionListener {

JLabel nameLabel, rollLabel, marksLabel, resultLabel;
JTextField nameField, rollField, marksField; JButton submitButton;

StudentRegistration() {

nameLabel = new JLabel("Enter Name:"); rollLabel = new JLabel("Enter Roll
Number:");
marksLabel = new JLabel("Enter Marks:"); resultLabel = new JLabel("");

nameField = new JTextField(15); rollField = new JTextField(15); marksField = new JTextField(15);

submitButton = new JButton("Submit");
submitButton.addActionListener(this); setLayout(new FlowLayout());
add(nameLabel); add(nameField);

add(rollLabel); add(rollField);

add(marksLabel); add(marksField);

add(submitButton); add(resultLabel);

setTitle("Student Registration"); setSize(350, 250);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setVisible(true);
}

public void actionPerformed(ActionEvent e) {

String name = nameField.getText(); String roll = rollField.getText(); String marksText = marksField.getText();

// Check whether fields are empty
if (name.isEmpty() || roll.isEmpty() || marksText.isEmpty()) {
resultLabel.setText("Please fill all
fields");
return;
}

// Convert marks into integer
int marks = Integer.parseInt(marksText);

// Calculate grade String grade;

if (marks >= 90) { grade = "A+";
} else if (marks >= 80) { grade = "A";
} else if (marks >= 70) { grade = "B";
} else if (marks >= 60) { grade = "C";
} else if (marks >= 50) { grade = "D";
} else {
grade = "F";
}

// Display result resultLabel.setText(
"Name: " + name + " Roll: " + roll +
" Marks: " + marks + " Grade: " + grade
);
}

public static void main(String[] args) { new StudentRegistration();
}
}



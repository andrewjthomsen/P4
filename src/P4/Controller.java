package P4;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField grade;
    @FXML
    private Label letter;

    // Method for calculating grade
    public void calculateGrade() {
        int x = Integer.parseInt(grade.getText());
        // Determine which grade by value of x
        if (x > 95) {
            letter.setText("A");
        }
        if (x < 96 && x > 89) {
            letter.setText("A-");
        }
        if (x < 90 && x > 86) {
            letter.setText("B+");
        }
        if (x < 87 && x > 83) {
            letter.setText("B");
        }
        if (x < 84 && x > 79) {
            letter.setText("B-");
        }
        if (x < 80 && x > 76) {
            letter.setText("C+");
        }
        if (x < 77 && x > 73) {
            letter.setText("C");
        }
        if (x < 74 && x > 69) {
            letter.setText("C-");
        }
        if (x < 70 && x > 66) {
            letter.setText("D+");
        }
        if (x < 67 && x > 63) {
            letter.setText("D");
        }
        if (x < 64 && x > 59) {
            letter.setText("D-");
        }
        if (x < 60) {
            letter.setText("F");
        }

    }
}

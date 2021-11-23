package calculator;

import org.mariuszgromada.math.mxparser.*;

public class Calculator {

    String screen = "";

    public void addToScreen(String s) {
        this.screen += s;
    }

    public String getScreen() {
        return this.screen;
    }

    public String eval() {

        if (this.screen.length() > 0) {
            Expression e = new Expression(this.screen);
            String output = String.valueOf(e.calculate());
            this.screen = "";
            return output;
        } else {
            return null;
        }

    }
    
    public void clearScreen() {
        this.screen = "";
    }

}

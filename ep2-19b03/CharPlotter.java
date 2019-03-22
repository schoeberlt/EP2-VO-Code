public class CharPlotter {

    private char[][] sheet;
    private boolean penDown = false;
    private char draw = ' ';
    private int x, y;

    // Create a CharPlotter drawing on a sheet of size 'xSize x ySize'.
    // Requires xSize > 0 and ySize > 0.
    public CharPlotter(int xSize, int ySize) {
        assert xSize > 0 && ySize > 0;
        sheet = new char[ySize][xSize];
        for (char[] line : sheet) {
            for (int i = 0; i < line.length; i++) {
                line[i] = ' ';
            }
        }
    }

    // Change the char to be drawn when the pen is down to 'draw'.
    // The char used for drawing before is returned.
    public char changeDraw(char draw) {
        char old = this.draw;
        this.draw = draw;
        return old;
    }

    // From now on each move of the pen draws chars on the sheet.
    public void penDown() {
        this.penDown = true;
    }

    // From now on nothing is drawn when moving the pen.
    public void penUp() {
        this.penDown = false;
    }

    // Move 'n' positions on the x-axis (positive values to the right, negative values to the left).
    // If the pen is down, put the char to be drawn on every visited position (including start and end positions).
    // Otherwise the position is changed, but nothing is drawn.
    // Movement stops at the smallest (to the left) or largest (to the right) index even after moving less than 'n' steps.
    // The result is the current index on the x-axis after movement.
    public int xMove(int n) {
        int end = x + n;
        if (n > 0) {
            if (end >= sheet[0].length) {
                end = sheet[0].length - 1;
            }
            if (penDown) {
                do {
                    sheet[y][x] = draw;
                } while (++x <= end);
            }
        } else {
            if (end < 0) {
                end = 0;
            }
            if (penDown) {
                do {
                    sheet[y][x] = draw;
                } while (--x >= end);
            }
        }
        x = end;
        return x;
    }

    // Move 'n' positions on the y-axis (positive values upward, negative values downwards).
    // If the pen is down, put the char to be drawn on every visited position (including start and end positions).
    // Otherwise the position is changed, but nothing is drawn.
    // Movement stops at the smallest (downward) or largest (upward) index even after moving less than 'n' steps.
    // The result is the current index on the y-axis after movement.
    public int yMove(int n) {
        int end = y + n;
        if (n > 0) {
            if (end >= sheet.length) {
                end = sheet.length - 1;
            }
            if (penDown) {
                do {
                    sheet[y][x] = draw;
                } while (++y <= end);
            }
        } else {
            if (end < 0) {
                end = 0;
            }
            if (penDown) {
                do {
                    sheet[y][x] = draw;
                } while (--y >= end);
            }
        }
        y = end;
        return y;
    }

    // Print the sheet on standard output.
    public void print() {
        for (int i = sheet.length - 1; i >= 0; i--) {
            for (char c : sheet[i]) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

}

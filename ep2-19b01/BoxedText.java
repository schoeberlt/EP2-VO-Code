/*****************************************************
 * Rectangular text within border lines.
 * Width and height of the text are initially 0.
 * Valid indexes for lines range from 0 to height - 1.
 *****************************************************/
public class BoxedText {

    private int textWidth = 0;
    private int textHeight = 0;
    private char[][] text = new char[0][];

    // Sets new text width and height to specified values.
    // Text existing so far is replaced with blank (' ').
    // Requires: width >= 0 and height >= 0.
    public void newDimensions(int width, int height) {
        textWidth = width;
        textHeight = height;
        text = new char[height][width];
        for (char[] line : text) {
            fill(line, 0);
        }
    }

    // Fills line 'index' with 'txt'.
    // If 'txt' is longer than the text width, additional characters are ignored.
    // If 'txt' is shorter, the line is filled with ' '.
    // If 'txt' contains a line break, all text in 'txt' following the line break is ignored.
    // Requires: index >= 0 and index < text height.
    public void setLine(int index, String txt) {
        int i = 0;
        if (txt != null) {
            int m = Math.min(textWidth, txt.length());
            while (i < m && txt.charAt(i) != '\n') {
                text[index][i] = txt.charAt(i++);
            }
        }
        fill(text[index], i);
    }

    // Fill the rest of the given line (of length textWidth) with ' ' starting at index i.
    private void fill(char[] line, int i) {
        for (; i < textWidth; i++) {
            line[i] = ' ';
        }
    }

    // Prints boxed text to standard output.
    // For example, if width is 2, height is 1 and text at line 0 is "ab", the output looks like:
    // ----
    // |ab|
    // ----
    public void print() {
        System.out.println(toString());
    }

    // Returns the same text as printed by 'print' (without line break at the end).
    public String toString() {
        String horizontal = "--";
        for (int i = 0; i < textWidth; i++) {
            horizontal += "-";
        }
        String result = horizontal + "\n";
        for (char[] line : text) {
            result += "|";
            for (char c : line) {
                result += c;
            }
            result += "|\n";
        }
        return result + horizontal;
    }

}

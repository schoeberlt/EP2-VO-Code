/*****************************************************
 * Rectangular text within border lines.
 * Width and height of the text are initially 0.
 * Valid indexes for lines range from 0 to height - 1.
 *****************************************************/
public interface AbstrBoxed {

    // Sets new text width and height to specified values.
    // Text existing so far is replaced with blank (' ').
    // Requires: width >= 0 and height >= 0.
    void newDimensions(int width, int height);

    // Fills line 'index' with 'txt'.
    // If 'txt' is longer than the text width, additional characters are ignored.
    // If 'txt' is shorter, the line is filled with ' '.
    // If 'txt' contains a line break, all text in 'txt' following the line break is ignored.
    // Requires: index >= 0 and index < text height.
    void setLine(int index, String txt);

    // Prints boxed text to standard output.
    // For example, if width is 2, height is 1 and text at line 0 is "ab", the output looks like:
    // ----
    // |ab|
    // ----
    void print();

    // Returns the same text as printed by 'print' (without line break at the end).
    String toString();
    }

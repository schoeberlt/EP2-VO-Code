/*****************************************************
 * Setting up rectangular text.
 * Width and height of the text are initially 0.
 * Valid indexes for lines range from 0 to height - 1.
 *****************************************************/
public interface SetBoxed {

    // Sets new text width and height to specified values.
    // Requires: width >= 0 and height >= 0.
    void newDimensions(int width, int height);

    // Fills line 'index' with 'txt'.
    // If 'txt' is longer than the text width, additional characters are ignored.
    // If 'txt' is shorter, the line is filled with ' '.
    // If 'txt' contains a line break, all text in 'txt' following the line break is ignored.
    // Requires: index >= 0 and index < text height.
    void setLine(int index, String txt);

}

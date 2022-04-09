public class GrayImage
{
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    /** The 2-dimensional representation of this image.
     *  Guaranteed not to be null.
     *  All values in the array are within the range
     *  [BLACK, WHITE], inclusive.
     */
    private int[][] pixelValues;

    /** constructor that takes a 2D array */
    public GrayImage(int[][] theArray)
    {
        pixelValues = theArray;
    }

    /** @return the total number of white pixels in
     *    this image.
     * Postcondition: this image has not been changed.
     */
    public int countWhitePixels()
    {
        int count=0;
        for(int r=0;r<pixelValues.length;r++){
            for(int c=0;c<pixelValues[0].length;c++){
                if(pixelValues[r][c]==WHITE) count++;
            }
        }
        return count;
    }

    /** Processes this image in row-major order and
     *  decreases the value of each pixel at position (row, col)
     *  by the value of the pixel at position (row + 2, col + 2)
     *  if it exists.
     * Resulting values that would be less than BLACK are replaced
     *   by BLACK.
     * Pixels for which there is no pixel at
     *   position (row + 2, col + 2) are unchanged.
     */
    public void processImage()
    {
        for(int r=0;r<pixelValues.length-2;r++){
            for(int c=0;c<pixelValues[0].length-2;c++){
                pixelValues[r][c]-=pixelValues[r+2][c+2];
                if(pixelValues[r][c]<BLACK) pixelValues[r][c]=BLACK;
            }
        }
    }

    public void printValues()
    {
        for (int r = 0; r < pixelValues.length; r++)
        {
            for (int c = 0; c < pixelValues[0].length; c++)
            {
                System.out.print(pixelValues[r][c] + ", ");
            }
            System.out.println();
        }
    }

    /** main for testing */
    public static void main (String[] args)
    {
        int[][] values = { {221, 184, 178, 84, 135},
                {84, 255, 255, 130, 84},
                {78, 255, 0, 0, 78},
                {84, 130, 255, 130, 84}};
        GrayImage image = new GrayImage(values);
        image.printValues();
        image.processImage();
        System.out.println("after process image");
        image.printValues();
    }
}

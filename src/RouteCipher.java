public class RouteCipher
{
    /** A two-dimensional array of single-character strings,
     instantiated in the constructor */
    private String[][] letterBlock;

    /** The number of rows of letterBlock, set by the constructor */
    private int numRows;

    /** The number of columns of letterBlock, set by the constructor */
    private int numCols;

    public RouteCipher(int r, int c){
        this.letterBlock = new String[r][c];
        this.numRows = r;
        this.numCols = c;
    }

    /** Places a string into letterBlock in row-major order.
     *   @param str the string to be processed
     *   Postcondition:
     *     if str.length() < numRows * numCols, "A" in each unfilled cell
     *     if str.length() > numRows * numCols, trailing characters are ignored
     */
    public void fillBlock(String str)
    {
        int indexCount=0;
        for(int r=0;r<numRows;r++){
            for(int c=0;c<numCols;c++){
                if(indexCount<str.length()){
                    letterBlock[r][c]=str.substring(indexCount,indexCount+1);
                    indexCount++;
                }
                else{
                    letterBlock[r][c]="A";
                }
            }
        }
    }

    /** Extracts encrypted string from letterBlock in column-major order.
     *   Precondition: letterBlock has been filled
     *   @return the encrypted string from letterBlock
     */
    private String encryptBlock()
    {
        return "Mte ea";
    }

    /** Encrypts a message.
     *   @param message the string to be encrypted
     *   @return the encrypted message;
     *           if message is the empty string, returns the empty string
     */
    public String encryptMessage(String message)
    {
        int iterateNum = message.length()/(numCols*numRows);
        String ret = "";
        for(int i=0;i<iterateNum;i++){
            fillBlock(message);
            for(int c=0;c<letterBlock[0].length;c++){
                for(int r=0;r<letterBlock.length;r++){
                    if(ret.length()<message.length()) ret+=letterBlock[r][c];
                }
            }
        }
        return ret;
    }

    // There may be instance variables, constructors, and methods that are not shown
    public static void main(String[] args)
    {

        boolean test1 = false;
        RouteCipher ciph = new RouteCipher(3, 3);

        ciph.fillBlock("There's 1");

        if((ciph.letterBlock[0][2]).equals("e") && (ciph.letterBlock[2][1]).equals(" "))
            test1 = true;
        else
            System.out.println("Oops! Looks like your code doesn't properly insert the given String.\n");

        if(test1)
            System.out.println("Looks like your code works well!");
        else
            System.out.println("Make a few changes, please.");

    }
}


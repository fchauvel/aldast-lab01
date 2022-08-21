package no.ntnu.idata2302.lab01;


public class Triangle {


    /**
     * Draw a triangle with the given height using the given buffer.
     */
    public static void createTriangle (int height,
                                       StringBuffer buffer) {
        // TODO: Provide an implementation
    }


    /**
     * This main program can help you debug your program
     */
    public static void main(String[] args) {
        int height = 10;
        if (args.length > 0) {
            try {
                height = Integer.parseInt(args[0]);
            } catch (Exception error) {
                System.out.println("Unable to read height from '" + args[0] + "'");
            }
        }

        StringBuffer buffer = new StringBuffer();
        createTriangle(height, buffer);
        System.out.print(buffer.toString());
    }

}

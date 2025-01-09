public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 200;    //gryffindor points
        int ravenclaw = 400;    //ravenclaw points
        int c = gryffindor - ravenclaw;
        if (c >= 300)
        {
            System.out.println("Gryffindor takes the house cup!");
        }
        else if ((c >= 0 ) && (c < 300))
        {
            System.out.println("In second place, Gryffindor!");
        }
        else if (Math.abs(c) < 100)
        {
            System.out.println("In third place, Gryffindor!");
        }
        else
        {
            System.out.println("In fourth place, Gryffindor!");
        }
        // int margin = amount of points by which gryffindor scored over ravenclaw;
        
    }
}

public class WorldMap
{ 
    public static void main(String[] args) {
        int x0 = StdIn.readInt();
        int y0 = StdIn.readInt();
        StdDraw.setCanvasSize(x0, y0);
        StdDraw.setXscale(0, x0);
        StdDraw.setYscale(0, y0);
        StdDraw.setPenRadius(0.005);
        while (!StdIn.isEmpty()) 
        {
              String place = StdIn.readString();
              int v = StdIn.readInt();
              double[] x = new double[v];
              double[] y = new double[v];
              for(int i=0;i<v;i++)
              {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
              }
              StdDraw.polygon(x,y);
        }
        StdDraw.show();
    }
}

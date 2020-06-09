import java.util.Arrays;

public class BarChartRacer {
    public static void main(String[] args) {
        // StdAudio.loop("soundtrackA.wav");

        StdDraw.setCanvasSize(1000, 700);
        StdDraw.enableDoubleBuffering();

        String filename = args[0];
        int k = Integer.parseInt(args[1]);

        In in = new In(filename);
        String title = in.readLine();
        String xAxis = in.readLine();
        String source = in.readLine();
        in.readLine(); 
        BarChart c = new BarChart(title, xAxis, source);
        while (in.hasNextLine()) {
            int n = Integer.parseInt(in.readLine());

            Bar[] bars = new Bar[n];
            String caption = "";

            for (int i = 0; i < n; i++) {
                String temp = in.readLine();
                String[] a = temp.split(",");
                bars[i] = new Bar(a[1], Integer.parseInt(a[3]), a[4]);
                caption = a[0];
            }
            Arrays.sort(bars);

            c.setCaption(caption);
            for (int i = bars.length - 1; i > bars.length - 1 - k; i--) {
                c.add(bars[i].getName(), bars[i].getValue(), bars[i].getCategory());
            }

            StdDraw.clear();
            c.draw();
            StdDraw.show();
            StdDraw.pause(0);
            c.reset();

            in.readLine(); // blank line
        }
        c.reset();
    }
}
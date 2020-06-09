import java.awt.Color;
public class KernelFilter {

    // Returns a new picture that applies a Gaussian blur filter to the given picture.
    public static Picture gaussian(Picture picture)
    {
        int w = picture.width();
        int h = picture.height();
        Picture pict = new Picture(w,h);
        Color[][] color = new Color[w+2][h+2];
        for (int i = 0; i <w; i++) 
        {
            for (int j = 0; j < h; j++)
            {
                color[i+1][j+1] = picture.get(i, j);
            }
        }
        for(int j = 1;j<=h;j++)
            {
                color[0][j] = color[w][j];
                color[w+1][j] = color[1][j];
            }
        for(int j = 0;j<w+2;j++)
            {
                color[j][0] = color[j][h];
                color[j][h+1] = color[j][1];
            }
        for (int y = 1; y <=h; y++) 
        {
            for (int x = 1; x <=w; x++) 
            {
                Color c00 = color[x-1][y-1];
                Color c01 = color[x-1][y];
                Color c02 = color[x-1][y+1];
                Color c10 = color[x][y-1];
                Color c11 = color[x][y];
                Color c12 = color[x][y+1];
                Color c20 = color[x+1][y-1];
                Color c21 = color[x+1][y];
                Color c22 =  color[x+1][y+1];
                int r = c00.getRed() +   2*c01.getRed() + c02.getRed() +
                        +2*c10.getRed() + 4*c11.getRed() + 2*c12.getRed() +
                        +c20.getRed() +   2*c21.getRed() + c22.getRed();
                int g = c00.getGreen() +  2*c01.getGreen() + c02.getGreen() +
                        +2*c10.getGreen() + 4*c11.getGreen() + 2*c12.getGreen() +
                        c20.getGreen() +   2*c21.getGreen() + c22.getGreen();
                int b = c00.getBlue() +   2*c01.getBlue() + c02.getBlue() +
                        +2*c10.getBlue() + 4*c11.getBlue() + 2*c12.getBlue() +
                        +c20.getBlue() +   2*c21.getBlue() + c22.getBlue();
                r = (int)Math.round(r/16.0);
                g = (int)Math.round(g/16.0);
                b = (int)Math.round(b/16.0);
                Color c = new Color(r, g, b);
                pict.set(x-1, y-1, c);
            }
        }
        return pict;
    }
    // Returns a new picture that applies a sharpen filter to the given picture.
    public static Picture sharpen(Picture picture)
    {
        int w = picture.width();
        int h = picture.height();
        Picture pict = new Picture(w,h);
        Color[][] color = new Color[w+2][h+2];
        for (int i = 0; i <w; i++) 
        {
            for (int j = 0; j < h; j++)
            {
                color[i+1][j+1] = picture.get(i, j);
            }
        }
        for(int j = 1;j<=h;j++)
            {
                color[0][j] = color[w][j];
                color[w+1][j] = color[1][j];
            }
        for(int j = 0;j<w+2;j++)
            {
                color[j][0] = color[j][h];
                color[j][h+1] = color[j][1];
            }
        for (int y = 1; y <=h; y++) 
        {
            for (int x = 1; x <=w; x++) 
            {
                Color c00 = color[x-1][y-1];
                Color c01 = color[x-1][y];
                Color c02 = color[x-1][y+1];
                Color c10 = color[x][y-1];
                Color c11 = color[x][y];
                Color c12 = color[x][y+1];
                Color c20 = color[x+1][y-1];
                Color c21 = color[x+1][y];
                Color c22 =  color[x+1][y+1];
                int r = 0*c00.getRed() -   1*c01.getRed() + 0*c02.getRed() +
                        -1*c10.getRed() + 5*c11.getRed() - 1*c12.getRed() +
                        +0*c20.getRed() - 1*c21.getRed() + 0*c22.getRed();
                int g = 0*c00.getGreen() -  1*c01.getGreen() + 0*c02.getGreen() +
                        -1*c10.getGreen() + 5*c11.getGreen() - 1*c12.getGreen() +
                        +0*c20.getGreen() -   1*c21.getGreen() + 0*c22.getGreen();
                int b = 0*c00.getBlue() -   1*c01.getBlue() + 0*c02.getBlue() +
                        -1*c10.getBlue() + 5*c11.getBlue() - 1*c12.getBlue() +
                        +0*c20.getBlue() -  1*c21.getBlue() + 0*c22.getBlue();
                r = Math.min(255, Math.max(0, r));
                g = Math.min(255, Math.max(0, g));
                b = Math.min(255, Math.max(0, b));
                Color c = new Color(r, g, b);
                pict.set(x-1, y-1, c);
            }
        }
        return pict;
    }
    // Returns a new picture that applies an Laplacian filter to the given picture.
    public static Picture laplacian(Picture picture)
    {
        int w = picture.width();
        int h = picture.height();
        Picture pict = new Picture(w,h);
        Color[][] color = new Color[w+2][h+2];
        for (int i = 0; i <w; i++) 
        {
            for (int j = 0; j < h; j++)
            {
                color[i+1][j+1] = picture.get(i, j);
            }
        }
        for(int j = 1;j<=h;j++)
            {
                color[0][j] = color[w][j];
                color[w+1][j] = color[1][j];
            }
        for(int j = 0;j<w+2;j++)
            {
                color[j][0] = color[j][h];
                color[j][h+1] = color[j][1];
            }
        for (int y = 1; y <=h; y++) 
        {
            for (int x = 1; x <=w; x++) 
            {
                Color c00 = color[x-1][y-1];
                Color c01 = color[x-1][y];
                Color c02 = color[x-1][y+1];
                Color c10 = color[x][y-1];
                Color c11 = color[x][y];
                Color c12 = color[x][y+1];
                Color c20 = color[x+1][y-1];
                Color c21 = color[x+1][y];
                Color c22 =  color[x+1][y+1];
                int r = -c00.getRed() -   c01.getRed() - c02.getRed() +
                        -c10.getRed() + 8*c11.getRed() - c12.getRed() +
                        -c20.getRed() -   c21.getRed() - c22.getRed();
                int g = -c00.getGreen() -   c01.getGreen() - c02.getGreen() +
                        -c10.getGreen() + 8*c11.getGreen() - c12.getGreen() +
                        -c20.getGreen() -   c21.getGreen() - c22.getGreen();
                int b = -c00.getBlue() -   c01.getBlue() - c02.getBlue() +
                        -c10.getBlue() + 8*c11.getBlue() - c12.getBlue() +
                        -c20.getBlue() -   c21.getBlue() - c22.getBlue();
                r = Math.min(255, Math.max(0, r));
                g = Math.min(255, Math.max(0, g));
                b = Math.min(255, Math.max(0, b));
                Color c = new Color(r, g, b);
                pict.set(x-1, y-1, c);
            }
        }
        return pict;
    }

    // Returns a new picture that applies an emboss filter to the given picture.
    public static Picture emboss(Picture picture)
    {
    	int w = picture.width();
        int h = picture.height();
        Picture pict = new Picture(w,h);
        Color[][] color = new Color[w+2][h+2];
        for (int i = 0; i <w; i++) 
        {
            for (int j = 0; j < h; j++)
            {
                color[i+1][j+1] = picture.get(i, j);
            }
        }
        for(int j = 1;j<=h;j++)
            {
                color[0][j] = color[w][j];
                color[w+1][j] = color[1][j];
            }
        for(int j = 0;j<w+2;j++)
            {
                color[j][0] = color[j][h];
                color[j][h+1] = color[j][1];
            }
        for (int y = 1; y <=h; y++) 
        {
            for (int x = 1; x <=w; x++) 
            {
                Color c00 = color[x-1][y-1];
                Color c01 = color[x-1][y];
                Color c02 = color[x-1][y+1];
                Color c10 = color[x][y-1];
                Color c11 = color[x][y];
                Color c12 = color[x][y+1];
                Color c20 = color[x+1][y-1];
                Color c21 = color[x+1][y];
                Color c22 =  color[x+1][y+1];        
                int r = -2*c00.getRed() -   1*c01.getRed() + 0*c02.getRed() +
                        -1*c10.getRed() + 1*c11.getRed() + 1*c12.getRed() +
                        +0*c20.getRed() + 1*c21.getRed() + 2*c22.getRed();
                int g = -2*c00.getGreen() -  1*c01.getGreen() + 0*c02.getGreen() +
                        -1*c10.getGreen() + 1*c11.getGreen() + 1*c12.getGreen() +
                        +0*c20.getGreen() +   1*c21.getGreen() + 2*c22.getGreen();
                int b = -2*c00.getBlue() -   1*c01.getBlue() + 0*c02.getBlue() +
                        -1*c10.getBlue() + 1*c11.getBlue() + 1*c12.getBlue() +
                        +0*c20.getBlue() +  1*c21.getBlue() + 2*c22.getBlue();
                r = Math.min(255, Math.max(0, r));
                g = Math.min(255, Math.max(0, g));
                b = Math.min(255, Math.max(0, b));
                Color c = new Color(r, g, b);
                pict.set(x-1, y-1, c);
            }
        }
        return pict;

    }

    // Returns a new picture that applies a motion blur filter to the given picture.
    public static Picture motionBlur(Picture picture)
    {
        int w = picture.width();
        int h = picture.height();
        //filter = {{1,0,0,0,0,0,0,0,0},{0,1,0,0,0,0,0,0,0},{0,0,1,0,0,0,0,0,0},{0,0,0,1,0,0,0,0,0},{0,0,0,0,1,0,0,0,0},{0,0,0,0,0,1,0,0,0},{0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,0},{0,0,0,0,0,0,0,0,1}}
        Picture pict = new Picture(w,h);
        Color[][] color = new Color[w+8][h+8];
        for (int i = 0; i < w; i++) 
        {
            for (int j = 0; j < h; j++)
            {
                color[i+4][j+4] = picture.get(i, j);
            }
        }
        for(int j = 4;j<=h+3;j++)
            {
                color[3][j] = color[w+3][j];
                color[2][j] = color[w+2][j];
                color[1][j] = color[w+1][j];
                color[0][j] = color[w][j];
                color[w+4][j] = color[4][j];
                color[w+5][j] = color[5][j];
                color[w+6][j] = color[6][j];
                color[w+7][j] = color[7][j];
            }
        for(int j = 0;j<w+8;j++)
            {
                color[j][3] = color[j][h+3];
                color[j][2] = color[j][h+2];
                color[j][1] = color[j][h+1];
                color[j][0] = color[j][h];
                color[j][h+4] = color[j][4];
                color[j][h+5] = color[j][5];
                color[j][h+6] = color[j][6];
                color[j][h+7] = color[j][7];
            }
        for (int y = 4; y <h+4; y++) 
        {
            for (int x = 4; x <w+4; x++) 
            {
                Color c00 = color[x-4][y-4];Color c01 = color[x-4][y-3];Color c02 = color[x-4][y-2];Color c03 = color[x-4][y-1];Color c04 = color[x-4][y];Color c05 = color[x-4][y+1];Color c06 = color[x-4][y+2];Color c07 = color[x-4][y+3];Color c08 = color[x-4][y+4];
                Color c10 = color[x-3][y-4];Color c11 = color[x-3][y-3];Color c12 = color[x-3][y-2];Color c13 = color[x-3][y-1];Color c14 = color[x-3][y];Color c15 = color[x-3][y+1];Color c16 = color[x-3][y+2];Color c17 = color[x-3][y+3];Color c18 = color[x-3][y+4];
                Color c20 = color[x-2][y-4];Color c21 = color[x-2][y-3];Color c22 = color[x-2][y-2];Color c23 = color[x-2][y-1];Color c24 = color[x-2][y];Color c25 = color[x-2][y+1];Color c26 = color[x-2][y+2];Color c27 = color[x-2][y+3];Color c28 = color[x-2][y+4];
                Color c30 = color[x-1][y-4];Color c31 = color[x-1][y-3];Color c32 = color[x-1][y-2];Color c33 = color[x-1][y-1];Color c34 = color[x-1][y];Color c35 = color[x-1][y+1];Color c36 = color[x-1][y+2];Color c37 = color[x-1][y+3];Color c38 = color[x-1][y+4];
                Color c40 = color[x][y-4];Color c41 = color[x][y-3];Color c42 = color[x][y-2];Color c43 = color[x][y-1];Color c44 = color[x][y];Color c45 = color[x][y+1];Color c46 = color[x][y+2];Color c47 = color[x][y+3];Color c48 = color[x][y+4];
                Color c50 = color[x+1][y-4];Color c51 = color[x+1][y-3];Color c52 = color[x+1][y-2];Color c53 = color[x+1][y-1];Color c54 = color[x+1][y];Color c55 = color[x+1][y+1];Color c56 = color[x+1][y+2];Color c57 = color[x+1][y+3];Color c58 = color[x+1][y+4];
                Color c60 = color[x+2][y-4];Color c61 = color[x+2][y-3];Color c62 = color[x+2][y-2];Color c63 = color[x+2][y-1];Color c64 = color[x+2][y];Color c65 = color[x+2][y+1];Color c66 = color[x+2][y+2];Color c67 = color[x+2][y+3];Color c68 = color[x+2][y+4];
                Color c70 = color[x+3][y-4];Color c71 = color[x+3][y-3];Color c72 = color[x+3][y-2];Color c73 = color[x+3][y-1];Color c74 = color[x+3][y];Color c75 = color[x+3][y+1];Color c76 = color[x+3][y+2];Color c77 = color[x+3][y+3];Color c78 = color[x+3][y+4];
                Color c80 = color[x+4][y-4];Color c81 = color[x+4][y-3];Color c82 = color[x+4][y-2];Color c83 = color[x+4][y-1];Color c84 = color[x+4][y];Color c85 = color[x+4][y+1];Color c86 = color[x+4][y+2];Color c87 = color[x+4][y+3];Color c88 = color[x+4][y+4];                
                int r = c00.getRed() + c11.getRed() + c22.getRed() +c33.getRed() + c44.getRed() + c55.getRed() +c66.getRed() + c77.getRed() + c88.getRed();
                int g = c00.getGreen() + c11.getGreen() + c22.getGreen() +c33.getGreen() + c44.getGreen() + c55.getGreen() +c66.getGreen() +   c77.getGreen() + c88.getGreen();
                int b = c00.getBlue() + c11.getBlue() + c22.getBlue() + c33.getBlue() + c44.getBlue() + c55.getBlue() + c66.getBlue() +  c77.getBlue() + c88.getBlue();
                r = (int)Math.round(r/9.0);
                g = (int)Math.round(g/9.0);
                b = (int)Math.round(b/9.0);
                Color c = new Color(r, g, b);
                pict.set(x-4, y-4, c);
            }
        }
        return pict;
    }

    // Test client (ungraded).
    public static void main(String[] args)
    {
        Picture pic = new Picture(args[0]);
        int width    = pic.width();
        int height   = pic.height();
        Picture picture1 = new Picture(width, height);
        Picture picture2 = new Picture(width, height);
        Picture picture3 = new Picture(width, height);
        Picture picture4 = new Picture(width, height);
        Picture picture5 = new Picture(width, height);
        picture1 = gaussian(pic);
        picture2 = sharpen(pic);
        picture3 = laplacian(pic);
        picture4 = emboss(pic);
        picture5 = motionBlur(pic);
        //picture1.show();
        //picture2.show();
        //picture3.show();
        //picture4.show();
        //picture5.show();
    }
}
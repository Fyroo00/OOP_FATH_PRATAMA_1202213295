

public class Calculation {
    double fnum, snum, tnum, luas, keliling;

    public void square(){
        
        luas = fnum * fnum;
        keliling = fnum + fnum + fnum + fnum;
        System.out.println(luas);
        System.out.println(keliling);
    }
    public void circle(){
        luas = (fnum * fnum) * Math.PI;
        keliling = 2 * Math.PI * fnum;
        System.out.println(luas);
        System.out.println(keliling);
    }
    public void Trapezoid(){
        luas = 0.5 * (fnum + snum)*tnum;
        System.out.println(luas);
    }
}


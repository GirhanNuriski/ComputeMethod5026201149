import java.util.*;

public class ComputeMethod5026201149 {

    public double fToc (double degreeF) {
        return (degreeF - 32 * (5.0 / 9));
    }
    public double hypothenuse (int a, int b){
        return (Math.sqrt(a*a + b*b));
    }
    public int roll (){
        Random random  = new Random();
        return (random.nextInt(6)+ 1 + random.nextInt(6)+1);
    }
}






public class Difference {

    private int[] elements;
    public int maximumDifference;

    Difference(int[] __elements){
                this.elements = __elements;
    }

    void computeDifference(){
            for(int i = 0; i < elements.length; i++) {
                for (int j = 0; j < elements.length; j++) {
                    int tDifference = (elements[i] <= elements[j]) ? (elements[j] - elements[i]) :
                            (elements[i] - elements[j]);
                    if (tDifference >= maximumDifference)
                        maximumDifference = tDifference;
                }
            }
    }
}

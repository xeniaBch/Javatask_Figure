package Figures.Model;

import java.util.Comparator;

public class FigureSquareComparator implements Comparator <Figure> {
    @Override
    public int compare(Figure f1, Figure f2) {
        if(f1.figureArea() > f2.figureArea()){
            return 1;
        } else if (f1.figureArea() < f2.figureArea()) {
            return -1;
        }
        return 0;
    }
}

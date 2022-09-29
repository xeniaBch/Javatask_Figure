package Klassendiagram.App;

import Figures.Model.Figure;
import Figures.Model.FigureSquareComparator;
import Klassendiagram.Class.Article;
import Klassendiagram.Class.ProductInMeters;
import Klassendiagram.Class.ProductsInPieces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Переопределить compareTo в классе Article (productManagementProjekt) таким образом, что бы он сортировал товары по их общей стоимости на складе.
        Article wallpaper = new ProductInMeters("Wallpaper", 1, 52, 400);
        Article linoleum = new ProductInMeters("Linoleum", 7, 300, 400);
        Article curtain = new ProductInMeters("Curtain", 20, 150, 250);
        Article door = new ProductsInPieces("Door", 400, 4);
        Article table = new ProductsInPieces("Table", 300, 3);

        List<Article> articles = new ArrayList<>();
        articles.add(wallpaper);
        articles.add(linoleum);
        articles.add(curtain);
        articles.add(door);
        articles.add(table);

        System.out.println("Articles sorted by sum to pay");
        Collections.sort(articles);
        System.out.println(articles);
    }


}

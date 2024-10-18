package uestc.book;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private List<Authors> Authors;
    private double price;
    private int qty=0;

    public Book(String name, List<Authors> authors, double price)
    {
        this.name=name;
        this.Authors=authors;
        this.price=price;
    }

    public Book(String name, List<Authors> authors, double price, int qty)
    {
        this.name=name;
        this.Authors=authors;
        this.price=price;
        this.qty=qty;
    }

    public String getName()
    {
        return this.name;
    }

    public List<Authors> getAuthors()
    {
        return Authors;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }

    public int getQty()
    {
        return this.qty;
    }

    public void setQty(int qty)
    {
        this.qty=qty;
    }

    public String toString()
    {
        return "Book[name="+this.name+", authors=Authors="+this.Authors+this.price+", qty="+this.qty+"]";
    }

    public String getAuthorsNames()
    {
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < Authors.size(); i++)
        {
            names.append(Authors.get(i).getName());
            if (i < Authors.size() - 1)
            {
                names.append(", ");
            }
        }
        return names.toString();
    }
}

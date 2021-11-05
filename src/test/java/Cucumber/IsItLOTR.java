package Cucumber;

public class IsItLOTR
{
    static String isItLotr(String filmTitle)
    {
        return "LOTR".equals(filmTitle) ? "saved" : "error";
    }
}

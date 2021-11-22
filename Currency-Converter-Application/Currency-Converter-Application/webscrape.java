package Classes;
import java.lang.*;
import java.util.*;
import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.FileWriter;

public class webscrape {
    public static void main(String[] args) {
        String p="";
        final String url = "https://www.corporateinformation.com/Currency-Exchange-Rates.aspx?c=840";
        try {
            final Document document = Jsoup.connect(url).get();
            FileWriter fw=new FileWriter("C:\\Users\\Sevakula Jyothi\\OneDrive\\Desktop\\out\\testout.txt");
            for (Element row : document.select("table.bodyTxt tr"))
            {

                //if (row.select("td:nth-of-type(1)").text().equals("")||row.select("td:nth-of-type(1)").text().equals("Currency"))
                //{
                    //continue;
                //}
                if(row.select("td:nth-of-type(1)").text().equals("Indian Rupee") ||
                        row.select("td:nth-of-type(1)").text().equals("Canadian Dollar") ||
                        row.select("td:nth-of-type(1)").text().equals("European Euro") ||
                        row.select("td:nth-of-type(1)").text().equals("Australian Dollar") ||
                        row.select("td:nth-of-type(1)").text().equals("Singapore Dollar")||
                        row.select("td:nth-of-type(1)").text().equals("Pakistani Rupee") ||
                        //row.select("td:nth-of-type(1)").text().equals("New Zealander Dollar") ||
                        row.select("td:nth-of-type(1)").text().equals("Japanese Yen") ||
                        row.select("td:nth-of-type(1)").text().equals("Mexican Peso") ||
                        row.select("td:nth-of-type(1)").text().equals("Indonesian Rupiah")||
                        row.select("td:nth-of-type(1)").text().equals("United Arab Emirates Dirham")
                )
                {
                    final String ticker =
                            row.select("td:nth-of-type(1)").text();
                    final String name =
                            row.select("td:nth-of-type(2)").text();
                    final String tempPrice =
                            row.select("td:nth-of-type(3)").text();
                    final String tempPrice1 =
                            tempPrice.replace(",", "");
                    //final double price = Double.parseDouble(tempPrice1);

                    p+=ticker +" "+ name +" "+ tempPrice1+"\n";
                    String q=ticker +" "+ name +" "+ tempPrice1+"\n";

                    System.out.println(q);
                }

            }

            fw.write(p);

            fw.close();

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
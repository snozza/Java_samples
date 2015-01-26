import java.util.*;

class HtmlParse {

  List<String> listItems = new ArrayList<String>();

  public List<String> htmlBeverage(String html) {

    int start = 0;
    String beverage;

    while (true) {
      int openP = html.indexOf("beverages");
      int closeP = html.indexOf("</o>", openP);
      int openLi = html.indexOf("<li>", start);
      if(openLi == -1 | openLi > closeP) break;
      int closeLi = html.indexOf("</li>", start+1);

      start = closeLi;

      beverage = html.substring(openLi+4, closeLi);
      listItems.add(beverage);
    }
    return listItems;
  }
}

class TestParse {
  public static void main(String args[]) {
    HtmlParse example = new HtmlParse();
    example.htmlBeverage("beverages<li>Andrew/Wendy/Mike</li>" + 
                          "<li>Coke</li></o>");
  }
}
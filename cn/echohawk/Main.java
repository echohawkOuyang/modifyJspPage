import java.io.*;
import org.jsoup.*;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
public class Main {
	public static void main(String[] args) {
		try {
			File file = new File("/git/job/src/main/webapp/pages/tms/workorder/orderList.jsp");
		    Document doc = Jsoup.parse(file, "UTF-8");
		    List<Stirng> querySeq = new ArrayList<>();
		    Elements eles = doc.getElementsByTag("table");
		    if(eles != null && eles.size() != 0) {
		    	Elements trEles = eles.get(0).getElementsByTag("tr");
		    	a :
		    	for(Element e : trEles) {
		    		Elements tdEles = e.getElementsByTag("td");
		    		for(Element s : tdEles) {
		    			Elements inputTag = s.getElementsByTag("input");
		    			if(inputTag != null && inputTag.size() != 0) {
		    				if("查询".equals(inputTag.val())) {
		    					break a;			
		    				}
		    				if(!"".equals(inputTag.val())) {
		    					if("searchBean.".contain(inputATag.val())) {
		    						
		    					}
		    					querySeq.add();
		    				}
			    			System.out.println(inputTag.val() + "didi");		    			
		    			}

		    		}
		    	}
		    }
		    System.out.println("没出错");
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}

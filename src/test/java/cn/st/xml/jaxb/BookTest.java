package cn.st.xml.jaxb;

import java.util.Date;

import org.junit.Test;

import cn.st.xml.jaxb.entity.Book;
import cn.st.xml.jaxb.util.JaxbUtil;

public class BookTest {
	@Test
	public void java2xml(){
		Book book = new Book();  
        book.setId(100l);  
        book.setAuthor("James");  
        book.setCalendar(new Date());  
//      book.setPrice(23.45f);   //默认是0.0  
          
        String str = JaxbUtil.convertToXml(book);  
        System.out.println(str);  
	}
	
	@Test
	public void xml2java() {  
        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +  
            "<book id=\"100\">" +  
            "    <author>James</author>" +  
            "  <price>23.45</price>" +  
             "   <calendar>2013-03-29T09:25:56.004+08:00</calendar>" +  
            "</book>";  
          
        Book book = JaxbUtil.converyToJavaBean(str, Book.class);  
        System.out.println(book);  
    }  
}

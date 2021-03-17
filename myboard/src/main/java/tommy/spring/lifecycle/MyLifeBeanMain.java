package tommy.spring.lifecycle;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class MyLifeBeanMain {
	public static void main(String[] args) {
			AbstractApplicationContext factory = 
			new GenericXmlApplicationContext("applicationContext.xml");
			MyLifeBean bean = (MyLifeBean) factory.getBean("myLifeBean");
			bean.sayHello();
			factory.close();

	}
}

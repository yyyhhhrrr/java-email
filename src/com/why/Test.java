package com.why;

import java.text.SimpleDateFormat;
import java.util.Date;

//afbsmfydrzqicafi   wfcsaoilwgzwbicd
public class Test {
public static void main(String[] args) {
	MailSenderInfo mailInfo = new MailSenderInfo();    
  //�������ַ
    mailInfo.setMailServerHost("smtp.qq.com");    
    mailInfo.setMailServerPort("587");  //465  
    mailInfo.setValidate(true);    
    mailInfo.setUserName("562605133");    
    //��Ѷ smtp ʶ���� wfcsaoilwgzwbicd
    mailInfo.setPassword("lobhxvlvxnadbfeb");//������������    //afbsmfydrzqicafi
    mailInfo.setFromAddress("562605133@qq.com");    
    mailInfo.setToAddress("562605133@qq.com");    
    boolean flag=true;
    	Date date = new Date();
    	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        mailInfo.setContent("I Love You "+format.format(date));    
        mailInfo.setSubject("����������ʼ�");
           //�������Ҫ�������ʼ�   
        SimpleMailSender sms = new SimpleMailSender();   
        flag= sms.sendTextMail(mailInfo);//���������ʽ    
      System.out.println("���ͳɹ�");
        //sms.sendHtmlMail(mailInfo);//����html��ʽ   
}
}
package com.why;

import java.text.SimpleDateFormat;
import java.util.Date;

//afbsmfydrzqicafi   wfcsaoilwgzwbicd
public class Test {
public static void main(String[] args) {
	MailSenderInfo mailInfo = new MailSenderInfo();    
  //邮箱的网址
    mailInfo.setMailServerHost("smtp.qq.com");    
    mailInfo.setMailServerPort("587");  //465  
    mailInfo.setValidate(true);    
    mailInfo.setUserName("562605133");    
    //腾讯 smtp 识别码 wfcsaoilwgzwbicd
    mailInfo.setPassword("lobhxvlvxnadbfeb");//您的邮箱密码    //afbsmfydrzqicafi
    mailInfo.setFromAddress("562605133@qq.com");    
    mailInfo.setToAddress("562605133@qq.com");    
    boolean flag=true;
    	Date date = new Date();
    	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        mailInfo.setContent("I Love You "+format.format(date));    
        mailInfo.setSubject("服务器检查邮件");
           //这个类主要来发送邮件   
        SimpleMailSender sms = new SimpleMailSender();   
        flag= sms.sendTextMail(mailInfo);//发送文体格式    
      System.out.println("发送成功");
        //sms.sendHtmlMail(mailInfo);//发送html格式   
}
}
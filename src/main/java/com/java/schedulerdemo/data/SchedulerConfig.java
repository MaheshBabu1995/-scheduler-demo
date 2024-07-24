package com.java.schedulerdemo.data;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
@EnableScheduling
// @EnableAsync
public class SchedulerConfig {

    // @Bean(name = "myScheduler")
    // public TaskScheduler taskScheduler() {
    //     return new ConcurrentTaskScheduler();
    // }
    // String threadName;

	@Bean
	public TaskScheduler taskScheduler1() {
		
	
		ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
		scheduler.setPoolSize(3);
		scheduler.setThreadNamePrefix("explicitScheduler1");
		return scheduler;
	}
}
// controller: [RequestDataDTO(initiatingSystem=0, customerInfo=[
// 	CustomerInfoDTO(firstName=ASMINA  KHATUN, mobileNumber=8159964882, 
// 	emailId=no-replay@gmail.com, customerdob=05-Jun-1999, gender=null, panCard=null,
// 	\ passport=null, dlNo=null, aadharId=null, relationship=self, 
// 	assetInfo=[AssetInfoDTO(assertType=MOBILE, productCode=A586GB128CPH2577, assetMake=OPPO,
// 	 assetModel=A586GB128CPH2577, serialNo1=862892067525631, serialNo2=null, invoiceDate=20-Dec-2023, 
// 	 invoiceValue=12999.0, warrantyPeriod=null)])], addressInfo=[
// 		AddressInfoDTO(addrType=PER, addrLine1=UDANG UDANG HOWRAH, pinCode=711401, 
// 		cityCode=null, stateCode=null, landmark=HAFEJIA KURANIYA MADRASA)], 
// 		orderInfo=OrderInfoDTO(applicationDate=20-Dec-2023, applicationNo=null, 
// 		memStartDate=20-Dec-2023, planCode=null, partnerCode=null, partnerBUCode=CD58137, promoCode=null), paymentInfo=PaymentInfoDTO(paymentMode=COD))]

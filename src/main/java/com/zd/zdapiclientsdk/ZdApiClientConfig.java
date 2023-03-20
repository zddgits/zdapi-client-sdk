package com.zd.zdapiclientsdk;
import com.zd.zdapiclientsdk.client.ZdApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConfigurationProperties("zdapi.client")
@Data
@ComponentScan
public class ZdApiClientConfig {
     private String accessKey;

     private String secretKey;

     @Bean
     public ZdApiClient yuApiClient() {
         return new ZdApiClient(accessKey, secretKey);
     }

}


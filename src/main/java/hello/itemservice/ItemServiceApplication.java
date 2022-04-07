package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

}


/**
 * 메시지 : 여러 화면에 보이는 상품명, 가격, 수량 등 'label' 에 있는 단어를 변경하려면 다음 화면들을 다 찾아가면서 모두 변경해야 한다.
 * 지금처럼 화면 수가 적으면 문제가 되지 않지만 수십개 이상이라면 수십개의 파일을 모두 고쳐야 한다.
 */


/**
 * 국제화 : 메시지에서 설명한 메시지 파일('messages.properteis') 을 각 나라별로 별도로 관리하면 서비스를 구제화 할 수 있다.
 * 영어를 사용하는 사람이면 'messages_en.propertis'를 사용하고,
 * 한국어를 사용하는 사람이면 'messages_ko.propertios 를 사용하게 개발하면 된다.
 */
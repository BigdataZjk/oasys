package zjk_oasys.oasys;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zjk_oasys.oasys.mappers.NoticeMapper;
import zjk_oasys.oasys.services.inform.InformService;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OasysApplicationTests {
	
	@Autowired
	private NoticeMapper nm;
	
	@Autowired
	private InformService informService;




////		List<Map<String, Object>> list=informService.informList(listOne);
//		for (Map<String, Object> map : list) {
//			System.out.println(map);
//		}

	
	

}

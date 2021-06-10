package zjk_oasys.oasys.model.dao.processdao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import zjk_oasys.oasys.model.entity.process.EvectionMoney;
import zjk_oasys.oasys.model.entity.process.Stay;

public interface StayDao extends PagingAndSortingRepository<Stay, Long>{
 
	List<Stay> findByEvemoney(EvectionMoney money);
}

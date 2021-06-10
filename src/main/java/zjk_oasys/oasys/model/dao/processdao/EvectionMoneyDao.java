package zjk_oasys.oasys.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import zjk_oasys.oasys.model.entity.process.EvectionMoney;
import zjk_oasys.oasys.model.entity.process.ProcessList;

public interface EvectionMoneyDao extends PagingAndSortingRepository<EvectionMoney, Long>{

	EvectionMoney findByProId(ProcessList pro);
}

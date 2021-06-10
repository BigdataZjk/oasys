package zjk_oasys.oasys.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import zjk_oasys.oasys.model.entity.process.ProcessList;
import zjk_oasys.oasys.model.entity.process.Regular;

public interface RegularDao extends PagingAndSortingRepository<Regular, Long>{

	Regular findByProId(ProcessList pro);

}

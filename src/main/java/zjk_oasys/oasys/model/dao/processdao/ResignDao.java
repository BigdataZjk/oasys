package zjk_oasys.oasys.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import zjk_oasys.oasys.model.entity.process.ProcessList;
import zjk_oasys.oasys.model.entity.process.Resign;

public interface ResignDao extends PagingAndSortingRepository<Resign, Long>{

	Resign findByProId(ProcessList process);

}

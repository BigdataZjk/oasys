package zjk_oasys.oasys.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import zjk_oasys.oasys.model.entity.process.Overtime;
import zjk_oasys.oasys.model.entity.process.ProcessList;

public interface OvertimeDao extends PagingAndSortingRepository<Overtime, Long>{

	Overtime findByProId(ProcessList pro);

}

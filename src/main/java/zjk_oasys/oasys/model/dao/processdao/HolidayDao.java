package zjk_oasys.oasys.model.dao.processdao;

import org.springframework.data.repository.PagingAndSortingRepository;

import zjk_oasys.oasys.model.entity.process.Holiday;
import zjk_oasys.oasys.model.entity.process.ProcessList;

public interface HolidayDao extends PagingAndSortingRepository<Holiday, Long>{

	Holiday findByProId(ProcessList pro);

}

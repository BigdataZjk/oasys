package zjk_oasys.oasys.model.dao.processdao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import zjk_oasys.oasys.model.entity.process.Bursement;
import zjk_oasys.oasys.model.entity.process.DetailsBurse;

public interface DetailsBurseDao extends PagingAndSortingRepository<DetailsBurse, Long>{

	List<DetailsBurse> findByBurs(Bursement bu);
}

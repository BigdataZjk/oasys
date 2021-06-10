package zjk_oasys.oasys.model.dao.filedao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import zjk_oasys.oasys.model.entity.file.FilePath;

@Repository
public interface FilePathdao extends PagingAndSortingRepository<FilePath, Long> {
	
	List<FilePath> findByParentId(Long parentId);
	
	List<FilePath> findByParentIdAndPathIstrash(Long parentId,Long istrash);
	
	FilePath findByPathNameAndParentId(String pathname,Long parentId);
	
	FilePath findByPathName(String pathname);

	List<FilePath> findByPathUserIdAndPathIstrash(Long userid,Long istrash);
	
	FilePath findByParentIdAndPathUserId(Long parentId,Long userid);
	
	List<FilePath> findByPathUserIdAndPathIstrashAndPathNameLikeAndParentIdNot(Long userid,Long istrash,String likefilename,Long userrootpathid);
	
}

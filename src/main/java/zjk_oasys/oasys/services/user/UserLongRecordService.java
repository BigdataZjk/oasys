package zjk_oasys.oasys.services.user;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zjk_oasys.oasys.model.dao.user.UserLogRecordDao;
import zjk_oasys.oasys.model.entity.user.LoginRecord;

@Service
@Transactional
public class UserLongRecordService {
	@Autowired
	private UserLogRecordDao  ulDao;
	
	public LoginRecord save(LoginRecord lr){
		return ulDao.save(lr);
	}
	
}

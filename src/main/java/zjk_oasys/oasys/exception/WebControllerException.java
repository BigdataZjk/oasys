package zjk_oasys.oasys.exception;

/**
 * @创建人 张金科
 * @创建时间 2021/04/30  18:02
 * @描述 无
 */

import org.hibernate.service.spi.ServiceException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class WebControllerException {
    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public void errorHandler(Exception ex) {
        ex.printStackTrace();
        System.out.println("异常处理："+ex.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(value = ServiceException.class)
    public void errorHandler(ServiceException ex) {
        ex.printStackTrace();
        System.out.println("异常处理："+ex.getMessage());
    }




}

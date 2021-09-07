package top.jingjianqian.webService.innerWeb.openfeign;


import com.ucap.ms.base.data.ResultModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("platform-approve")
public interface MyClient {
    @RequestMapping(value = "/auditItemsNotifyDept", method = RequestMethod.GET)
    ResultModel one(String deptCode);
}

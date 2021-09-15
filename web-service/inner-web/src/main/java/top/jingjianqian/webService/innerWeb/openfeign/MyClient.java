package top.jingjianqian.webService.innerWeb.openfeign;


import com.ucap.ms.base.data.ResultModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(name = "PLATFORM-APPROVE" ,url = "PLATFORM-APPROVE")
public interface MyClient {
    @RequestMapping(value = "/approveStepItem/auditItemsNotifyDept", method = RequestMethod.POST)
    ResultModel one();
}
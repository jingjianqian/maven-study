package com.ucap.ms.approve.api.payload;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.ucap.ms.approve.api.payload.RequestAuditItemPayload.CustomBean;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.ucap.ms.approve.api.payload.RequestAuditItemPayload.StatusBean;

/**
 * @author loncx
 * @date 2019/12/11
 */
public class RequestTaskItemPayload {

    /**
     * STATUS : {"CODE":"00","TEXT":""}
     * data : {"LASTTIMESTAMP":1572880572947,"RETURNITEMSUNNUM":1,"list":[{"AUDIT_ITEM_BYLAW":[{"law_id":"ee0b2a30-cc04-4956-9afe-211e82e0db12","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","cataloglawid":"a83ae371-ef67-42aa-bad9-59572930fb41","law_name":"《固定资产投资项目节能办法》","year":1572244774000,"law_number":"(2016年国家发改委令第44号)","clause_number":"第三条","clause_content":"固定资产投资项目节能审查意见是项目开工建设、竣工验收和运营管理的重要依据。政府投资项目，建设单位在报送项目可行性研究报告前，需取得节能审查机关出具的节能审查意见。企业投资项目，建设单位需在开工建设前取得节能审查机关出具的节能审查意见。未按本办法规定进行节能审查，或节能审查未通过的项目，建设单位不得开工建设，已经建成的不得投入生产、使用。第五条 定资产投资项目节能审查由地方节能审查机关负责。\n国家发展改革委核报国务院审批以及国家发展改革委审批的政府投资项目，建设单位在报送项目可行性研究报告前，需取得省级节能审查机关出具的节能审查意见。国家发展改革委核报国务院核准以及国家发展改革委核准的企业投资项目，建设单位需在开工建设前取得省级节能审查机关出具的节能审查意见。\n年综合能源消费量5000 吨标准煤以上(改扩建项目按照建成投产后年综合能源消费增量计算，电力折算系数按当量值，下同)的固定资产投资项目，其节能审查由省级节能审查机关负责。其他固定资产投资项目，其节能审查管理权限由省级节能审查机关依据实际情况自行决定。第六条 年综合能源消费量不满1000 吨标准煤，且年电力消费量不满500 万千瓦时的固定资产投资项目，以及用能工艺简单、节能潜力小的行业(具体行业目录由国家发展改革委制定并公布)的固定资产投资项目应按照相关节能标准、规范建设，不再单独进行节能审查。《全国人大财政经济委员会办公室关于节能评估审查是否属于行政许可事项的复函》根据行政许可法，上述规定符合设定行政许可的要求和条件。在实际工作中，国家发改委为落实节能法的要求，将节能评估和审查作为项目审批、核准和开工建设的强制性前置条件，节能评估和审查制度与环境评估等一样，已成为固定资产投资项目审批核准制度的重点环节。","rowguid":"773a1fa2-4429-46a7-b488-1dcc2c563eba","operatedate":1572244774000},{"law_id":"fd2f0844-49ff-4764-b1d5-af55282e96c2","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","cataloglawid":"cba9eff3-e57d-48f5-8874-36fb55a725e0","law_name":"《全国人民代表大会常务委员会关于修改<中华人民共和国节约能源法>等六部法律的决定》","year":1572244774000,"law_number":"","clause_number":"","clause_content":"国家实行固定资产投资项目节能评估和审查制度。不符合强制性节能标准的项目，建设单位不得开工建设；已经建成的，不得投入生产、使用。政府投资项目不符合强制性节能标准的，依法负责项目审批的机关不得批准建设。具体办法由国务院管理节能工作的部门会同国务院有关部门制定。","rowguid":"8b2bb3d2-3e10-4700-9b90-2aab8ccf4e8a","operatedate":1572244774000},{"law_id":"7103bc77-ab24-4f7f-911b-f4c897395b56","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","cataloglawid":"ca4db625-42cc-4f5b-9fd9-334cc5a9ecb8","law_name":"《国务院关于加强节能工作的决定》","year":1572244774000,"law_number":"(国发[2006]28号)","clause_number":"第二十三条","clause_content":"建立固定资产投资项目节能评估和审查制度。有关部门和地方人民政府要对固定资产投资项目（含新建、改建、扩建项目）进行节能评估和审查。","rowguid":"a9af8523-5062-410a-865a-edebe8daeef0","operatedate":1572244774000}],"AUDIT_ITEM_WINDOW":[{"traffic_info":"可乘公交1路或101路到县政务服务中心站下车，沿着江南路往南过红绿灯再走50米左右。","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","transact_addr":"灵山县三海街道江南路5号县政务服务中心法人大厅工程建设项目综合窗口（县卫生监督所一楼）。","window_name":"工程建设项目综合窗口","window_tel":"0777-6428820","year":1572192000000,"map_url":"https://j.map.baidu.com/ZZyIG","rowguid":"2c807869-6fab-44f0-89ab-dbfd995398d3","transact_time":"工作日：上午9:00-12:00、下午14：00-17:00","operatedate":1572244774000,"ordernumber":0,"window_id":"6d92c3cf-fa0a-4466-9746-43bf155d7b3d"}],"AUDIT_MATERIAL":[{"partitionguid":"450700","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","is_generate_ecert":"0","year":1572192000000,"is_jzbm":"0","operateusername":"周瑞秋","td_tlimit":"0","materialid":"7e677b6c-fe30-4a69-8724-bd828136d95f","rowguid":"2f0c41ea-9057-4a33-8606-f5a39451285e","operatedate":1572244774000,"material_type":"1","is_need":"1","example_guid":"a49ecc13-4677-4287-bc0b-c07a549a096b","original_amount":1,"jzbm_way":"","material_name":"申请书","sign_ask":"个人签字或签章","task_code":"11450721MB155808114000104002000","material_form":"1","page_num":1,"source_type":"10","by_law":"《广西壮族自治区固定资产投资项目节能审查办法》第八条","ordernum":1,"copy_amount":1,"td_correctway":"","source_explain":"申请人自备","page_format":"A4","accept_stand":"1.内容真实有效；2.符合国家相关法律法规。","fill_explian":"材料内容应如实反映，不得出现弄虚作假情况","form_guid":"5fba5b12-72de-46d0-9824-92bd6453209d"},{"partitionguid":"450700","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","is_generate_ecert":"0","year":1572192000000,"is_jzbm":"0","operateusername":"周瑞秋","td_tlimit":"0","materialid":"fb837e7e-c229-4589-9c42-38004e9b9d60","rowguid":"e25fbce8-e95b-4854-8ac4-3e883bc431f2","operatedate":1572244774000,"material_type":"1","is_need":"1","example_guid":"","original_amount":1,"jzbm_way":"","material_name":"节能报告","sign_ask":"个人签字或签章","task_code":"11450721MB155808114000104002000","material_form":"1","page_num":2,"source_type":"10","by_law":"《广西壮族自治区固定资产投资项目节能审查办法》第八条","ordernum":2,"copy_amount":1,"td_correctway":"","source_explain":"申请人自备","page_format":"A4","accept_stand":"1.内容真实有效；2.符合国家相关法律法规。","fill_explian":"材料内容应如实反映，不得出现弄虚作假情况","form_guid":""}],"AUDIT_MATERIAL_CONDITION":[],"AUDIT_QA":[{"task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","gscapproveproblem":"    1. 是不是所有的固定资产投资项目都必须在可研前获得节能审查意见？\n    答：根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第三条规定，政府投资项目，建设单位在报送项目可行性研究报告前，需取得节能审查机关出具的节能审查意见。企业投资项目，建设单位需在开工建设前取得节能审查机关出具的节能审查意见。\n    2. 跨地区的固定资产投资项目的节能报告如何报送？\n    答：根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第八条规定，跨行政区域的固定资产投资项目，其节能报告可由项目所在地其中一方节能审查机关负责报送，同时抄送项目所在地其他方节能审查机关。","gscapproveprojectcodeid":"Gx-Gsc-App-388-336","question":"是不是所有的固定资产投资项目都必须在可研前获得节能审查意见？","year":1572192000000,"task_code":"11450721MB155808114000104002000","ordernum":1,"rowguid":"15c5d3a2-5c38-4d5d-8ac2-336d1581aaec","operatedate":1572244774000,"missex":"无","answer":"根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第三条规定，政府投资项目，建设单位在报送项目可行性研究报告前，需取得节能审查机关出具的节能审查意见。企业投资项目，建设单位需在开工建设前取得节能审查机关出具的节能审查意见。","qaid":"b84e90c2-4638-43d6-9d64-e1d2e9705060"},{"task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","gscapproveproblem":"    1. 是不是所有的固定资产投资项目都必须在可研前获得节能审查意见？\n    答：根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第三条规定，政府投资项目，建设单位在报送项目可行性研究报告前，需取得节能审查机关出具的节能审查意见。企业投资项目，建设单位需在开工建设前取得节能审查机关出具的节能审查意见。\n    2. 跨地区的固定资产投资项目的节能报告如何报送？\n    答：根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第八条规定，跨行政区域的固定资产投资项目，其节能报告可由项目所在地其中一方节能审查机关负责报送，同时抄送项目所在地其他方节能审查机关。","gscapproveprojectcodeid":"Gx-Gsc-App-388-336","question":"跨地区的固定资产投资项目的节能报告如何报送？","year":1572192000000,"task_code":"11450721MB155808114000104002000","ordernum":2,"rowguid":"4b185d46-e603-4625-a2a3-e8903dc1fb69","operatedate":1572244774000,"missex":"无","answer":"根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第八条规定，跨行政区域的固定资产投资项目，其节能报告可由项目所在地其中一方节能审查机关负责报送，同时抄送项目所在地其他方节能审查机关。","qaid":"519ff111-f4d6-48b3-ad77-e1cc3f7facdb"}],"AUDIT_ITEM_EXTEND":{"partitionguid":"450700","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","year":1572192000000,"is_intermediary":"0","amount_limit_desc":"","star_service":"0","lead_dept":"","handle_online_address":"http://qzls.zwfw.gxzf.gov.cn/","rowguid":"67e861d2-6df3-4bee-b1d2-abb800213c85","operatedate":1572244796000,"local_theme_natural_type":"","reform_way":"","result_name":"灵山县行政审批局关于 xxx 项目节能报告的批复","is_cert_seperate":"0","four_handle":"2,4","match_dept":"","is_schedule":"1","is_entry_center":"1","result_guid":"e7e94e51-b67e-40d1-980c-ebd5a2467e2d,1877b67f-4ec9-47b0-bd83-ef428c2f5561","is_online_handle":"1","limit_explain":"","is_joint_org":"0","cjsqmc":"无","is_handle_machine":"0","service_dept":"受理后:固定资产投资项目节能评审","result_type":"20","wsblsd":"6,1","is_single_use":"0","task_code":"11450721MB155808114000104002000","arrive_charge_way":"","is_amount_limit":"0","is_cert_joint":"0","xzjddm":"无","is_invest":"0","sensitives":"0","is_agency":"0","is_intelli_approval":"0","cjsqdm":"无","local_theme_legal_type":"","handle_area":"4","theme_natural_type":"","scene_reason":"须现场核验材料","is_express":"0","xzjdmc":"无","theme_legal_type":"040","is_pay_online":"0"},"AUDIT_ITEM":{"dept_code":"11450721MB15580811","partitionguid":"450700","flow_chart":"a37a3835-84f8-42b8-96b3-8a64b0403b8c,63ec218d-6822-4cd8-9eed-dde720356637","td_tlimit":"","accept_std":"一、审查方式：机构评审。\n    设定依据：《固定资产投资项目节能审查办法》（国家发展和改革委员会令第44号）第八条  节能审查机关受理固定资产投资项目节能报告后，应委托有关机构进行评审，形成评审意见，作为节能审查的重要依据。\n    二、审查标准：\n    （一）格式、体例\n    1.项目摘要表数据完整、准确，与节能报告内容一致；\n    2.内容、深度、体例符合《固定资产投资项目节能审查办法》、《固定资产投资项目节能评估和审查工作指南》（2014年本）有关要求；\n    3.评估范围准确、合理；\n    4.评估依据准确、适用；\n    5.必要的附录、附件齐全、准确。\n    （二）建设方案、节能措施\n    1.项目建设方案的介绍和分析全面、专业，从节能角度进行分析评价，并提出合理评估意见和建议；\n    2.节能技术措施综述全面，阶段措施合理、有针对性，符合实操性原则，节能效果测算合理，节能管理机制健全。\n    （三）用能设备\n    1.主要用能设备的指标达到先进水平；\n    2.通用设备的能效要求达到先进水平；\n    3.项目未采用国家明令禁止和淘汰的落后设备。\n    （四）数据计算\n    1.基础数据有详细的基本参数支撑，基础数据、基本参数选择真实、合理，有明确的计算过程；\n    2.主要能效指标、工序能耗指标等计算过程清晰，结果准确；\n    3.主要耗能设备、通用设备的参数科学、合理，能效要求（水平）计算过程清晰；\n    4.综合能源消费量计算过程和结果正确，对所在地影响评价合理。\n    （五）能效水平\n    1.能效水平对标分析客观，对比数据真实、合理、可靠；\n    2.合理评价项目能效水平。","login_url":"http://qzls.zwfw.gxzf.gov.cn/","accept_name":"根据《固定资产投资项目节能审查办法》第八条，节能审查机关受理固定资产投资项目节能报告后，应委托有关机构进行评审，形成评审意见，作为节能审查的重要依据。节能审查机关应依据项目是否符合节能有关法律法规、标准规范、政策；项目用能分析是否客观准确，方法是否科学，结论是否准确；节能措施是否合理可行；项目的能源消费量和能效水平是否满足本地区能源消耗总量和强度\u201c双控\u201d管理要求等对项目节能报告进行审查。","other_supervise":"0777-6428880","exercise_content":"对符合以下任一条件的固定资产投资项目进行节能审查：\n    1.国务院投资主管部门核报国务院审批、核准以及国务院投资主管部门审批、核准的固定资产投资项目；\n    2.高耗能高排放（简称\u201c两高\u201d）项目；\n    3.年综合能源消费量5000吨标准煤以上（含5000吨标准煤），或年电力消费量在2500万千瓦时以上（含2500万千瓦时）的固定资产投资项目；\n    4.年综合能源消费量1000吨至5000吨标准煤，或年电力消费量500万千瓦时至2500万千瓦时的固定资产投资项目中属于自治区投资主管部门核报本级人民政府审批或核准的项目，以及自治区投资主管部门审批、核准或备案的固定资产投资项目。","link_way":"0777\u20146428820","create_date":1572244774000,"project_type":"2","is_need_entry":"1","task_code":"11450721MB155808114000104002000","entrust_name":"","query_url":"http://qzls.zwfw.gxzf.gov.cn/","supervise_way":"0777\u20146428880","catalog_id":"36c5fb30-33df-11e9-89bc-fa163ea9bf82","anticipate_day_explain":"除可以当场作出行政许可决定的外，行政机关应当自受理行政许可申请之日起二十日内做出行政许可决定。二十日内不能做出决定的，经本行政机关负责人批准，可以延长十日，并应当将延长期限的理由告知申请人。但是，法律、法规另有规定的，依照其规定。","publicity_url":"http://wsbs.gxzf.gov.cn","item_source":"1","transact_app_url":"","promise_day_explain":"无","ywcode":"","pre_dept_name":"无","inspection_review":"3","promise_type":"1","task_name":"固定资产投资项目节能审查","handle_publicity":"01","pre_task_name":"无","serve_type":"2,3,4,6","use_level":"4","areacode":"450721","promise_day":"5","rowguid":"e7712954-2b2c-44d0-889c-c2ac692479b2","anticipate_day":"20","other_link":"0777-6428820","authority_division":"根据《广西壮族自治区固定资产投资项目节能审查办法》第五条：\n年综合能源消费量在1000吨标准煤（含1000吨标准煤；改扩建项目按照建成投产后年综合能源消费增量计算，电力折算系数按当量值，下同）以上，或年电力消费量500万千瓦时以上（含500万千瓦时）的固定资产投资项目，需要进行节能审查。\n国务院投资主管部门核报国务院审批、核准以及国务院投资主管部门审批、核准的固定资产投资项目，高耗能高排放（简称\u201c两高\u201d）项目，年综合能源消费量5000吨标准煤以上（含5000吨标准煤），或年电力消费量在2500万千瓦时以上（含2500万千瓦时）的固定资产投资项目，其节能审查由自治区节能审查机关负责。\n年综合能源消费量1000吨至5000吨标准煤，或年电力消费量500万千瓦时至2500万千瓦时的固定资产投资项目，其节能审查按照项目管理权限实行分级管理，即自治区、设区市、县（市、区）投资主管部门核报本级人民政府审批或核准的项目，以及自治区、设区市、县（市、区）投资主管部门审批、核准或备案的项目，其节能审查由本级节能审查机关负责。","is_td":"0","publishdate":1572335054000,"publishstatus":"1","dept_type":"1","catalog_code":"000104002000","task_version":"13","is_fee":"0","audit_state":"40","is_mobile_entry":"0","item_id":"e35685d0-b67b-4375-b094-5d6a650992b1","limit_scene_num":"1","version_date":1572244548000,"dept_name":"灵山县行政审批局","task_state":"1","reconsiderat":"公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。","td_conrection_way":"","anticipate_type":"1","litigation":"1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。","handle_type":"1,2","progress_query_way":"02,04","scene_reason":"","task_type":"01"},"AUDIT_ITEM_SPECIAL":[{"task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","special_id":"c0d832bb-3591-4d46-bf2a-b859c3ab42c3","year":1572244774000,"special_name":"9","special_date":15,"rowguid":"25ea329b-6b8b-470c-99ae-b9f73eaf00e9","special_desc":"机构评审：\n《固定资产投资项目节能审查办法》（国家发展和改革委员会令第44号）第八条  节能审查机关受理固定资产投资项目节能报告后，应委托有关机构进行评审，形成评审意见，作为节能审查的重要依据。","operatedate":1572244774000,"special_date_type":"1","special_tel":"0777\u20146428820","special_dept":"灵山县行政审批局","ordernumber":1}],"AUDIT_ITEM_CONDITION":[]}]}
     */
    /*{"STATUS":{"CODE":"00","TEXT":""},"data":{"LASTTIMESTAMP":1596771021318,"RETURNITEMSUNNUM":10,"list":[{"AUDIT_ITEM_BYLAW":[{"law_id":"7db7047a-3dc0-40f1-b089-99ea6dfd920c","task_guid":"bffd486f-3eef-4e2e-8e69-aaa18abb514e","partitionguid":"450700","cataloglawid":"d6c961a9-8861-4ae1-93da-52a93b1d6b36","law_name":"《公共文化体育设施条例》","year":1589331938000,"law_number":"（国务院令第382号）","clause_number":"第二十七条","clause_content":"因城乡建设确需拆除公共文化体育设施或者改变其功能、用途的，有关地方人民政府在作出决定前，应当组织专家论证，并征得上一级人民政府文化行政主管部门、体育行政主管部门同意，报上一级人民政府批准。","rowguid":"0ebdf930-ebe2-4154-bab2-97a330671d48","operatedate":1589331938000}],"AUDIT_ITEM_WINDOW":[{"traffic_info":"可乘公交1路或101路到县攻务服务中心站下车","task_guid":"bffd486f-3eef-4e2e-8e69-aaa18abb514e","partitionguid":"450700","transact_addr":"灵山县三海街道江南路12号政务服务中心二楼综合窗口11","window_name":"灵山县政务服务中心二楼综合窗口11","window_tel":"0777-6428913","year":1589299200000,"map_url":"https://ditu.so.com/?pid=647ecbf970c5323b","ordernumber":0,"rowguid":"cbc80430-c4b1-4b5c-ae62-e56be1db6b2c","transact_time":"工作日：上午9:00-12:00、下午14:00-17:00，法定节假日除外。","operatedate":1589331938000}],"AUDIT_MATERIAL":[{"partitionguid":"450700","task_guid":"bffd486f-3eef-4e2e-8e69-aaa18abb514e","is_generate_ecert":"0","year":1589299200000,"is_jzbm":"0","operateusername":"潘雷","remark":"无","materialid":"0c632be1-1eb7-465c-a322-8b2a2c434eb0","rowguid":"6da0b8b8-6810-4887-aecf-7aaa2cd1632e","operatedate":1589331938000,"material_type":"1","is_need":"1","example_guid":"21ae7554-236d-456d-8646-5cd8bca71b01","original_amount":1,"jzbm_way":"","material_name":"申请表","sign_ask":"签字确认","task_code":"11450721348531435D4001033002000","material_form":"1","page_num":1,"source_type":"10","by_law":"根据《全民健身法》","ordernum":0,"copy_amount":0,"source_explain":"申请人自备","page_format":"无","materialcode":"11450721348531435D4001033002000001","accept_stand":"无","fill_explian":"无","form_guid":"ed270b92-f698-48ab-9703-b99da2e6b2cd"}],"AUDIT_MATERIAL_CONDITION":[],"AUDIT_QA":[{"task_guid":"bffd486f-3eef-4e2e-8e69-aaa18abb514e","partitionguid":"450700","missex":"无","question":"几日内办结","answer":"10日内","year":1589299200000,"task_code":"11450721348531435D4001033002000","operateusername":"潘雷","ordernum":0,"rowguid":"ecec5d26-70c8-4f60-982b-0c9d58d0e8d8","operatedate":1589331938000,"qaid":"c52c92f1-a34d-4dd4-b50b-3805efe1a900"}],"AUDIT_ITEM_EXTEND":{"partitionguid":"450700","task_guid":"bffd486f-3eef-4e2e-8e69-aaa18abb514e","year":1589299200000,"is_intermediary":"0","amount_limit_desc":"","star_service":"","lead_dept":"","handle_online_address":"无","rowguid":"1cbd3082-9b98-41ce-bfa3-1010fe8112e3","operatedate":1589331938000,"local_theme_natural_type":"","reform_way":"","result_name":"无","is_cert_seperate":"0","four_handle":"2,4","match_dept":"","is_schedule":"0","is_entry_center":"1","result_guid":"","is_online_handle":"1","limit_explain":"","is_joint_org":"0","cjsqmc":"","is_handle_machine":"0","result_type":"99","wsblsd":"1,2,3","is_single_use":"","task_code":"11450721348531435D4001033002000","arrive_charge_way":"","is_amount_limit":"0","is_cert_joint":"0","xzjddm":"","is_invest":"","sensitives":"0","is_agency":"0","is_intelli_approval":"0","cjsqdm":"","local_theme_legal_type":"","handle_area":"4","theme_natural_type":"005,010,015","scene_reason":"现场核查材料","is_express":"0","xzjdmc":"","theme_legal_type":"005,010,015,020","is_pay_online":"0"},"AUDIT_ITEM":{"dept_code":"11450721348531435D","partitionguid":"450700","flow_chart":"6e907e91-bf0f-45fb-a0c3-f17233f388a6,da6105d0-a462-4598-ab7f-855bae41f4c6","td_tlimit":"","accept_std":"一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.申请人应如实填写各项内容，对提交材料的真实性、完整性负责，不得虚构、伪造或编造事实； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁，不得涂改。文书设定的栏目，应逐项填写完整、准确； 3.申请材料中的表格应使用国际标准A4或A3型纸对开正面印制； 4.相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等复印件的审查标准 1.其他各项提交的材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2.“证明文件”、“身份证复印件”等均为复印件，经申请人签名确认并注明日期，受理人员应现场核对复印件与原件是否一致； 3.申请个人或单位提供的材料应齐全并符合法定形式。 二、现场勘察。标准如下： 查看演出场地、舞台、看台是否符合安全、消防要求。","login_url":"无","accept_name":"符合以上条件","other_supervise":"无","exercise_content":"根据《公共文化体育设施条例》第二十七条 因城乡建设确需拆除公共文化体育设施或者改变其功能、用途的，有关地方人民政府在作出决定前，应当组织专家论证，并征得上一级人民政府文化行政主管部门、体育行政主管部门同意，报上一级人民政府批准。","link_way":"0777-6428913","create_date":1589331938000,"project_type":"2","is_need_entry":"1","task_code":"11450721348531435D4001033002000","entrust_name":"","query_url":"http://qzls.zwfw.gxzf.gov.cn/\n查询电话：0777—6428913","supervise_way":"0777-6428880","catalog_id":"36d66df3-33df-11e9-89bc-fa163ea9bf82","anticipate_day_explain":"受理之日起20个工作日。","publicity_url":"http://zwgk.gxls.gov.cn/","item_source":"1","transact_app_url":"","promise_day_explain":"受理之日起1个工作日。","ywcode":"","pre_dept_name":"无","inspection_review":"3","promise_type":"1","task_name":"全民健身设施拆迁或者改变用途批准","handle_publicity":"01,02","pre_task_name":"无","serve_type":"1,2,3,4","use_level":"4","areacode":"450721","promise_day":"24","rowguid":"bffd486f-3eef-4e2e-8e69-aaa18abb514e","anticipate_day":"66","other_link":"无","authority_division":"《公共文化体育设施条例》第二十七条 因城乡建设确需拆除公共文化体育设施或者改变其功能、用途的，有关地方人民政府在作出决定前，应当组织专家论证，并征得上一级人民政府文化行政主管部门、体育行政主管部门同意，报上一级人民政府批准。\n\n涉及大型公共文化体育设施的，上一级人民政府在批准前，应当举行听证会，听取公众意见。\n\n经批准拆除公共文化体育设施或者改变其功能、用途的，应当依照国家有关法律、行政法规的规定择地重建。重新建设的公共文化体育设施，应当符合规划要求，一般不得小于原有规模。迁建工作应当坚持先建设后拆除或者建设拆除同时进行的原则。迁建所需费用由造成迁建的单位承担。","is_td":"0","publishdate":1590720470000,"publishstatus":"1","dept_type":"1","catalog_code":"001033002000","task_version":"11","is_fee":"0","audit_state":"40","is_mobile_entry":"0","item_id":"c0104ddb-22c8-43a0-a4e4-8d212d948d20","limit_scene_num":"1","version_date":1589332357000,"dept_name":"灵山县文化广电体育和旅游局","task_state":"1","reconsiderat":"公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。","td_conrection_way":"","anticipate_type":"1","litigation":"1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。    2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。","handle_type":"1,2,3","progress_query_way":"01,02","scene_reason":"","task_type":"10"},"AUDIT_ITEM_SPECIAL":[],"AUDIT_ITEM_CONDITION":[]},{"AUDIT_ITEM_BYLAW":[{"law_id":"7db7047a-3dc0-40f1-b089-99ea6dfd920c","task_guid":"f43ca715-a4ad-4faf-a1a8-2a9ecc732df4","partitionguid":"450700","cataloglawid":"d6c961a9-8861-4ae1-93da-52a93b1d6b36","law_name":"《公共文化体育设施条例》","year":1591169772000,"law_number":"（国务院令第382号）","clause_number":"第二十七条","clause_content":"因城乡建设确需拆除公共文化体育设施或者改变其功能、用途的，有关地方人民政府在作出决定前，应当组织专家论证，并征得上一级人民政府文化行政主管部门、体育行政主管部门同意，报上一级人民政府批准。","rowguid":"fe939cf4-a514-4270-b0ea-137b9082fc83","operatedate":1591169772000}],"AUDIT_ITEM_WINDOW":[{"traffic_info":"可乘公交1路或101路到县攻务服务中心站下车","task_guid":"f43ca715-a4ad-4faf-a1a8-2a9ecc732df4","partitionguid":"450700","transact_addr":"灵山县三海街道江南路12号政务服务中心二楼综合窗口11","window_name":"灵山县政务服务中心二楼综合窗口11","window_tel":"0777-6428913","year":1591113600000,"map_url":"https://ditu.so.com/?pid=647ecbf970c5323b","ordernumber":0,"rowguid":"cdef7e18-0176-4338-9132-66a8e14cfb35","transact_time":"工作日：上午9:00-12:00、下午14:00-17:00，法定节假日除外。","operatedate":1591169772000}],"AUDIT_MATERIAL":[{"partitionguid":"450700","task_guid":"f43ca715-a4ad-4faf-a1a8-2a9ecc732df4","is_generate_ecert":"0","year":1591113600000,"is_jzbm":"0","operateusername":"潘雷","remark":"无","materialid":"0c632be1-1eb7-465c-a322-8b2a2c434eb0","rowguid":"e9cceaad-abe7-42e6-9c35-6edb6fca42cf","operatedate":1591169772000,"material_type":"1","is_need":"1","example_guid":"e58ccfef-1ac3-4761-84dc-a8c92baced7c","original_amount":1,"jzbm_way":"","material_name":"申请表","sign_ask":"签字确认","task_code":"11450721348531435D4001033002000","material_form":"1","page_num":1,"source_type":"10","by_law":"根据《全民健身法》","ordernum":0,"copy_amount":0,"source_explain":"申请人自备","page_format":"无","materialcode":"11450721348531435D4001033002000001","accept_stand":"无","fill_explian":"无","form_guid":"e6b4381b-646b-42c8-9718-b796c68f081d"}],"AUDIT_MATERIAL_CONDITION":[],"AUDIT_QA":[{"task_guid":"f43ca715-a4ad-4faf-a1a8-2a9ecc732df4","partitionguid":"450700","missex":"无","question":"几日内办结","answer":"10日内","year":1591113600000,"task_code":"11450721348531435D4001033002000","operateusername":"潘雷","ordernum":0,"rowguid":"34b2aa55-1708-4307-9e3a-12c978eba34c","operatedate":1591169772000,"qaid":"c52c92f1-a34d-4dd4-b50b-3805efe1a900"}],"AUDIT_ITEM_EXTEND":{"partitionguid":"450700","task_guid":"f43ca715-a4ad-4faf-a1a8-2a9ecc732df4","year":1591113600000,"is_intermediary":"0","amount_limit_desc":"","star_service":"","lead_dept":"","handle_online_address":"无","rowguid":"73bc691c-094c-47f0-b342-745f47ede281","operatedate":1591169772000,"local_theme_natural_type":"","reform_way":"","result_name":"无","is_cert_seperate":"0","four_handle":"2,4","match_dept":"","is_schedule":"0","is_entry_center":"1","result_guid":"","is_online_handle":"1","limit_explain":"","is_joint_org":"0","cjsqmc":"","is_handle_machine":"0","result_type":"99","wsblsd":"1,2,3","is_single_use":"","task_code":"11450721348531435D4001033002000","arrive_charge_way":"","is_amount_limit":"0","is_cert_joint":"0","xzjddm":"","is_invest":"","sensitives":"0","is_agency":"0","is_intelli_approval":"0","cjsqdm":"","local_theme_legal_type":"","handle_area":"4","theme_natural_type":"005,010,015","scene_reason":"现场核查材料","is_express":"0","xzjdmc":"","theme_legal_type":"005,010,015,020","is_pay_online":"0"},"AUDIT_ITEM":{"dept_code":"11450721348531435D","partitionguid":"450700","flow_chart":"10d5d14d-d992-4806-be58-9e44fe703550,af54d770-179c-49bb-97c8-99440db2bbf6","td_tlimit":"","accept_std":"一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.申请人应如实填写各项内容，对提交材料的真实性、完整性负责，不得虚构、伪造或编造事实； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁，不得涂改。文书设定的栏目，应逐项填写完整、准确； 3.申请材料中的表格应使用国际标准A4或A3型纸对开正面印制； 4.相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等复印件的审查标准 1.其他各项提交的材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2.“证明文件”、“身份证复印件”等均为复印件，经申请人签名确认并注明日期，受理人员应现场核对复印件与原件是否一致； 3.申请个人或单位提供的材料应齐全并符合法定形式。 二、现场勘察。标准如下： 查看演出场地、舞台、看台是否符合安全、消防要求。","login_url":"无","accept_name":"符合以上条件","other_supervise":"无","exercise_content":"根据《公共文化体育设施条例》第二十七条 因城乡建设确需拆除公共文化体育设施或者改变其功能、用途的，有关地方人民政府在作出决定前，应当组织专家论证，并征得上一级人民政府文化行政主管部门、体育行政主管部门同意，报上一级人民政府批准。","link_way":"0777-6428913","create_date":1591169772000,"project_type":"2","is_need_entry":"1","task_code":"11450721348531435D4001033002000","entrust_name":"","query_url":"http://qzls.zwfw.gxzf.gov.cn/\n查询电话：0777—6428913","supervise_way":"0777-6428880","catalog_id":"36d66df3-33df-11e9-89bc-fa163ea9bf82","anticipate_day_explain":"受理之日起20个工作日。","publicity_url":"http://zwgk.gxls.gov.cn/","item_source":"1","transact_app_url":"","promise_day_explain":"受理之日起1个工作日。","ywcode":"","pre_dept_name":"无","inspection_review":"3","promise_type":"1","task_name":"全民健身设施拆迁或者改变用途批准","handle_publicity":"01,02","pre_task_name":"无","serve_type":"1,2,3,4","use_level":"4","areacode":"450721","promise_day":"24","rowguid":"f43ca715-a4ad-4faf-a1a8-2a9ecc732df4","anticipate_day":"66","other_link":"无","authority_division":"《公共文化体育设施条例》第二十七条 因城乡建设确需拆除公共文化体育设施或者改变其功能、用途的，有关地方人民政府在作出决定前，应当组织专家论证，并征得上一级人民政府文化行政主管部门、体育行政主管部门同意，报上一级人民政府批准。\n\n涉及大型公共文化体育设施的，上一级人民政府在批准前，应当举行听证会，听取公众意见。\n\n经批准拆除公共文化体育设施或者改变其功能、用途的，应当依照国家有关法律、行政法规的规定择地重建。重新建设的公共文化体育设施，应当符合规划要求，一般不得小于原有规模。迁建工作应当坚持先建设后拆除或者建设拆除同时进行的原则。迁建所需费用由造成迁建的单位承担。","is_td":"0","publishdate":1591170448000,"publishstatus":"1","dept_type":"1","catalog_code":"001033002000","task_version":"12","is_fee":"0","audit_state":"40","is_mobile_entry":"0","item_id":"c0104ddb-22c8-43a0-a4e4-8d212d948d20","limit_scene_num":"1","version_date":1591170375000,"dept_name":"灵山县文化广电体育和旅游局","task_state":"1","reconsiderat":"公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。","td_conrection_way":"","anticipate_type":"1","litigation":"1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。    2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。","handle_type":"1,2,3","progress_query_way":"01,02","scene_reason":"","task_type":"10"},"AUDIT_ITEM_SPECIAL":[],"AUDIT_ITEM_CONDITION":[]},{"AUDIT_ITEM_BYLAW":[{"law_id":"6d53ce80-4b82-4ae2-a96c-cd0a9b8069e6","task_guid":"8e488afa-1870-457d-afee-b7d92112b4d6","partitionguid":"450700","cataloglawid":"9c51805d-c7e0-4cd4-b14f-5b28db059dd8","law_name":"《宗教事务条例》","year":1594177697000,"law_number":"（2004年11月30日国务院令第426号，2017年8月26日修订）","clause_number":"第三十三条第一款","clause_content":"“在宗教活动场所内改建或者新建建筑物，应当经所在地县级以上地方人民政府宗教事务部门批准后，依法办理规划、建设等手续。”","rowguid":"aeb54980-46a9-427a-b47a-65544ed22efe","operatedate":1594177697000}],"AUDIT_ITEM_WINDOW":[{"traffic_info":"可乘公交1路或101路到县政务服务中心站下车","task_guid":"8e488afa-1870-457d-afee-b7d92112b4d6","partitionguid":"450700","transact_addr":"灵山县三海街道江南路12号县政务服务中心二楼④⑤⑥综合窗口","window_name":"灵山县政务中心二楼④⑤⑥综合窗口","window_tel":"0777-6428001","year":1594137600000,"map_url":"https://j.map.baidu.com/ZZyIG","operateusername":"阮文敏","rowguid":"f7651120-e8a2-49fe-bd58-c35588c76798","transact_time":"工作日：上午9:00-12:00、下午２:00-５:00","operatedate":1594177697000,"ordernumber":0,"window_id":"9599968f-3c0f-49dc-86fc-fb6be1ad43d3"}],"AUDIT_MATERIAL":[{"partitionguid":"450700","task_guid":"8e488afa-1870-457d-afee-b7d92112b4d6","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"0eaceea3-bebe-4c4c-9e0d-243fa2e40f15","rowguid":"4bad3793-3f37-4afd-81db-afb42dc03c57","operatedate":1594177697000,"material_type":"1","is_need":"1","example_guid":"310c183e-dab4-4de0-b25c-33610ab2ad47","original_amount":2,"jzbm_way":"","material_name":"申请书，内容包括拟改建或者新建建筑物的项目说明及理由","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":1,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500001001","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"df45044d-4903-4b64-997a-d8ed5bfbdc1c","ywcode":"11450721MB15580811400014100500001"},{"partitionguid":"450700","task_guid":"8e488afa-1870-457d-afee-b7d92112b4d6","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"5223db39-6d55-473f-8887-5c4b6152b95e","rowguid":"5f3c4717-32e7-4877-b166-78c52da3147a","operatedate":1594177697000,"material_type":"3","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"建设资金说明","sign_ask":"原件加盖申请人公章, 复印件盖“与原件无异”章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":5,"copy_amount":2,"source_explain":"申请人自备（建设资金文字证明为原件，银行存单等材料为复印件）","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500001005","accept_stand":"无","material_prop":"06","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500001"},{"partitionguid":"450700","task_guid":"8e488afa-1870-457d-afee-b7d92112b4d6","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"23e5f195-159c-4a75-9131-09723e4d0c3a","rowguid":"6c0e3f42-1287-4553-89b5-f0f03c29ac36","operatedate":1594177697000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"拟改建或者新建建筑物的设计草图、位置图、效果图及可行性报告","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":3,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500001003","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500001"},{"partitionguid":"450700","task_guid":"8e488afa-1870-457d-afee-b7d92112b4d6","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"f208e23b-60ea-4b95-8423-58f1dd2d114a","rowguid":"be009cb9-d1b9-44f3-a6b0-754ab8702f26","operatedate":1594177697000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"宗教活动场所管理组织集体研究同意的书面材料","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":2,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500001002","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500001"},{"partitionguid":"450700","task_guid":"8e488afa-1870-457d-afee-b7d92112b4d6","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"5ae6b2e2-a9c4-427e-b228-7b3387ff23a6","rowguid":"ee85b26c-e5ec-4dd6-89e4-9a5460dc01cd","operatedate":1594177697000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"有权改建或者新建建筑物的材料","sign_ask":"加盖相关部门公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":4,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500001004","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500001"}],"AUDIT_MATERIAL_CONDITION":[],"AUDIT_QA":[{"task_guid":"8e488afa-1870-457d-afee-b7d92112b4d6","partitionguid":"450700","question":"第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；","year":1594137600000,"task_code":"11450721MB155808114000141005000","operateusername":"黄冬燕","ordernum":0,"rowguid":"ac1052f4-47d0-42ba-9cc5-1b998ef30402","operatedate":1594177697000,"missex":"无","answer":"答：根据《关于印发<广西两类宗教活动场所区分标准>的通知》（桂宗通〔2006〕5号）规定，符合下列标准的为寺院、宫观、清真寺、教堂：    第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；    第二、管理机构和规章制度健全，能够独立承担民事责任；    第三、有相对固定的专职或兼职主持宗教活动的宗教教职人员；    第四、主要建筑设施相对独立，符合本宗教的传统规制，不混杂交叉有非宗教方面的房产或人员居住、使用。    不符合上述标准的宗教活动场所，即为其他固定宗教活动处所。","belongxiaqucode":"wwy_fixqa","ywcode":"11450721MB15580811400014100500001","qaid":"87569c66-cfa1-4570-8565-d188c26c8bf2"},{"task_guid":"8e488afa-1870-457d-afee-b7d92112b4d6","partitionguid":"450700","question":"如何区分寺观教堂和其他固定宗教活动处所？","year":1594137600000,"task_code":"11450721MB155808114000141005000","operateusername":"黄冬燕","ordernum":1,"rowguid":"e07f72c0-f3fc-4638-ae53-d6a4121fc677","operatedate":1594177697000,"missex":"无","answer":"答：根据《关于印发<广西两类宗教活动场所区分标准>的通知》（桂宗通〔2006〕5号）规定，符合下列标准的为寺院、宫观、清真寺、教堂：\n    第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；\n    第二、管理机构和规章制度健全，能够独立承担民事责任；\n    第三、有相对固定的专职或兼职主持宗教活动的宗教教职人员；\n    第四、主要建筑设施相对独立，符合本宗教的传统规制，不混杂交叉有非宗教方面的房产或人员居住、使用。\n    不符合上述标准的宗教活动场所，即为其他固定宗教活动处所。","ywcode":"11450721MB15580811400014100500001","qaid":"6eb85769-9cbe-42c0-a337-b4e8d775a955"}],"AUDIT_ITEM_EXTEND":{"partitionguid":"450700","task_guid":"8e488afa-1870-457d-afee-b7d92112b4d6","year":1594137600000,"is_intermediary":"0","amount_limit_desc":"","star_service":"","lead_dept":"","handle_online_address":"http://zwfw.gxzf.gov.cn/gxzwfw/member/login/tologin.do?gotourl=http%3A//zwfw.gxzf.gov.cn/gxzxsb/Apply/tostep1.do?sxbm=11450721MB15580811400014100500001","operateusername":"黄冬燕","rowguid":"ea8228a0-4658-435e-85db-8b4605cafc3f","operatedate":1594177704000,"local_theme_natural_type":"","reform_way":"","result_name":"关于拟同意在XX寺内新建一座大雄宝殿和一座观音殿的意见","is_cert_seperate":"0","four_handle":"2,4","match_dept":"","is_schedule":"0","is_entry_center":"1","result_guid":"55b9d066-8fa0-4e4e-9b56-5dbf58f01de3,a344af49-19c7-434b-876a-5bd4b8a65588","is_online_handle":"1","limit_explain":"","is_joint_org":"0","cjsqmc":"无","is_handle_machine":"0","result_type":"20","wsblsd":"9","is_single_use":"","task_code":"11450721MB155808114000141005000","arrive_charge_way":"","is_amount_limit":"0","is_cert_joint":"0","xzjddm":"无","is_invest":"","sensitives":"0","is_agency":"0","is_intelli_approval":"0","cjsqdm":"无","local_theme_legal_type":"","handle_area":"4","theme_natural_type":"015","scene_reason":"核验原件","is_express":"0","xzjdmc":"无","theme_legal_type":"999","ywcode":"11450721MB15580811400014100500001","is_pay_online":"0"},"AUDIT_ITEM":{"dept_code":"11450721MB15580811","partitionguid":"450700","flow_chart":"800b1984-28a3-45db-961d-cb73a7eb91d8,cc073cad-228d-492a-8388-0f25697b4165","td_tlimit":"","accept_std":"一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。","login_url":"http://zwfw.gxzf.gov.cn/gxzwfw/member/login/tologin.do?gotourl=http%3A//zwfw.gxzf.gov.cn/gxzxsb/Apply/tostep1.do?sxbm=11450721MB15580811400014100500001","accept_name":"根据《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十条规定：在宗教活动场所内改建或者新建建筑物，应当具备下列条件：\n    1.确有改建或者新建建筑物的需要，并经该场所管理组织集体研究同意；\n    2.拟改建或者新建的建筑物符合该宗教的建筑规制，与该场所的环境相协调；\n    3.符合城乡规划和文物、风景名胜区、建设、消防、环保等方面的规定；\n    4.有必要的建设资金，资金来源渠道合法；","other_supervise":"无","exercise_content":"灵山县范围内在在宗教活动场所内改建或者新建建筑物（不影响该宗教活动场所现有布局和功能的）审批由灵山县行政审批局实施。","link_way":"0777-6428001","create_date":1594177697000,"project_type":"2","is_need_entry":"1","task_code":"11450721MB155808114000141005000","entrust_name":"","query_url":"http://qzls.zwfw.gxzf.gov.cn/\n0777-6428001","supervise_way":"0777-6428880","catalog_id":"36ca6109-33df-11e9-89bc-fa163ea9bf82","anticipate_day_explain":"《宗教事务条例》规定","publicity_url":"","item_source":"1","transact_app_url":"","promise_day_explain":"办事提速。申请人准备、修改材料不计入承诺办结时限。","ywcode":"11450721MB15580811400014100500001","pre_dept_name":"无","inspection_review":"3","promise_type":"1","task_name":"在宗教活动场所内改建或者新建建筑物（不影响该宗教活动场所现有布局和功能的）审批","handle_publicity":"05","pre_task_name":"无","serve_type":"1,9","use_level":"4","areacode":"450721","promise_day":"10","rowguid":"8e488afa-1870-457d-afee-b7d92112b4d6","anticipate_day":"20","other_link":"无","authority_division":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十二条：申请在宗教活动场所内改建或者新建建筑物,由宗教活动场所将申请材料报所在地县级人民政府宗教事务部门。拟改建或者新建的建筑物不影响宗教活动场所现有布局和功能的，由县级人民政府宗教事务部门自受理之日起20日内，作出批准或者不予批准的决定。拟改建或者新建的建筑物改变宗教活动场所现有布局和功能的，由县级人民政府宗教事务部门提出意见，属于寺观教堂的，经设区的市级人民政府宗教事务部门审核，报省级人民政府宗教事务部门，省级人民政府宗教事务部门应当自收到材料之日起20日内，作出批准或者不予批准的决定；属于其他固定宗教活动处所的，报设区的市级人民政府宗教事务部门，设区的市级人民政府宗教事务部门应当自收到材料之日起20日内，作出批准或者不予批准的决定。","is_td":"0","publishdate":1594177804000,"publishstatus":"1","dept_type":"1","catalog_code":"000141005000","task_version":"7","is_fee":"0","audit_state":"40","is_mobile_entry":"0","item_id":"17be9f40-f16d-4a18-a28a-b031678dbc8e","limit_scene_num":"1","version_date":1594177734000,"dept_name":"灵山县行政审批局","task_state":"1","reconsiderat":"公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。","td_conrection_way":"","anticipate_type":"1","litigation":"1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。 2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。","handle_type":"1,2","progress_query_way":"01,02","scene_reason":"","task_type":"01"},"AUDIT_ITEM_SPECIAL":[],"AUDIT_ITEM_CONDITION":[]},{"AUDIT_ITEM_BYLAW":[{"law_id":"6d53ce80-4b82-4ae2-a96c-cd0a9b8069e6","task_guid":"9609fb67-57dd-456c-ab44-b0300f3aa4e3","partitionguid":"450700","cataloglawid":"9c51805d-c7e0-4cd4-b14f-5b28db059dd8","law_name":"《宗教事务条例》","year":1594173507000,"law_number":"（2004年11月30日国务院令第426号，2017年8月26日修订）","clause_number":"第三十三条第一款","clause_content":"“在宗教活动场所内改建或者新建建筑物，应当经所在地县级以上地方人民政府宗教事务部门批准后，依法办理规划、建设等手续。”","rowguid":"45e98e17-8fe5-47f8-9171-6f6f03aefc0d","operatedate":1594173507000}],"AUDIT_ITEM_WINDOW":[{"traffic_info":"可乘公交1路或101路到县政务服务中心站下车","task_guid":"9609fb67-57dd-456c-ab44-b0300f3aa4e3","partitionguid":"450700","transact_addr":"灵山县三海街道江南路12号县政务服务中心二楼④⑤⑥综合窗口","window_name":"灵山县政务服务中心二楼④⑤⑥综合窗口","window_tel":"0777-6428001","year":1594137600000,"map_url":"https://j.map.baidu.com/ZZyIG","operateusername":"梁敏","rowguid":"7f0fcfe8-83b5-459c-ba84-62864bed2ab9","transact_time":"工作日：上午9:00-12:00、下午2:00-5:00","operatedate":1594173507000,"ordernumber":0,"window_id":"ab4151be-8aff-498c-91f2-7fe1751c6ad6"}],"AUDIT_MATERIAL":[{"partitionguid":"450700","task_guid":"9609fb67-57dd-456c-ab44-b0300f3aa4e3","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"aec52fa5-2cd7-4b98-8df6-47055433c0de","rowguid":"0375f6f5-97f1-481e-9450-4e4364ad03cd","operatedate":1594173507000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"拟改建或者新建建筑物的设计草图、位置图、效果图及可行性报告","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":3,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB155808114000141005000003","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":""},{"partitionguid":"450700","task_guid":"9609fb67-57dd-456c-ab44-b0300f3aa4e3","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"cb85b589-1ee1-491d-8d87-11df6929d268","rowguid":"35a4c653-8641-464c-8d7f-6286ef46ed70","operatedate":1594173507000,"material_type":"3","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"建设资金说明","sign_ask":"原件加盖申请人公章, 复印件盖“与原件无异”章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":5,"copy_amount":2,"source_explain":"申请人自备（建设资金文字证明为原件，银行存单等材料为复印件）","page_format":"A4","is_apply":"1","materialcode":"11450721MB155808114000141005000005","accept_stand":"无","material_prop":"06","fill_explian":"无","form_guid":""},{"partitionguid":"450700","task_guid":"9609fb67-57dd-456c-ab44-b0300f3aa4e3","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"cbe7290b-3d27-4dcf-a6a1-ead03bcf41e2","rowguid":"71e376f6-811b-42d5-87d1-ec1dec23defd","operatedate":1594173507000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"宗教活动场所管理组织集体研究同意的书面材料","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":2,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB155808114000141005000002","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":""},{"partitionguid":"450700","task_guid":"9609fb67-57dd-456c-ab44-b0300f3aa4e3","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"b9326a4a-301a-4559-a6d4-fc83c2cc577c","rowguid":"9a399993-ecf5-4b9e-a2f2-2c6a537af26e","operatedate":1594173507000,"material_type":"1","is_need":"1","example_guid":"bafcc6b1-7358-47ec-bd66-85945d179db4","original_amount":2,"jzbm_way":"","material_name":"申请书（内容包括拟改建或者新建建筑物的项目说明及理由等）","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":1,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB155808114000141005000001","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"631d90bc-5862-4de4-9ba0-e4b8327ae053"},{"partitionguid":"450700","task_guid":"9609fb67-57dd-456c-ab44-b0300f3aa4e3","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"52e1b08f-91f6-479e-9717-9174b19ed3be","rowguid":"b9a8014d-551a-44e7-856b-98f9d8ab1d6b","operatedate":1594173507000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"有权改建或者新建建筑物的材料","sign_ask":"加盖相关部门公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":4,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB155808114000141005000004","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":""}],"AUDIT_MATERIAL_CONDITION":[],"AUDIT_QA":[{"task_guid":"9609fb67-57dd-456c-ab44-b0300f3aa4e3","partitionguid":"450700","question":"第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；","year":1594137600000,"task_code":"11450721MB155808114000141005000","operateusername":"黄冬燕","ordernum":0,"rowguid":"a61216a9-850f-4136-9173-6e9ee8a11168","operatedate":1594173507000,"missex":"无","answer":"答：根据《关于印发<广西两类宗教活动场所区分标准>的通知》（桂宗通〔2006〕5号）规定，符合下列标准的为寺院、宫观、清真寺、教堂：    第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；    第二、管理机构和规章制度健全，能够独立承担民事责任；    第三、有相对固定的专职或兼职主持宗教活动的宗教教职人员；    第四、主要建筑设施相对独立，符合本宗教的传统规制，不混杂交叉有非宗教方面的房产或人员居住、使用。    不符合上述标准的宗教活动场所，即为其他固定宗教活动处所。","belongxiaqucode":"wwy_fixqa","qaid":"9bc30cdf-a782-4725-ac86-4761912b53cb"},{"task_guid":"9609fb67-57dd-456c-ab44-b0300f3aa4e3","partitionguid":"450700","missex":"无","question":"如何区分寺观教堂和其他固定宗教活动处所？","answer":"答：根据《关于印发<广西两类宗教活动场所区分标准>的通知》（桂宗通〔2006〕5号）规定，符合下列标准的为寺院、宫观、清真寺、教堂：\n    第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；\n    第二、管理机构和规章制度健全，能够独立承担民事责任；\n    第三、有相对固定的专职或兼职主持宗教活动的宗教教职人员；\n    第四、主要建筑设施相对独立，符合本宗教的传统规制，不混杂交叉有非宗教方面的房产或人员居住、使用。\n    不符合上述标准的宗教活动场所，即为其他固定宗教活动处所。","year":1594137600000,"task_code":"11450721MB155808114000141005000","operateusername":"黄冬燕","ordernum":1,"rowguid":"dacd32fc-8b62-4410-8afd-8bc42378d96a","operatedate":1594173507000,"qaid":"ea11a144-86db-4131-a109-fbeb67331976"}],"AUDIT_ITEM_EXTEND":{"partitionguid":"450700","task_guid":"9609fb67-57dd-456c-ab44-b0300f3aa4e3","year":1594137600000,"is_intermediary":"0","amount_limit_desc":"","star_service":"","lead_dept":"","handle_online_address":"http://zwfw.gxzf.gov.cn/gxzwfw/member/login/tologin.do?gotourl=http%3A//zwfw.gxzf.gov.cn/gxzxsb/Apply/tostep1.do?sxbm=11450721MB155808114000141005000","rowguid":"1265847f-fd98-4bfa-b571-b8cb447bec34","operatedate":1594173526000,"local_theme_natural_type":"","reform_way":"","result_name":"关于拟同意在XX寺内新建一座大雄宝殿和一座观音殿的意见","is_cert_seperate":"0","four_handle":"2,4","match_dept":"","is_schedule":"0","is_entry_center":"1","result_guid":"e9e5fb05-7f57-432e-a1e0-3fae392a2bb0,fff372d5-a571-4f93-b8fb-2d0e6f5c332a","is_online_handle":"1","limit_explain":"","is_joint_org":"0","cjsqmc":"无","is_handle_machine":"0","result_type":"20","wsblsd":"9","is_single_use":"","task_code":"11450721MB155808114000141005000","arrive_charge_way":"","is_amount_limit":"0","is_cert_joint":"0","xzjddm":"无","is_invest":"","sensitives":"0","is_agency":"0","is_intelli_approval":"0","cjsqdm":"无","local_theme_legal_type":"","handle_area":"4","theme_natural_type":"015","scene_reason":"核验原件","is_express":"0","xzjdmc":"无","theme_legal_type":"999","is_pay_online":"0"},"AUDIT_ITEM":{"dept_code":"11450721MB15580811","partitionguid":"450700","flow_chart":"b5e3526a-c9c2-48da-a401-be28836f66bb,f961f765-1ee7-4a2d-bbed-ac70e062edaf","td_tlimit":"","accept_std":"一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。","login_url":"http://zwfw.gxzf.gov.cn/gxzwfw/member/login/tologin.do?gotourl=http%3A//zwfw.gxzf.gov.cn/gxzxsb/Apply/tostep1.do?sxbm=11450721MB155808114000141005000","accept_name":"根据《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十条规定：在宗教活动场所内改建或者新建建筑物，应当具备下列条件：\n    1.确有改建或者新建建筑物的需要，并经该场所管理组织集体研究同意；\n    2.拟改建或者新建的建筑物符合该宗教的建筑规制，与该场所的环境相协调；\n    3.符合城乡规划和文物、风景名胜区、建设、消防、环保等方面的规定；\n    4.有必要的建设资金，资金来源渠道合法；","other_supervise":"无","exercise_content":"灵山县范围内在在宗教活动场所内改建或者新建建筑物（不影响该宗教活动场所现有布局和功能的）审批由钦州市行政审批局实施。","link_way":"0777-6428001","create_date":1594173507000,"project_type":"2","is_need_entry":"1","task_code":"11450721MB155808114000141005000","entrust_name":"","query_url":"http://qzls.zwfw.gxzf.gov.cn/\n0777-6428001","supervise_way":"0777-6428880","catalog_id":"36ca6109-33df-11e9-89bc-fa163ea9bf82","anticipate_day_explain":"《宗教事务条例》规定","publicity_url":"","item_source":"1","transact_app_url":"","promise_day_explain":"办事提速。申请人准备、修改材料不计入承诺办结时限。","ywcode":"","pre_dept_name":"无","inspection_review":"3","promise_type":"1","task_name":"在宗教活动场所内改建或者新建建筑物审批","handle_publicity":"05","pre_task_name":"无","serve_type":"1,9","use_level":"4","areacode":"450721","promise_day":"10","rowguid":"9609fb67-57dd-456c-ab44-b0300f3aa4e3","anticipate_day":"20","other_link":"无","authority_division":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十二条：申请在宗教活动场所内改建或者新建建筑物,由宗教活动场所将申请材料报所在地县级人民政府宗教事务部门。拟改建或者新建的建筑物不影响宗教活动场所现有布局和功能的，由县级人民政府宗教事务部门自受理之日起20日内，作出批准或者不予批准的决定。拟改建或者新建的建筑物改变宗教活动场所现有布局和功能的，由县级人民政府宗教事务部门提出意见，属于寺观教堂的，经设区的市级人民政府宗教事务部门审核，报省级人民政府宗教事务部门，省级人民政府宗教事务部门应当自收到材料之日起20日内，作出批准或者不予批准的决定；属于其他固定宗教活动处所的，报设区的市级人民政府宗教事务部门，设区的市级人民政府宗教事务部门应当自收到材料之日起20日内，作出批准或者不予批准的决定。","is_td":"0","publishdate":1594177804000,"publishstatus":"1","dept_type":"1","catalog_code":"000141005000","task_version":"14","is_fee":"0","audit_state":"40","is_mobile_entry":"0","item_id":"ce55c007-63ab-4082-a7e9-03109d8b9f46","limit_scene_num":"1","version_date":1594173555000,"dept_name":"灵山县行政审批局","task_state":"1","reconsiderat":"公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。","td_conrection_way":"","anticipate_type":"1","litigation":"1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。 2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。","handle_type":"1,2","progress_query_way":"01,02","scene_reason":"","task_type":"01"},"AUDIT_ITEM_SPECIAL":[],"AUDIT_ITEM_CONDITION":[]},{"AUDIT_ITEM_BYLAW":[{"law_id":"6d53ce80-4b82-4ae2-a96c-cd0a9b8069e6","task_guid":"5fb0d34c-0b10-4972-bebc-276c8198b9e3","partitionguid":"450700","cataloglawid":"9c51805d-c7e0-4cd4-b14f-5b28db059dd8","law_name":"《宗教事务条例》","year":1594177697000,"law_number":"（2004年11月30日国务院令第426号，2017年8月26日修订）","clause_number":"第三十三条第一款","clause_content":"“在宗教活动场所内改建或者新建建筑物，应当经所在地县级以上地方人民政府宗教事务部门批准后，依法办理规划、建设等手续。”","rowguid":"01957259-05ca-4db4-8395-1a147daba6e7","operatedate":1594177697000}],"AUDIT_ITEM_WINDOW":[{"traffic_info":"可乘公交1路或101路到县政务服务中心站下车","task_guid":"5fb0d34c-0b10-4972-bebc-276c8198b9e3","partitionguid":"450700","transact_addr":"灵山县三海街道江南路12号县政务服务中心二楼④⑤⑥综合窗口","window_name":"灵山县政务中心二楼④⑤⑥综合窗口","window_tel":"0777-6428001","year":1594137600000,"map_url":"https://j.map.baidu.com/ZZyIG","operateusername":"阮文敏","rowguid":"2f29d5c6-dd0a-425e-8ffa-3e5e4d654e74","transact_time":"工作日：上午9:00-12:00、下午２:00-５:00","operatedate":1594177697000,"ordernumber":0,"window_id":"9599968f-3c0f-49dc-86fc-fb6be1ad43d3"}],"AUDIT_MATERIAL":[{"partitionguid":"450700","task_guid":"5fb0d34c-0b10-4972-bebc-276c8198b9e3","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"23e5f195-159c-4a75-9131-09723e4d0c3a","rowguid":"3f3b277e-1d61-443a-93aa-d0a2dc86b39e","operatedate":1594177697000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"拟改建或者新建建筑物的设计草图、位置图、效果图及可行性报告","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":3,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500001003","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500001"},{"partitionguid":"450700","task_guid":"5fb0d34c-0b10-4972-bebc-276c8198b9e3","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"5ae6b2e2-a9c4-427e-b228-7b3387ff23a6","rowguid":"4be2f3f8-3d32-4140-a96a-21748e61e4eb","operatedate":1594177697000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"有权改建或者新建建筑物的材料","sign_ask":"加盖相关部门公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":4,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500001004","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500001"},{"partitionguid":"450700","task_guid":"5fb0d34c-0b10-4972-bebc-276c8198b9e3","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"0eaceea3-bebe-4c4c-9e0d-243fa2e40f15","rowguid":"577492da-6d6f-41f4-b06b-779f3bc83a73","operatedate":1594177697000,"material_type":"1","is_need":"1","example_guid":"59c5d7a2-a4a0-4655-9ab0-b10ebe4c1bd5","original_amount":2,"jzbm_way":"","material_name":"申请书，内容包括拟改建或者新建建筑物的项目说明及理由","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":1,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500001001","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"918b3020-a935-46e5-aef8-f7c9f0eb46bc","ywcode":"11450721MB15580811400014100500001"},{"partitionguid":"450700","task_guid":"5fb0d34c-0b10-4972-bebc-276c8198b9e3","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"f208e23b-60ea-4b95-8423-58f1dd2d114a","rowguid":"708c00c7-7c60-4a68-920d-fc3b91b46f29","operatedate":1594177697000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"宗教活动场所管理组织集体研究同意的书面材料","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":2,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500001002","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500001"},{"partitionguid":"450700","task_guid":"5fb0d34c-0b10-4972-bebc-276c8198b9e3","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"5223db39-6d55-473f-8887-5c4b6152b95e","rowguid":"af1d33b1-fd78-4312-a3fd-999286e17803","operatedate":1594177697000,"material_type":"3","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"建设资金说明","sign_ask":"原件加盖申请人公章, 复印件盖“与原件无异”章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":5,"copy_amount":2,"source_explain":"申请人自备（建设资金文字证明为原件，银行存单等材料为复印件）","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500001005","accept_stand":"无","material_prop":"06","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500001"}],"AUDIT_MATERIAL_CONDITION":[],"AUDIT_QA":[{"task_guid":"5fb0d34c-0b10-4972-bebc-276c8198b9e3","partitionguid":"450700","question":"第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；","year":1594137600000,"task_code":"11450721MB155808114000141005000","operateusername":"黄冬燕","ordernum":0,"rowguid":"38072105-7f28-454c-9cc6-e6d18dfdd85f","operatedate":1594177697000,"missex":"无","answer":"答：根据《关于印发<广西两类宗教活动场所区分标准>的通知》（桂宗通〔2006〕5号）规定，符合下列标准的为寺院、宫观、清真寺、教堂：    第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；    第二、管理机构和规章制度健全，能够独立承担民事责任；    第三、有相对固定的专职或兼职主持宗教活动的宗教教职人员；    第四、主要建筑设施相对独立，符合本宗教的传统规制，不混杂交叉有非宗教方面的房产或人员居住、使用。    不符合上述标准的宗教活动场所，即为其他固定宗教活动处所。","belongxiaqucode":"wwy_fixqa","ywcode":"11450721MB15580811400014100500001","qaid":"87569c66-cfa1-4570-8565-d188c26c8bf2"},{"task_guid":"5fb0d34c-0b10-4972-bebc-276c8198b9e3","partitionguid":"450700","question":"如何区分寺观教堂和其他固定宗教活动处所？","year":1594137600000,"task_code":"11450721MB155808114000141005000","operateusername":"黄冬燕","ordernum":1,"rowguid":"792f57c7-0f37-4ea4-9f6e-2456b1aa326e","operatedate":1594177697000,"missex":"无","answer":"答：根据《关于印发<广西两类宗教活动场所区分标准>的通知》（桂宗通〔2006〕5号）规定，符合下列标准的为寺院、宫观、清真寺、教堂：\n    第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；\n    第二、管理机构和规章制度健全，能够独立承担民事责任；\n    第三、有相对固定的专职或兼职主持宗教活动的宗教教职人员；\n    第四、主要建筑设施相对独立，符合本宗教的传统规制，不混杂交叉有非宗教方面的房产或人员居住、使用。\n    不符合上述标准的宗教活动场所，即为其他固定宗教活动处所。","ywcode":"11450721MB15580811400014100500001","qaid":"6eb85769-9cbe-42c0-a337-b4e8d775a955"}],"AUDIT_ITEM_EXTEND":{"partitionguid":"450700","task_guid":"5fb0d34c-0b10-4972-bebc-276c8198b9e3","year":1594137600000,"is_intermediary":"0","amount_limit_desc":"","star_service":"","lead_dept":"","handle_online_address":"http://zwfw.gxzf.gov.cn/gxzwfw/member/login/tologin.do?gotourl=http%3A//zwfw.gxzf.gov.cn/gxzxsb/Apply/tostep1.do?sxbm=11450721MB15580811400014100500001","operateusername":"黄冬燕","rowguid":"527f586a-5359-43d3-8bcf-6ad8944ab40b","operatedate":1594177704000,"local_theme_natural_type":"","reform_way":"","result_name":"关于拟同意在XX寺内新建一座大雄宝殿和一座观音殿的意见","is_cert_seperate":"0","four_handle":"2,4","match_dept":"","is_schedule":"0","is_entry_center":"1","result_guid":"57cd0eab-5a18-4ba5-b636-05587cfbc9c9,21d995ce-ae19-4299-a553-693c6f8c6922","is_online_handle":"1","limit_explain":"","is_joint_org":"0","cjsqmc":"无","is_handle_machine":"0","result_type":"20","wsblsd":"9","is_single_use":"","task_code":"11450721MB155808114000141005000","arrive_charge_way":"","is_amount_limit":"0","is_cert_joint":"0","xzjddm":"无","is_invest":"","sensitives":"0","is_agency":"0","is_intelli_approval":"0","cjsqdm":"无","local_theme_legal_type":"","handle_area":"4","theme_natural_type":"015","scene_reason":"核验原件","is_express":"0","xzjdmc":"无","theme_legal_type":"999","ywcode":"11450721MB15580811400014100500001","is_pay_online":"0"},"AUDIT_ITEM":{"dept_code":"11450721MB15580811","partitionguid":"450700","flow_chart":"9022de4b-260b-4ab2-853b-f122e2defd31,fdffad39-4346-4868-b10d-26cbb001d034","td_tlimit":"","accept_std":"一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。","login_url":"http://zwfw.gxzf.gov.cn/gxzwfw/member/login/tologin.do?gotourl=http%3A//zwfw.gxzf.gov.cn/gxzxsb/Apply/tostep1.do?sxbm=11450721MB15580811400014100500001","accept_name":"根据《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十条规定：在宗教活动场所内改建或者新建建筑物，应当具备下列条件：\n    1.确有改建或者新建建筑物的需要，并经该场所管理组织集体研究同意；\n    2.拟改建或者新建的建筑物符合该宗教的建筑规制，与该场所的环境相协调；\n    3.符合城乡规划和文物、风景名胜区、建设、消防、环保等方面的规定；\n    4.有必要的建设资金，资金来源渠道合法；","other_supervise":"无","exercise_content":"灵山县范围内在在宗教活动场所内改建或者新建建筑物（不影响该宗教活动场所现有布局和功能的）审批由灵山县行政审批局实施。","link_way":"0777-6428001","create_date":1594177697000,"project_type":"2","is_need_entry":"1","task_code":"11450721MB155808114000141005000","entrust_name":"","query_url":"http://qzls.zwfw.gxzf.gov.cn/\n0777-6428001","supervise_way":"0777-6428880","catalog_id":"36ca6109-33df-11e9-89bc-fa163ea9bf82","anticipate_day_explain":"《宗教事务条例》规定","publicity_url":"","item_source":"1","transact_app_url":"","promise_day_explain":"办事提速。申请人准备、修改材料不计入承诺办结时限。","ywcode":"11450721MB15580811400014100500001","pre_dept_name":"无","inspection_review":"3","promise_type":"1","task_name":"在宗教活动场所内改建或者新建建筑物（不影响该宗教活动场所现有布局和功能的）审批","handle_publicity":"05","pre_task_name":"无","serve_type":"1,9","use_level":"4","areacode":"450721","promise_day":"8","rowguid":"5fb0d34c-0b10-4972-bebc-276c8198b9e3","anticipate_day":"20","other_link":"无","authority_division":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十二条：申请在宗教活动场所内改建或者新建建筑物,由宗教活动场所将申请材料报所在地县级人民政府宗教事务部门。拟改建或者新建的建筑物不影响宗教活动场所现有布局和功能的，由县级人民政府宗教事务部门自受理之日起20日内，作出批准或者不予批准的决定。拟改建或者新建的建筑物改变宗教活动场所现有布局和功能的，由县级人民政府宗教事务部门提出意见，属于寺观教堂的，经设区的市级人民政府宗教事务部门审核，报省级人民政府宗教事务部门，省级人民政府宗教事务部门应当自收到材料之日起20日内，作出批准或者不予批准的决定；属于其他固定宗教活动处所的，报设区的市级人民政府宗教事务部门，设区的市级人民政府宗教事务部门应当自收到材料之日起20日内，作出批准或者不予批准的决定。","is_td":"0","publishdate":1595924299000,"publishstatus":"1","dept_type":"1","catalog_code":"000141005000","task_version":"8","is_fee":"0","audit_state":"40","is_mobile_entry":"0","item_id":"17be9f40-f16d-4a18-a28a-b031678dbc8e","limit_scene_num":"1","version_date":1595923999000,"dept_name":"灵山县行政审批局","task_state":"1","reconsiderat":"公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。","td_conrection_way":"","anticipate_type":"1","litigation":"1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。 2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。","handle_type":"1,2","progress_query_way":"01,02","scene_reason":"","task_type":"01"},"AUDIT_ITEM_SPECIAL":[],"AUDIT_ITEM_CONDITION":[]},{"AUDIT_ITEM_BYLAW":[{"law_id":"6d53ce80-4b82-4ae2-a96c-cd0a9b8069e6","task_guid":"3ed4add7-bcb8-4fad-8238-6f8f35866a6b","partitionguid":"450700","cataloglawid":"9c51805d-c7e0-4cd4-b14f-5b28db059dd8","law_name":"《宗教事务条例》","year":1582081877000,"law_number":"（2004年11月30日国务院令第426号，2017年8月26日修订）","clause_number":"第三十三条第一款","clause_content":"“在宗教活动场所内改建或者新建建筑物，应当经所在地县级以上地方人民政府宗教事务部门批准后，依法办理规划、建设等手续。”","rowguid":"057a5abf-07e3-43a9-a5de-dcc7233d428f","operatedate":1582081877000}],"AUDIT_ITEM_WINDOW":[{"traffic_info":"可乘公交1路或101路到县政务服务中心站下车","task_guid":"3ed4add7-bcb8-4fad-8238-6f8f35866a6b","partitionguid":"450700","transact_addr":"灵山县三海街道江南路12号县政务服务中心二楼④⑤⑥综合窗口","window_name":"灵山县政务中心二楼④⑤⑥综合窗口","window_tel":"0777-6428001","year":1582041600000,"map_url":"https://j.map.baidu.com/ZZyIG","operateusername":"阮文敏","rowguid":"ee8b1972-121b-4daf-9ee3-e8adca553386","transact_time":"工作日：上午9:00-12:00、下午２:00-５:00","operatedate":1582081877000,"ordernumber":0,"window_id":"f16963b8-d84c-4fed-9c65-8320bea82853"}],"AUDIT_MATERIAL":[{"partitionguid":"450700","task_guid":"3ed4add7-bcb8-4fad-8238-6f8f35866a6b","is_generate_ecert":"0","year":1582041600000,"is_jzbm":"","materialid":"810a3a95-b47a-4ec3-b4b2-40d666e4357e","rowguid":"3c2f2868-6f8e-4740-b8a3-7a79ad9cb809","operatedate":1582081877000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"宗教活动场所管理组织集体研究同意的书面材料","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":2,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500002002","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500002"},{"partitionguid":"450700","task_guid":"3ed4add7-bcb8-4fad-8238-6f8f35866a6b","is_generate_ecert":"0","year":1582041600000,"is_jzbm":"","materialid":"acc02a6b-9db9-4ed8-94a0-fc4614ad4163","rowguid":"c8249147-e743-4445-a253-83524ea7c7a8","operatedate":1582081877000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"有权改建或者新建建筑物的材料","sign_ask":"加盖相关部门公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":4,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500002004","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500002"},{"partitionguid":"450700","task_guid":"3ed4add7-bcb8-4fad-8238-6f8f35866a6b","is_generate_ecert":"0","year":1582041600000,"is_jzbm":"","materialid":"424dd2a1-5270-467a-a7ae-6f2aaca10e64","rowguid":"d9b3d97c-5fd7-4078-8b79-423941f1a71d","operatedate":1582081877000,"material_type":"1","is_need":"1","example_guid":"5d718d5b-540f-49be-bb6c-6a13bfeb9c68","original_amount":2,"jzbm_way":"","material_name":"申请书，内容包括拟改建或者新建建筑物的项目说明及理由","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":1,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500002001","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"70483aec-99d3-4046-bf8a-986fd4f88186","ywcode":"11450721MB15580811400014100500002"},{"partitionguid":"450700","task_guid":"3ed4add7-bcb8-4fad-8238-6f8f35866a6b","is_generate_ecert":"0","year":1582041600000,"is_jzbm":"","materialid":"991fa69f-2df0-42a0-94d6-3d3d42d2545f","rowguid":"da5a1955-2917-4e2e-a1f3-a6c445445340","operatedate":1582081877000,"material_type":"3","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"建设资金说明","sign_ask":"原件加盖申请人公章, 复印件盖“与原件无异”章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":5,"copy_amount":2,"source_explain":"申请人自备（建设资金文字证明为原件，银行存单等材料为复印件）","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500002005","accept_stand":"无","material_prop":"06","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500002"},{"partitionguid":"450700","task_guid":"3ed4add7-bcb8-4fad-8238-6f8f35866a6b","is_generate_ecert":"0","year":1582041600000,"is_jzbm":"","materialid":"029560cf-3d35-45b4-b196-8af406779eed","rowguid":"e1607baa-2a59-4e44-8665-8bba8faf956d","operatedate":1582081970000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"拟改建或者新建建筑物的设计草图、位置图、效果图及可行性报告","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":3,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500002003","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500002"}],"AUDIT_MATERIAL_CONDITION":[],"AUDIT_QA":[{"task_guid":"3ed4add7-bcb8-4fad-8238-6f8f35866a6b","partitionguid":"450700","question":"第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；","year":1582041600000,"task_code":"11450721MB155808114000141005000","operateusername":"黄冬燕","ordernum":0,"rowguid":"57bf9c12-e2ac-4a8b-895c-2d60f348ffa9","operatedate":1582081877000,"missex":"无","answer":"答：根据《关于印发<广西两类宗教活动场所区分标准>的通知》（桂宗通〔2006〕5号）规定，符合下列标准的为寺院、宫观、清真寺、教堂：    第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；    第二、管理机构和规章制度健全，能够独立承担民事责任；    第三、有相对固定的专职或兼职主持宗教活动的宗教教职人员；    第四、主要建筑设施相对独立，符合本宗教的传统规制，不混杂交叉有非宗教方面的房产或人员居住、使用。    不符合上述标准的宗教活动场所，即为其他固定宗教活动处所。","belongxiaqucode":"wwy_fixqa","ywcode":"11450721MB15580811400014100500002","qaid":"87569c66-cfa1-4570-8565-d188c26c8bf2"},{"task_guid":"3ed4add7-bcb8-4fad-8238-6f8f35866a6b","partitionguid":"450700","question":"如何区分寺观教堂和其他固定宗教活动处所？","year":1582041600000,"task_code":"11450721MB155808114000141005000","operateusername":"黄冬燕","ordernum":1,"rowguid":"741ad2d0-a601-4d7e-a33a-6216580ea621","operatedate":1582081877000,"missex":"无","answer":"答：根据《关于印发<广西两类宗教活动场所区分标准>的通知》（桂宗通〔2006〕5号）规定，符合下列标准的为寺院、宫观、清真寺、教堂：\n    第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；\n    第二、管理机构和规章制度健全，能够独立承担民事责任；\n    第三、有相对固定的专职或兼职主持宗教活动的宗教教职人员；\n    第四、主要建筑设施相对独立，符合本宗教的传统规制，不混杂交叉有非宗教方面的房产或人员居住、使用。\n    不符合上述标准的宗教活动场所，即为其他固定宗教活动处所。","ywcode":"11450721MB15580811400014100500002","qaid":"6eb85769-9cbe-42c0-a337-b4e8d775a955"}],"AUDIT_ITEM_EXTEND":{"partitionguid":"450700","task_guid":"3ed4add7-bcb8-4fad-8238-6f8f35866a6b","year":1582041600000,"is_intermediary":"0","amount_limit_desc":"","star_service":"","lead_dept":"","handle_online_address":"http://qzls.zwfw.gxzf.gov.cn/","operateusername":"黄冬燕","rowguid":"9a54f403-2323-4bba-8fb7-ba8299f6f357","operatedate":1582081877000,"local_theme_natural_type":"","reform_way":"","result_name":"关于拟同意在XX寺内新建一座大雄宝殿和一座观音殿的意见","is_cert_seperate":"0","four_handle":"2,4","match_dept":"","is_schedule":"0","is_entry_center":"1","result_guid":"312ca0af-75f7-485c-b3d5-e6c50ac3270c,b7712644-e252-4f95-879a-24e43fc90355","is_online_handle":"1","limit_explain":"","is_joint_org":"0","cjsqmc":"无","is_handle_machine":"0","result_type":"20","wsblsd":"9","is_single_use":"","task_code":"11450721MB155808114000141005000","arrive_charge_way":"","is_amount_limit":"0","is_cert_joint":"0","xzjddm":"无","is_invest":"","sensitives":"0","is_agency":"0","is_intelli_approval":"0","cjsqdm":"无","local_theme_legal_type":"","handle_area":"4","theme_natural_type":"015","scene_reason":"核验原件","is_express":"0","xzjdmc":"无","theme_legal_type":"999","ywcode":"11450721MB15580811400014100500002","is_pay_online":"0"},"AUDIT_ITEM":{"dept_code":"11450721MB15580811","partitionguid":"450700","flow_chart":"871d0632-88ec-466c-9e80-4ad72defa5c4,a9456f4d-e92f-4665-a4c0-6ddef6c379b0","td_tlimit":"","accept_std":"一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。","login_url":"http://qzls.zwfw.gxzf.gov.cn/","accept_name":"根据《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十条规定：在宗教活动场所内改建或者新建建筑物，应当具备下列条件：\n    1.确有改建或者新建建筑物的需要，并经该场所管理组织集体研究同意；\n    2.拟改建或者新建的建筑物符合该宗教的建筑规制，与该场所的环境相协调；\n    3.符合城乡规划和文物、风景名胜区、建设、消防、环保等方面的规定；\n    4.有必要的建设资金，资金来源渠道合法；","other_supervise":"无","exercise_content":"灵山县范围内在在宗教活动场所内改建或者新建建筑物（不影响该宗教活动场所现有布局和功能的）审批由灵山县行政审批局实施。","link_way":"0777-6428001","create_date":1582081877000,"project_type":"2","is_need_entry":"1","task_code":"11450721MB155808114000141005000","entrust_name":"","query_url":"http://qzls.zwfw.gxzf.gov.cn/\n0777-6428001","supervise_way":"0777-6428880","catalog_id":"36ca6109-33df-11e9-89bc-fa163ea9bf82","anticipate_day_explain":"《宗教事务条例》规定","publicity_url":"","item_source":"1","transact_app_url":"","promise_day_explain":"办事提速。申请人准备、修改材料不计入承诺办结时限。","ywcode":"11450721MB15580811400014100500002","pre_dept_name":"无","inspection_review":"3","promise_type":"1","task_name":"在宗教活动场所内改建或者新建建筑物（拟改变该宗教活动场所现有布局和功能的）审核上报","handle_publicity":"05","pre_task_name":"无","serve_type":"1,9","use_level":"4","areacode":"450721","promise_day":"8","rowguid":"3ed4add7-bcb8-4fad-8238-6f8f35866a6b","anticipate_day":"20","other_link":"无","authority_division":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十二条：申请在宗教活动场所内改建或者新建建筑物,由宗教活动场所将申请材料报所在地县级人民政府宗教事务部门。拟改建或者新建的建筑物不影响宗教活动场所现有布局和功能的，由县级人民政府宗教事务部门自受理之日起20日内，作出批准或者不予批准的决定。拟改建或者新建的建筑物改变宗教活动场所现有布局和功能的，由县级人民政府宗教事务部门提出意见，属于寺观教堂的，经设区的市级人民政府宗教事务部门审核，报省级人民政府宗教事务部门，省级人民政府宗教事务部门应当自收到材料之日起20日内，作出批准或者不予批准的决定；属于其他固定宗教活动处所的，报设区的市级人民政府宗教事务部门，设区的市级人民政府宗教事务部门应当自收到材料之日起20日内，作出批准或者不予批准的决定。","is_td":"0","publishdate":1595924299000,"publishstatus":"1","dept_type":"1","catalog_code":"000141005000","task_version":"7","is_fee":"0","audit_state":"40","is_mobile_entry":"0","item_id":"54879430-1083-4d8b-8305-5624f2a655e9","limit_scene_num":"1","version_date":1595923999000,"dept_name":"灵山县行政审批局","task_state":"1","reconsiderat":"公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。","td_conrection_way":"","anticipate_type":"1","litigation":"1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。 2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。","handle_type":"1,2","progress_query_way":"01,02","scene_reason":"","task_type":"01"},"AUDIT_ITEM_SPECIAL":[],"AUDIT_ITEM_CONDITION":[]},{"AUDIT_ITEM_BYLAW":[{"law_id":"6d53ce80-4b82-4ae2-a96c-cd0a9b8069e6","task_guid":"2d8845e0-3398-451c-8638-2837615ecda9","partitionguid":"450700","cataloglawid":"9c51805d-c7e0-4cd4-b14f-5b28db059dd8","law_name":"《宗教事务条例》","year":1594173507000,"law_number":"（2004年11月30日国务院令第426号，2017年8月26日修订）","clause_number":"第三十三条第一款","clause_content":"“在宗教活动场所内改建或者新建建筑物，应当经所在地县级以上地方人民政府宗教事务部门批准后，依法办理规划、建设等手续。”","rowguid":"a9ef43c8-eee6-47cb-94d2-0d3506b97736","operatedate":1594173507000}],"AUDIT_ITEM_WINDOW":[{"traffic_info":"可乘公交1路或101路到县政务服务中心站下车","task_guid":"2d8845e0-3398-451c-8638-2837615ecda9","partitionguid":"450700","transact_addr":"灵山县三海街道江南路12号县政务服务中心二楼④⑤⑥综合窗口","window_name":"灵山县政务服务中心二楼④⑤⑥综合窗口","window_tel":"0777-6428001","year":1594137600000,"map_url":"https://j.map.baidu.com/ZZyIG","operateusername":"梁敏","rowguid":"e14d83a2-f6cb-4654-aff4-0e41d1468012","transact_time":"工作日：上午9:00-12:00、下午2:00-5:00","operatedate":1594173507000,"ordernumber":0,"window_id":"ab4151be-8aff-498c-91f2-7fe1751c6ad6"}],"AUDIT_MATERIAL":[{"partitionguid":"450700","task_guid":"2d8845e0-3398-451c-8638-2837615ecda9","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"cb85b589-1ee1-491d-8d87-11df6929d268","rowguid":"5c7f42d4-3971-432b-8f27-608f99eedade","operatedate":1594173507000,"material_type":"3","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"建设资金说明","sign_ask":"原件加盖申请人公章, 复印件盖“与原件无异”章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":5,"copy_amount":2,"source_explain":"申请人自备（建设资金文字证明为原件，银行存单等材料为复印件）","page_format":"A4","is_apply":"1","materialcode":"11450721MB155808114000141005000005","accept_stand":"无","material_prop":"06","fill_explian":"无","form_guid":""},{"partitionguid":"450700","task_guid":"2d8845e0-3398-451c-8638-2837615ecda9","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"b9326a4a-301a-4559-a6d4-fc83c2cc577c","rowguid":"c2b8195c-f6ee-4a69-8958-c52a43b728b8","operatedate":1594173507000,"material_type":"1","is_need":"1","example_guid":"96565481-4e7d-4e69-b32a-9c13a255114d","original_amount":2,"jzbm_way":"","material_name":"申请书（内容包括拟改建或者新建建筑物的项目说明及理由等）","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":1,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB155808114000141005000001","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"0c070fe8-6695-4a21-a06f-fbb570dc8ddc"},{"partitionguid":"450700","task_guid":"2d8845e0-3398-451c-8638-2837615ecda9","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"cbe7290b-3d27-4dcf-a6a1-ead03bcf41e2","rowguid":"dedd304c-211e-48be-8b6d-16328fff57aa","operatedate":1594173507000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"宗教活动场所管理组织集体研究同意的书面材料","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":2,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB155808114000141005000002","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":""},{"partitionguid":"450700","task_guid":"2d8845e0-3398-451c-8638-2837615ecda9","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"52e1b08f-91f6-479e-9717-9174b19ed3be","rowguid":"e8a3850b-8aeb-49d1-9f40-410a17b73f4a","operatedate":1594173507000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"有权改建或者新建建筑物的材料","sign_ask":"加盖相关部门公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":4,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB155808114000141005000004","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":""},{"partitionguid":"450700","task_guid":"2d8845e0-3398-451c-8638-2837615ecda9","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"aec52fa5-2cd7-4b98-8df6-47055433c0de","rowguid":"f347e403-7993-4fae-ab61-f0eeb6fca5b0","operatedate":1594173507000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"拟改建或者新建建筑物的设计草图、位置图、效果图及可行性报告","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":3,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB155808114000141005000003","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":""}],"AUDIT_MATERIAL_CONDITION":[],"AUDIT_QA":[{"task_guid":"2d8845e0-3398-451c-8638-2837615ecda9","partitionguid":"450700","question":"第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；","year":1594137600000,"task_code":"11450721MB155808114000141005000","operateusername":"黄冬燕","ordernum":0,"rowguid":"4ae32917-12d5-4c2f-b2f8-47b556cf65c1","operatedate":1594173507000,"missex":"无","answer":"答：根据《关于印发<广西两类宗教活动场所区分标准>的通知》（桂宗通〔2006〕5号）规定，符合下列标准的为寺院、宫观、清真寺、教堂：    第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；    第二、管理机构和规章制度健全，能够独立承担民事责任；    第三、有相对固定的专职或兼职主持宗教活动的宗教教职人员；    第四、主要建筑设施相对独立，符合本宗教的传统规制，不混杂交叉有非宗教方面的房产或人员居住、使用。    不符合上述标准的宗教活动场所，即为其他固定宗教活动处所。","belongxiaqucode":"wwy_fixqa","qaid":"9bc30cdf-a782-4725-ac86-4761912b53cb"},{"task_guid":"2d8845e0-3398-451c-8638-2837615ecda9","partitionguid":"450700","missex":"无","question":"如何区分寺观教堂和其他固定宗教活动处所？","answer":"答：根据《关于印发<广西两类宗教活动场所区分标准>的通知》（桂宗通〔2006〕5号）规定，符合下列标准的为寺院、宫观、清真寺、教堂：\n    第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；\n    第二、管理机构和规章制度健全，能够独立承担民事责任；\n    第三、有相对固定的专职或兼职主持宗教活动的宗教教职人员；\n    第四、主要建筑设施相对独立，符合本宗教的传统规制，不混杂交叉有非宗教方面的房产或人员居住、使用。\n    不符合上述标准的宗教活动场所，即为其他固定宗教活动处所。","year":1594137600000,"task_code":"11450721MB155808114000141005000","operateusername":"黄冬燕","ordernum":1,"rowguid":"a5e8d799-ed18-46b3-b552-1281b41902c7","operatedate":1594173507000,"qaid":"ea11a144-86db-4131-a109-fbeb67331976"}],"AUDIT_ITEM_EXTEND":{"partitionguid":"450700","task_guid":"2d8845e0-3398-451c-8638-2837615ecda9","year":1594137600000,"is_intermediary":"0","amount_limit_desc":"","star_service":"","lead_dept":"","handle_online_address":"http://zwfw.gxzf.gov.cn/gxzwfw/member/login/tologin.do?gotourl=http%3A//zwfw.gxzf.gov.cn/gxzxsb/Apply/tostep1.do?sxbm=11450721MB155808114000141005000","rowguid":"f8d5c1ca-b8ff-4199-bd22-eb13e7de3e1a","operatedate":1594173526000,"local_theme_natural_type":"","reform_way":"","result_name":"关于拟同意在XX寺内新建一座大雄宝殿和一座观音殿的意见","is_cert_seperate":"0","four_handle":"2,4","match_dept":"","is_schedule":"0","is_entry_center":"1","result_guid":"c3d59b3e-00e4-4a54-9884-c28d7470c2ff,c0fb5165-bf00-4be9-b5d8-d0fecd808e67","is_online_handle":"1","limit_explain":"","is_joint_org":"0","cjsqmc":"无","is_handle_machine":"0","result_type":"20","wsblsd":"9","is_single_use":"","task_code":"11450721MB155808114000141005000","arrive_charge_way":"","is_amount_limit":"0","is_cert_joint":"0","xzjddm":"无","is_invest":"","sensitives":"0","is_agency":"0","is_intelli_approval":"0","cjsqdm":"无","local_theme_legal_type":"","handle_area":"4","theme_natural_type":"015","scene_reason":"核验原件","is_express":"0","xzjdmc":"无","theme_legal_type":"999","is_pay_online":"0"},"AUDIT_ITEM":{"dept_code":"11450721MB15580811","partitionguid":"450700","flow_chart":"029d8b0c-d5b8-4562-adb5-8721a53deff4,010b6c8b-55e7-474e-bd45-46405c3b7712","td_tlimit":"","accept_std":"一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。","login_url":"http://zwfw.gxzf.gov.cn/gxzwfw/member/login/tologin.do?gotourl=http%3A//zwfw.gxzf.gov.cn/gxzxsb/Apply/tostep1.do?sxbm=11450721MB155808114000141005000","accept_name":"根据《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十条规定：在宗教活动场所内改建或者新建建筑物，应当具备下列条件：\n    1.确有改建或者新建建筑物的需要，并经该场所管理组织集体研究同意；\n    2.拟改建或者新建的建筑物符合该宗教的建筑规制，与该场所的环境相协调；\n    3.符合城乡规划和文物、风景名胜区、建设、消防、环保等方面的规定；\n    4.有必要的建设资金，资金来源渠道合法；","other_supervise":"无","exercise_content":"灵山县范围内在在宗教活动场所内改建或者新建建筑物（不影响该宗教活动场所现有布局和功能的）审批由钦州市行政审批局实施。","link_way":"0777-6428001","create_date":1594173507000,"project_type":"2","is_need_entry":"1","task_code":"11450721MB155808114000141005000","entrust_name":"","query_url":"http://qzls.zwfw.gxzf.gov.cn/\n0777-6428001","supervise_way":"0777-6428880","catalog_id":"36ca6109-33df-11e9-89bc-fa163ea9bf82","anticipate_day_explain":"《宗教事务条例》规定","publicity_url":"","item_source":"1","transact_app_url":"","promise_day_explain":"办事提速。申请人准备、修改材料不计入承诺办结时限。","ywcode":"","pre_dept_name":"无","inspection_review":"3","promise_type":"1","task_name":"在宗教活动场所内改建或者新建建筑物审批","handle_publicity":"05","pre_task_name":"无","serve_type":"1,9","use_level":"4","areacode":"450721","promise_day":"8","rowguid":"2d8845e0-3398-451c-8638-2837615ecda9","anticipate_day":"20","other_link":"无","authority_division":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十二条：申请在宗教活动场所内改建或者新建建筑物,由宗教活动场所将申请材料报所在地县级人民政府宗教事务部门。拟改建或者新建的建筑物不影响宗教活动场所现有布局和功能的，由县级人民政府宗教事务部门自受理之日起20日内，作出批准或者不予批准的决定。拟改建或者新建的建筑物改变宗教活动场所现有布局和功能的，由县级人民政府宗教事务部门提出意见，属于寺观教堂的，经设区的市级人民政府宗教事务部门审核，报省级人民政府宗教事务部门，省级人民政府宗教事务部门应当自收到材料之日起20日内，作出批准或者不予批准的决定；属于其他固定宗教活动处所的，报设区的市级人民政府宗教事务部门，设区的市级人民政府宗教事务部门应当自收到材料之日起20日内，作出批准或者不予批准的决定。","is_td":"0","publishdate":1595924299000,"publishstatus":"1","dept_type":"1","catalog_code":"000141005000","task_version":"15","is_fee":"0","audit_state":"40","is_mobile_entry":"0","item_id":"ce55c007-63ab-4082-a7e9-03109d8b9f46","limit_scene_num":"1","version_date":1595923999000,"dept_name":"灵山县行政审批局","task_state":"1","reconsiderat":"公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。","td_conrection_way":"","anticipate_type":"1","litigation":"1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。 2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。","handle_type":"1,2","progress_query_way":"01,02","scene_reason":"","task_type":"01"},"AUDIT_ITEM_SPECIAL":[],"AUDIT_ITEM_CONDITION":[]},{"AUDIT_ITEM_BYLAW":[{"law_id":"c4192a43-3818-46a7-9db9-29df4594273a","task_guid":"80d9542a-ee5b-4bd4-8c81-b0d83ad5808e","partitionguid":"450700","cataloglawid":"54c019e7-eba1-46f7-8509-c1380f5fc9ed","year":1596596927000,"clause_number":"第十一条","law_type":"3","ordernum":1,"clause_content":"申请变更民族成份，按照下列程序办理：（一）申请人向户籍所在地的县级人民政府民族事务部门提出申请；（二）县级人民政府民族事务部门对变更申请提出初审意见，对不符合条件的申请予以退回，并书面说明不予受理的理由；对符合条件的申请，自受理之日起的十个工作日内报上一级人民政府民族事务部门审批。对于十个工作日内不能提出初审意见的，经县级人民政府民族事务部门负责人批准，可以延长十个工作日；（三）上一级人民政府民族事务部门应当在收到审批申请之日起的十个工作日内，出具书面审批意见，并反馈给县级人民政府民族事务部门；（四）县级人民政府民族事务部门应当在收到审批意见的十个工作日内，将审批意见告知申请人。审批同意的，并将审批意见、公民申请书及相关证明材料抄送县级人民政府公安部门；（五）公安部门应当依据市级人民政府民族事务部门的审批意见，严格按照公民户籍主项信息变更的管理程序，在十五个工作日内办理公民民族成份变更登记。","rowguid":"886c9ac3-a511-40b7-9df9-dabccbd9e652","operatedate":1596596927000,"law_name":"《中国公民民族成份登记管理办法》","law_dept":"国家民委 公安部","law_number":"国家民委 公安部令第2号","law_date":1451577600000}],"AUDIT_ITEM_WINDOW":[{"traffic_info":"乘公交3路、101路车，在（政务中心）华源大厦站下车往前步行约100m即可到达。","task_guid":"80d9542a-ee5b-4bd4-8c81-b0d83ad5808e","partitionguid":"450700","transact_addr":"灵山县三海街道江南路12号政务服务中心二楼综合窗口11","window_name":"政务服务中心二楼综合窗口11","window_tel":"0777-6428913","year":1596556800000,"map_url":"https://ditu.so.com/?pid=647ecbf970c5323b","ordernumber":0,"rowguid":"0a43caea-8dbb-4717-906f-4cc75f109839","transact_time":"工作日：上午9:00-12:00、下午14:00-17:00","operatedate":1596596927000}],"AUDIT_MATERIAL":[{"partitionguid":"450700","task_guid":"80d9542a-ee5b-4bd4-8c81-b0d83ad5808e","is_generate_ecert":"0","year":1596556800000,"is_jzbm":"","operateusername":"刘雪萍","materialid":"b38a1f7b-91cc-4def-be5c-4d69ce6428a8","rowguid":"00ad4a16-a621-407c-801d-1175c9f67122","operatedate":1596596927000,"material_type":"1","is_need":"2","example_guid":"","original_amount":1,"jzbm_way":"","material_name":"申请变更人出生证","sign_ask":"复印件盖“与原件无异”章","task_code":"TE45072110000000034450708001W01","material_form":"1","page_num":1,"source_type":"99","by_law":"《中国公民民族成份登记管理办法》（国家民委 公安部令第3号）第九条第（五）项，第十条第（四）项","ordernum":6,"copy_amount":0,"source_explain":"出生医院","page_format":"A4","materialcode":"TE45072110000000034450708001W01006","accept_stand":"无","fill_explian":"无","form_guid":""},{"partitionguid":"450700","task_guid":"80d9542a-ee5b-4bd4-8c81-b0d83ad5808e","is_generate_ecert":"0","year":1596556800000,"is_jzbm":"","operateusername":"刘雪萍","materialid":"83a0af4e-f444-408a-8610-3816f337bd90","rowguid":"1c373434-6c70-4476-bb4b-42d04d7a0596","operatedate":1596596927000,"material_type":"1","is_need":"2","example_guid":"","original_amount":1,"jzbm_way":"","material_name":"父母结婚证或离婚证、离婚协议或法院判决书","sign_ask":"复印件盖“与原件无异”章","task_code":"TE45072110000000034450708001W01","material_form":"1","page_num":1,"source_type":"20","by_law":"《中国公民民族成份登记管理办法》（国家民委 公安部令第2号）第九条第（三）（五）项，第十条第（四）项","ordernum":5,"copy_amount":0,"source_explain":"当地民政部门或人民法院","page_format":"A4","materialcode":"TE45072110000000034450708001W01005","accept_stand":"暂无","fill_explian":"暂无","form_guid":""},{"partitionguid":"450700","task_guid":"80d9542a-ee5b-4bd4-8c81-b0d83ad5808e","is_generate_ecert":"0","year":1596556800000,"is_jzbm":"","operateusername":"刘雪萍","materialid":"71259e74-8e73-4ae2-8aca-a842bc4a7634","rowguid":"6a513ca6-996f-4616-83f7-ed3c4ec7a223","operatedate":1596596927000,"material_type":"1","is_need":"1","example_guid":"","original_amount":1,"jzbm_way":"","material_name":"公民本人的居民户口簿及公民的父母或养（继）父（母）的居民户口簿、居民身份证","sign_ask":"复印件盖“与原件无异”章","task_code":"TE45072110000000034450708001W01","material_form":"1","page_num":1,"source_type":"20","by_law":"《中国公民民族成份登记管理办法》（国家民委 公安部令第2号）第九条第（三）项，第十条第（二）项","ordernum":2,"copy_amount":0,"source_explain":"公民本人及养（继）父（母）户籍地派出所","page_format":"A4","materialcode":"TE45072110000000034450708001W01002","accept_stand":"无","fill_explian":"无","form_guid":""},{"partitionguid":"450700","task_guid":"80d9542a-ee5b-4bd4-8c81-b0d83ad5808e","is_generate_ecert":"0","year":1596556800000,"is_jzbm":"","operateusername":"刘雪萍","materialid":"e74039ed-30a1-415e-bf59-84b247c26702","rowguid":"71ad896f-3e7d-4f74-a4b9-8166650ff7e6","operatedate":1596596927000,"material_type":"1","is_need":"1","example_guid":"","original_amount":1,"jzbm_way":"","material_name":"父母子女关系证明","sign_ask":"复印件盖“与原件无异”章","task_code":"TE45072110000000034450708001W01","material_form":"1","page_num":1,"source_type":"20","by_law":"《中国公民民族成份登记管理办法》（国家民委 公安部令第2号）第九条第（四）项，第十条第（三）项","ordernum":7,"copy_amount":0,"source_explain":"户籍所在地乡（镇）人民政府、街道办事处","page_format":"A4","materialcode":"TE45072110000000034450708001W01008","accept_stand":"无","fill_explian":"无","form_guid":""},{"partitionguid":"450700","task_guid":"80d9542a-ee5b-4bd4-8c81-b0d83ad5808e","is_generate_ecert":"0","year":1596556800000,"is_jzbm":"","operateusername":"韦群花","remark":"原件备查，复印件可在窗口复印","materialid":"8cf257dc-f527-4af1-85dd-ee639c35b9d6","rowguid":"88197971-dd36-4fa4-92d4-2ca66b307fbb","operatedate":1596596927000,"material_type":"1","is_need":"1","example_guid":"","original_amount":1,"jzbm_way":"","material_name":"公民本人的居民户口簿及公民的养（继）父（母）的居民户口簿、居民身份证","sign_ask":"复印件盖“与原件无异”章","task_code":"TE45072110000000034450708001W01","material_form":"1","page_num":1,"source_type":"20","by_law":"《中国公民民族成份登记管理办法》（国家民委 公安部令第2号）第九条第（二）项","ordernum":4,"copy_amount":0,"source_explain":"公民本人及养（继）父（母）户籍地派出所","page_format":"A4","materialcode":"TE45072110000000034450708001W01004","accept_stand":"无","fill_explian":"无","form_guid":""},{"partitionguid":"450700","task_guid":"80d9542a-ee5b-4bd4-8c81-b0d83ad5808e","is_generate_ecert":"0","year":1596556800000,"is_jzbm":"","operateusername":"刘雪萍","materialid":"048fe564-3585-4901-b09f-ea9f0e578ce2","rowguid":"9bc16d74-0662-4366-9197-aa3d01d008b8","operatedate":1596596927000,"material_type":"1","is_need":"1","example_guid":"86e9e92b-946d-4e20-89c7-a27edf2912ca","original_amount":4,"jzbm_way":"","material_name":"申请书","sign_ask":"申请人签名","task_code":"TE45072110000000034450708001W01","material_form":"1","page_num":4,"source_type":"10","by_law":"《中国公民民族成份登记管理办法》（国家民委 公安部令第2号）第九条第（一）项","ordernum":1,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","materialcode":"TE45072110000000034450708001W01001","accept_stand":"无","fill_explian":"无","form_guid":"a8bbd4ca-67af-4afe-92fb-1c03be5c3536"},{"partitionguid":"450700","task_guid":"80d9542a-ee5b-4bd4-8c81-b0d83ad5808e","is_generate_ecert":"0","year":1596556800000,"is_jzbm":"","operateusername":"韦群花","remark":"暂无","materialid":"981bd347-4056-49eb-a41a-036f7ac2a200","rowguid":"e0cd1f8c-777b-4ba0-85ea-4c01d30b025b","operatedate":1596596927000,"material_type":"1","is_need":"1","example_guid":"acee7797-a748-4dc5-8064-ad7610aeb7a6","original_amount":3,"jzbm_way":"","material_name":"公民变更民族成份申请审批表","sign_ask":"加盖申请人公章","task_code":"TE45072110000000034450708001W01","material_form":"1","page_num":3,"source_type":"10","by_law":"《中国公民民族成份登记管理办法》（国家民委 公安部令第2号）第九条第（一）项","ordernum":3,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","materialcode":"TE45072110000000034450708001W01003","accept_stand":"暂无","fill_explian":"暂无","form_guid":"c217afd0-611e-4159-a032-053bec6a50c7"}],"AUDIT_MATERIAL_CONDITION":[],"AUDIT_QA":[{"task_guid":"80d9542a-ee5b-4bd4-8c81-b0d83ad5808e","partitionguid":"450700","missex":"无","question":"公民在多少周岁前可以申请变更民族成份？","answer":"未满十八周岁的公民，有下列情况之一的，可以申请变更其民族成份一次。\n（一）父母婚姻关系发生变化，其民族成份与直接抚养的一方不同的；\n（二）父母婚姻关系发生变化，其民族成份与继父（母）的民族成份不同的；\n（三）其民族成份与养父（母）的民族成份不同的。\n年javascript:void(0)满十八周岁的公民，在其年满十八周岁之日起的两年内，可以依据其父或者其母的民族成份申请变更一次。","year":1596556800000,"task_code":"TE45072110000000034450708001W01","operateusername":"杨凌","ordernum":1,"rowguid":"9b040542-a834-478b-950e-f312bc104d63","operatedate":1596596927000,"qaid":"1f9946bb-f62a-4941-ba46-fc1ef6c17934"}],"AUDIT_ITEM_EXTEND":{"partitionguid":"450700","task_guid":"80d9542a-ee5b-4bd4-8c81-b0d83ad5808e","year":1596556800000,"is_intermediary":"0","amount_limit_desc":"","star_service":"","lead_dept":"","handle_online_address":"http://ggpn.zwfw.gxzf.gov.cn/","rowguid":"e20429f4-8856-4e27-ab72-79715adf64d2","operatedate":1596596927000,"local_theme_natural_type":"","reform_way":"","result_name":"关于拟同意公民民族成份变更的批准公文","is_cert_seperate":"0","four_handle":"2,4","match_dept":"","is_schedule":"0","is_entry_center":"1","result_guid":"49a067fe-a827-455d-bbb4-1659a2ce1309,da889bca-41a6-4286-9ab5-40dd7edea447","is_online_handle":"1","limit_explain":"","is_joint_org":"0","cjsqmc":"","is_handle_machine":"0","result_type":"20","wsblsd":"1,3,9,6","is_single_use":"","task_code":"TE45072110000000034450708001W01","arrive_charge_way":"1","is_amount_limit":"0","is_cert_joint":"0","xzjddm":"","is_invest":"","sensitives":"0","is_agency":"0","is_intelli_approval":"0","cjsqdm":"","local_theme_legal_type":"","handle_area":"4","theme_natural_type":"015","scene_reason":"核查原件","is_express":"1","xzjdmc":"","theme_legal_type":"","is_pay_online":"0"},"AUDIT_ITEM":{"dept_code":"TE4507211000000003","partitionguid":"450700","flow_chart":"a664435f-16ff-4e44-abd8-ad868a2d1534,e56b6449-9138-4411-809f-28d1ba26b52c","td_tlimit":"","accept_std":"（一）申请书（表）的审查标准 1.申请人应如实填写各项内容，对提交材料的真实性、完整性负责，不得虚构、伪造或编造事实； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁，不得涂改。文书设定的栏目，应逐项填写完整、准确； 3.申请材料中的表格应使用国际标准A4 或A3 型纸对开正面印制； 4.相关申请表格应由申请相对人填写并本人签名。 （二）证明文件等复印件的审查标准 1.其他各项提交的材料应使用国际标准 A4 型纸打印、复印或按照A4 型纸的规格装订； 2.“证明文件”、“身份证复印件”等均为复印件，经申请人签名确认并注明日期，受理人员应现场核对复印件与原件是否一致； 3.申请人提供的材料应齐全并符合法定形式。 （三）其他材料的审查标准 1.格式要求：应使用国际标准A4 型纸打印或者复印； 2.材料要求：应对提交材料的真实性、完整性负责，不得虚构、伪造或编造事实。","login_url":"http://ggpn.zwfw.gxzf.gov.cn/","accept_name":"年满十八周岁的公民，在其年满十八周岁之日起的两年内，可以依据其父或者其母的民族成份申请变更一次 未满十八周岁的公民，有下列情况之一的，可以申请变更其民族成份一次。 （一）父母婚姻关系发生变化，其民族成份与直接抚养的一方不同的； （二）父母婚姻关系发生变化，其民族成份与继父（母）的民族成份不同的； （三）其民族成份与养父（母）的民族成份不同的。","other_supervise":"无","exercise_content":"中国公民民族成份登记管理办法》（2015年6月16日国家民委 公安部令第2号公布，自2016年1月1日起施行）第十一条规定，申请变更民族成份，按照下列程序办理：（一）申请人向户籍所在地的县级人民政府民族事务部门提出申请；（二）县级人民政府民族事务部门对变更申请提出初审意见，对不符合条件的申请予以退回，并书面说明不予受理的理由；对符合条件的申请，自受理之日起的十个工作日内报上一级人民政府民族事务部门审批。对于十个工作日内不能提出初审意见的，经县级人民政府民族事务部门负责人批准，可以延长十个工作日；（三）上一级人民政府民族事务部门应当在收到审批申请之日起的十个工作日内，出具书面审批意见，并反馈给县级人民政府民族事务部门；（四）县级人民政府民族事务部门应当在收到审批意见的十个工作日内，将审批意见告知申请人。审批同意的，并将审批意见、公民申请书及相关证明材料抄送县级人民政府公安部门；（五）公安部门应当依据市级人民政府民族事务部门的审批意见，严格按照公民户籍主项信息变更的管理程序，在十五个工作日内办理公民民族成份变更登记。","link_way":"0777-6428913","create_date":1596596927000,"project_type":"2","is_need_entry":"1","task_code":"TE45072110000000034450708001W01","entrust_name":"","query_url":"0777-6428913","supervise_way":"0777-6428880","catalog_id":"eef41bbd-232f-45d3-a673-5d92e57ced70","anticipate_day_explain":"县级经其机关负责人批准，可以延长10个工作日","publicity_url":"","item_source":"1","transact_app_url":"","promise_day_explain":"县级经其机关负责人批准，可以延长10个工作日","ywcode":"","pre_dept_name":"无","inspection_review":"3","promise_type":"1","task_name":"公民民族成份变更初审","handle_publicity":"05","pre_task_name":"无","serve_type":"1","use_level":"4","areacode":"450721","promise_day":"1","rowguid":"80d9542a-ee5b-4bd4-8c81-b0d83ad5808e","anticipate_day":"10","other_link":"无","authority_division":"中国公民民族成份登记管理办法》（2015年6月16日国家民委 公安部令第2号公布，自2016年1月1日起施行）第十一条规定，申请变更民族成份，按照下列程序办理：（一）申请人向户籍所在地的县级人民政府民族事务部门提出申请；（二）县级人民政府民族事务部门对变更申请提出初审意见，对不符合条件的申请予以退回，并书面说明不予受理的理由；对符合条件的申请，自受理之日起的十个工作日内报上一级人民政府民族事务部门审批。对于十个工作日内不能提出初审意见的，经县级人民政府民族事务部门负责人批准，可以延长十个工作日；（三）上一级人民政府民族事务部门应当在收到审批申请之日起的十个工作日内，出具书面审批意见，并反馈给县级人民政府民族事务部门；（四）县级人民政府民族事务部门应当在收到审批意见的十个工作日内，将审批意见告知申请人。审批同意的，并将审批意见、公民申请书及相关证明材料抄送县级人民政府公安部门；（五）公安部门应当依据市级人民政府民族事务部门的审批意见，严格按照公民户籍主项信息变更的管理程序，在十五个工作日内办理公民民族成份变更登记。","is_td":"0","publishdate":1596616676000,"publishstatus":"1","dept_type":"1","catalog_code":"450708001W01","task_version":"16","is_fee":"0","audit_state":"40","is_mobile_entry":"0","item_id":"402d4c35-2cb0-4bd4-af0f-5bf1984f6b85","limit_scene_num":"1","version_date":1596598220000,"dept_name":"灵山县民族宗教事务局","task_state":"1","reconsiderat":"公民、法人或其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。","td_conrection_way":"","anticipate_type":"1","litigation":"1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。 2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。","handle_type":"1,2","progress_query_way":"02","scene_reason":"","task_type":"07"},"AUDIT_ITEM_SPECIAL":[],"AUDIT_ITEM_CONDITION":[]},{"AUDIT_ITEM_BYLAW":[{"law_id":"6d53ce80-4b82-4ae2-a96c-cd0a9b8069e6","task_guid":"44a46304-628d-4325-b045-ffd498aeac3a","partitionguid":"450700","cataloglawid":"9c51805d-c7e0-4cd4-b14f-5b28db059dd8","law_name":"《宗教事务条例》","year":1594173507000,"law_number":"（2004年11月30日国务院令第426号，2017年8月26日修订）","clause_number":"第三十三条第一款","clause_content":"“在宗教活动场所内改建或者新建建筑物，应当经所在地县级以上地方人民政府宗教事务部门批准后，依法办理规划、建设等手续。”","rowguid":"9a0ef4c6-37b5-407d-bdb8-671d54832f98","operatedate":1594173507000}],"AUDIT_ITEM_WINDOW":[{"traffic_info":"可乘公交1路或101路到县政务服务中心站下车","task_guid":"44a46304-628d-4325-b045-ffd498aeac3a","partitionguid":"450700","transact_addr":"灵山县三海街道江南路12号县政务服务中心二楼④⑤⑥综合窗口","window_name":"灵山县政务服务中心二楼④⑤⑥综合窗口","window_tel":"0777-6428001","year":1594137600000,"map_url":"https://j.map.baidu.com/ZZyIG","operateusername":"梁敏","rowguid":"828ff66d-b7ab-49d3-af5f-dc67367f02b5","transact_time":"工作日：上午9:00-12:00、下午2:00-5:00","operatedate":1594173507000,"ordernumber":0,"window_id":"ab4151be-8aff-498c-91f2-7fe1751c6ad6"}],"AUDIT_MATERIAL":[{"partitionguid":"450700","task_guid":"44a46304-628d-4325-b045-ffd498aeac3a","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"52e1b08f-91f6-479e-9717-9174b19ed3be","rowguid":"2e58bccf-2aa6-4ad9-8da8-5c8a3ce7c306","operatedate":1594173507000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"有权改建或者新建建筑物的材料","sign_ask":"加盖相关部门公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":4,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB155808114000141005000004","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":""},{"partitionguid":"450700","task_guid":"44a46304-628d-4325-b045-ffd498aeac3a","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"aec52fa5-2cd7-4b98-8df6-47055433c0de","rowguid":"801315b8-5c18-4ec5-adfa-b64ec5789957","operatedate":1594173507000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"拟改建或者新建建筑物的设计草图、位置图、效果图及可行性报告","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":3,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB155808114000141005000003","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":""},{"partitionguid":"450700","task_guid":"44a46304-628d-4325-b045-ffd498aeac3a","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"b9326a4a-301a-4559-a6d4-fc83c2cc577c","rowguid":"c8914530-6f4e-457f-97b4-e9e878d26e6e","operatedate":1594173507000,"material_type":"1","is_need":"1","example_guid":"83a5bf73-6bb1-49f1-9291-09329714e863","original_amount":2,"jzbm_way":"","material_name":"申请书（内容包括拟改建或者新建建筑物的项目说明及理由等）","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":1,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB155808114000141005000001","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"f1c8ccd0-7cd7-4aff-9011-9ae7b455c785"},{"partitionguid":"450700","task_guid":"44a46304-628d-4325-b045-ffd498aeac3a","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"cbe7290b-3d27-4dcf-a6a1-ead03bcf41e2","rowguid":"d6064675-1cc9-434c-9163-3764364e199f","operatedate":1594173507000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"宗教活动场所管理组织集体研究同意的书面材料","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":2,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB155808114000141005000002","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":""},{"partitionguid":"450700","task_guid":"44a46304-628d-4325-b045-ffd498aeac3a","is_generate_ecert":"0","year":1594137600000,"is_jzbm":"","materialid":"cb85b589-1ee1-491d-8d87-11df6929d268","rowguid":"ea6fad91-42ea-4613-b428-7bfa620166b4","operatedate":1594173507000,"material_type":"3","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"建设资金说明","sign_ask":"原件加盖申请人公章, 复印件盖“与原件无异”章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":5,"copy_amount":2,"source_explain":"申请人自备（建设资金文字证明为原件，银行存单等材料为复印件）","page_format":"A4","is_apply":"1","materialcode":"11450721MB155808114000141005000005","accept_stand":"无","material_prop":"06","fill_explian":"无","form_guid":""}],"AUDIT_MATERIAL_CONDITION":[],"AUDIT_QA":[{"task_guid":"44a46304-628d-4325-b045-ffd498aeac3a","partitionguid":"450700","question":"第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；","year":1594137600000,"task_code":"11450721MB155808114000141005000","operateusername":"黄冬燕","ordernum":0,"rowguid":"9353e008-c4c5-4f3f-bd85-0bf8f824f334","operatedate":1594173507000,"missex":"无","answer":"答：根据《关于印发<广西两类宗教活动场所区分标准>的通知》（桂宗通〔2006〕5号）规定，符合下列标准的为寺院、宫观、清真寺、教堂：    第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；    第二、管理机构和规章制度健全，能够独立承担民事责任；    第三、有相对固定的专职或兼职主持宗教活动的宗教教职人员；    第四、主要建筑设施相对独立，符合本宗教的传统规制，不混杂交叉有非宗教方面的房产或人员居住、使用。    不符合上述标准的宗教活动场所，即为其他固定宗教活动处所。","belongxiaqucode":"wwy_fixqa","qaid":"9bc30cdf-a782-4725-ac86-4761912b53cb"},{"task_guid":"44a46304-628d-4325-b045-ffd498aeac3a","partitionguid":"450700","missex":"无","question":"如何区分寺观教堂和其他固定宗教活动处所？","answer":"答：根据《关于印发<广西两类宗教活动场所区分标准>的通知》（桂宗通〔2006〕5号）规定，符合下列标准的为寺院、宫观、清真寺、教堂：\n    第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；\n    第二、管理机构和规章制度健全，能够独立承担民事责任；\n    第三、有相对固定的专职或兼职主持宗教活动的宗教教职人员；\n    第四、主要建筑设施相对独立，符合本宗教的传统规制，不混杂交叉有非宗教方面的房产或人员居住、使用。\n    不符合上述标准的宗教活动场所，即为其他固定宗教活动处所。","year":1594137600000,"task_code":"11450721MB155808114000141005000","operateusername":"黄冬燕","ordernum":1,"rowguid":"9955cff7-ada4-4f78-93bb-071d66b0ca8a","operatedate":1594173507000,"qaid":"ea11a144-86db-4131-a109-fbeb67331976"}],"AUDIT_ITEM_EXTEND":{"partitionguid":"450700","task_guid":"44a46304-628d-4325-b045-ffd498aeac3a","year":1594137600000,"is_intermediary":"0","amount_limit_desc":"","star_service":"","lead_dept":"","handle_online_address":"http://zwfw.gxzf.gov.cn/gxzwfw/member/login/tologin.do?gotourl=http%3A//zwfw.gxzf.gov.cn/gxzxsb/Apply/tostep1.do?sxbm=11450721MB155808114000141005000","rowguid":"2f483b17-6a06-4b11-9d39-a51d5fbad710","operatedate":1594173526000,"local_theme_natural_type":"","reform_way":"","result_name":"关于拟同意在XX寺内新建一座大雄宝殿和一座观音殿的意见","is_cert_seperate":"0","four_handle":"2,4","match_dept":"","is_schedule":"0","is_entry_center":"1","result_guid":"c8dc33cd-85d2-4c37-901e-d7d7021d4ffb,9b940003-50ae-4fcf-b395-a52894bb3380","is_online_handle":"1","limit_explain":"","is_joint_org":"0","cjsqmc":"无","is_handle_machine":"0","result_type":"20","wsblsd":"9","is_single_use":"","task_code":"11450721MB155808114000141005000","arrive_charge_way":"","is_amount_limit":"0","is_cert_joint":"0","xzjddm":"无","is_invest":"","sensitives":"0","is_agency":"0","is_intelli_approval":"0","cjsqdm":"无","local_theme_legal_type":"","handle_area":"4","theme_natural_type":"015","scene_reason":"核验原件","is_express":"0","xzjdmc":"无","theme_legal_type":"999","is_pay_online":"0"},"AUDIT_ITEM":{"dept_code":"11450721MB15580811","partitionguid":"450700","flow_chart":"1bff1127-9ed3-4dd4-99d6-55200fffe9a0,909cf305-c2c7-4dd3-a96c-bb2f901e6257","td_tlimit":"","accept_std":"一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。","login_url":"http://zwfw.gxzf.gov.cn/gxzwfw/member/login/tologin.do?gotourl=http%3A//zwfw.gxzf.gov.cn/gxzxsb/Apply/tostep1.do?sxbm=11450721MB155808114000141005000","accept_name":"根据《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十条规定：在宗教活动场所内改建或者新建建筑物，应当具备下列条件：\n    1.确有改建或者新建建筑物的需要，并经该场所管理组织集体研究同意；\n    2.拟改建或者新建的建筑物符合该宗教的建筑规制，与该场所的环境相协调；\n    3.符合城乡规划和文物、风景名胜区、建设、消防、环保等方面的规定；\n    4.有必要的建设资金，资金来源渠道合法；","other_supervise":"无","exercise_content":"灵山县范围内在在宗教活动场所内改建或者新建建筑物（不影响该宗教活动场所现有布局和功能的）审批由钦州市行政审批局实施。","link_way":"0777-6428001","create_date":1594173507000,"project_type":"2","is_need_entry":"1","task_code":"11450721MB155808114000141005000","entrust_name":"","query_url":"http://qzls.zwfw.gxzf.gov.cn/\n0777-6428001","supervise_way":"0777-6428880","catalog_id":"36ca6109-33df-11e9-89bc-fa163ea9bf82","anticipate_day_explain":"《宗教事务条例》规定","publicity_url":"","item_source":"1","transact_app_url":"","promise_day_explain":"办事提速。申请人准备、修改材料不计入承诺办结时限。","ywcode":"","pre_dept_name":"无","inspection_review":"3","promise_type":"1","task_name":"在宗教活动场所内改建或者新建建筑物审批","handle_publicity":"05","pre_task_name":"无","serve_type":"1,9","use_level":"4","areacode":"450721","promise_day":"5","rowguid":"44a46304-628d-4325-b045-ffd498aeac3a","anticipate_day":"20","other_link":"无","authority_division":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十二条：申请在宗教活动场所内改建或者新建建筑物,由宗教活动场所将申请材料报所在地县级人民政府宗教事务部门。拟改建或者新建的建筑物不影响宗教活动场所现有布局和功能的，由县级人民政府宗教事务部门自受理之日起20日内，作出批准或者不予批准的决定。拟改建或者新建的建筑物改变宗教活动场所现有布局和功能的，由县级人民政府宗教事务部门提出意见，属于寺观教堂的，经设区的市级人民政府宗教事务部门审核，报省级人民政府宗教事务部门，省级人民政府宗教事务部门应当自收到材料之日起20日内，作出批准或者不予批准的决定；属于其他固定宗教活动处所的，报设区的市级人民政府宗教事务部门，设区的市级人民政府宗教事务部门应当自收到材料之日起20日内，作出批准或者不予批准的决定。","is_td":"0","publishdate":1596770841000,"publishstatus":"1","dept_type":"1","catalog_code":"000141005000","task_version":"16","is_fee":"0","audit_state":"40","is_mobile_entry":"0","item_id":"ce55c007-63ab-4082-a7e9-03109d8b9f46","limit_scene_num":"1","version_date":1596769209000,"dept_name":"灵山县行政审批局","task_state":"1","reconsiderat":"公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。","td_conrection_way":"","anticipate_type":"1","litigation":"1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。 2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。","handle_type":"1,2","progress_query_way":"01,02","scene_reason":"","task_type":"01"},"AUDIT_ITEM_SPECIAL":[],"AUDIT_ITEM_CONDITION":[]},{"AUDIT_ITEM_BYLAW":[{"law_id":"6d53ce80-4b82-4ae2-a96c-cd0a9b8069e6","task_guid":"986c4083-a587-4765-936e-cb9c0a671a0f","partitionguid":"450700","cataloglawid":"9c51805d-c7e0-4cd4-b14f-5b28db059dd8","law_name":"《宗教事务条例》","year":1582081877000,"law_number":"（2004年11月30日国务院令第426号，2017年8月26日修订）","clause_number":"第三十三条第一款","clause_content":"“在宗教活动场所内改建或者新建建筑物，应当经所在地县级以上地方人民政府宗教事务部门批准后，依法办理规划、建设等手续。”","rowguid":"2f74bc2f-d6e3-4722-9002-aa7385c907dd","operatedate":1582081877000}],"AUDIT_ITEM_WINDOW":[{"traffic_info":"可乘公交1路或101路到县政务服务中心站下车","task_guid":"986c4083-a587-4765-936e-cb9c0a671a0f","partitionguid":"450700","transact_addr":"灵山县三海街道江南路12号县政务服务中心二楼④⑤⑥综合窗口","window_name":"灵山县政务中心二楼④⑤⑥综合窗口","window_tel":"0777-6428001","year":1582041600000,"map_url":"https://j.map.baidu.com/ZZyIG","operateusername":"阮文敏","rowguid":"00c06c6b-20c1-4dc1-8383-84ced3b0b5e7","transact_time":"工作日：上午9:00-12:00、下午２:00-５:00","operatedate":1582081877000,"ordernumber":0,"window_id":"f16963b8-d84c-4fed-9c65-8320bea82853"}],"AUDIT_MATERIAL":[{"partitionguid":"450700","task_guid":"986c4083-a587-4765-936e-cb9c0a671a0f","is_generate_ecert":"0","year":1582041600000,"is_jzbm":"","materialid":"acc02a6b-9db9-4ed8-94a0-fc4614ad4163","rowguid":"0cdc52b9-a482-4450-ac36-515c50b59e31","operatedate":1582081877000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"有权改建或者新建建筑物的材料","sign_ask":"加盖相关部门公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":4,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500002004","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500002"},{"partitionguid":"450700","task_guid":"986c4083-a587-4765-936e-cb9c0a671a0f","is_generate_ecert":"0","year":1582041600000,"is_jzbm":"","materialid":"810a3a95-b47a-4ec3-b4b2-40d666e4357e","rowguid":"18f91cb1-ada1-4874-8a10-008fe7d5923d","operatedate":1582081877000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"宗教活动场所管理组织集体研究同意的书面材料","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":2,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500002002","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500002"},{"partitionguid":"450700","task_guid":"986c4083-a587-4765-936e-cb9c0a671a0f","is_generate_ecert":"0","year":1582041600000,"is_jzbm":"","materialid":"991fa69f-2df0-42a0-94d6-3d3d42d2545f","rowguid":"7e99ec11-48cc-4c96-96c1-5b006ece7b3b","operatedate":1582081877000,"material_type":"3","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"建设资金说明","sign_ask":"原件加盖申请人公章, 复印件盖“与原件无异”章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":5,"copy_amount":2,"source_explain":"申请人自备（建设资金文字证明为原件，银行存单等材料为复印件）","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500002005","accept_stand":"无","material_prop":"06","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500002"},{"partitionguid":"450700","task_guid":"986c4083-a587-4765-936e-cb9c0a671a0f","is_generate_ecert":"0","year":1582041600000,"is_jzbm":"","materialid":"029560cf-3d35-45b4-b196-8af406779eed","rowguid":"96fca165-c1d2-4cfb-b543-0f90e83ddb75","operatedate":1582081970000,"material_type":"1","is_need":"1","example_guid":"","original_amount":2,"jzbm_way":"","material_name":"拟改建或者新建建筑物的设计草图、位置图、效果图及可行性报告","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":3,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500002003","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"","ywcode":"11450721MB15580811400014100500002"},{"partitionguid":"450700","task_guid":"986c4083-a587-4765-936e-cb9c0a671a0f","is_generate_ecert":"0","year":1582041600000,"is_jzbm":"","materialid":"424dd2a1-5270-467a-a7ae-6f2aaca10e64","rowguid":"f748854b-4735-44bf-bee3-bba9a7601e2e","operatedate":1582081877000,"material_type":"1","is_need":"1","example_guid":"872de97c-44b1-426b-b911-468504b4788d","original_amount":2,"jzbm_way":"","material_name":"申请书，内容包括拟改建或者新建建筑物的项目说明及理由","sign_ask":"加盖申请人公章","task_code":"11450721MB155808114000141005000","material_form":"1","material_assort":"","page_num":2,"source_type":"10","by_law":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十一条","ordernum":1,"copy_amount":0,"source_explain":"申请人自备","page_format":"A4","is_apply":"1","materialcode":"11450721MB15580811400014100500002001","accept_stand":"无","material_prop":"01","fill_explian":"无","form_guid":"2c55fe34-d68f-4c12-a77e-5d33a9a8ab0f","ywcode":"11450721MB15580811400014100500002"}],"AUDIT_MATERIAL_CONDITION":[],"AUDIT_QA":[{"task_guid":"986c4083-a587-4765-936e-cb9c0a671a0f","partitionguid":"450700","question":"第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；","year":1582041600000,"task_code":"11450721MB155808114000141005000","operateusername":"黄冬燕","ordernum":0,"rowguid":"7e883031-b980-4132-b321-62397fb87399","operatedate":1582081877000,"missex":"无","answer":"答：根据《关于印发<广西两类宗教活动场所区分标准>的通知》（桂宗通〔2006〕5号）规定，符合下列标准的为寺院、宫观、清真寺、教堂：    第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；    第二、管理机构和规章制度健全，能够独立承担民事责任；    第三、有相对固定的专职或兼职主持宗教活动的宗教教职人员；    第四、主要建筑设施相对独立，符合本宗教的传统规制，不混杂交叉有非宗教方面的房产或人员居住、使用。    不符合上述标准的宗教活动场所，即为其他固定宗教活动处所。","belongxiaqucode":"wwy_fixqa","ywcode":"11450721MB15580811400014100500002","qaid":"87569c66-cfa1-4570-8565-d188c26c8bf2"},{"task_guid":"986c4083-a587-4765-936e-cb9c0a671a0f","partitionguid":"450700","question":"如何区分寺观教堂和其他固定宗教活动处所？","year":1582041600000,"task_code":"11450721MB155808114000141005000","operateusername":"黄冬燕","ordernum":1,"rowguid":"95f4f454-e0ba-457c-9b77-2458d68c248c","operatedate":1582081877000,"missex":"无","answer":"答：根据《关于印发<广西两类宗教活动场所区分标准>的通知》（桂宗通〔2006〕5号）规定，符合下列标准的为寺院、宫观、清真寺、教堂：\n    第一、建筑物的产权或使用权属场所或宗教团体所有，不属临时租用或借用；\n    第二、管理机构和规章制度健全，能够独立承担民事责任；\n    第三、有相对固定的专职或兼职主持宗教活动的宗教教职人员；\n    第四、主要建筑设施相对独立，符合本宗教的传统规制，不混杂交叉有非宗教方面的房产或人员居住、使用。\n    不符合上述标准的宗教活动场所，即为其他固定宗教活动处所。","ywcode":"11450721MB15580811400014100500002","qaid":"6eb85769-9cbe-42c0-a337-b4e8d775a955"}],"AUDIT_ITEM_EXTEND":{"partitionguid":"450700","task_guid":"986c4083-a587-4765-936e-cb9c0a671a0f","year":1582041600000,"is_intermediary":"0","amount_limit_desc":"","star_service":"","lead_dept":"","handle_online_address":"http://qzls.zwfw.gxzf.gov.cn/","operateusername":"黄冬燕","rowguid":"b947c1e2-9c86-4bcd-9889-533cf13cf6a7","operatedate":1582081877000,"local_theme_natural_type":"","reform_way":"","result_name":"关于拟同意在XX寺内新建一座大雄宝殿和一座观音殿的意见","is_cert_seperate":"0","four_handle":"2,4","match_dept":"","is_schedule":"0","is_entry_center":"1","result_guid":"be69ca23-060f-491d-97bc-903385ede607,7e8bbfed-129f-42df-9fce-569757b9d1d6","is_online_handle":"1","limit_explain":"","is_joint_org":"0","cjsqmc":"无","is_handle_machine":"0","result_type":"20","wsblsd":"9","is_single_use":"","task_code":"11450721MB155808114000141005000","arrive_charge_way":"","is_amount_limit":"0","is_cert_joint":"0","xzjddm":"无","is_invest":"","sensitives":"0","is_agency":"0","is_intelli_approval":"0","cjsqdm":"无","local_theme_legal_type":"","handle_area":"4","theme_natural_type":"015","scene_reason":"核验原件","is_express":"0","xzjdmc":"无","theme_legal_type":"999","ywcode":"11450721MB15580811400014100500002","is_pay_online":"0"},"AUDIT_ITEM":{"dept_code":"11450721MB15580811","partitionguid":"450700","flow_chart":"27e51d7d-16ff-431d-bc8e-53822eace35b,521fc839-2b3c-4220-8af1-89131df7f547","td_tlimit":"","accept_std":"一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。,一、审查方式：书面审查。标准如下： （一）申请书（表）的审查标准 1.对申请人提交的申请书（表）及其相关材料进行完整性、准确性审核； 2.文书应使用钢笔和能够长期保持字迹的墨水填写或打印，做到字迹清楚、文字规范、文面整洁。文书设定的栏目，应逐项填写完整、准确； 3. 申请材料中的表格应使用国际标准A4型纸正面印制； 4. 相关申请表格应由申请相对人、申请单位填写并本人签名、加盖单位公章，没有单位印章的，应由其单位负责人签名。 （二）证明文件等材料的审查标准 1.证明文件等材料应使用国际标准A4型纸打印、复印或按照A4型纸的规格装订； 2. 复印材料应清晰可辨认； 3. 证明材料相关内容与申请书（表）保持一致。 二、审查方式：实地审查。标准如下： 组织2名或者2名以上民族宗教工作部门干部现场检查，重点察看改建或新建建筑物是否影响该寺观教堂现有布局和功能。","login_url":"http://qzls.zwfw.gxzf.gov.cn/","accept_name":"根据《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十条规定：在宗教活动场所内改建或者新建建筑物，应当具备下列条件：\n    1.确有改建或者新建建筑物的需要，并经该场所管理组织集体研究同意；\n    2.拟改建或者新建的建筑物符合该宗教的建筑规制，与该场所的环境相协调；\n    3.符合城乡规划和文物、风景名胜区、建设、消防、环保等方面的规定；\n    4.有必要的建设资金，资金来源渠道合法；","other_supervise":"无","exercise_content":"灵山县范围内在在宗教活动场所内改建或者新建建筑物（不影响该宗教活动场所现有布局和功能的）审批由灵山县行政审批局实施。","link_way":"0777-6428001","create_date":1582081877000,"project_type":"2","is_need_entry":"1","task_code":"11450721MB155808114000141005000","entrust_name":"","query_url":"http://qzls.zwfw.gxzf.gov.cn/\n0777-6428001","supervise_way":"0777-6428880","catalog_id":"36ca6109-33df-11e9-89bc-fa163ea9bf82","anticipate_day_explain":"《宗教事务条例》规定","publicity_url":"","item_source":"1","transact_app_url":"","promise_day_explain":"办事提速。申请人准备、修改材料不计入承诺办结时限。","ywcode":"11450721MB15580811400014100500002","pre_dept_name":"无","inspection_review":"3","promise_type":"1","task_name":"在宗教活动场所内改建或者新建建筑物（拟改变该宗教活动场所现有布局和功能的）审核上报","handle_publicity":"05","pre_task_name":"无","serve_type":"1,9","use_level":"4","areacode":"450721","promise_day":"5","rowguid":"986c4083-a587-4765-936e-cb9c0a671a0f","anticipate_day":"20","other_link":"无","authority_division":"《国家宗教事务局关于印发<宗教事务部分行政许可项目实施办法>的通知》（国宗发〔2018〕11号）第四章第二十二条：申请在宗教活动场所内改建或者新建建筑物,由宗教活动场所将申请材料报所在地县级人民政府宗教事务部门。拟改建或者新建的建筑物不影响宗教活动场所现有布局和功能的，由县级人民政府宗教事务部门自受理之日起20日内，作出批准或者不予批准的决定。拟改建或者新建的建筑物改变宗教活动场所现有布局和功能的，由县级人民政府宗教事务部门提出意见，属于寺观教堂的，经设区的市级人民政府宗教事务部门审核，报省级人民政府宗教事务部门，省级人民政府宗教事务部门应当自收到材料之日起20日内，作出批准或者不予批准的决定；属于其他固定宗教活动处所的，报设区的市级人民政府宗教事务部门，设区的市级人民政府宗教事务部门应当自收到材料之日起20日内，作出批准或者不予批准的决定。","is_td":"0","publishdate":1596770841000,"publishstatus":"1","dept_type":"1","catalog_code":"000141005000","task_version":"8","is_fee":"0","audit_state":"40","is_mobile_entry":"0","item_id":"54879430-1083-4d8b-8305-5624f2a655e9","limit_scene_num":"1","version_date":1596769209000,"dept_name":"灵山县行政审批局","task_state":"1","reconsiderat":"公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。","td_conrection_way":"","anticipate_type":"1","litigation":"1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。 2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。","handle_type":"1,2","progress_query_way":"01,02","scene_reason":"","task_type":"01"},"AUDIT_ITEM_SPECIAL":[],"AUDIT_ITEM_CONDITION":[]}]}}*/
    @JSONField(name = "STATUS")
    private STATUSBean STATUS;
    @JSONField(name = "data")
    private DataBean data;

    public STATUSBean getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(STATUSBean STATUS) {
        this.STATUS = STATUS;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class STATUSBean {
        /**
         * CODE : 00
         * TEXT :
         */

        @JSONField(name = "CODE")
        private String CODE;
        @JSONField(name = "TEXT")
        private String TEXT;

        public StatusBean getStatusBean() {
            StatusBean statusBean = new StatusBean();
            statusBean.setCode(getCODE());
            statusBean.setText(getTEXT());
            return statusBean;

        }

        public String getCODE() {
            return CODE;
        }

        public void setCODE(String CODE) {
            this.CODE = CODE;
        }

        public String getTEXT() {
            return TEXT;
        }

        public void setTEXT(String TEXT) {
            this.TEXT = TEXT;
        }
    }

    public static class DataBean {
        /**
         * LASTTIMESTAMP : 1572880572947
         * RETURNITEMSUNNUM : 1
         * list : [{"AUDIT_ITEM_BYLAW":[{"law_id":"ee0b2a30-cc04-4956-9afe-211e82e0db12","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","cataloglawid":"a83ae371-ef67-42aa-bad9-59572930fb41","law_name":"《固定资产投资项目节能办法》","year":1572244774000,"law_number":"(2016年国家发改委令第44号)","clause_number":"第三条","clause_content":"固定资产投资项目节能审查意见是项目开工建设、竣工验收和运营管理的重要依据。政府投资项目，建设单位在报送项目可行性研究报告前，需取得节能审查机关出具的节能审查意见。企业投资项目，建设单位需在开工建设前取得节能审查机关出具的节能审查意见。未按本办法规定进行节能审查，或节能审查未通过的项目，建设单位不得开工建设，已经建成的不得投入生产、使用。第五条 定资产投资项目节能审查由地方节能审查机关负责。\n国家发展改革委核报国务院审批以及国家发展改革委审批的政府投资项目，建设单位在报送项目可行性研究报告前，需取得省级节能审查机关出具的节能审查意见。国家发展改革委核报国务院核准以及国家发展改革委核准的企业投资项目，建设单位需在开工建设前取得省级节能审查机关出具的节能审查意见。\n年综合能源消费量5000 吨标准煤以上(改扩建项目按照建成投产后年综合能源消费增量计算，电力折算系数按当量值，下同)的固定资产投资项目，其节能审查由省级节能审查机关负责。其他固定资产投资项目，其节能审查管理权限由省级节能审查机关依据实际情况自行决定。第六条 年综合能源消费量不满1000 吨标准煤，且年电力消费量不满500 万千瓦时的固定资产投资项目，以及用能工艺简单、节能潜力小的行业(具体行业目录由国家发展改革委制定并公布)的固定资产投资项目应按照相关节能标准、规范建设，不再单独进行节能审查。《全国人大财政经济委员会办公室关于节能评估审查是否属于行政许可事项的复函》根据行政许可法，上述规定符合设定行政许可的要求和条件。在实际工作中，国家发改委为落实节能法的要求，将节能评估和审查作为项目审批、核准和开工建设的强制性前置条件，节能评估和审查制度与环境评估等一样，已成为固定资产投资项目审批核准制度的重点环节。","rowguid":"773a1fa2-4429-46a7-b488-1dcc2c563eba","operatedate":1572244774000},{"law_id":"fd2f0844-49ff-4764-b1d5-af55282e96c2","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","cataloglawid":"cba9eff3-e57d-48f5-8874-36fb55a725e0","law_name":"《全国人民代表大会常务委员会关于修改<中华人民共和国节约能源法>等六部法律的决定》","year":1572244774000,"law_number":"","clause_number":"","clause_content":"国家实行固定资产投资项目节能评估和审查制度。不符合强制性节能标准的项目，建设单位不得开工建设；已经建成的，不得投入生产、使用。政府投资项目不符合强制性节能标准的，依法负责项目审批的机关不得批准建设。具体办法由国务院管理节能工作的部门会同国务院有关部门制定。","rowguid":"8b2bb3d2-3e10-4700-9b90-2aab8ccf4e8a","operatedate":1572244774000},{"law_id":"7103bc77-ab24-4f7f-911b-f4c897395b56","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","cataloglawid":"ca4db625-42cc-4f5b-9fd9-334cc5a9ecb8","law_name":"《国务院关于加强节能工作的决定》","year":1572244774000,"law_number":"(国发[2006]28号)","clause_number":"第二十三条","clause_content":"建立固定资产投资项目节能评估和审查制度。有关部门和地方人民政府要对固定资产投资项目（含新建、改建、扩建项目）进行节能评估和审查。","rowguid":"a9af8523-5062-410a-865a-edebe8daeef0","operatedate":1572244774000}],"AUDIT_ITEM_WINDOW":[{"traffic_info":"可乘公交1路或101路到县政务服务中心站下车，沿着江南路往南过红绿灯再走50米左右。","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","transact_addr":"灵山县三海街道江南路5号县政务服务中心法人大厅工程建设项目综合窗口（县卫生监督所一楼）。","window_name":"工程建设项目综合窗口","window_tel":"0777-6428820","year":1572192000000,"map_url":"https://j.map.baidu.com/ZZyIG","rowguid":"2c807869-6fab-44f0-89ab-dbfd995398d3","transact_time":"工作日：上午9:00-12:00、下午14：00-17:00","operatedate":1572244774000,"ordernumber":0,"window_id":"6d92c3cf-fa0a-4466-9746-43bf155d7b3d"}],"AUDIT_MATERIAL":[{"partitionguid":"450700","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","is_generate_ecert":"0","year":1572192000000,"is_jzbm":"0","operateusername":"周瑞秋","td_tlimit":"0","materialid":"7e677b6c-fe30-4a69-8724-bd828136d95f","rowguid":"2f0c41ea-9057-4a33-8606-f5a39451285e","operatedate":1572244774000,"material_type":"1","is_need":"1","example_guid":"a49ecc13-4677-4287-bc0b-c07a549a096b","original_amount":1,"jzbm_way":"","material_name":"申请书","sign_ask":"个人签字或签章","task_code":"11450721MB155808114000104002000","material_form":"1","page_num":1,"source_type":"10","by_law":"《广西壮族自治区固定资产投资项目节能审查办法》第八条","ordernum":1,"copy_amount":1,"td_correctway":"","source_explain":"申请人自备","page_format":"A4","accept_stand":"1.内容真实有效；2.符合国家相关法律法规。","fill_explian":"材料内容应如实反映，不得出现弄虚作假情况","form_guid":"5fba5b12-72de-46d0-9824-92bd6453209d"},{"partitionguid":"450700","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","is_generate_ecert":"0","year":1572192000000,"is_jzbm":"0","operateusername":"周瑞秋","td_tlimit":"0","materialid":"fb837e7e-c229-4589-9c42-38004e9b9d60","rowguid":"e25fbce8-e95b-4854-8ac4-3e883bc431f2","operatedate":1572244774000,"material_type":"1","is_need":"1","example_guid":"","original_amount":1,"jzbm_way":"","material_name":"节能报告","sign_ask":"个人签字或签章","task_code":"11450721MB155808114000104002000","material_form":"1","page_num":2,"source_type":"10","by_law":"《广西壮族自治区固定资产投资项目节能审查办法》第八条","ordernum":2,"copy_amount":1,"td_correctway":"","source_explain":"申请人自备","page_format":"A4","accept_stand":"1.内容真实有效；2.符合国家相关法律法规。","fill_explian":"材料内容应如实反映，不得出现弄虚作假情况","form_guid":""}],"AUDIT_MATERIAL_CONDITION":[],"AUDIT_QA":[{"task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","gscapproveproblem":"    1. 是不是所有的固定资产投资项目都必须在可研前获得节能审查意见？\n    答：根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第三条规定，政府投资项目，建设单位在报送项目可行性研究报告前，需取得节能审查机关出具的节能审查意见。企业投资项目，建设单位需在开工建设前取得节能审查机关出具的节能审查意见。\n    2. 跨地区的固定资产投资项目的节能报告如何报送？\n    答：根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第八条规定，跨行政区域的固定资产投资项目，其节能报告可由项目所在地其中一方节能审查机关负责报送，同时抄送项目所在地其他方节能审查机关。","gscapproveprojectcodeid":"Gx-Gsc-App-388-336","question":"是不是所有的固定资产投资项目都必须在可研前获得节能审查意见？","year":1572192000000,"task_code":"11450721MB155808114000104002000","ordernum":1,"rowguid":"15c5d3a2-5c38-4d5d-8ac2-336d1581aaec","operatedate":1572244774000,"missex":"无","answer":"根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第三条规定，政府投资项目，建设单位在报送项目可行性研究报告前，需取得节能审查机关出具的节能审查意见。企业投资项目，建设单位需在开工建设前取得节能审查机关出具的节能审查意见。","qaid":"b84e90c2-4638-43d6-9d64-e1d2e9705060"},{"task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","gscapproveproblem":"    1. 是不是所有的固定资产投资项目都必须在可研前获得节能审查意见？\n    答：根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第三条规定，政府投资项目，建设单位在报送项目可行性研究报告前，需取得节能审查机关出具的节能审查意见。企业投资项目，建设单位需在开工建设前取得节能审查机关出具的节能审查意见。\n    2. 跨地区的固定资产投资项目的节能报告如何报送？\n    答：根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第八条规定，跨行政区域的固定资产投资项目，其节能报告可由项目所在地其中一方节能审查机关负责报送，同时抄送项目所在地其他方节能审查机关。","gscapproveprojectcodeid":"Gx-Gsc-App-388-336","question":"跨地区的固定资产投资项目的节能报告如何报送？","year":1572192000000,"task_code":"11450721MB155808114000104002000","ordernum":2,"rowguid":"4b185d46-e603-4625-a2a3-e8903dc1fb69","operatedate":1572244774000,"missex":"无","answer":"根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第八条规定，跨行政区域的固定资产投资项目，其节能报告可由项目所在地其中一方节能审查机关负责报送，同时抄送项目所在地其他方节能审查机关。","qaid":"519ff111-f4d6-48b3-ad77-e1cc3f7facdb"}],"AUDIT_ITEM_EXTEND":{"partitionguid":"450700","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","year":1572192000000,"is_intermediary":"0","amount_limit_desc":"","star_service":"0","lead_dept":"","handle_online_address":"http://qzls.zwfw.gxzf.gov.cn/","rowguid":"67e861d2-6df3-4bee-b1d2-abb800213c85","operatedate":1572244796000,"local_theme_natural_type":"","reform_way":"","result_name":"灵山县行政审批局关于 xxx 项目节能报告的批复","is_cert_seperate":"0","four_handle":"2,4","match_dept":"","is_schedule":"1","is_entry_center":"1","result_guid":"e7e94e51-b67e-40d1-980c-ebd5a2467e2d,1877b67f-4ec9-47b0-bd83-ef428c2f5561","is_online_handle":"1","limit_explain":"","is_joint_org":"0","cjsqmc":"无","is_handle_machine":"0","service_dept":"受理后:固定资产投资项目节能评审","result_type":"20","wsblsd":"6,1","is_single_use":"0","task_code":"11450721MB155808114000104002000","arrive_charge_way":"","is_amount_limit":"0","is_cert_joint":"0","xzjddm":"无","is_invest":"0","sensitives":"0","is_agency":"0","is_intelli_approval":"0","cjsqdm":"无","local_theme_legal_type":"","handle_area":"4","theme_natural_type":"","scene_reason":"须现场核验材料","is_express":"0","xzjdmc":"无","theme_legal_type":"040","is_pay_online":"0"},"AUDIT_ITEM":{"dept_code":"11450721MB15580811","partitionguid":"450700","flow_chart":"a37a3835-84f8-42b8-96b3-8a64b0403b8c,63ec218d-6822-4cd8-9eed-dde720356637","td_tlimit":"","accept_std":"一、审查方式：机构评审。\n    设定依据：《固定资产投资项目节能审查办法》（国家发展和改革委员会令第44号）第八条  节能审查机关受理固定资产投资项目节能报告后，应委托有关机构进行评审，形成评审意见，作为节能审查的重要依据。\n    二、审查标准：\n    （一）格式、体例\n    1.项目摘要表数据完整、准确，与节能报告内容一致；\n    2.内容、深度、体例符合《固定资产投资项目节能审查办法》、《固定资产投资项目节能评估和审查工作指南》（2014年本）有关要求；\n    3.评估范围准确、合理；\n    4.评估依据准确、适用；\n    5.必要的附录、附件齐全、准确。\n    （二）建设方案、节能措施\n    1.项目建设方案的介绍和分析全面、专业，从节能角度进行分析评价，并提出合理评估意见和建议；\n    2.节能技术措施综述全面，阶段措施合理、有针对性，符合实操性原则，节能效果测算合理，节能管理机制健全。\n    （三）用能设备\n    1.主要用能设备的指标达到先进水平；\n    2.通用设备的能效要求达到先进水平；\n    3.项目未采用国家明令禁止和淘汰的落后设备。\n    （四）数据计算\n    1.基础数据有详细的基本参数支撑，基础数据、基本参数选择真实、合理，有明确的计算过程；\n    2.主要能效指标、工序能耗指标等计算过程清晰，结果准确；\n    3.主要耗能设备、通用设备的参数科学、合理，能效要求（水平）计算过程清晰；\n    4.综合能源消费量计算过程和结果正确，对所在地影响评价合理。\n    （五）能效水平\n    1.能效水平对标分析客观，对比数据真实、合理、可靠；\n    2.合理评价项目能效水平。","login_url":"http://qzls.zwfw.gxzf.gov.cn/","accept_name":"根据《固定资产投资项目节能审查办法》第八条，节能审查机关受理固定资产投资项目节能报告后，应委托有关机构进行评审，形成评审意见，作为节能审查的重要依据。节能审查机关应依据项目是否符合节能有关法律法规、标准规范、政策；项目用能分析是否客观准确，方法是否科学，结论是否准确；节能措施是否合理可行；项目的能源消费量和能效水平是否满足本地区能源消耗总量和强度\u201c双控\u201d管理要求等对项目节能报告进行审查。","other_supervise":"0777-6428880","exercise_content":"对符合以下任一条件的固定资产投资项目进行节能审查：\n    1.国务院投资主管部门核报国务院审批、核准以及国务院投资主管部门审批、核准的固定资产投资项目；\n    2.高耗能高排放（简称\u201c两高\u201d）项目；\n    3.年综合能源消费量5000吨标准煤以上（含5000吨标准煤），或年电力消费量在2500万千瓦时以上（含2500万千瓦时）的固定资产投资项目；\n    4.年综合能源消费量1000吨至5000吨标准煤，或年电力消费量500万千瓦时至2500万千瓦时的固定资产投资项目中属于自治区投资主管部门核报本级人民政府审批或核准的项目，以及自治区投资主管部门审批、核准或备案的固定资产投资项目。","link_way":"0777\u20146428820","create_date":1572244774000,"project_type":"2","is_need_entry":"1","task_code":"11450721MB155808114000104002000","entrust_name":"","query_url":"http://qzls.zwfw.gxzf.gov.cn/","supervise_way":"0777\u20146428880","catalog_id":"36c5fb30-33df-11e9-89bc-fa163ea9bf82","anticipate_day_explain":"除可以当场作出行政许可决定的外，行政机关应当自受理行政许可申请之日起二十日内做出行政许可决定。二十日内不能做出决定的，经本行政机关负责人批准，可以延长十日，并应当将延长期限的理由告知申请人。但是，法律、法规另有规定的，依照其规定。","publicity_url":"http://wsbs.gxzf.gov.cn","item_source":"1","transact_app_url":"","promise_day_explain":"无","ywcode":"","pre_dept_name":"无","inspection_review":"3","promise_type":"1","task_name":"固定资产投资项目节能审查","handle_publicity":"01","pre_task_name":"无","serve_type":"2,3,4,6","use_level":"4","areacode":"450721","promise_day":"5","rowguid":"e7712954-2b2c-44d0-889c-c2ac692479b2","anticipate_day":"20","other_link":"0777-6428820","authority_division":"根据《广西壮族自治区固定资产投资项目节能审查办法》第五条：\n年综合能源消费量在1000吨标准煤（含1000吨标准煤；改扩建项目按照建成投产后年综合能源消费增量计算，电力折算系数按当量值，下同）以上，或年电力消费量500万千瓦时以上（含500万千瓦时）的固定资产投资项目，需要进行节能审查。\n国务院投资主管部门核报国务院审批、核准以及国务院投资主管部门审批、核准的固定资产投资项目，高耗能高排放（简称\u201c两高\u201d）项目，年综合能源消费量5000吨标准煤以上（含5000吨标准煤），或年电力消费量在2500万千瓦时以上（含2500万千瓦时）的固定资产投资项目，其节能审查由自治区节能审查机关负责。\n年综合能源消费量1000吨至5000吨标准煤，或年电力消费量500万千瓦时至2500万千瓦时的固定资产投资项目，其节能审查按照项目管理权限实行分级管理，即自治区、设区市、县（市、区）投资主管部门核报本级人民政府审批或核准的项目，以及自治区、设区市、县（市、区）投资主管部门审批、核准或备案的项目，其节能审查由本级节能审查机关负责。","is_td":"0","publishdate":1572335054000,"publishstatus":"1","dept_type":"1","catalog_code":"000104002000","task_version":"13","is_fee":"0","audit_state":"40","is_mobile_entry":"0","item_id":"e35685d0-b67b-4375-b094-5d6a650992b1","limit_scene_num":"1","version_date":1572244548000,"dept_name":"灵山县行政审批局","task_state":"1","reconsiderat":"公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。","td_conrection_way":"","anticipate_type":"1","litigation":"1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。","handle_type":"1,2","progress_query_way":"02,04","scene_reason":"","task_type":"01"},"AUDIT_ITEM_SPECIAL":[{"task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","special_id":"c0d832bb-3591-4d46-bf2a-b859c3ab42c3","year":1572244774000,"special_name":"9","special_date":15,"rowguid":"25ea329b-6b8b-470c-99ae-b9f73eaf00e9","special_desc":"机构评审：\n《固定资产投资项目节能审查办法》（国家发展和改革委员会令第44号）第八条  节能审查机关受理固定资产投资项目节能报告后，应委托有关机构进行评审，形成评审意见，作为节能审查的重要依据。","operatedate":1572244774000,"special_date_type":"1","special_tel":"0777\u20146428820","special_dept":"灵山县行政审批局","ordernumber":1}],"AUDIT_ITEM_CONDITION":[]}]
         */

        @JSONField(name = "LASTTIMESTAMP")
        private long LASTTIMESTAMP;
        @JSONField(name = "RETURNITEMSUNNUM")
        private int RETURNITEMSUNNUM;
        @JSONField(name = "list")
        private List<ListBean> list;



    public CustomBean getCustomBean() {
        Optional<ListBean> max = list.stream().max((o1, o2) -> Integer.parseInt(o1.AUDITITEM.taskVersion) -
                Integer.parseInt(o2.AUDITITEM.taskVersion));
        if (!max.isPresent()) {
            return null;
        }
        ListBean listBean = max.get();
        CustomBean customBean = new CustomBean();
        customBean.setLastTimeStamp(getLASTTIMESTAMP());
        customBean.setReturnItemSunNum(getRETURNITEMSUNNUM());
        // AUDIT_ITEM
        CustomBean.AuditItemBean auditItemBean = JSONObject.parseObject(JSONObject.toJSONString(listBean.getAUDITITEM()), CustomBean.AuditItemBean.class);
        customBean.setAuditItem(Collections.singletonList(auditItemBean));
        // AUDIT_ITEM_EXTEND
        CustomBean.AuditItemExtendBean auditItemExtendBean = JSONObject.parseObject(JSONObject.toJSONString(listBean.getAUDITITEMEXTEND()), CustomBean.AuditItemExtendBean.class);
        customBean.setAuditItemExtend(Collections.singletonList(auditItemExtendBean));
        // AUDIT_MATERIAL
        List<CustomBean.AuditMaterialBean> auditMaterialBeans = JSONObject.parseArray(JSONObject.toJSONString(listBean.getAUDITMATERIAL()), CustomBean.AuditMaterialBean.class);
        customBean.setAuditMaterial(auditMaterialBeans);
        //AUDIT_QA
        List<CustomBean.AuditQaBean> auditQaBeans = JSONObject.parseArray(JSONObject.toJSONString(listBean.getAUDITQA()), CustomBean.AuditQaBean.class);
        customBean.setAuditQa(auditQaBeans);
        //AUDIT_ITEM_BYLAW
        List<CustomBean.AuditItemBylawBean> auditItemBylawBeans = JSONObject.parseArray(JSONObject.toJSONString(listBean.getAUDITITEMBYLAW()), CustomBean.AuditItemBylawBean.class);
        customBean.setAuditItemBylaw(auditItemBylawBeans);
        //AUDIT_ITEM_WINDOW
        List<CustomBean.AuditItemWindowBean> auditItemWindowBeans = JSONObject.parseArray(JSONObject.toJSONString(listBean.getAUDITITEMWINDOW()), CustomBean.AuditItemWindowBean.class);
        customBean.setAuditItemWindow(auditItemWindowBeans);
        // AUDIT_ITEM_SPECIAL
        List<CustomBean.AuditItemSpecialBean> auditItemSpecialBeans = JSONObject.parseArray(JSONObject.toJSONString(listBean.getAUDITITEMSPECIAL()), CustomBean.AuditItemSpecialBean.class);
        customBean.setAuditItemSpecial(auditItemSpecialBeans);

        List<CustomBean.AuditChargeBean> auditChargeBeans = JSONObject.parseArray(JSONObject.toJSONString(listBean.getAUDITCHARGE()), CustomBean.AuditChargeBean.class);
        customBean.setAuditCharge(auditChargeBeans);
        return customBean;
    }
        public CustomBean getCustomBean(String ywcode) {
            Optional<ListBean> first = list.stream().filter(tuple -> {
                if (StringUtils.isEmpty(ywcode) && StringUtils.isEmpty(tuple.AUDITITEM.getYwcode())) {
                    return true;
                } else {
                    return Objects.equals(tuple.AUDITITEM.getYwcode(), ywcode);
                }
            }).findFirst();
            if (!first.isPresent()) {
                return null;
            }
            ListBean listBean = first.get();
            CustomBean customBean = new CustomBean();
            customBean.setLastTimeStamp(getLASTTIMESTAMP());
            customBean.setReturnItemSunNum(getRETURNITEMSUNNUM());
            // AUDIT_ITEM
            CustomBean.AuditItemBean auditItemBean = JSONObject.parseObject(JSONObject.toJSONString(listBean.getAUDITITEM()), CustomBean.AuditItemBean.class);
            customBean.setAuditItem(Collections.singletonList(auditItemBean));
            // AUDIT_ITEM_EXTEND
            CustomBean.AuditItemExtendBean auditItemExtendBean = JSONObject.parseObject(JSONObject.toJSONString(listBean.getAUDITITEMEXTEND()), CustomBean.AuditItemExtendBean.class);
            customBean.setAuditItemExtend(Collections.singletonList(auditItemExtendBean));
            // AUDIT_MATERIAL
            List<CustomBean.AuditMaterialBean> auditMaterialBeans = JSONObject.parseArray(JSONObject.toJSONString(listBean.getAUDITMATERIAL()), CustomBean.AuditMaterialBean.class);
            customBean.setAuditMaterial(auditMaterialBeans);
            //AUDIT_QA
            List<CustomBean.AuditQaBean> auditQaBeans = JSONObject.parseArray(JSONObject.toJSONString(listBean.getAUDITQA()), CustomBean.AuditQaBean.class);
            customBean.setAuditQa(auditQaBeans);
            //AUDIT_ITEM_BYLAW
            List<CustomBean.AuditItemBylawBean> auditItemBylawBeans = JSONObject.parseArray(JSONObject.toJSONString(listBean.getAUDITITEMBYLAW()), CustomBean.AuditItemBylawBean.class);
            customBean.setAuditItemBylaw(auditItemBylawBeans);
            //AUDIT_ITEM_WINDOW
            List<CustomBean.AuditItemWindowBean> auditItemWindowBeans = JSONObject.parseArray(JSONObject.toJSONString(listBean.getAUDITITEMWINDOW()), CustomBean.AuditItemWindowBean.class);
            customBean.setAuditItemWindow(auditItemWindowBeans);
            // AUDIT_ITEM_SPECIAL
            List<CustomBean.AuditItemSpecialBean> auditItemSpecialBeans = JSONObject.parseArray(JSONObject.toJSONString(listBean.getAUDITITEMSPECIAL()), CustomBean.AuditItemSpecialBean.class);
            customBean.setAuditItemSpecial(auditItemSpecialBeans);

            List<CustomBean.AuditChargeBean> auditChargeBeans = JSONObject.parseArray(JSONObject.toJSONString(listBean.getAUDITCHARGE()), CustomBean.AuditChargeBean.class);

            customBean.setAuditCharge(auditChargeBeans);
            return customBean;
        }

        public long getLASTTIMESTAMP() {
            return LASTTIMESTAMP;
        }

        public void setLASTTIMESTAMP(long LASTTIMESTAMP) {
            this.LASTTIMESTAMP = LASTTIMESTAMP;
        }

        public int getRETURNITEMSUNNUM() {
            return RETURNITEMSUNNUM;
        }

        public void setRETURNITEMSUNNUM(int RETURNITEMSUNNUM) {
            this.RETURNITEMSUNNUM = RETURNITEMSUNNUM;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * AUDIT_ITEM_BYLAW : [{"law_id":"ee0b2a30-cc04-4956-9afe-211e82e0db12","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","cataloglawid":"a83ae371-ef67-42aa-bad9-59572930fb41","law_name":"《固定资产投资项目节能办法》","year":1572244774000,"law_number":"(2016年国家发改委令第44号)","clause_number":"第三条","clause_content":"固定资产投资项目节能审查意见是项目开工建设、竣工验收和运营管理的重要依据。政府投资项目，建设单位在报送项目可行性研究报告前，需取得节能审查机关出具的节能审查意见。企业投资项目，建设单位需在开工建设前取得节能审查机关出具的节能审查意见。未按本办法规定进行节能审查，或节能审查未通过的项目，建设单位不得开工建设，已经建成的不得投入生产、使用。第五条 定资产投资项目节能审查由地方节能审查机关负责。\n国家发展改革委核报国务院审批以及国家发展改革委审批的政府投资项目，建设单位在报送项目可行性研究报告前，需取得省级节能审查机关出具的节能审查意见。国家发展改革委核报国务院核准以及国家发展改革委核准的企业投资项目，建设单位需在开工建设前取得省级节能审查机关出具的节能审查意见。\n年综合能源消费量5000 吨标准煤以上(改扩建项目按照建成投产后年综合能源消费增量计算，电力折算系数按当量值，下同)的固定资产投资项目，其节能审查由省级节能审查机关负责。其他固定资产投资项目，其节能审查管理权限由省级节能审查机关依据实际情况自行决定。第六条 年综合能源消费量不满1000 吨标准煤，且年电力消费量不满500 万千瓦时的固定资产投资项目，以及用能工艺简单、节能潜力小的行业(具体行业目录由国家发展改革委制定并公布)的固定资产投资项目应按照相关节能标准、规范建设，不再单独进行节能审查。《全国人大财政经济委员会办公室关于节能评估审查是否属于行政许可事项的复函》根据行政许可法，上述规定符合设定行政许可的要求和条件。在实际工作中，国家发改委为落实节能法的要求，将节能评估和审查作为项目审批、核准和开工建设的强制性前置条件，节能评估和审查制度与环境评估等一样，已成为固定资产投资项目审批核准制度的重点环节。","rowguid":"773a1fa2-4429-46a7-b488-1dcc2c563eba","operatedate":1572244774000},{"law_id":"fd2f0844-49ff-4764-b1d5-af55282e96c2","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","cataloglawid":"cba9eff3-e57d-48f5-8874-36fb55a725e0","law_name":"《全国人民代表大会常务委员会关于修改<中华人民共和国节约能源法>等六部法律的决定》","year":1572244774000,"law_number":"","clause_number":"","clause_content":"国家实行固定资产投资项目节能评估和审查制度。不符合强制性节能标准的项目，建设单位不得开工建设；已经建成的，不得投入生产、使用。政府投资项目不符合强制性节能标准的，依法负责项目审批的机关不得批准建设。具体办法由国务院管理节能工作的部门会同国务院有关部门制定。","rowguid":"8b2bb3d2-3e10-4700-9b90-2aab8ccf4e8a","operatedate":1572244774000},{"law_id":"7103bc77-ab24-4f7f-911b-f4c897395b56","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","cataloglawid":"ca4db625-42cc-4f5b-9fd9-334cc5a9ecb8","law_name":"《国务院关于加强节能工作的决定》","year":1572244774000,"law_number":"(国发[2006]28号)","clause_number":"第二十三条","clause_content":"建立固定资产投资项目节能评估和审查制度。有关部门和地方人民政府要对固定资产投资项目（含新建、改建、扩建项目）进行节能评估和审查。","rowguid":"a9af8523-5062-410a-865a-edebe8daeef0","operatedate":1572244774000}]
             * AUDIT_ITEM_WINDOW : [{"traffic_info":"可乘公交1路或101路到县政务服务中心站下车，沿着江南路往南过红绿灯再走50米左右。","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","transact_addr":"灵山县三海街道江南路5号县政务服务中心法人大厅工程建设项目综合窗口（县卫生监督所一楼）。","window_name":"工程建设项目综合窗口","window_tel":"0777-6428820","year":1572192000000,"map_url":"https://j.map.baidu.com/ZZyIG","rowguid":"2c807869-6fab-44f0-89ab-dbfd995398d3","transact_time":"工作日：上午9:00-12:00、下午14：00-17:00","operatedate":1572244774000,"ordernumber":0,"window_id":"6d92c3cf-fa0a-4466-9746-43bf155d7b3d"}]
             * AUDIT_MATERIAL : [{"partitionguid":"450700","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","is_generate_ecert":"0","year":1572192000000,"is_jzbm":"0","operateusername":"周瑞秋","td_tlimit":"0","materialid":"7e677b6c-fe30-4a69-8724-bd828136d95f","rowguid":"2f0c41ea-9057-4a33-8606-f5a39451285e","operatedate":1572244774000,"material_type":"1","is_need":"1","example_guid":"a49ecc13-4677-4287-bc0b-c07a549a096b","original_amount":1,"jzbm_way":"","material_name":"申请书","sign_ask":"个人签字或签章","task_code":"11450721MB155808114000104002000","material_form":"1","page_num":1,"source_type":"10","by_law":"《广西壮族自治区固定资产投资项目节能审查办法》第八条","ordernum":1,"copy_amount":1,"td_correctway":"","source_explain":"申请人自备","page_format":"A4","accept_stand":"1.内容真实有效；2.符合国家相关法律法规。","fill_explian":"材料内容应如实反映，不得出现弄虚作假情况","form_guid":"5fba5b12-72de-46d0-9824-92bd6453209d"},{"partitionguid":"450700","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","is_generate_ecert":"0","year":1572192000000,"is_jzbm":"0","operateusername":"周瑞秋","td_tlimit":"0","materialid":"fb837e7e-c229-4589-9c42-38004e9b9d60","rowguid":"e25fbce8-e95b-4854-8ac4-3e883bc431f2","operatedate":1572244774000,"material_type":"1","is_need":"1","example_guid":"","original_amount":1,"jzbm_way":"","material_name":"节能报告","sign_ask":"个人签字或签章","task_code":"11450721MB155808114000104002000","material_form":"1","page_num":2,"source_type":"10","by_law":"《广西壮族自治区固定资产投资项目节能审查办法》第八条","ordernum":2,"copy_amount":1,"td_correctway":"","source_explain":"申请人自备","page_format":"A4","accept_stand":"1.内容真实有效；2.符合国家相关法律法规。","fill_explian":"材料内容应如实反映，不得出现弄虚作假情况","form_guid":""}]
             * AUDIT_MATERIAL_CONDITION : []
             * AUDIT_QA : [{"task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","gscapproveproblem":"    1. 是不是所有的固定资产投资项目都必须在可研前获得节能审查意见？\n    答：根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第三条规定，政府投资项目，建设单位在报送项目可行性研究报告前，需取得节能审查机关出具的节能审查意见。企业投资项目，建设单位需在开工建设前取得节能审查机关出具的节能审查意见。\n    2. 跨地区的固定资产投资项目的节能报告如何报送？\n    答：根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第八条规定，跨行政区域的固定资产投资项目，其节能报告可由项目所在地其中一方节能审查机关负责报送，同时抄送项目所在地其他方节能审查机关。","gscapproveprojectcodeid":"Gx-Gsc-App-388-336","question":"是不是所有的固定资产投资项目都必须在可研前获得节能审查意见？","year":1572192000000,"task_code":"11450721MB155808114000104002000","ordernum":1,"rowguid":"15c5d3a2-5c38-4d5d-8ac2-336d1581aaec","operatedate":1572244774000,"missex":"无","answer":"根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第三条规定，政府投资项目，建设单位在报送项目可行性研究报告前，需取得节能审查机关出具的节能审查意见。企业投资项目，建设单位需在开工建设前取得节能审查机关出具的节能审查意见。","qaid":"b84e90c2-4638-43d6-9d64-e1d2e9705060"},{"task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","gscapproveproblem":"    1. 是不是所有的固定资产投资项目都必须在可研前获得节能审查意见？\n    答：根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第三条规定，政府投资项目，建设单位在报送项目可行性研究报告前，需取得节能审查机关出具的节能审查意见。企业投资项目，建设单位需在开工建设前取得节能审查机关出具的节能审查意见。\n    2. 跨地区的固定资产投资项目的节能报告如何报送？\n    答：根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第八条规定，跨行政区域的固定资产投资项目，其节能报告可由项目所在地其中一方节能审查机关负责报送，同时抄送项目所在地其他方节能审查机关。","gscapproveprojectcodeid":"Gx-Gsc-App-388-336","question":"跨地区的固定资产投资项目的节能报告如何报送？","year":1572192000000,"task_code":"11450721MB155808114000104002000","ordernum":2,"rowguid":"4b185d46-e603-4625-a2a3-e8903dc1fb69","operatedate":1572244774000,"missex":"无","answer":"根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第八条规定，跨行政区域的固定资产投资项目，其节能报告可由项目所在地其中一方节能审查机关负责报送，同时抄送项目所在地其他方节能审查机关。","qaid":"519ff111-f4d6-48b3-ad77-e1cc3f7facdb"}]
             * AUDIT_ITEM_EXTEND : {"partitionguid":"450700","task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","year":1572192000000,"is_intermediary":"0","amount_limit_desc":"","star_service":"0","lead_dept":"","handle_online_address":"http://qzls.zwfw.gxzf.gov.cn/","rowguid":"67e861d2-6df3-4bee-b1d2-abb800213c85","operatedate":1572244796000,"local_theme_natural_type":"","reform_way":"","result_name":"灵山县行政审批局关于 xxx 项目节能报告的批复","is_cert_seperate":"0","four_handle":"2,4","match_dept":"","is_schedule":"1","is_entry_center":"1","result_guid":"e7e94e51-b67e-40d1-980c-ebd5a2467e2d,1877b67f-4ec9-47b0-bd83-ef428c2f5561","is_online_handle":"1","limit_explain":"","is_joint_org":"0","cjsqmc":"无","is_handle_machine":"0","service_dept":"受理后:固定资产投资项目节能评审","result_type":"20","wsblsd":"6,1","is_single_use":"0","task_code":"11450721MB155808114000104002000","arrive_charge_way":"","is_amount_limit":"0","is_cert_joint":"0","xzjddm":"无","is_invest":"0","sensitives":"0","is_agency":"0","is_intelli_approval":"0","cjsqdm":"无","local_theme_legal_type":"","handle_area":"4","theme_natural_type":"","scene_reason":"须现场核验材料","is_express":"0","xzjdmc":"无","theme_legal_type":"040","is_pay_online":"0"}
             * AUDIT_ITEM : {"dept_code":"11450721MB15580811","partitionguid":"450700","flow_chart":"a37a3835-84f8-42b8-96b3-8a64b0403b8c,63ec218d-6822-4cd8-9eed-dde720356637","td_tlimit":"","accept_std":"一、审查方式：机构评审。\n    设定依据：《固定资产投资项目节能审查办法》（国家发展和改革委员会令第44号）第八条  节能审查机关受理固定资产投资项目节能报告后，应委托有关机构进行评审，形成评审意见，作为节能审查的重要依据。\n    二、审查标准：\n    （一）格式、体例\n    1.项目摘要表数据完整、准确，与节能报告内容一致；\n    2.内容、深度、体例符合《固定资产投资项目节能审查办法》、《固定资产投资项目节能评估和审查工作指南》（2014年本）有关要求；\n    3.评估范围准确、合理；\n    4.评估依据准确、适用；\n    5.必要的附录、附件齐全、准确。\n    （二）建设方案、节能措施\n    1.项目建设方案的介绍和分析全面、专业，从节能角度进行分析评价，并提出合理评估意见和建议；\n    2.节能技术措施综述全面，阶段措施合理、有针对性，符合实操性原则，节能效果测算合理，节能管理机制健全。\n    （三）用能设备\n    1.主要用能设备的指标达到先进水平；\n    2.通用设备的能效要求达到先进水平；\n    3.项目未采用国家明令禁止和淘汰的落后设备。\n    （四）数据计算\n    1.基础数据有详细的基本参数支撑，基础数据、基本参数选择真实、合理，有明确的计算过程；\n    2.主要能效指标、工序能耗指标等计算过程清晰，结果准确；\n    3.主要耗能设备、通用设备的参数科学、合理，能效要求（水平）计算过程清晰；\n    4.综合能源消费量计算过程和结果正确，对所在地影响评价合理。\n    （五）能效水平\n    1.能效水平对标分析客观，对比数据真实、合理、可靠；\n    2.合理评价项目能效水平。","login_url":"http://qzls.zwfw.gxzf.gov.cn/","accept_name":"根据《固定资产投资项目节能审查办法》第八条，节能审查机关受理固定资产投资项目节能报告后，应委托有关机构进行评审，形成评审意见，作为节能审查的重要依据。节能审查机关应依据项目是否符合节能有关法律法规、标准规范、政策；项目用能分析是否客观准确，方法是否科学，结论是否准确；节能措施是否合理可行；项目的能源消费量和能效水平是否满足本地区能源消耗总量和强度\u201c双控\u201d管理要求等对项目节能报告进行审查。","other_supervise":"0777-6428880","exercise_content":"对符合以下任一条件的固定资产投资项目进行节能审查：\n    1.国务院投资主管部门核报国务院审批、核准以及国务院投资主管部门审批、核准的固定资产投资项目；\n    2.高耗能高排放（简称\u201c两高\u201d）项目；\n    3.年综合能源消费量5000吨标准煤以上（含5000吨标准煤），或年电力消费量在2500万千瓦时以上（含2500万千瓦时）的固定资产投资项目；\n    4.年综合能源消费量1000吨至5000吨标准煤，或年电力消费量500万千瓦时至2500万千瓦时的固定资产投资项目中属于自治区投资主管部门核报本级人民政府审批或核准的项目，以及自治区投资主管部门审批、核准或备案的固定资产投资项目。","link_way":"0777\u20146428820","create_date":1572244774000,"project_type":"2","is_need_entry":"1","task_code":"11450721MB155808114000104002000","entrust_name":"","query_url":"http://qzls.zwfw.gxzf.gov.cn/","supervise_way":"0777\u20146428880","catalog_id":"36c5fb30-33df-11e9-89bc-fa163ea9bf82","anticipate_day_explain":"除可以当场作出行政许可决定的外，行政机关应当自受理行政许可申请之日起二十日内做出行政许可决定。二十日内不能做出决定的，经本行政机关负责人批准，可以延长十日，并应当将延长期限的理由告知申请人。但是，法律、法规另有规定的，依照其规定。","publicity_url":"http://wsbs.gxzf.gov.cn","item_source":"1","transact_app_url":"","promise_day_explain":"无","ywcode":"","pre_dept_name":"无","inspection_review":"3","promise_type":"1","task_name":"固定资产投资项目节能审查","handle_publicity":"01","pre_task_name":"无","serve_type":"2,3,4,6","use_level":"4","areacode":"450721","promise_day":"5","rowguid":"e7712954-2b2c-44d0-889c-c2ac692479b2","anticipate_day":"20","other_link":"0777-6428820","authority_division":"根据《广西壮族自治区固定资产投资项目节能审查办法》第五条：\n年综合能源消费量在1000吨标准煤（含1000吨标准煤；改扩建项目按照建成投产后年综合能源消费增量计算，电力折算系数按当量值，下同）以上，或年电力消费量500万千瓦时以上（含500万千瓦时）的固定资产投资项目，需要进行节能审查。\n国务院投资主管部门核报国务院审批、核准以及国务院投资主管部门审批、核准的固定资产投资项目，高耗能高排放（简称\u201c两高\u201d）项目，年综合能源消费量5000吨标准煤以上（含5000吨标准煤），或年电力消费量在2500万千瓦时以上（含2500万千瓦时）的固定资产投资项目，其节能审查由自治区节能审查机关负责。\n年综合能源消费量1000吨至5000吨标准煤，或年电力消费量500万千瓦时至2500万千瓦时的固定资产投资项目，其节能审查按照项目管理权限实行分级管理，即自治区、设区市、县（市、区）投资主管部门核报本级人民政府审批或核准的项目，以及自治区、设区市、县（市、区）投资主管部门审批、核准或备案的项目，其节能审查由本级节能审查机关负责。","is_td":"0","publishdate":1572335054000,"publishstatus":"1","dept_type":"1","catalog_code":"000104002000","task_version":"13","is_fee":"0","audit_state":"40","is_mobile_entry":"0","item_id":"e35685d0-b67b-4375-b094-5d6a650992b1","limit_scene_num":"1","version_date":1572244548000,"dept_name":"灵山县行政审批局","task_state":"1","reconsiderat":"公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。","td_conrection_way":"","anticipate_type":"1","litigation":"1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。","handle_type":"1,2","progress_query_way":"02,04","scene_reason":"","task_type":"01"}
             * AUDIT_ITEM_SPECIAL : [{"task_guid":"e7712954-2b2c-44d0-889c-c2ac692479b2","partitionguid":"450700","special_id":"c0d832bb-3591-4d46-bf2a-b859c3ab42c3","year":1572244774000,"special_name":"9","special_date":15,"rowguid":"25ea329b-6b8b-470c-99ae-b9f73eaf00e9","special_desc":"机构评审：\n《固定资产投资项目节能审查办法》（国家发展和改革委员会令第44号）第八条  节能审查机关受理固定资产投资项目节能报告后，应委托有关机构进行评审，形成评审意见，作为节能审查的重要依据。","operatedate":1572244774000,"special_date_type":"1","special_tel":"0777\u20146428820","special_dept":"灵山县行政审批局","ordernumber":1}]
             * AUDIT_ITEM_CONDITION : []
             */

            @JSONField(name = "AUDIT_ITEM_EXTEND")
            private AUDITITEMEXTENDBean AUDITITEMEXTEND;
            @JSONField(name = "AUDIT_ITEM")
            private AUDITITEMBean AUDITITEM;
            @JSONField(name = "AUDIT_ITEM_BYLAW")
            private List<AUDITITEMBYLAWBean> AUDITITEMBYLAW;
            @JSONField(name = "AUDIT_ITEM_WINDOW")
            private List<AUDITITEMWINDOWBean> AUDITITEMWINDOW;
            @JSONField(name = "AUDIT_MATERIAL")
            private List<AUDITMATERIALBean> AUDITMATERIAL;
            @JSONField(name = "AUDIT_MATERIAL_CONDITION")
            private List<?> AUDITMATERIALCONDITION;
            @JSONField(name = "AUDIT_QA")
            private List<AUDITQABean> AUDITQA;
            @JSONField(name = "AUDIT_ITEM_SPECIAL")
            private List<AUDITITEMSPECIALBean> AUDITITEMSPECIAL;
            @JSONField(name = "AUDIT_ITEM_CONDITION")
            private List<?> AUDITITEMCONDITION;


            @JSONField(name = "AUDIT_CHARGE")
            private List<AUDITCHARGEBean> AUDITCHARGE;

            public List<AUDITCHARGEBean> getAUDITCHARGE() {
                return AUDITCHARGE;
            }

            public void setAUDITCHARGE(List<AUDITCHARGEBean> AUDITCHARGE) {
                this.AUDITCHARGE = AUDITCHARGE;
            }

            public AUDITITEMEXTENDBean getAUDITITEMEXTEND() {
                return AUDITITEMEXTEND;
            }

            public void setAUDITITEMEXTEND(AUDITITEMEXTENDBean AUDITITEMEXTEND) {
                this.AUDITITEMEXTEND = AUDITITEMEXTEND;
            }

            public AUDITITEMBean getAUDITITEM() {
                return AUDITITEM;
            }

            public void setAUDITITEM(AUDITITEMBean AUDITITEM) {
                this.AUDITITEM = AUDITITEM;
            }

            public List<AUDITITEMBYLAWBean> getAUDITITEMBYLAW() {
                return AUDITITEMBYLAW;
            }

            public void setAUDITITEMBYLAW(List<AUDITITEMBYLAWBean> AUDITITEMBYLAW) {
                this.AUDITITEMBYLAW = AUDITITEMBYLAW;
            }

            public List<AUDITITEMWINDOWBean> getAUDITITEMWINDOW() {
                return AUDITITEMWINDOW;
            }

            public void setAUDITITEMWINDOW(List<AUDITITEMWINDOWBean> AUDITITEMWINDOW) {
                this.AUDITITEMWINDOW = AUDITITEMWINDOW;
            }

            public List<AUDITMATERIALBean> getAUDITMATERIAL() {
                return AUDITMATERIAL;
            }

            public void setAUDITMATERIAL(List<AUDITMATERIALBean> AUDITMATERIAL) {
                this.AUDITMATERIAL = AUDITMATERIAL;
            }

            public List<?> getAUDITMATERIALCONDITION() {
                return AUDITMATERIALCONDITION;
            }

            public void setAUDITMATERIALCONDITION(List<?> AUDITMATERIALCONDITION) {
                this.AUDITMATERIALCONDITION = AUDITMATERIALCONDITION;
            }

            public List<AUDITQABean> getAUDITQA() {
                return AUDITQA;
            }

            public void setAUDITQA(List<AUDITQABean> AUDITQA) {
                this.AUDITQA = AUDITQA;
            }

            public List<AUDITITEMSPECIALBean> getAUDITITEMSPECIAL() {
                return AUDITITEMSPECIAL;
            }

            public void setAUDITITEMSPECIAL(List<AUDITITEMSPECIALBean> AUDITITEMSPECIAL) {
                this.AUDITITEMSPECIAL = AUDITITEMSPECIAL;
            }

            public List<?> getAUDITITEMCONDITION() {
                return AUDITITEMCONDITION;
            }

            public void setAUDITITEMCONDITION(List<?> AUDITITEMCONDITION) {
                this.AUDITITEMCONDITION = AUDITITEMCONDITION;
            }

            public static class AUDITITEMEXTENDBean {
                /**
                 * partitionguid : 450700
                 * task_guid : e7712954-2b2c-44d0-889c-c2ac692479b2
                 * year : 1572192000000
                 * is_intermediary : 0
                 * amount_limit_desc :
                 * star_service : 0
                 * lead_dept :
                 * handle_online_address : http://qzls.zwfw.gxzf.gov.cn/
                 * rowguid : 67e861d2-6df3-4bee-b1d2-abb800213c85
                 * operatedate : 1572244796000
                 * local_theme_natural_type :
                 * reform_way :
                 * result_name : 灵山县行政审批局关于 xxx 项目节能报告的批复
                 * is_cert_seperate : 0
                 * four_handle : 2,4
                 * match_dept :
                 * is_schedule : 1
                 * is_entry_center : 1
                 * result_guid : e7e94e51-b67e-40d1-980c-ebd5a2467e2d,1877b67f-4ec9-47b0-bd83-ef428c2f5561
                 * is_online_handle : 1
                 * limit_explain :
                 * is_joint_org : 0
                 * cjsqmc : 无
                 * is_handle_machine : 0
                 * service_dept : 受理后:固定资产投资项目节能评审
                 * result_type : 20
                 * wsblsd : 6,1
                 * is_single_use : 0
                 * task_code : 11450721MB155808114000104002000
                 * arrive_charge_way :
                 * is_amount_limit : 0
                 * is_cert_joint : 0
                 * xzjddm : 无
                 * is_invest : 0
                 * sensitives : 0
                 * is_agency : 0
                 * is_intelli_approval : 0
                 * cjsqdm : 无
                 * local_theme_legal_type :
                 * handle_area : 4
                 * theme_natural_type :
                 * scene_reason : 须现场核验材料
                 * is_express : 0
                 * xzjdmc : 无
                 * theme_legal_type : 040
                 * is_pay_online : 0
                 */

                @JSONField(name = "partitionguid")
                private String partitionguid;
                @JSONField(name = "task_guid")
                private String taskGuid;
                @JSONField(name = "year")
                private long year;
                @JSONField(name = "is_intermediary")
                private String isIntermediary;
                @JSONField(name = "amount_limit_desc")
                private String amountLimitDesc;
                @JSONField(name = "star_service")
                private String starService;
                @JSONField(name = "lead_dept")
                private String leadDept;
                @JSONField(name = "handle_online_address")
                private String handleOnlineAddress;
                @JSONField(name = "rowguid")
                private String rowguid;
                @JSONField(name = "operatedate")
                private long operatedate;
                @JSONField(name = "local_theme_natural_type")
                private String localThemeNaturalType;
                @JSONField(name = "reform_way")
                private String reformWay;
                @JSONField(name = "result_name")
                private String resultName;
                @JSONField(name = "is_cert_seperate")
                private String isCertSeperate;
                @JSONField(name = "four_handle")
                private String fourHandle;
                @JSONField(name = "match_dept")
                private String matchDept;
                @JSONField(name = "is_schedule")
                private String isSchedule;
                @JSONField(name = "is_entry_center")
                private String isEntryCenter;
                @JSONField(name = "result_guid")
                private String resultGuid;
                @JSONField(name = "is_online_handle")
                private String isOnlineHandle;
                @JSONField(name = "limit_explain")
                private String limitExplain;
                @JSONField(name = "is_joint_org")
                private String isJointOrg;
                @JSONField(name = "cjsqmc")
                private String cjsqmc;
                @JSONField(name = "is_handle_machine")
                private String isHandleMachine;
                @JSONField(name = "service_dept")
                private String serviceDept;
                @JSONField(name = "result_type")
                private String resultType;
                @JSONField(name = "wsblsd")
                private String wsblsd;
                @JSONField(name = "is_single_use")
                private String isSingleUse;
                @JSONField(name = "task_code")
                private String taskCode;
                @JSONField(name = "arrive_charge_way")
                private String arriveChargeWay;
                @JSONField(name = "is_amount_limit")
                private String isAmountLimit;
                @JSONField(name = "is_cert_joint")
                private String isCertJoint;
                @JSONField(name = "xzjddm")
                private String xzjddm;
                @JSONField(name = "is_invest")
                private String isInvest;
                @JSONField(name = "sensitives")
                private String sensitives;
                @JSONField(name = "is_agency")
                private String isAgency;
                @JSONField(name = "is_intelli_approval")
                private String isIntelliApproval;
                @JSONField(name = "cjsqdm")
                private String cjsqdm;
                @JSONField(name = "local_theme_legal_type")
                private String localThemeLegalType;
                @JSONField(name = "handle_area")
                private String handleArea;
                @JSONField(name = "theme_natural_type")
                private String themeNaturalType;
                @JSONField(name = "scene_reason")
                private String sceneReason;
                @JSONField(name = "is_express")
                private String isExpress;
                @JSONField(name = "xzjdmc")
                private String xzjdmc;
                @JSONField(name = "theme_legal_type")
                private String themeLegalType;
                @JSONField(name = "is_pay_online")
                private String isPayOnline;

                public String getPartitionguid() {
                    return partitionguid;
                }

                public void setPartitionguid(String partitionguid) {
                    this.partitionguid = partitionguid;
                }

                public String getTaskGuid() {
                    return taskGuid;
                }

                public void setTaskGuid(String taskGuid) {
                    this.taskGuid = taskGuid;
                }

                public long getYear() {
                    return year;
                }

                public void setYear(long year) {
                    this.year = year;
                }

                public String getIsIntermediary() {
                    return isIntermediary;
                }

                public void setIsIntermediary(String isIntermediary) {
                    this.isIntermediary = isIntermediary;
                }

                public String getAmountLimitDesc() {
                    return amountLimitDesc;
                }

                public void setAmountLimitDesc(String amountLimitDesc) {
                    this.amountLimitDesc = amountLimitDesc;
                }

                public String getStarService() {
                    return starService;
                }

                public void setStarService(String starService) {
                    this.starService = starService;
                }

                public String getLeadDept() {
                    return leadDept;
                }

                public void setLeadDept(String leadDept) {
                    this.leadDept = leadDept;
                }

                public String getHandleOnlineAddress() {
                    return handleOnlineAddress;
                }

                public void setHandleOnlineAddress(String handleOnlineAddress) {
                    this.handleOnlineAddress = handleOnlineAddress;
                }

                public String getRowguid() {
                    return rowguid;
                }

                public void setRowguid(String rowguid) {
                    this.rowguid = rowguid;
                }

                public long getOperatedate() {
                    return operatedate;
                }

                public void setOperatedate(long operatedate) {
                    this.operatedate = operatedate;
                }

                public String getLocalThemeNaturalType() {
                    return localThemeNaturalType;
                }

                public void setLocalThemeNaturalType(String localThemeNaturalType) {
                    this.localThemeNaturalType = localThemeNaturalType;
                }

                public String getReformWay() {
                    return reformWay;
                }

                public void setReformWay(String reformWay) {
                    this.reformWay = reformWay;
                }

                public String getResultName() {
                    return resultName;
                }

                public void setResultName(String resultName) {
                    this.resultName = resultName;
                }

                public String getIsCertSeperate() {
                    return isCertSeperate;
                }

                public void setIsCertSeperate(String isCertSeperate) {
                    this.isCertSeperate = isCertSeperate;
                }

                public String getFourHandle() {
                    return fourHandle;
                }

                public void setFourHandle(String fourHandle) {
                    this.fourHandle = fourHandle;
                }

                public String getMatchDept() {
                    return matchDept;
                }

                public void setMatchDept(String matchDept) {
                    this.matchDept = matchDept;
                }

                public String getIsSchedule() {
                    return isSchedule;
                }

                public void setIsSchedule(String isSchedule) {
                    this.isSchedule = isSchedule;
                }

                public String getIsEntryCenter() {
                    return isEntryCenter;
                }

                public void setIsEntryCenter(String isEntryCenter) {
                    this.isEntryCenter = isEntryCenter;
                }

                public String getResultGuid() {
                    return resultGuid;
                }

                public void setResultGuid(String resultGuid) {
                    this.resultGuid = resultGuid;
                }

                public String getIsOnlineHandle() {
                    return isOnlineHandle;
                }

                public void setIsOnlineHandle(String isOnlineHandle) {
                    this.isOnlineHandle = isOnlineHandle;
                }

                public String getLimitExplain() {
                    return limitExplain;
                }

                public void setLimitExplain(String limitExplain) {
                    this.limitExplain = limitExplain;
                }

                public String getIsJointOrg() {
                    return isJointOrg;
                }

                public void setIsJointOrg(String isJointOrg) {
                    this.isJointOrg = isJointOrg;
                }

                public String getCjsqmc() {
                    return cjsqmc;
                }

                public void setCjsqmc(String cjsqmc) {
                    this.cjsqmc = cjsqmc;
                }

                public String getIsHandleMachine() {
                    return isHandleMachine;
                }

                public void setIsHandleMachine(String isHandleMachine) {
                    this.isHandleMachine = isHandleMachine;
                }

                public String getServiceDept() {
                    return serviceDept;
                }

                public void setServiceDept(String serviceDept) {
                    this.serviceDept = serviceDept;
                }

                public String getResultType() {
                    return resultType;
                }

                public void setResultType(String resultType) {
                    this.resultType = resultType;
                }

                public String getWsblsd() {
                    return wsblsd;
                }

                public void setWsblsd(String wsblsd) {
                    this.wsblsd = wsblsd;
                }

                public String getIsSingleUse() {
                    return isSingleUse;
                }

                public void setIsSingleUse(String isSingleUse) {
                    this.isSingleUse = isSingleUse;
                }

                public String getTaskCode() {
                    return taskCode;
                }

                public void setTaskCode(String taskCode) {
                    this.taskCode = taskCode;
                }

                public String getArriveChargeWay() {
                    return arriveChargeWay;
                }

                public void setArriveChargeWay(String arriveChargeWay) {
                    this.arriveChargeWay = arriveChargeWay;
                }

                public String getIsAmountLimit() {
                    return isAmountLimit;
                }

                public void setIsAmountLimit(String isAmountLimit) {
                    this.isAmountLimit = isAmountLimit;
                }

                public String getIsCertJoint() {
                    return isCertJoint;
                }

                public void setIsCertJoint(String isCertJoint) {
                    this.isCertJoint = isCertJoint;
                }

                public String getXzjddm() {
                    return xzjddm;
                }

                public void setXzjddm(String xzjddm) {
                    this.xzjddm = xzjddm;
                }

                public String getIsInvest() {
                    return isInvest;
                }

                public void setIsInvest(String isInvest) {
                    this.isInvest = isInvest;
                }

                public String getSensitives() {
                    return sensitives;
                }

                public void setSensitives(String sensitives) {
                    this.sensitives = sensitives;
                }

                public String getIsAgency() {
                    return isAgency;
                }

                public void setIsAgency(String isAgency) {
                    this.isAgency = isAgency;
                }

                public String getIsIntelliApproval() {
                    return isIntelliApproval;
                }

                public void setIsIntelliApproval(String isIntelliApproval) {
                    this.isIntelliApproval = isIntelliApproval;
                }

                public String getCjsqdm() {
                    return cjsqdm;
                }

                public void setCjsqdm(String cjsqdm) {
                    this.cjsqdm = cjsqdm;
                }

                public String getLocalThemeLegalType() {
                    return localThemeLegalType;
                }

                public void setLocalThemeLegalType(String localThemeLegalType) {
                    this.localThemeLegalType = localThemeLegalType;
                }

                public String getHandleArea() {
                    return handleArea;
                }

                public void setHandleArea(String handleArea) {
                    this.handleArea = handleArea;
                }

                public String getThemeNaturalType() {
                    return themeNaturalType;
                }

                public void setThemeNaturalType(String themeNaturalType) {
                    this.themeNaturalType = themeNaturalType;
                }

                public String getSceneReason() {
                    return sceneReason;
                }

                public void setSceneReason(String sceneReason) {
                    this.sceneReason = sceneReason;
                }

                public String getIsExpress() {
                    return isExpress;
                }

                public void setIsExpress(String isExpress) {
                    this.isExpress = isExpress;
                }

                public String getXzjdmc() {
                    return xzjdmc;
                }

                public void setXzjdmc(String xzjdmc) {
                    this.xzjdmc = xzjdmc;
                }

                public String getThemeLegalType() {
                    return themeLegalType;
                }

                public void setThemeLegalType(String themeLegalType) {
                    this.themeLegalType = themeLegalType;
                }

                public String getIsPayOnline() {
                    return isPayOnline;
                }

                public void setIsPayOnline(String isPayOnline) {
                    this.isPayOnline = isPayOnline;
                }
            }

            public static class AUDITITEMBean {
                /**
                 * dept_code : 11450721MB15580811
                 * partitionguid : 450700
                 * flow_chart : a37a3835-84f8-42b8-96b3-8a64b0403b8c,63ec218d-6822-4cd8-9eed-dde720356637
                 * td_tlimit :
                 * accept_std : 一、审查方式：机构评审。
                 设定依据：《固定资产投资项目节能审查办法》（国家发展和改革委员会令第44号）第八条  节能审查机关受理固定资产投资项目节能报告后，应委托有关机构进行评审，形成评审意见，作为节能审查的重要依据。
                 二、审查标准：
                 （一）格式、体例
                 1.项目摘要表数据完整、准确，与节能报告内容一致；
                 2.内容、深度、体例符合《固定资产投资项目节能审查办法》、《固定资产投资项目节能评估和审查工作指南》（2014年本）有关要求；
                 3.评估范围准确、合理；
                 4.评估依据准确、适用；
                 5.必要的附录、附件齐全、准确。
                 （二）建设方案、节能措施
                 1.项目建设方案的介绍和分析全面、专业，从节能角度进行分析评价，并提出合理评估意见和建议；
                 2.节能技术措施综述全面，阶段措施合理、有针对性，符合实操性原则，节能效果测算合理，节能管理机制健全。
                 （三）用能设备
                 1.主要用能设备的指标达到先进水平；
                 2.通用设备的能效要求达到先进水平；
                 3.项目未采用国家明令禁止和淘汰的落后设备。
                 （四）数据计算
                 1.基础数据有详细的基本参数支撑，基础数据、基本参数选择真实、合理，有明确的计算过程；
                 2.主要能效指标、工序能耗指标等计算过程清晰，结果准确；
                 3.主要耗能设备、通用设备的参数科学、合理，能效要求（水平）计算过程清晰；
                 4.综合能源消费量计算过程和结果正确，对所在地影响评价合理。
                 （五）能效水平
                 1.能效水平对标分析客观，对比数据真实、合理、可靠；
                 2.合理评价项目能效水平。
                 * login_url : http://qzls.zwfw.gxzf.gov.cn/
                 * accept_name : 根据《固定资产投资项目节能审查办法》第八条，节能审查机关受理固定资产投资项目节能报告后，应委托有关机构进行评审，形成评审意见，作为节能审查的重要依据。节能审查机关应依据项目是否符合节能有关法律法规、标准规范、政策；项目用能分析是否客观准确，方法是否科学，结论是否准确；节能措施是否合理可行；项目的能源消费量和能效水平是否满足本地区能源消耗总量和强度“双控”管理要求等对项目节能报告进行审查。
                 * other_supervise : 0777-6428880
                 * exercise_content : 对符合以下任一条件的固定资产投资项目进行节能审查：
                 1.国务院投资主管部门核报国务院审批、核准以及国务院投资主管部门审批、核准的固定资产投资项目；
                 2.高耗能高排放（简称“两高”）项目；
                 3.年综合能源消费量5000吨标准煤以上（含5000吨标准煤），或年电力消费量在2500万千瓦时以上（含2500万千瓦时）的固定资产投资项目；
                 4.年综合能源消费量1000吨至5000吨标准煤，或年电力消费量500万千瓦时至2500万千瓦时的固定资产投资项目中属于自治区投资主管部门核报本级人民政府审批或核准的项目，以及自治区投资主管部门审批、核准或备案的固定资产投资项目。
                 * link_way : 0777—6428820
                 * create_date : 1572244774000
                 * project_type : 2
                 * is_need_entry : 1
                 * task_code : 11450721MB155808114000104002000
                 * entrust_name :
                 * query_url : http://qzls.zwfw.gxzf.gov.cn/
                 * supervise_way : 0777—6428880
                 * catalog_id : 36c5fb30-33df-11e9-89bc-fa163ea9bf82
                 * anticipate_day_explain : 除可以当场作出行政许可决定的外，行政机关应当自受理行政许可申请之日起二十日内做出行政许可决定。二十日内不能做出决定的，经本行政机关负责人批准，可以延长十日，并应当将延长期限的理由告知申请人。但是，法律、法规另有规定的，依照其规定。
                 * publicity_url : http://wsbs.gxzf.gov.cn
                 * item_source : 1
                 * transact_app_url :
                 * promise_day_explain : 无
                 * ywcode :
                 * pre_dept_name : 无
                 * inspection_review : 3
                 * promise_type : 1
                 * task_name : 固定资产投资项目节能审查
                 * handle_publicity : 01
                 * pre_task_name : 无
                 * serve_type : 2,3,4,6
                 * use_level : 4
                 * areacode : 450721
                 * promise_day : 5
                 * rowguid : e7712954-2b2c-44d0-889c-c2ac692479b2
                 * anticipate_day : 20
                 * other_link : 0777-6428820
                 * authority_division : 根据《广西壮族自治区固定资产投资项目节能审查办法》第五条：
                 年综合能源消费量在1000吨标准煤（含1000吨标准煤；改扩建项目按照建成投产后年综合能源消费增量计算，电力折算系数按当量值，下同）以上，或年电力消费量500万千瓦时以上（含500万千瓦时）的固定资产投资项目，需要进行节能审查。
                 国务院投资主管部门核报国务院审批、核准以及国务院投资主管部门审批、核准的固定资产投资项目，高耗能高排放（简称“两高”）项目，年综合能源消费量5000吨标准煤以上（含5000吨标准煤），或年电力消费量在2500万千瓦时以上（含2500万千瓦时）的固定资产投资项目，其节能审查由自治区节能审查机关负责。
                 年综合能源消费量1000吨至5000吨标准煤，或年电力消费量500万千瓦时至2500万千瓦时的固定资产投资项目，其节能审查按照项目管理权限实行分级管理，即自治区、设区市、县（市、区）投资主管部门核报本级人民政府审批或核准的项目，以及自治区、设区市、县（市、区）投资主管部门审批、核准或备案的项目，其节能审查由本级节能审查机关负责。
                 * is_td : 0
                 * publishdate : 1572335054000
                 * publishstatus : 1
                 * dept_type : 1
                 * catalog_code : 000104002000
                 * task_version : 13
                 * is_fee : 0
                 * audit_state : 40
                 * is_mobile_entry : 0
                 * item_id : e35685d0-b67b-4375-b094-5d6a650992b1
                 * limit_scene_num : 1
                 * version_date : 1572244548000
                 * dept_name : 灵山县行政审批局
                 * task_state : 1
                 * reconsiderat : 公民、法人或者其他组织认为具体行政行为侵犯其合法权益的，可以自知道该具体行政行为之日起六十日内提出行政复议申请。
                 * td_conrection_way :
                 * anticipate_type : 1
                 * litigation : 1.公民、法人或者其他组织不服复议决定的，可以在收到复议决定书之日起十五日内向人民法院提起诉讼。复议机关逾期不作决定的，申请人可以在复议期满之日起十五日内向人民法院提起诉讼。2.公民、法人或者其他组织直接向人民法院提起诉讼的，应当自知道或者应当知道作出行政行为之日起六个月内提出。
                 * handle_type : 1,2
                 * progress_query_way : 02,04
                 * scene_reason :
                 * task_type : 01
                 */

                @JSONField(name = "dept_code")
                private String deptCode;
                @JSONField(name = "partitionguid")
                private String partitionguid;
                @JSONField(name = "flow_chart")
                private String flowChart;
                @JSONField(name = "td_tlimit")
                private String tdTlimit;
                @JSONField(name = "accept_std")
                private String acceptStd;
                @JSONField(name = "login_url")
                private String loginUrl;
                @JSONField(name = "accept_name")
                private String acceptName;
                @JSONField(name = "other_supervise")
                private String otherSupervise;
                @JSONField(name = "exercise_content")
                private String exerciseContent;
                @JSONField(name = "link_way")
                private String linkWay;
                @JSONField(name = "create_date")
                private long createDate;
                @JSONField(name = "project_type")
                private String projectType;
                @JSONField(name = "is_need_entry")
                private String isNeedEntry;
                @JSONField(name = "task_code")
                private String taskCode;
                @JSONField(name = "entrust_name")
                private String entrustName;
                @JSONField(name = "query_url")
                private String queryUrl;
                @JSONField(name = "supervise_way")
                private String superviseWay;
                @JSONField(name = "catalog_id")
                private String catalogId;
                @JSONField(name = "anticipate_day_explain")
                private String anticipateDayExplain;
                @JSONField(name = "publicity_url")
                private String publicityUrl;
                @JSONField(name = "item_source")
                private String itemSource;
                @JSONField(name = "transact_app_url")
                private String transactAppUrl;
                @JSONField(name = "promise_day_explain")
                private String promiseDayExplain;
                @JSONField(name = "ywcode")
                private String ywcode;
                @JSONField(name = "pre_dept_name")
                private String preDeptName;
                @JSONField(name = "inspection_review")
                private String inspectionReview;
                @JSONField(name = "promise_type")
                private String promiseType;
                @JSONField(name = "task_name")
                private String taskName;
                @JSONField(name = "handle_publicity")
                private String handlePublicity;
                @JSONField(name = "pre_task_name")
                private String preTaskName;
                @JSONField(name = "serve_type")
                private String serveType;
                @JSONField(name = "use_level")
                private String useLevel;
                @JSONField(name = "areacode")
                private String areacode;
                @JSONField(name = "promise_day")
                private String promiseDay;
                @JSONField(name = "rowguid")
                private String rowguid;
                @JSONField(name = "anticipate_day")
                private String anticipateDay;
                @JSONField(name = "other_link")
                private String otherLink;
                @JSONField(name = "authority_division")
                private String authorityDivision;
                @JSONField(name = "is_td")
                private String isTd;
                @JSONField(name = "publishdate")
                private long publishdate;
                @JSONField(name = "publishstatus")
                private String publishstatus;
                @JSONField(name = "dept_type")
                private String deptType;
                @JSONField(name = "catalog_code")
                private String catalogCode;
                @JSONField(name = "task_version")
                private String taskVersion;
                @JSONField(name = "is_fee")
                private String isFee;
                @JSONField(name = "audit_state")
                private String auditState;
                @JSONField(name = "is_mobile_entry")
                private String isMobileEntry;
                @JSONField(name = "item_id")
                private String itemId;
                @JSONField(name = "limit_scene_num")
                private String limitSceneNum;
                @JSONField(name = "version_date")
                private long versionDate;
                @JSONField(name = "dept_name")
                private String deptName;
                @JSONField(name = "task_state")
                private String taskState;
                @JSONField(name = "reconsiderat")
                private String reconsiderat;
                @JSONField(name = "td_conrection_way")
                private String tdConrectionWay;
                @JSONField(name = "anticipate_type")
                private String anticipateType;
                @JSONField(name = "litigation")
                private String litigation;
                @JSONField(name = "handle_type")
                private String handleType;
                @JSONField(name = "progress_query_way")
                private String progressQueryWay;
                @JSONField(name = "scene_reason")
                private String sceneReason;
                @JSONField(name = "task_type")
                private String taskType;

                public String getDeptCode() {
                    return deptCode;
                }

                public void setDeptCode(String deptCode) {
                    this.deptCode = deptCode;
                }

                public String getPartitionguid() {
                    return partitionguid;
                }

                public void setPartitionguid(String partitionguid) {
                    this.partitionguid = partitionguid;
                }

                public String getFlowChart() {
                    return flowChart;
                }

                public void setFlowChart(String flowChart) {
                    this.flowChart = flowChart;
                }

                public String getTdTlimit() {
                    return tdTlimit;
                }

                public void setTdTlimit(String tdTlimit) {
                    this.tdTlimit = tdTlimit;
                }

                public String getAcceptStd() {
                    return acceptStd;
                }

                public void setAcceptStd(String acceptStd) {
                    this.acceptStd = acceptStd;
                }

                public String getLoginUrl() {
                    return loginUrl;
                }

                public void setLoginUrl(String loginUrl) {
                    this.loginUrl = loginUrl;
                }

                public String getAcceptName() {
                    return acceptName;
                }

                public void setAcceptName(String acceptName) {
                    this.acceptName = acceptName;
                }

                public String getOtherSupervise() {
                    return otherSupervise;
                }

                public void setOtherSupervise(String otherSupervise) {
                    this.otherSupervise = otherSupervise;
                }

                public String getExerciseContent() {
                    return exerciseContent;
                }

                public void setExerciseContent(String exerciseContent) {
                    this.exerciseContent = exerciseContent;
                }

                public String getLinkWay() {
                    return linkWay;
                }

                public void setLinkWay(String linkWay) {
                    this.linkWay = linkWay;
                }

                public long getCreateDate() {
                    return createDate;
                }

                public void setCreateDate(long createDate) {
                    this.createDate = createDate;
                }

                public String getProjectType() {
                    return projectType;
                }

                public void setProjectType(String projectType) {
                    this.projectType = projectType;
                }

                public String getIsNeedEntry() {
                    return isNeedEntry;
                }

                public void setIsNeedEntry(String isNeedEntry) {
                    this.isNeedEntry = isNeedEntry;
                }

                public String getTaskCode() {
                    return taskCode;
                }

                public void setTaskCode(String taskCode) {
                    this.taskCode = taskCode;
                }

                public String getEntrustName() {
                    return entrustName;
                }

                public void setEntrustName(String entrustName) {
                    this.entrustName = entrustName;
                }

                public String getQueryUrl() {
                    return queryUrl;
                }

                public void setQueryUrl(String queryUrl) {
                    this.queryUrl = queryUrl;
                }

                public String getSuperviseWay() {
                    return superviseWay;
                }

                public void setSuperviseWay(String superviseWay) {
                    this.superviseWay = superviseWay;
                }

                public String getCatalogId() {
                    return catalogId;
                }

                public void setCatalogId(String catalogId) {
                    this.catalogId = catalogId;
                }

                public String getAnticipateDayExplain() {
                    return anticipateDayExplain;
                }

                public void setAnticipateDayExplain(String anticipateDayExplain) {
                    this.anticipateDayExplain = anticipateDayExplain;
                }

                public String getPublicityUrl() {
                    return publicityUrl;
                }

                public void setPublicityUrl(String publicityUrl) {
                    this.publicityUrl = publicityUrl;
                }

                public String getItemSource() {
                    return itemSource;
                }

                public void setItemSource(String itemSource) {
                    this.itemSource = itemSource;
                }

                public String getTransactAppUrl() {
                    return transactAppUrl;
                }

                public void setTransactAppUrl(String transactAppUrl) {
                    this.transactAppUrl = transactAppUrl;
                }

                public String getPromiseDayExplain() {
                    return promiseDayExplain;
                }

                public void setPromiseDayExplain(String promiseDayExplain) {
                    this.promiseDayExplain = promiseDayExplain;
                }

                public String getYwcode() {
                    return ywcode;
                }

                public void setYwcode(String ywcode) {
                    this.ywcode = ywcode;
                }

                public String getPreDeptName() {
                    return preDeptName;
                }

                public void setPreDeptName(String preDeptName) {
                    this.preDeptName = preDeptName;
                }

                public String getInspectionReview() {
                    return inspectionReview;
                }

                public void setInspectionReview(String inspectionReview) {
                    this.inspectionReview = inspectionReview;
                }

                public String getPromiseType() {
                    return promiseType;
                }

                public void setPromiseType(String promiseType) {
                    this.promiseType = promiseType;
                }

                public String getTaskName() {
                    return taskName;
                }

                public void setTaskName(String taskName) {
                    this.taskName = taskName;
                }

                public String getHandlePublicity() {
                    return handlePublicity;
                }

                public void setHandlePublicity(String handlePublicity) {
                    this.handlePublicity = handlePublicity;
                }

                public String getPreTaskName() {
                    return preTaskName;
                }

                public void setPreTaskName(String preTaskName) {
                    this.preTaskName = preTaskName;
                }

                public String getServeType() {
                    return serveType;
                }

                public void setServeType(String serveType) {
                    this.serveType = serveType;
                }

                public String getUseLevel() {
                    return useLevel;
                }

                public void setUseLevel(String useLevel) {
                    this.useLevel = useLevel;
                }

                public String getAreacode() {
                    return areacode;
                }

                public void setAreacode(String areacode) {
                    this.areacode = areacode;
                }

                public String getPromiseDay() {
                    return promiseDay;
                }

                public void setPromiseDay(String promiseDay) {
                    this.promiseDay = promiseDay;
                }

                public String getRowguid() {
                    return rowguid;
                }

                public void setRowguid(String rowguid) {
                    this.rowguid = rowguid;
                }

                public String getAnticipateDay() {
                    return anticipateDay;
                }

                public void setAnticipateDay(String anticipateDay) {
                    this.anticipateDay = anticipateDay;
                }

                public String getOtherLink() {
                    return otherLink;
                }

                public void setOtherLink(String otherLink) {
                    this.otherLink = otherLink;
                }

                public String getAuthorityDivision() {
                    return authorityDivision;
                }

                public void setAuthorityDivision(String authorityDivision) {
                    this.authorityDivision = authorityDivision;
                }

                public String getIsTd() {
                    return isTd;
                }

                public void setIsTd(String isTd) {
                    this.isTd = isTd;
                }

                public long getPublishdate() {
                    return publishdate;
                }

                public void setPublishdate(long publishdate) {
                    this.publishdate = publishdate;
                }

                public String getPublishstatus() {
                    return publishstatus;
                }

                public void setPublishstatus(String publishstatus) {
                    this.publishstatus = publishstatus;
                }

                public String getDeptType() {
                    return deptType;
                }

                public void setDeptType(String deptType) {
                    this.deptType = deptType;
                }

                public String getCatalogCode() {
                    return catalogCode;
                }

                public void setCatalogCode(String catalogCode) {
                    this.catalogCode = catalogCode;
                }

                public String getTaskVersion() {
                    return taskVersion;
                }

                public void setTaskVersion(String taskVersion) {
                    this.taskVersion = taskVersion;
                }

                public String getIsFee() {
                    return isFee;
                }

                public void setIsFee(String isFee) {
                    this.isFee = isFee;
                }

                public String getAuditState() {
                    return auditState;
                }

                public void setAuditState(String auditState) {
                    this.auditState = auditState;
                }

                public String getIsMobileEntry() {
                    return isMobileEntry;
                }

                public void setIsMobileEntry(String isMobileEntry) {
                    this.isMobileEntry = isMobileEntry;
                }

                public String getItemId() {
                    return itemId;
                }

                public void setItemId(String itemId) {
                    this.itemId = itemId;
                }

                public String getLimitSceneNum() {
                    return limitSceneNum;
                }

                public void setLimitSceneNum(String limitSceneNum) {
                    this.limitSceneNum = limitSceneNum;
                }

                public long getVersionDate() {
                    return versionDate;
                }

                public void setVersionDate(long versionDate) {
                    this.versionDate = versionDate;
                }

                public String getDeptName() {
                    return deptName;
                }

                public void setDeptName(String deptName) {
                    this.deptName = deptName;
                }

                public String getTaskState() {
                    return taskState;
                }

                public void setTaskState(String taskState) {
                    this.taskState = taskState;
                }

                public String getReconsiderat() {
                    return reconsiderat;
                }

                public void setReconsiderat(String reconsiderat) {
                    this.reconsiderat = reconsiderat;
                }

                public String getTdConrectionWay() {
                    return tdConrectionWay;
                }

                public void setTdConrectionWay(String tdConrectionWay) {
                    this.tdConrectionWay = tdConrectionWay;
                }

                public String getAnticipateType() {
                    return anticipateType;
                }

                public void setAnticipateType(String anticipateType) {
                    this.anticipateType = anticipateType;
                }

                public String getLitigation() {
                    return litigation;
                }

                public void setLitigation(String litigation) {
                    this.litigation = litigation;
                }

                public String getHandleType() {
                    return handleType;
                }

                public void setHandleType(String handleType) {
                    this.handleType = handleType;
                }

                public String getProgressQueryWay() {
                    return progressQueryWay;
                }

                public void setProgressQueryWay(String progressQueryWay) {
                    this.progressQueryWay = progressQueryWay;
                }

                public String getSceneReason() {
                    return sceneReason;
                }

                public void setSceneReason(String sceneReason) {
                    this.sceneReason = sceneReason;
                }

                public String getTaskType() {
                    return taskType;
                }

                public void setTaskType(String taskType) {
                    this.taskType = taskType;
                }
            }

            public static class AUDITITEMBYLAWBean {
                /**
                 * law_id : ee0b2a30-cc04-4956-9afe-211e82e0db12
                 * task_guid : e7712954-2b2c-44d0-889c-c2ac692479b2
                 * partitionguid : 450700
                 * cataloglawid : a83ae371-ef67-42aa-bad9-59572930fb41
                 * law_name : 《固定资产投资项目节能办法》
                 * year : 1572244774000
                 * law_number : (2016年国家发改委令第44号)
                 * clause_number : 第三条
                 * clause_content : 固定资产投资项目节能审查意见是项目开工建设、竣工验收和运营管理的重要依据。政府投资项目，建设单位在报送项目可行性研究报告前，需取得节能审查机关出具的节能审查意见。企业投资项目，建设单位需在开工建设前取得节能审查机关出具的节能审查意见。未按本办法规定进行节能审查，或节能审查未通过的项目，建设单位不得开工建设，已经建成的不得投入生产、使用。第五条 定资产投资项目节能审查由地方节能审查机关负责。
                 国家发展改革委核报国务院审批以及国家发展改革委审批的政府投资项目，建设单位在报送项目可行性研究报告前，需取得省级节能审查机关出具的节能审查意见。国家发展改革委核报国务院核准以及国家发展改革委核准的企业投资项目，建设单位需在开工建设前取得省级节能审查机关出具的节能审查意见。
                 年综合能源消费量5000 吨标准煤以上(改扩建项目按照建成投产后年综合能源消费增量计算，电力折算系数按当量值，下同)的固定资产投资项目，其节能审查由省级节能审查机关负责。其他固定资产投资项目，其节能审查管理权限由省级节能审查机关依据实际情况自行决定。第六条 年综合能源消费量不满1000 吨标准煤，且年电力消费量不满500 万千瓦时的固定资产投资项目，以及用能工艺简单、节能潜力小的行业(具体行业目录由国家发展改革委制定并公布)的固定资产投资项目应按照相关节能标准、规范建设，不再单独进行节能审查。《全国人大财政经济委员会办公室关于节能评估审查是否属于行政许可事项的复函》根据行政许可法，上述规定符合设定行政许可的要求和条件。在实际工作中，国家发改委为落实节能法的要求，将节能评估和审查作为项目审批、核准和开工建设的强制性前置条件，节能评估和审查制度与环境评估等一样，已成为固定资产投资项目审批核准制度的重点环节。
                 * rowguid : 773a1fa2-4429-46a7-b488-1dcc2c563eba
                 * operatedate : 1572244774000
                 */

                @JSONField(name = "law_id")
                private String lawId;
                @JSONField(name = "task_guid")
                private String taskGuid;
                @JSONField(name = "partitionguid")
                private String partitionguid;
                @JSONField(name = "cataloglawid")
                private String cataloglawid;
                @JSONField(name = "law_name")
                private String lawName;
                @JSONField(name = "year")
                private long year;
                @JSONField(name = "law_number")
                private String lawNumber;
                @JSONField(name = "clause_number")
                private String clauseNumber;
                @JSONField(name = "clause_content")
                private String clauseContent;
                @JSONField(name = "rowguid")
                private String rowguid;
                @JSONField(name = "operatedate")
                private long operatedate;

                public String getLawId() {
                    return lawId;
                }

                public void setLawId(String lawId) {
                    this.lawId = lawId;
                }

                public String getTaskGuid() {
                    return taskGuid;
                }

                public void setTaskGuid(String taskGuid) {
                    this.taskGuid = taskGuid;
                }

                public String getPartitionguid() {
                    return partitionguid;
                }

                public void setPartitionguid(String partitionguid) {
                    this.partitionguid = partitionguid;
                }

                public String getCataloglawid() {
                    return cataloglawid;
                }

                public void setCataloglawid(String cataloglawid) {
                    this.cataloglawid = cataloglawid;
                }

                public String getLawName() {
                    return lawName;
                }

                public void setLawName(String lawName) {
                    this.lawName = lawName;
                }

                public long getYear() {
                    return year;
                }

                public void setYear(long year) {
                    this.year = year;
                }

                public String getLawNumber() {
                    return lawNumber;
                }

                public void setLawNumber(String lawNumber) {
                    this.lawNumber = lawNumber;
                }

                public String getClauseNumber() {
                    return clauseNumber;
                }

                public void setClauseNumber(String clauseNumber) {
                    this.clauseNumber = clauseNumber;
                }

                public String getClauseContent() {
                    return clauseContent;
                }

                public void setClauseContent(String clauseContent) {
                    this.clauseContent = clauseContent;
                }

                public String getRowguid() {
                    return rowguid;
                }

                public void setRowguid(String rowguid) {
                    this.rowguid = rowguid;
                }

                public long getOperatedate() {
                    return operatedate;
                }

                public void setOperatedate(long operatedate) {
                    this.operatedate = operatedate;
                }
            }

            public static class AUDITITEMWINDOWBean {
                /**
                 * traffic_info : 可乘公交1路或101路到县政务服务中心站下车，沿着江南路往南过红绿灯再走50米左右。
                 * task_guid : e7712954-2b2c-44d0-889c-c2ac692479b2
                 * partitionguid : 450700
                 * transact_addr : 灵山县三海街道江南路5号县政务服务中心法人大厅工程建设项目综合窗口（县卫生监督所一楼）。
                 * window_name : 工程建设项目综合窗口
                 * window_tel : 0777-6428820
                 * year : 1572192000000
                 * map_url : https://j.map.baidu.com/ZZyIG
                 * rowguid : 2c807869-6fab-44f0-89ab-dbfd995398d3
                 * transact_time : 工作日：上午9:00-12:00、下午14：00-17:00
                 * operatedate : 1572244774000
                 * ordernumber : 0
                 * window_id : 6d92c3cf-fa0a-4466-9746-43bf155d7b3d
                 */

                @JSONField(name = "traffic_info")
                private String trafficInfo;
                @JSONField(name = "task_guid")
                private String taskGuid;
                @JSONField(name = "partitionguid")
                private String partitionguid;
                @JSONField(name = "transact_addr")
                private String transactAddr;
                @JSONField(name = "window_name")
                private String windowName;
                @JSONField(name = "window_tel")
                private String windowTel;
                @JSONField(name = "year")
                private long year;
                @JSONField(name = "map_url")
                private String mapUrl;
                @JSONField(name = "rowguid")
                private String rowguid;
                @JSONField(name = "transact_time")
                private String transactTime;
                @JSONField(name = "operatedate")
                private long operatedate;
                @JSONField(name = "ordernumber")
                private int ordernumber;
                @JSONField(name = "window_id")
                private String windowId;

                public String getTrafficInfo() {
                    return trafficInfo;
                }

                public void setTrafficInfo(String trafficInfo) {
                    this.trafficInfo = trafficInfo;
                }

                public String getTaskGuid() {
                    return taskGuid;
                }

                public void setTaskGuid(String taskGuid) {
                    this.taskGuid = taskGuid;
                }

                public String getPartitionguid() {
                    return partitionguid;
                }

                public void setPartitionguid(String partitionguid) {
                    this.partitionguid = partitionguid;
                }

                public String getTransactAddr() {
                    return transactAddr;
                }

                public void setTransactAddr(String transactAddr) {
                    this.transactAddr = transactAddr;
                }

                public String getWindowName() {
                    return windowName;
                }

                public void setWindowName(String windowName) {
                    this.windowName = windowName;
                }

                public String getWindowTel() {
                    return windowTel;
                }

                public void setWindowTel(String windowTel) {
                    this.windowTel = windowTel;
                }

                public long getYear() {
                    return year;
                }

                public void setYear(long year) {
                    this.year = year;
                }

                public String getMapUrl() {
                    return mapUrl;
                }

                public void setMapUrl(String mapUrl) {
                    this.mapUrl = mapUrl;
                }

                public String getRowguid() {
                    return rowguid;
                }

                public void setRowguid(String rowguid) {
                    this.rowguid = rowguid;
                }

                public String getTransactTime() {
                    return transactTime;
                }

                public void setTransactTime(String transactTime) {
                    this.transactTime = transactTime;
                }

                public long getOperatedate() {
                    return operatedate;
                }

                public void setOperatedate(long operatedate) {
                    this.operatedate = operatedate;
                }

                public int getOrdernumber() {
                    return ordernumber;
                }

                public void setOrdernumber(int ordernumber) {
                    this.ordernumber = ordernumber;
                }

                public String getWindowId() {
                    return windowId;
                }

                public void setWindowId(String windowId) {
                    this.windowId = windowId;
                }
            }

            public static class AUDITMATERIALBean {
                /**
                 * partitionguid : 450700
                 * task_guid : e7712954-2b2c-44d0-889c-c2ac692479b2
                 * is_generate_ecert : 0
                 * year : 1572192000000
                 * is_jzbm : 0
                 * operateusername : 周瑞秋
                 * td_tlimit : 0
                 * materialid : 7e677b6c-fe30-4a69-8724-bd828136d95f
                 * rowguid : 2f0c41ea-9057-4a33-8606-f5a39451285e
                 * operatedate : 1572244774000
                 * material_type : 1
                 * is_need : 1
                 * example_guid : a49ecc13-4677-4287-bc0b-c07a549a096b
                 * original_amount : 1
                 * jzbm_way :
                 * material_name : 申请书
                 * sign_ask : 个人签字或签章
                 * task_code : 11450721MB155808114000104002000
                 * material_form : 1
                 * page_num : 1
                 * source_type : 10
                 * by_law : 《广西壮族自治区固定资产投资项目节能审查办法》第八条
                 * ordernum : 1
                 * copy_amount : 1
                 * td_correctway :
                 * source_explain : 申请人自备
                 * page_format : A4
                 * accept_stand : 1.内容真实有效；2.符合国家相关法律法规。
                 * fill_explian : 材料内容应如实反映，不得出现弄虚作假情况
                 * form_guid : 5fba5b12-72de-46d0-9824-92bd6453209d
                 */

                @JSONField(name = "partitionguid")
                private String partitionguid;
                @JSONField(name = "task_guid")
                private String taskGuid;
                @JSONField(name = "is_generate_ecert")
                private String isGenerateEcert;
                @JSONField(name = "year")
                private long year;
                @JSONField(name = "is_jzbm")
                private String isJzbm;
                @JSONField(name = "operateusername")
                private String operateusername;
                @JSONField(name = "td_tlimit")
                private String tdTlimit;
                @JSONField(name = "materialid")
                private String materialid;
                @JSONField(name = "rowguid")
                private String rowguid;
                @JSONField(name = "operatedate")
                private long operatedate;
                @JSONField(name = "material_type")
                private String materialType;
                @JSONField(name = "is_need")
                private String isNeed;
                @JSONField(name = "example_guid")
                private String exampleGuid;
                @JSONField(name = "original_amount")
                private int originalAmount;
                @JSONField(name = "jzbm_way")
                private String jzbmWay;
                @JSONField(name = "material_name")
                private String materialName;
                @JSONField(name = "sign_ask")
                private String signAsk;
                @JSONField(name = "task_code")
                private String taskCode;
                @JSONField(name = "material_form")
                private String materialForm;
                @JSONField(name = "page_num")
                private int pageNum;
                @JSONField(name = "source_type")
                private String sourceType;
                @JSONField(name = "by_law")
                private String byLaw;
                @JSONField(name = "ordernum")
                private int ordernum;
                @JSONField(name = "copy_amount")
                private int copyAmount;
                @JSONField(name = "td_correctway")
                private String tdCorrectway;
                @JSONField(name = "source_explain")
                private String sourceExplain;
                @JSONField(name = "page_format")
                private String pageFormat;
                @JSONField(name = "accept_stand")
                private String acceptStand;
                @JSONField(name = "fill_explian")
                private String fillExplian;
                @JSONField(name = "form_guid")
                private String formGuid;

                public String getPartitionguid() {
                    return partitionguid;
                }

                public void setPartitionguid(String partitionguid) {
                    this.partitionguid = partitionguid;
                }

                public String getTaskGuid() {
                    return taskGuid;
                }

                public void setTaskGuid(String taskGuid) {
                    this.taskGuid = taskGuid;
                }

                public String getIsGenerateEcert() {
                    return isGenerateEcert;
                }

                public void setIsGenerateEcert(String isGenerateEcert) {
                    this.isGenerateEcert = isGenerateEcert;
                }

                public long getYear() {
                    return year;
                }

                public void setYear(long year) {
                    this.year = year;
                }

                public String getIsJzbm() {
                    return isJzbm;
                }

                public void setIsJzbm(String isJzbm) {
                    this.isJzbm = isJzbm;
                }

                public String getOperateusername() {
                    return operateusername;
                }

                public void setOperateusername(String operateusername) {
                    this.operateusername = operateusername;
                }

                public String getTdTlimit() {
                    return tdTlimit;
                }

                public void setTdTlimit(String tdTlimit) {
                    this.tdTlimit = tdTlimit;
                }

                public String getMaterialid() {
                    return materialid;
                }

                public void setMaterialid(String materialid) {
                    this.materialid = materialid;
                }

                public String getRowguid() {
                    return rowguid;
                }

                public void setRowguid(String rowguid) {
                    this.rowguid = rowguid;
                }

                public long getOperatedate() {
                    return operatedate;
                }

                public void setOperatedate(long operatedate) {
                    this.operatedate = operatedate;
                }

                public String getMaterialType() {
                    return materialType;
                }

                public void setMaterialType(String materialType) {
                    this.materialType = materialType;
                }

                public String getIsNeed() {
                    return isNeed;
                }

                public void setIsNeed(String isNeed) {
                    this.isNeed = isNeed;
                }

                public String getExampleGuid() {
                    return exampleGuid;
                }

                public void setExampleGuid(String exampleGuid) {
                    this.exampleGuid = exampleGuid;
                }

                public int getOriginalAmount() {
                    return originalAmount;
                }

                public void setOriginalAmount(int originalAmount) {
                    this.originalAmount = originalAmount;
                }

                public String getJzbmWay() {
                    return jzbmWay;
                }

                public void setJzbmWay(String jzbmWay) {
                    this.jzbmWay = jzbmWay;
                }

                public String getMaterialName() {
                    return materialName;
                }

                public void setMaterialName(String materialName) {
                    this.materialName = materialName;
                }

                public String getSignAsk() {
                    return signAsk;
                }

                public void setSignAsk(String signAsk) {
                    this.signAsk = signAsk;
                }

                public String getTaskCode() {
                    return taskCode;
                }

                public void setTaskCode(String taskCode) {
                    this.taskCode = taskCode;
                }

                public String getMaterialForm() {
                    return materialForm;
                }

                public void setMaterialForm(String materialForm) {
                    this.materialForm = materialForm;
                }

                public int getPageNum() {
                    return pageNum;
                }

                public void setPageNum(int pageNum) {
                    this.pageNum = pageNum;
                }

                public String getSourceType() {
                    return sourceType;
                }

                public void setSourceType(String sourceType) {
                    this.sourceType = sourceType;
                }

                public String getByLaw() {
                    return byLaw;
                }

                public void setByLaw(String byLaw) {
                    this.byLaw = byLaw;
                }

                public int getOrdernum() {
                    return ordernum;
                }

                public void setOrdernum(int ordernum) {
                    this.ordernum = ordernum;
                }

                public int getCopyAmount() {
                    return copyAmount;
                }

                public void setCopyAmount(int copyAmount) {
                    this.copyAmount = copyAmount;
                }

                public String getTdCorrectway() {
                    return tdCorrectway;
                }

                public void setTdCorrectway(String tdCorrectway) {
                    this.tdCorrectway = tdCorrectway;
                }

                public String getSourceExplain() {
                    return sourceExplain;
                }

                public void setSourceExplain(String sourceExplain) {
                    this.sourceExplain = sourceExplain;
                }

                public String getPageFormat() {
                    return pageFormat;
                }

                public void setPageFormat(String pageFormat) {
                    this.pageFormat = pageFormat;
                }

                public String getAcceptStand() {
                    return acceptStand;
                }

                public void setAcceptStand(String acceptStand) {
                    this.acceptStand = acceptStand;
                }

                public String getFillExplian() {
                    return fillExplian;
                }

                public void setFillExplian(String fillExplian) {
                    this.fillExplian = fillExplian;
                }

                public String getFormGuid() {
                    return formGuid;
                }

                public void setFormGuid(String formGuid) {
                    this.formGuid = formGuid;
                }
            }

            public static class AUDITQABean {
                /**
                 * task_guid : e7712954-2b2c-44d0-889c-c2ac692479b2
                 * partitionguid : 450700
                 * gscapproveproblem :     1. 是不是所有的固定资产投资项目都必须在可研前获得节能审查意见？
                 答：根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第三条规定，政府投资项目，建设单位在报送项目可行性研究报告前，需取得节能审查机关出具的节能审查意见。企业投资项目，建设单位需在开工建设前取得节能审查机关出具的节能审查意见。
                 2. 跨地区的固定资产投资项目的节能报告如何报送？
                 答：根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第八条规定，跨行政区域的固定资产投资项目，其节能报告可由项目所在地其中一方节能审查机关负责报送，同时抄送项目所在地其他方节能审查机关。
                 * gscapproveprojectcodeid : Gx-Gsc-App-388-336
                 * question : 是不是所有的固定资产投资项目都必须在可研前获得节能审查意见？
                 * year : 1572192000000
                 * task_code : 11450721MB155808114000104002000
                 * ordernum : 1
                 * rowguid : 15c5d3a2-5c38-4d5d-8ac2-336d1581aaec
                 * operatedate : 1572244774000
                 * missex : 无
                 * answer : 根据《广西壮族自治区固定资产投资项目节能审查办法》（桂发改环资〔2017〕635号）第三条规定，政府投资项目，建设单位在报送项目可行性研究报告前，需取得节能审查机关出具的节能审查意见。企业投资项目，建设单位需在开工建设前取得节能审查机关出具的节能审查意见。
                 * qaid : b84e90c2-4638-43d6-9d64-e1d2e9705060
                 */

                @JSONField(name = "task_guid")
                private String taskGuid;
                @JSONField(name = "partitionguid")
                private String partitionguid;
                @JSONField(name = "gscapproveproblem")
                private String gscapproveproblem;
                @JSONField(name = "gscapproveprojectcodeid")
                private String gscapproveprojectcodeid;
                @JSONField(name = "question")
                private String question;
                @JSONField(name = "year")
                private long year;
                @JSONField(name = "task_code")
                private String taskCode;
                @JSONField(name = "ordernum")
                private int ordernum;
                @JSONField(name = "rowguid")
                private String rowguid;
                @JSONField(name = "operatedate")
                private long operatedate;
                @JSONField(name = "missex")
                private String missex;
                @JSONField(name = "answer")
                private String answer;
                @JSONField(name = "qaid")
                private String qaid;

                public String getTaskGuid() {
                    return taskGuid;
                }

                public void setTaskGuid(String taskGuid) {
                    this.taskGuid = taskGuid;
                }

                public String getPartitionguid() {
                    return partitionguid;
                }

                public void setPartitionguid(String partitionguid) {
                    this.partitionguid = partitionguid;
                }

                public String getGscapproveproblem() {
                    return gscapproveproblem;
                }

                public void setGscapproveproblem(String gscapproveproblem) {
                    this.gscapproveproblem = gscapproveproblem;
                }

                public String getGscapproveprojectcodeid() {
                    return gscapproveprojectcodeid;
                }

                public void setGscapproveprojectcodeid(String gscapproveprojectcodeid) {
                    this.gscapproveprojectcodeid = gscapproveprojectcodeid;
                }

                public String getQuestion() {
                    return question;
                }

                public void setQuestion(String question) {
                    this.question = question;
                }

                public long getYear() {
                    return year;
                }

                public void setYear(long year) {
                    this.year = year;
                }

                public String getTaskCode() {
                    return taskCode;
                }

                public void setTaskCode(String taskCode) {
                    this.taskCode = taskCode;
                }

                public int getOrdernum() {
                    return ordernum;
                }

                public void setOrdernum(int ordernum) {
                    this.ordernum = ordernum;
                }

                public String getRowguid() {
                    return rowguid;
                }

                public void setRowguid(String rowguid) {
                    this.rowguid = rowguid;
                }

                public long getOperatedate() {
                    return operatedate;
                }

                public void setOperatedate(long operatedate) {
                    this.operatedate = operatedate;
                }

                public String getMissex() {
                    return missex;
                }

                public void setMissex(String missex) {
                    this.missex = missex;
                }

                public String getAnswer() {
                    return answer;
                }

                public void setAnswer(String answer) {
                    this.answer = answer;
                }

                public String getQaid() {
                    return qaid;
                }

                public void setQaid(String qaid) {
                    this.qaid = qaid;
                }
            }

            public static class AUDITITEMSPECIALBean {
                /**
                 * task_guid : e7712954-2b2c-44d0-889c-c2ac692479b2
                 * partitionguid : 450700
                 * special_id : c0d832bb-3591-4d46-bf2a-b859c3ab42c3
                 * year : 1572244774000
                 * special_name : 9
                 * special_date : 15
                 * rowguid : 25ea329b-6b8b-470c-99ae-b9f73eaf00e9
                 * special_desc : 机构评审：
                 《固定资产投资项目节能审查办法》（国家发展和改革委员会令第44号）第八条  节能审查机关受理固定资产投资项目节能报告后，应委托有关机构进行评审，形成评审意见，作为节能审查的重要依据。
                 * operatedate : 1572244774000
                 * special_date_type : 1
                 * special_tel : 0777—6428820
                 * special_dept : 灵山县行政审批局
                 * ordernumber : 1
                 */

                @JSONField(name = "task_guid")
                private String taskGuid;
                @JSONField(name = "partitionguid")
                private String partitionguid;
                @JSONField(name = "special_id")
                private String specialId;
                @JSONField(name = "year")
                private long year;
                @JSONField(name = "special_name")
                private String specialName;
                @JSONField(name = "special_date")
                private int specialDate;
                @JSONField(name = "rowguid")
                private String rowguid;
                @JSONField(name = "special_desc")
                private String specialDesc;
                @JSONField(name = "operatedate")
                private long operatedate;
                @JSONField(name = "special_date_type")
                private String specialDateType;
                @JSONField(name = "special_tel")
                private String specialTel;
                @JSONField(name = "special_dept")
                private String specialDept;
                @JSONField(name = "ordernumber")
                private int ordernumber;

                public String getTaskGuid() {
                    return taskGuid;
                }

                public void setTaskGuid(String taskGuid) {
                    this.taskGuid = taskGuid;
                }

                public String getPartitionguid() {
                    return partitionguid;
                }

                public void setPartitionguid(String partitionguid) {
                    this.partitionguid = partitionguid;
                }

                public String getSpecialId() {
                    return specialId;
                }

                public void setSpecialId(String specialId) {
                    this.specialId = specialId;
                }

                public long getYear() {
                    return year;
                }

                public void setYear(long year) {
                    this.year = year;
                }

                public String getSpecialName() {
                    return specialName;
                }

                public void setSpecialName(String specialName) {
                    this.specialName = specialName;
                }

                public int getSpecialDate() {
                    return specialDate;
                }

                public void setSpecialDate(int specialDate) {
                    this.specialDate = specialDate;
                }

                public String getRowguid() {
                    return rowguid;
                }

                public void setRowguid(String rowguid) {
                    this.rowguid = rowguid;
                }

                public String getSpecialDesc() {
                    return specialDesc;
                }

                public void setSpecialDesc(String specialDesc) {
                    this.specialDesc = specialDesc;
                }

                public long getOperatedate() {
                    return operatedate;
                }

                public void setOperatedate(long operatedate) {
                    this.operatedate = operatedate;
                }

                public String getSpecialDateType() {
                    return specialDateType;
                }

                public void setSpecialDateType(String specialDateType) {
                    this.specialDateType = specialDateType;
                }

                public String getSpecialTel() {
                    return specialTel;
                }

                public void setSpecialTel(String specialTel) {
                    this.specialTel = specialTel;
                }

                public String getSpecialDept() {
                    return specialDept;
                }

                public void setSpecialDept(String specialDept) {
                    this.specialDept = specialDept;
                }

                public int getOrdernumber() {
                    return ordernumber;
                }

                public void setOrdernumber(int ordernumber) {
                    this.ordernumber = ordernumber;
                }
            }
            public static class AUDITCHARGEBean{
                @JSONField(name = "rowguid")
                private String rowguid;
                @JSONField(name = "task_guid")
                private String taskGuid;
                @JSONField(name = "fee_name")
                private String feeName;
                @JSONField(name = "fee_stand")
                private String feeStand;
                @JSONField(name = "is_desc")
                private String isDesc;

                @JSONField(name = "desc_explain")
                private String descExplain;

                @JSONField(name = "remark")
                private String remark;

                @JSONField(name = "ordernum")
                private int ordernum;

                @JSONField(name = "task_code")
                private String taskCode;
                @JSONField(name = "partitionguid")
                private String partitionguid;
                @JSONField(name = "year")
                private long year;
                @JSONField(name = "chargeid")
                private String chargeid;
                @JSONField(name = "ywcode")
                private String ywcode;
                @JSONField(name = "charge_prop")
                private String chargeProp;
                @JSONField(name = "desc_condition")
                private String descCondition;

                public String getRowguid() {
                    return rowguid;
                }

                public void setRowguid(String rowguid) {
                    this.rowguid = rowguid;
                }

                public String getTaskGuid() {
                    return taskGuid;
                }

                public void setTaskGuid(String taskGuid) {
                    this.taskGuid = taskGuid;
                }

                public String getFeeName() {
                    return feeName;
                }

                public void setFeeName(String feeName) {
                    this.feeName = feeName;
                }

                public String getFeeStand() {
                    return feeStand;
                }

                public void setFeeStand(String feeStand) {
                    this.feeStand = feeStand;
                }

                public String getIsDesc() {
                    return isDesc;
                }

                public void setIsDesc(String isDesc) {
                    this.isDesc = isDesc;
                }

                public String getDescExplain() {
                    return descExplain;
                }

                public void setDescExplain(String descExplain) {
                    this.descExplain = descExplain;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public int getOrdernum() {
                    return ordernum;
                }

                public void setOrdernum(int ordernum) {
                    this.ordernum = ordernum;
                }

                public String getTaskCode() {
                    return taskCode;
                }

                public void setTaskCode(String taskCode) {
                    this.taskCode = taskCode;
                }

                public String getPartitionguid() {
                    return partitionguid;
                }

                public void setPartitionguid(String partitionguid) {
                    this.partitionguid = partitionguid;
                }

                public long getYear() {
                    return year;
                }

                public void setYear(long year) {
                    this.year = year;
                }

                public String getChargeid() {
                    return chargeid;
                }

                public void setChargeid(String chargeid) {
                    this.chargeid = chargeid;
                }

                public String getYwcode() {
                    return ywcode;
                }

                public void setYwcode(String ywcode) {
                    this.ywcode = ywcode;
                }

                public String getChargeProp() {
                    return chargeProp;
                }

                public void setChargeProp(String chargeProp) {
                    this.chargeProp = chargeProp;
                }

                public String getDescCondition() {
                    return descCondition;
                }

                public void setDescCondition(String descCondition) {
                    this.descCondition = descCondition;
                }
            }
        }
    }
}

package com.egg.core.activiti;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.egg.core.activiti.model.ModelVO;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Model;
import org.activiti.engine.repository.ModelQuery;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping(value = "/activiti")
public class AcController {

    @Autowired private RepositoryService repositoryService;


    /**
     * 获取模型列表
     * @param page 分页
     * @param model 模型
     * @return Page
     */
    @GetMapping("/page")
    @ResponseBody
    public Page modelPage(Page<Model> page, ModelVO model) {
        ModelQuery modelQuery = repositoryService.createModelQuery();
        if (StringUtils.isNotEmpty(model.getKey())) {
            modelQuery.modelKey(model.getKey());
        }
        if (StringUtils.isNotEmpty(model.getName())) {
            modelQuery.modelNameLike("%" + model.getName() + "%");
        }
        int size = (int) page.getSize();
        int current = (int) page.getCurrent();
        List<Model> list = modelQuery.listPage((current - 1) * size, size);
        int total = list.size();
        if (total == size || current != 1){
            total = (int) modelQuery.count();
        }
        page.setTotal(total);
        return page.setRecords(list);
    }

   /* *//**
     * 流程上传 (多机部署有问题，建议使用独立的文件服务器)
     * <p>
     * 需要一个拦截器，对上传的文件进行统一管理， 将文件保存之后返回一个文件路径或者文件id给被调用的方法
     *//*
    @PostMapping("/upload")
    @ResponseBody
    public R upload(@RequestParam("file") MultipartFile file) {
        try {
            repositoryService.createDeployment()
                    .addInputStream(file.getOriginalFilename(),
                            file.getInputStream())
                    .deploy();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return R.ok("导入成功");
    }*/
}

package com.btmf.business.service.master.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btmf.business.dao.master.DistrictDao;
import com.btmf.business.entity.master.DistrictEntity;
import com.btmf.business.service.master.DistrictService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service("districtService")
public class DistrictServiceImpl extends ServiceImpl<DistrictDao, DistrictEntity> implements DistrictService {


    @Override
    public List<DistrictEntity> withTree() {

        //        //1、查出所有分类
        List<DistrictEntity> entities = baseMapper.selectList(null);
        //
        //        //2、组装成父子的树形结构
        //
        //        //2.1）、找到所有的一级分类
        List<DistrictEntity> level1 = entities.stream().filter(DistrictEntity ->
            DistrictEntity.getPid() == 0
        ).map((menu) -> {
            menu.setChildren(getChildrens(menu, entities));
            return menu;
        }).collect(Collectors.toList());

        return level1;
    }


    //递归查找
    private List<DistrictEntity> getChildrens(DistrictEntity root,List<DistrictEntity> all){

        List<DistrictEntity> children = all.stream().filter(DistrictEntity -> {
            return DistrictEntity.getPid().equals(root.getId());
        }).map(DistrictEntity -> {
            //1、找到子
            DistrictEntity.setChildren(getChildrens(DistrictEntity,all));
            return DistrictEntity;
        }).collect(Collectors.toList());

        return children;
    }
}
package cn.juechuang.service.impl;

import cn.juechuang.mapper.CommodityMapper;
import cn.juechuang.model.Commodity;
import cn.juechuang.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    CommodityMapper commodityMapper;

    public int addCommodity(Commodity com) {
        List<Commodity> list = commodityMapper.findAll();
        if(list.size()!=0){
            Commodity oneCommodity = commodityMapper.findOneCommodity();
            com.setSid(oneCommodity.getSid()+1);
        }else {
            com.setSid("666");
        }
        int commodity = commodityMapper.addCommodity(com);
        return commodity;
    }

    public Commodity findOneCommodity() {
        Commodity oneCommodity = commodityMapper.findOneCommodity();
        return oneCommodity;
    }

    public int DeleteCommodity(int sid) {
        int commodity = commodityMapper.DeleteCommodity(sid);
        return commodity;
    }
    @Transactional(readOnly = true)
    public List<Commodity> findAll() {
        List<Commodity> list = commodityMapper.findAll();
        return list;
    }

    public Commodity findById(Integer id) {
        Commodity commodity = commodityMapper.findById(id);
        return commodity;
    }

    public int UpdateCommodity(Commodity com) {
        int commodity = commodityMapper.UpdateCommodity(com);
        return commodity;
    }
}

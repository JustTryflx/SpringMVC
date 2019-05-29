package cn.juechuang.mapper;

import cn.juechuang.model.Commodity;
import java.util.List;

public interface CommodityMapper {

    //增加商品
    int addCommodity(Commodity com);
    Commodity findOneCommodity();

    //删除商品
    int DeleteCommodity(int sid);

    //查出全部商品信息
    List<Commodity> findAll();

    //修改商品信息
    Commodity findById(Integer id);
    int UpdateCommodity(Commodity com);
}

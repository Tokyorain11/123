package generate;

import generate.StuTab;

public interface StuTabDao {
    int deleteByPrimaryKey(Integer id);

    int insert(StuTab record);

    int insertSelective(StuTab record);

    StuTab selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StuTab record);

    int updateByPrimaryKey(StuTab record);
}
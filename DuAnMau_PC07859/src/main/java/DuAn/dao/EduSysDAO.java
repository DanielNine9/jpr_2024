
package DuAn.dao;

/**
 *
 * @author dinhh
 */
import java.util.List;
/*
    Đây là DAO cha các DAO con sẽ thường hưởng, viết chồng lên và có thê thêm
*/
abstract public class EduSysDAO<EntityType, KeyType> {//generic
    abstract public void insert(EntityType entity);//EntityType: NhanVien, KhoaHoc...
    abstract public void update(EntityType entity);
    abstract public void delete(KeyType id, boolean want);//KeyType: String, Integer, Double...
    abstract public EntityType selectById(int id);
    abstract public List<EntityType> selectAll();
    abstract protected List<EntityType> selectBySql(String sql, Object...args);
}
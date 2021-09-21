import com.rem.entry.SC;
import com.rem.mapper.ScMapper;
import com.rem.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SqlSession session = MybatisUtils.openSession();
        ScMapper mapper = session.getMapper(ScMapper.class);
        List<SC> scs = mapper.querryAll();
        System.out.println("scs = " + scs);
        SC sc = mapper.selectByGrade(66);
        System.out.println("sc = " + sc);
        SC sc1 = new SC();
        sc1.setSno("A");
        sc1.setCno("123");
        sc1.setGrade(100);
        //int i = mapper.insertIntoSC(sc1);
        //System.out.println(i);
        session.commit();
        session.close();

    }
}

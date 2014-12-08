import com.lingjoin.summary.SummaryMethod;
import org.apache.log4j.Logger;
import org.junit.Test;

public class SummaryTest {
	private static Logger logger = Logger.getLogger(SummaryTest.class.getName());
	@Test
	/**
	 * 分词测试
	 */
    public void testSummary(){
		System.out.println(System.getProperty("user.dir"));
		SummaryMethod.Summary_init();
    	String sSrc=FileOperateUtils.getFileContent("test.txt");
        logger.debug("文本内容为："+sSrc);
    	String data= SummaryMethod.DS_SingleDoc(sSrc);
//    	FileOperateUtils.writeFile(data, "E:\\灵玖\\国防科技大学\\国防科大测试语料\\听out.txt");
    	logger.debug("摘要内容为："+data);
    }
}

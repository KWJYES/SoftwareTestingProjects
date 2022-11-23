import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PhoneNumTest {

    private PhoneNumJudge phoneNumJudge;

    @Before
    public void init() {
        phoneNumJudge = new PhoneNumJudge();
    }

    /**
     * 11位数字是手机号测试
     */
    @Test
    public void positiveTest() {
        Assert.assertEquals("中国电信",phoneNumJudge.judgePhoneNum("19167867643"));
        Assert.assertEquals("中国联通",phoneNumJudge.judgePhoneNum("13057186923"));
        Assert.assertEquals("中国移动",phoneNumJudge.judgePhoneNum("13457186923"));
    }


    /**
     * 非法输入测试
     */
    @Test
    public void nullInputTest(){
        Assert.assertEquals("输入不合法",phoneNumJudge.judgePhoneNum(""));
    }

    @Test
    public void lengthIllegalInputTest(){
        Assert.assertEquals("输入不合法",phoneNumJudge.judgePhoneNum("123"));

    }

    @Test
    public void notNumInputTest(){
        Assert.assertEquals("输入不合法",phoneNumJudge.judgePhoneNum("134*57935509"));
        Assert.assertEquals("输入不合法",phoneNumJudge.judgePhoneNum("191*579"));
    }
}

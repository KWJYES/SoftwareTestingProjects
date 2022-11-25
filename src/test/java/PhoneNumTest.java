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
     * 空输入测试
     */
    @Test
    public void nullInputTest(){
        Assert.assertEquals("输入不合法",phoneNumJudge.judgePhoneNum(""));
    }

    /**
     * 有非数字字符输入测试
     */
    @Test
    public void haveOtherCharsTest(){
        Assert.assertEquals("输入不合法",phoneNumJudge.judgePhoneNum("191****7925"));
    }

    /**
     * 长度小于11畋测试
     */
    @Test
    public void smallLengthInputTest(){
        Assert.assertEquals("输入不合法",phoneNumJudge.judgePhoneNum("191"));

    }

    /**
     * 长度大于11输入测试
     */
    @Test
    public void bigLengthInputTest(){
        Assert.assertEquals("输入不合法",phoneNumJudge.judgePhoneNum("191666688889"));
    }

    /**
     * 11位数字
     * 是手机号测试
     */
    @Test
    public void positiveInputTest() {
        Assert.assertEquals("是手机号",phoneNumJudge.judgePhoneNum("19166668888"));
    }

    /**
     * 11位数字
     * 但不是手机号测试
     */
    @Test
    public void negativeInputTest() {
        Assert.assertEquals("不是手机号",phoneNumJudge.judgePhoneNum("12366668888"));
    }
}

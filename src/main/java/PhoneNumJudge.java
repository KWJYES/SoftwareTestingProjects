import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumJudge {
    //存放三大运营商号码的前3位——网络识别号
    private final Map<String, String> networkIdNumMap;

    public PhoneNumJudge() {
        networkIdNumMap = new HashMap<>();
        //中国电信 133、149、153、173、177、180、181、189、191、199
        networkIdNumMap.put("133", "中国电信");
        networkIdNumMap.put("149", "中国电信");
        networkIdNumMap.put("153", "中国电信");
        networkIdNumMap.put("173", "中国电信");
        networkIdNumMap.put("177", "中国电信");
        networkIdNumMap.put("180", "中国电信");
        networkIdNumMap.put("181", "中国电信");
        networkIdNumMap.put("189", "中国电信");
        networkIdNumMap.put("191", "中国电信");
        networkIdNumMap.put("199", "中国电信");
        //中国联通 130、131、132、145、155、156、166、171、175、176、185、186
        networkIdNumMap.put("130", "中国联通");
        networkIdNumMap.put("131", "中国联通");
        networkIdNumMap.put("132", "中国联通");
        networkIdNumMap.put("145", "中国联通");
        networkIdNumMap.put("155", "中国联通");
        networkIdNumMap.put("156", "中国联通");
        networkIdNumMap.put("166", "中国联通");
        networkIdNumMap.put("171", "中国联通");
        networkIdNumMap.put("175", "中国联通");
        networkIdNumMap.put("176", "中国联通");
        networkIdNumMap.put("185", "中国联通");
        networkIdNumMap.put("186", "中国联通");
        //中国移动 134、135、136、137、138、139、147、150、151、152、157、158、159、182、183、187、188、178
        networkIdNumMap.put("134", "中国移动");
        networkIdNumMap.put("135", "中国移动");
        networkIdNumMap.put("136", "中国移动");
        networkIdNumMap.put("137", "中国移动");
        networkIdNumMap.put("138", "中国移动");
        networkIdNumMap.put("139", "中国移动");
        networkIdNumMap.put("147", "中国移动");
        networkIdNumMap.put("150", "中国移动");
        networkIdNumMap.put("151", "中国移动");
        networkIdNumMap.put("152", "中国移动");
        networkIdNumMap.put("157", "中国移动");
        networkIdNumMap.put("158", "中国移动");
        networkIdNumMap.put("159", "中国移动");
        networkIdNumMap.put("182", "中国移动");
        networkIdNumMap.put("183", "中国移动");
        networkIdNumMap.put("187", "中国移动");
        networkIdNumMap.put("188", "中国移动");
        networkIdNumMap.put("178", "中国移动");
    }

    /**
     * 输入一个11位数字的字符串，
     * 判断它是不是一个手机号码，
     * 如果是返回该手机号的所属的“运营商名称”
     * 如果不是返回“不是一个手机号”
     *
     * @param phoneNum 输入的字符串
     * @return 判断结果
     */
    public String judgePhoneNum(String phoneNum) {
        for (int i = 0; i < phoneNum.length(); i++) {
            if (phoneNum.charAt(i) < '0' || phoneNum.charAt(i) > '9')
                return "输入不合法";
        }
        if (phoneNum.length() == 11 && networkIdNumMap.containsKey(phoneNum.substring(0, 3))) {
            return networkIdNumMap.get(phoneNum.substring(0, 3));
        } else {
            return "不是一个手机号";
        }
    }

}

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumJudge {
    //存放三大运营商号码的前3位——网络识别号
    private final Map<String,String> networkIdNumMap;

    public PhoneNumJudge() {
        networkIdNumMap = new HashMap<>();
        //中国电信 133、149、153、173、177、180、181、189、191、199
        networkIdNumMap.put("133","中国电信");
        networkIdNumMap.put("149","中国电信");
        networkIdNumMap.put("153","中国电信");
        networkIdNumMap.put("173","中国电信");
        networkIdNumMap.put("177","中国电信");
        networkIdNumMap.put("180","中国电信");
        networkIdNumMap.put("181","中国电信");
        networkIdNumMap.put("189","中国电信");
        networkIdNumMap.put("191","中国电信");
        networkIdNumMap.put("199","中国电信");
        //中国联通 130、131、132、145、155、156、166、171、175、176、185、186
        networkIdNumMap.put("130","中国联通");
        networkIdNumMap.put("131","中国联通");
        networkIdNumMap.put("132","中国联通");
        networkIdNumMap.put("145","中国联通");
        networkIdNumMap.put("155","中国联通");
        networkIdNumMap.put("156","中国联通");
        networkIdNumMap.put("166","中国联通");
        networkIdNumMap.put("171","中国联通");
        networkIdNumMap.put("175","中国联通");
        networkIdNumMap.put("176","中国联通");
        networkIdNumMap.put("185","中国联通");
        networkIdNumMap.put("186","中国联通");
        //中国移动 134、135、136、137、138、139、147、150、151、152、157、158、159、182、183、187、188、178
        networkIdNumMap.put("134","中国移动");
        networkIdNumMap.put("135","中国移动");
        networkIdNumMap.put("136","中国移动");
        networkIdNumMap.put("137","中国移动");
        networkIdNumMap.put("138","中国移动");
        networkIdNumMap.put("139","中国移动");
        networkIdNumMap.put("147","中国移动");
        networkIdNumMap.put("150","中国移动");
        networkIdNumMap.put("151","中国移动");
        networkIdNumMap.put("152","中国移动");
        networkIdNumMap.put("157","中国移动");
        networkIdNumMap.put("158","中国移动");
        networkIdNumMap.put("159","中国移动");
        networkIdNumMap.put("182","中国移动");
        networkIdNumMap.put("183","中国移动");
        networkIdNumMap.put("187","中国移动");
        networkIdNumMap.put("188","中国移动");
        networkIdNumMap.put("178","中国移动");
    }

    public String judgePhoneNum(String phoneNum){
        if(!isNumeric(phoneNum))
            return "输入不合法";
        if(phoneNum.length()!=11)
            return "手机号不正确";
        if(networkIdNumMap.containsKey(phoneNum.substring(0,3))){
            return "手机号正确";
        }else {
            return "手机号不正确";
        }
    }

    /**
     * 利用正则表达式判断字符串是否是数字
     * @param str
     * @return
     */
    public boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        return isNum.matches();
    }

}

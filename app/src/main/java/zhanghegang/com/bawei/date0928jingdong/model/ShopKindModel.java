package zhanghegang.com.bawei.date0928jingdong.model;

import android.content.Context;

import java.util.Map;

import zhanghegang.com.bawei.date0928jingdong.api.ApiUrl;
import zhanghegang.com.bawei.date0928jingdong.utils.OkhttpCall;
import zhanghegang.com.bawei.date0928jingdong.utils.OkhttpMethod;
import zhanghegang.com.bawei.date0928jingdong.utils.OkhttpUtils;

/**
 * Created by asus on 2017/10/15.
 */

public class ShopKindModel {
    public void gainShopKind(Context context,String String, Map<String,Object> map, OkhttpCall okhttpCall){

            OkhttpUtils.getInstance(context).call(OkhttpMethod.POST, String, map, okhttpCall);

    }
}

package cn.duanchao.wechatmoments.viewmodel;

import android.content.Context;
import android.databinding.Bindable;
import android.widget.Toast;

import java.util.ArrayList;

import cn.duanchao.wechatmoments.BR;
import cn.duanchao.wechatmoments.base.BaseBean;
import cn.duanchao.wechatmoments.base.BaseModel;
import cn.duanchao.wechatmoments.base.BaseViewModel;
import cn.duanchao.wechatmoments.bean.TweetsBean;
import cn.duanchao.wechatmoments.model.WechatMomentsModel;

/**
 *
 */

public class WechatMomentsViewModel extends BaseViewModel {
    @Bindable
    public ArrayList<TweetsBean.DataBean> datas = new ArrayList<>();
    @Bindable
    public String content = "";


    public WechatMomentsViewModel(Context context, BaseModel baseModel) {
        super(context, baseModel);
    }


    public void getTweets() {
        ((WechatMomentsModel) baseModel).sendRequest("jsmith");
    }

    @Override
    public void onRequestSuccess(BaseBean data) {
        super.onRequestSuccess(data);
        if (data instanceof TweetsBean) {
            this.datas = ((TweetsBean) data).getData();
            this.content = ((TweetsBean) data).getData().get(0).getContent();
            Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
            notifyPropertyChanged(BR.content);
        }
    }
}

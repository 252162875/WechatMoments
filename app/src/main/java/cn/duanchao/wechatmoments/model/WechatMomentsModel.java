package cn.duanchao.wechatmoments.model;

import cn.duanchao.wechatmoments.base.BaseModel;
import cn.duanchao.wechatmoments.bean.TweetsBean;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 *
 */

public class WechatMomentsModel extends BaseModel {

    public void sendRequest(String requestData) {
        Subscription subscribe = thServer.getTweetsData(requestData).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<TweetsBean>() {
                    @Override
                    public void onStart() {
                        httpResultIml.onRequestStart();
                    }

                    @Override
                    public void onCompleted() {
                        httpResultIml.onRequestFinished();
                    }

                    @Override
                    public void onError(Throwable e) {
                        httpResultIml.onRequestError(e);
                    }

                    @Override
                    public void onNext(TweetsBean tweetsBean) {
                        httpResultIml.onRequestSuccess(tweetsBean);
                    }
                });
        addSubscription(subscribe);
    }
}

package xyz.fishstar.mypokemon.ui.send;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import xyz.fishstar.mypokemon.config.configHandler;

public class SendViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SendViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(configHandler.name.send);
        //todo:反馈功能。发送报错信息+联系方式。
    }

    public LiveData<String> getText() {
        return mText;
    }
}
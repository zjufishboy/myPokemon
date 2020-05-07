package xyz.fishstar.mypokemon.ui.share;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import xyz.fishstar.mypokemon.config.configHandler;

public class ShareViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(configHandler.name.share);
        //todo:分享功能。 截图分享/二维码/链接
    }

    public LiveData<String> getText() {
        return mText;
    }
}
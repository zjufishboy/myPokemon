package xyz.fishstar.mypokemon.ui.home;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import xyz.fishstar.mypokemon.R;
import xyz.fishstar.mypokemon.config.configHandler;


public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(configHandler.name.home);
        //todo:主页功能：导航到各个页面，显示一些即时数据，最喜欢的宝可梦（搜索最多次），每日随机推荐宝可梦
    }

    public LiveData<String> getText() {
        return mText;
    }
}
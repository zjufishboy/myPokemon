package xyz.fishstar.mypokemon.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import xyz.fishstar.mypokemon.config.configHandler;

public class NewsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NewsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(configHandler.name.news);
        //todo:新闻功能。活动新闻/赠送新闻/民间新闻
    }

    public LiveData<String> getText() {
        return mText;
    }
}

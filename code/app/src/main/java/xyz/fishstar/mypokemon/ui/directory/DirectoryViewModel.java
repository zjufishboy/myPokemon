package xyz.fishstar.mypokemon.ui.directory;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import xyz.fishstar.mypokemon.config.configHandler;

public class DirectoryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DirectoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(configHandler.name.directory);
        //todo:图鉴功能，查询宝可梦/筛选宝可梦/收藏宝可梦
    }

    public LiveData<String> getText() {
        return mText;
    }
}
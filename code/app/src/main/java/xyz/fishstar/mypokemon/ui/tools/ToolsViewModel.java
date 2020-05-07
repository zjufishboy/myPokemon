package xyz.fishstar.mypokemon.ui.tools;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import xyz.fishstar.mypokemon.config.configHandler;

public class ToolsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ToolsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(configHandler.name.tools);
        //todo:工具功能。对战模拟/数据模拟/队伍数据。
    }

    public LiveData<String> getText() {
        return mText;
    }
}
package notrace.notracelibs.adapter.adapters;

import android.support.annotation.UiThread;

import java.util.List;

/**
 * Created by notrace on 2016/3/1.
 */
public interface IAdapter {
    @UiThread
    void setItems(List items);
    @UiThread
    void addItem(Object item);
    @UiThread
    void delItem(Object item);
    @UiThread
    void addItems(List items);
    @UiThread
    void  clearItems();

}

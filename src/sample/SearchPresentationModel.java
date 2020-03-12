package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SearchPresentationModel
{
    private StringProperty searchText = new SimpleStringProperty("Hello, World!");


    public final StringProperty searchTextProperty()
    {
        return searchText;
    }

    public String getSearchText()
    {
        return searchText.get();
    }

    public void setSearchText(String text)
    {
        this.searchText.set(text);
    }

}

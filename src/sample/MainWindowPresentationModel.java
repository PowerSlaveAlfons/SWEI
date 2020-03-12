package sample;

public class MainWindowPresentationModel
{
    private SearchPresentationModel _search;

    public SearchPresentationModel getSearch()
    {
        if (_search == null)
            _search = new SearchPresentationModel();
        return _search;
    }
}

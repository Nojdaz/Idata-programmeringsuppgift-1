public abstract class BaseIdata implements IIdata {

    MainWork mw;
    String dep;

    @Override
    public MainWork getMainWork() {
        return mw;
    }

    @Override
    public String getDepartment() {
        return dep;
    }

    public enum MainWork{
        Paper, Digital
    }
}
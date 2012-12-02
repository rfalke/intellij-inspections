import javax.annotation.Nonnull;

public class Derived extends Base {
    @Override
    public String notFlagedInDerived(String notFlagged) {
        return "";
    }

    @Override
    public String shouldFlagInDerived(String shouldFlag) {
        return "";
    }

    @Override
    @Nonnull
    public String flaggedInBaseButDerivedAddsAnnotation(@Nonnull String flaggedInBase) {
        return "";
    }

}

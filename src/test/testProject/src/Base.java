import javax.annotation.Nonnull;

public class Base {

    public
    @Nonnull
    String notFlagedInDerived(@Nonnull String notFlagged) {
        return "";
    }

    public String shouldFlagInDerived(String shouldFlag) {
        return "";
    }

    public String flaggedInBaseButDerivedAddsAnnotation(String flaggedInBase) {
        return "";
    }
}

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.Object;
import java.lang.String;

public class Simple {

    public String shouldMarkReturn() {
        return "";
    }

    public
    @Nonnull
    String returnOk() {
        return "";
    }

    public void foo(@Nullable Object ok1, @Nonnull Object ok2, int ok3, Object... ok4) {
    }

    public void foo(Object shouldFlag1, String[] shouldFlag2) {
    }

    public String shouldFlagPublic(String shouldFlag) {
        return "";
    }

    protected String shouldFlagProtected(String shouldFlag) {
        return "";
    }

    String shouldFlagPackage(String shouldFlag) {
        return "";
    }

    private String shouldNotFlagPrivate(String shouldNotFlag) {
        return "";
    }

    public static class InnerClass {
        public String shouldFlag(String shouldFlag) {
            return "";
        }
    }
}

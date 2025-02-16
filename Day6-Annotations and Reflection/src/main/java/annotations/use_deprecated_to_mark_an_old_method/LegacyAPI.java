package annotations.use_deprecated_to_mark_an_old_method;

public class LegacyAPI {
    @Deprecated
    void oldFeature() {
        System.out.println("This is the old feature.");
    }

    void newFeature() {
        System.out.println("This is the new feature.");
    }
}

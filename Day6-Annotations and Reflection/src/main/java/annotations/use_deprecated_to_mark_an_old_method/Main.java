package annotations.use_deprecated_to_mark_an_old_method;

public class Main {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature();  // it shows a warning
        api.newFeature();
    }
}

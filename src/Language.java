import java.util.Scanner;

enum Language {
    PL,
    EN;

    public static String askUser() {
        Scanner scanner = new Scanner(System.in);
        String language = "";
        do {
            System.out.println("Podaj język (EN lub PL):");
            language = scanner.nextLine();
        } while (!isLangaugeCorrect(language));
        return language;
    }

    private static boolean isLangaugeCorrect(String languageShortcut) {
        Language[] availableLanguages = Language.values();
        for (Language language : availableLanguages) {
            if (language.name().equals(languageShortcut)) {
                return true;
            }
        }
        return false;
    }
}

import java.util.*;

public class I18NExemple {
    static public void main(String[] args) {
        String language;
        String country;
        Locale currentLocale;
        ResourceBundle messages;
        currentLocale = Locale.getDefault();
        messages = ResourceBundle.getBundle("messages/MessagesBundle", currentLocale);
        System.out.println("Current Locale: " + Locale.getDefault());
        System.out.println(messages.getString("greetings"));
        System.out.println(messages.getString("inquiry"));
        System.out.println(messages.getString("farewell"));
        language = new String("en");
        country = new String("US");
        currentLocale = new Locale(language, country);
//Locale.setDefault(new Locale(language, country));
        Locale.setDefault(currentLocale);
        messages = ResourceBundle.getBundle("messages/MessagesBundle", currentLocale);
        System.out.println("Current Locale: " + Locale.getDefault());
        System.out.println(messages.getString("greetings"));
        System.out.println(messages.getString("inquiry"));
        System.out.println(messages.getString("farewell"));
        System.out.println((Runtime.getRuntime().availableProcessors()));
    }
}

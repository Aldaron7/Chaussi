package chaussia.shared.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;

public class Messages
{
    private static final String         BUNDLE_NAME     = "chaussia.shared.test.messages";               //$NON-NLS-1$

    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(Messages.BUNDLE_NAME);

    private Messages()
    {
    }

    public static String getString(String key)
    {
        try
        {
            return Messages.RESOURCE_BUNDLE.getString(key);
        }
        catch (MissingResourceException e)
        {
            return '!' + key + '!';
        }
    }

    public static void put(String key, Object value) throws IOException
    {
        System.out.println("writing to properties" + value.getClass().getName());
        final File file = new File(Messages.BUNDLE_NAME + ".properties");
        final Path path = file.toPath();
        System.out.println(Files.exists(path));
        final OutputStream os = new FileOutputStream(file);
        final Properties properties = new Properties();
        properties.setProperty(key, value.getClass().getName());
        properties.store(os, "");
        os.flush();
        os.close();
    }
}

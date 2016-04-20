package jackpal.androidterm;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import jackpal.androidterm.R;
/**
 * Created by surge on 4/5/16.
 */



/**
 * This activity handles configuration changes itself. The list of configuration changes that are
 * supported is defined in its AndroidManifest definition. Each configuration change triggers a
 * call to {@link #onConfigurationChanged(Configuration)}, which is logged in the {@link
 * LoggingActivity}.
 *
 * @see com.android.multiwindowplayground.MainActivity#onStartCustomConfigurationActivity(View)
 */
public class MultisizeTerm extends Term {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.term_activity);

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        /*
        Note: The implementation in LoggingActivity logs the output o the new configuration.
        This callback is received whenever the configuration is updated, for example when the
        size of this Activity is changed.
         */
    }
}

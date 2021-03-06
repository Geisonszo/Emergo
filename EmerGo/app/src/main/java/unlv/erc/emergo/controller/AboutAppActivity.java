/*
 * Class: AboutApp (.java)
 *
 * Porpouse: This class contais the method related to the info view in the app.
 */


package unlv.erc.emergo.controller;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import unlv.erc.emergo.R;

public class AboutAppActivity extends Activity {

  @Override
  protected void onCreate(final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.about_app);

    setInformationAboutApp(showMessageApp());
  }

  /*
   * Set informations about app on TextView.
   * @param messageAboutApp
   *
   */

  private void setInformationAboutApp(String messageAboutApp) {

    assert messageAboutApp != null : "messageAboutApp";

    Log.d("Log of Information: ", "He entered the setInformationAboutApp.");
    TextView informationAboutApp = (TextView) findViewById(R.id.aboutApp);
    informationAboutApp.setText(messageAboutApp);
  }

  /*
   * Show message about app.
   *
   */

  private String showMessageApp() {

    Log.d("Log of Information: ","He entered the showMessage method.");

    //String which will be written the information about the app.
    final String messageApp = "\tEmerGo é um aplicativo que oferece a facilidade de "
            + "encontrar Unidades de Saúde mais próximas. Possui MODO EMERGÊNCIA, "
            + "que traça a rota para uma Unidade de Saúde mais próxima, "
            + "ligar para o SAMU, e envia uma mensagem pré definida com pedido de ajuda para "
            + "os contatos de emergência salvos!"
            + "\n\n\tTodas as funcionalidades em suas mãos, em apenas um aplicativo.";

    Log.e("Return of messageApp","" + messageApp);
    return messageApp;
  }
}

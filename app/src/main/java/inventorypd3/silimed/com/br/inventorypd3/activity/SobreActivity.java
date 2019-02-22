package inventorypd3.silimed.com.br.inventorypd3.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import inventorypd3.silimed.com.br.inventorypd3.R;
import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_sobre);

        String descricao = "Presente no mercado desde 1978, a SILIMED reúne toda sua tecnologia à modernidade e sofisticação de um mercado cada vez mais exigente, e tem por vocação servir a cirurgia plástica, no sentido de disponibilizar produtos de altíssima qualidade que possam satisfazer uma ampla gama de necessidades.\n" +
                "Os produtos da Silimed são fabricados com matéria-prima de primeira qualidade e tecnologia de ponta. Foi a primeira no mundo a identificar cada peça com um número de série individual, o que permite a rastreabilidade de seus produtos, proporcionando mais segurança a médicos e pacientes. Este sistema de rastreabilidade é capaz de armazenar as informações desde a produção até a implantação, proporcionando mais segurança a médicos e pacientes. Sendo assim, para assegurar o funcionamento do sistema, todas as vendas são realizadas de forma cuidadosa e com a validação dos dados. Para efetuar a compra, os médicos precisam informar seu CRM e os pacientes necessitam de prescrição médica com informações específicas e dos dados de um médico cadastrado.";
        View sobre = new AboutPage(this)
                .setImage(R.drawable.logo_silimed_horizontal)
                .setDescription(descricao)
                .addGroup("Fale conosco")
                .addEmail("sistemas@silimed.com.br", "Envie um e-mail")
                .addWebsite("https://silimed.com.br/", "Acesse nosso site")
                .addGroup("Acesse nossas redes sociais")
                .addFacebook("Silimed oficial", "Facebook")
                .addInstagram("silimed.oficial", "Instagram")
                .addYoutube("UCYLnpPSjU-N4WVhsaWMjRnw", "Youtube")
                //.addPlayStore("appinventor.ai_eng_rodrigo_martins_silva.Inventory_app4", "Google Play")
                .addPlayStore("br.com.silimed.inventorypd3", "Google Play")
                .create();

        setContentView(sobre);
    }
}

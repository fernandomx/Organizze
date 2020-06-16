package cursoandroid.example.com.organizze;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

import cursoandroid.example.com.organizze.activity.CadastroActivity;
import cursoandroid.example.com.organizze.activity.LoginActivity;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //Exibe os sliders
        ShowSlider();

    }

    protected void ShowSlider(){

        //Desativar botões
        setButtonBackVisible(false);
        setButtonNextVisible(true);

        //Chamada dos slides
        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_1)
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_2)
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_3)
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_4)
                //.canGoForward(false) // não permite avançar pra próximo slide
                .build());


        //tela de cadastro
        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_cadastro)
                .build());

    }


    public void bt_Entrar(View view){
        startActivity(new Intent(this, LoginActivity.class));


    }

    public void bt_Cadastrar(View view){
        startActivity(new Intent(this, CadastroActivity.class));

    }


}



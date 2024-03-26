package br.com.ademar.projeto_intent_aula_2503;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySecundaria extends AppCompatActivity {
    TextView nome, email, telefone;
    private Button voltarButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        nome = findViewById(R.id.nomeTextView);
        email = findViewById(R.id.emailTextView);
        telefone = findViewById(R.id.telefoneTextView);

        Intent intent = getIntent();
        String nomel = intent.getStringExtra("nome");
        String emaill = intent.getStringExtra("email");
        String telefonel = intent.getStringExtra("telefone");

        nome.setText("Nome: " + nomel);
        email.setText("Telefone: " + emaill);
        telefone.setText("Email: " + telefonel);

        voltarButton = findViewById(R.id.voltarButton);
        voltarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

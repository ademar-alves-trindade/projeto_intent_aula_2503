package br.com.ademar.projeto_intent_aula_2503;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nomeEditText, emailEditText, telefoneEditText;
    private Button enviarButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEditText = findViewById(R.id.nomeEditText);
        emailEditText = findViewById(R.id.emailEditText);
        telefoneEditText = findViewById(R.id.telefoneEditText);
        enviarButton = findViewById(R.id.enviarButton);

        enviarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivitySecundaria.class);
                intent.putExtra("nome", nomeEditText.getText().toString());
                intent.putExtra("email", emailEditText.getText().toString());
                intent.putExtra("telefone", telefoneEditText.getText().toString());
                startActivity(intent);
            }
        });
    }
}
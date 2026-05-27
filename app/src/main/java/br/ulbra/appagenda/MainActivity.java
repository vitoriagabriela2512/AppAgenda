package br.ulbra.appagenda;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edCpf;
    private EditText edNome;
    private EditText edTelefone;

    private Button btSalvar;
    private Button btVoltar;

    private PessoaDAO dao;
    private Pessoa pessoa = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNome = findViewById(R.id.edNome);
        edCpf = findViewById(R.id.edCpf);
        edTelefone = findViewById(R.id.edTelefone);

        btSalvar = findViewById(R.id.btSalvar);
        btVoltar = findViewById(R.id.btnVoltar);

        dao = new PessoaDAO(this);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // linha utilizada para atualizar update
        Intent it = getIntent();

        if (it.hasExtra("pessoa")) {

            pessoa = (Pessoa) it.getSerializableExtra("pessoa");

            edNome.setText(pessoa.getNome());
            edCpf.setText(pessoa.getCpf());
            edTelefone.setText(pessoa.getTelefone());
        }
    }

    public void salvar(View view) {

        if (pessoa == null) {

            Pessoa pessoa = new Pessoa();

            pessoa.setNome(edNome.getText().toString());
            pessoa.setCpf(edCpf.getText().toString());
            pessoa.setTelefone(edTelefone.getText().toString());

            long id = dao.inserir(pessoa);

            Toast.makeText(this,
                    "Pessoa inserida no ID de nº:" + id,
                    Toast.LENGTH_LONG).show();

        } else {

            pessoa.setNome(edNome.getText().toString());
            pessoa.setCpf(edCpf.getText().toString());
            pessoa.setTelefone(edTelefone.getText().toString());

            dao.atualizar(pessoa);

            Toast.makeText(this,
                    pessoa.getNome() + ", atualizado com sucesso !!!",
                    Toast.LENGTH_LONG).show();
        }
    }
}


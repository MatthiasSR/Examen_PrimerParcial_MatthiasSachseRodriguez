package mx.ipn.cecyt9.examen_primerparcial_matthiassachserodriguez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String Usuario = "Matthias";
    String Pasword = "Patos";

    EditText ETU = (EditText) findViewById(R.id.editText);
    EditText ETP = (EditText) findViewById(R.id.editText2);

    String UsrObtenido = ETU.getText().toString();
    String PaswordObtenida = ETP.getText().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsrObtenido=ETU.getText().toString();

        PaswordObtenida=ETP.getText().toString();
    }
    public void Validacion(View v)
    {

        if(Usuario.equals(UsrObtenido) && Pasword.equals(PaswordObtenida))
        {
            Toast toast1=
                    Toast.makeText(getApplicationContext(),
                            "Usuario Correcto",Toast.LENGTH_SHORT);
            toast1.show();
        }
        else
        {
            Toast toast2=
                    Toast.makeText(getApplicationContext(),
                            "Usuario Incorrecto",Toast.LENGTH_SHORT);

            toast2.show();
        }
    }
}

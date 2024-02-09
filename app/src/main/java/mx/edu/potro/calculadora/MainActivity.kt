package mx.edu.potro.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        operacion()

        val cero:Button = findViewById(R.id.btn_0)
        val uno:Button = findViewById(R.id.btn_1)
        val dos:Button = findViewById(R.id.btn_2)
        val tres:Button = findViewById(R.id.btn_3)
        val cuatro:Button = findViewById(R.id.btn_4)
        val cinco:Button = findViewById(R.id.btn_5)
        val seis:Button = findViewById(R.id.btn_6)
        val siete:Button = findViewById(R.id.btn_7)
        val ocho:Button = findViewById(R.id.btn_8)
        val nueve:Button = findViewById(R.id.btn_9)

        val limpiar :Button = findViewById(R.id.btn_limpiar)

        val numero:TextView = findViewById(R.id.txt_numero)
        val error:TextView = findViewById(R.id.txt_error)
        val resultado:TextView = findViewById(R.id.txt_resultado)

        cero.setOnClickListener {
            if (detonante == false) {
                    if (numeroActual == "0") {
                        numeroActual = "0"
                    } else {
                        numeroActual = numeroActual + "0"
                    }
                numero.setText(numeroActual)
            } else {
               if(operacionActual.isBlank()){
                   mensaje ="No se a seleccionado operacion"
                   error.text = mensaje

               }else{
                   detonante = false
                   numeroActual = "0"
                   numero.setText(numeroActual)
               }
            }
        }
        uno.setOnClickListener {
                if (detonante == false) {
                    if (numeroActual == "0") {
                        numeroActual = "1"
                    } else {
                        numeroActual = numeroActual + "1"
                    }
                numero.setText(numeroActual)
            } else {
                if(operacionActual.isBlank()){
                    mensaje ="No se a seleccionado operacion"
                    error.text = mensaje

                }else{
                    detonante = false
                    numeroActual = "1"
                    numero.setText(numeroActual)
                }
            }
        }

        dos.setOnClickListener {
            if (detonante == false) {
                    if (numeroActual == "0") {
                        numeroActual = "2"
                    } else {
                        numeroActual = numeroActual + "2"
                    }
                numero.setText(numeroActual)
            } else {
                if(operacionActual.isBlank()){
                    mensaje ="No se a seleccionado operacion"
                    error.text = mensaje

                }else{
                    detonante = false
                    numeroActual = "2"
                    numero.setText(numeroActual)
                }
            }
        }

        tres.setOnClickListener {
            if (detonante == false) {
                    if (numeroActual == "0") {
                        numeroActual = "3"
                    } else {
                        numeroActual = numeroActual + "3"
                    }
                numero.setText(numeroActual)
            } else {
                if(operacionActual.isBlank()){
                    mensaje ="No se a seleccionado operacion"
                    error.text = mensaje

                }else{
                    detonante = false
                    numeroActual = "3"
                    numero.setText(numeroActual)
                }
            }
        }

        cuatro.setOnClickListener {
            if (detonante == false) {
                    if (numeroActual == "0") {
                        numeroActual = "4"
                    } else {
                        numeroActual = numeroActual + "4"
                    }
                numero.setText(numeroActual)
            } else {
                if(operacionActual.isBlank()){
                    mensaje ="No se a seleccionado operacion"
                    error.text = mensaje

                }else{
                    detonante = false
                    numeroActual = "4"
                    numero.setText(numeroActual)
                }
            }
        }

        cinco.setOnClickListener {
            if (detonante == false) {
                    if (numeroActual == "0") {
                        numeroActual = "5"
                    } else {
                        numeroActual = numeroActual + "5"
                    }
                numero.setText(numeroActual)
            } else {
                if(operacionActual.isBlank()){
                    mensaje ="No se a seleccionado operacion"
                    error.text = mensaje

                }else{
                    detonante = false
                    numeroActual = "5"
                    numero.setText(numeroActual)
                }
            }
        }

        seis.setOnClickListener {
            if (detonante == false) {
                    if (numeroActual == "0") {
                        numeroActual = "6"
                    } else {
                        numeroActual = numeroActual + "6"
                    }
                numero.setText(numeroActual)
            } else {
                if(operacionActual.isBlank()){
                    mensaje ="No se a seleccionado operacion"
                    error.text = mensaje

                }else{
                    detonante = false
                    numeroActual = "6"
                    numero.setText(numeroActual)
                }
            }
        }

        siete.setOnClickListener {
            if (detonante == false) {
                    if (numeroActual == "0") {
                        numeroActual = "7"
                    } else {
                        numeroActual = numeroActual + "7"
                    }
                numero.setText(numeroActual)
            } else {
                if(operacionActual.isBlank()){
                    mensaje ="No se a seleccionado operacion"
                    error.text = mensaje

                }else{
                    detonante = false
                    numeroActual = "7"
                    numero.setText(numeroActual)
                }
            }
        }

        ocho.setOnClickListener {
            if (detonante == false) {

                    if (numeroActual == "0") {
                        numeroActual = "8"
                    } else {
                        numeroActual = numeroActual + "8"
                    }

                numero.setText(numeroActual)
            } else {
                if(operacionActual.isBlank()){
                    mensaje ="No se a seleccionado operacion"
                    error.text = mensaje

                }else{
                    detonante = false
                    numeroActual = "8"
                    numero.setText(numeroActual)
                }
            }
        }

        nueve.setOnClickListener {
            if (!detonante) {
                    if (numeroActual == "0") {
                        numeroActual = "9"
                    } else {
                        numeroActual += "9"
                    }
                numero.setText(numeroActual)
            } else {
                if (operacionActual.isBlank()) {
                    mensaje ="No se ha seleccionado operación"
                    error.text = mensaje
                } else {
                    detonante = false
                    numeroActual = "9"
                    numero.setText(numeroActual)
                }
            }
        }


        limpiar.setOnClickListener {
            numeroActual = "0"
            numero.setText(numeroActual)
            error.setText("")
            resultado.setText("0")
        }
    }
    var numeroActual = "" // Esta variable almacenará el número actual como una cadena
    var detonante = false

    var mensaje =""
    var operacionActual = ""

    fun operacion():Unit{
        val sumar:Button = findViewById(R.id.btn_suma)
        val restar:Button = findViewById(R.id.btn_resta)
        val multuplicar:Button = findViewById(R.id.btn_multiplicar)
        val dividir:Button = findViewById(R.id.btn_dividir)

        val igual:Button = findViewById(R.id.btn_igual)

        val numero:TextView = findViewById(R.id.txt_numero)
        val error:TextView = findViewById(R.id.txt_error)
        val resultado:TextView = findViewById(R.id.txt_resultado)

        var num1 :Int = 0
        var num2 :Int = 0

        sumar.setOnClickListener {
            try {
                if (operacionActual.isBlank()) {
                    resultado.text = numeroActual + "+"
                    operacionActual = "+"
                    num1 = numeroActual.toInt()
                    numero.setText("0")
                    numeroActual = "0"
                } else {
                    resultado.text = resultado.text.substring(0, resultado.text.length - 1) + "+"
                    operacionActual = "+"
                    num1 = numeroActual.toInt()
                    numero.setText("0")
                    numeroActual = "0"
                }
                error.text = ""
            } catch (e: NumberFormatException) {
                // Manejar la excepción si numeroActual no se puede convertir a un entero
                error.text = "Error: el número no es válido"
            }
        }

        restar.setOnClickListener {
            try {
                if (operacionActual.isBlank()) {
                    resultado.text = numeroActual + "-"
                    operacionActual = "-"
                    num1 = numeroActual.toInt()
                    numero.setText("0")
                    numeroActual = "0"
                } else {
                    resultado.text = resultado.text.substring(0, resultado.text.length - 1) + "-"
                    operacionActual = "-"
                    num1 = numeroActual.toInt()
                    numero.setText("0")
                    numeroActual = "0"
                }
                error.text = ""
            } catch (e: NumberFormatException) {
                // Manejar la excepción si numeroActual no se puede convertir a un entero
                error.text = "Error: el número no es válido"
            }
        }

        multuplicar.setOnClickListener {
            try {
                if (operacionActual.isBlank()) {
                    resultado.text = numeroActual + "*"
                    operacionActual = "*"
                    num1 = numeroActual.toInt()
                    numero.setText("0")
                    numeroActual = "0"
                } else {
                    resultado.text = resultado.text.substring(0, resultado.text.length - 1) + "*"
                    operacionActual = "*"
                    num1 = numeroActual.toInt()
                    numero.setText("0")
                    numeroActual = "0"
                }
                error.text = ""
            } catch (e: NumberFormatException) {
                // Manejar la excepción si numeroActual no se puede convertir a un entero
                error.text = "Error: el número no es válido"
            }
        }

        dividir.setOnClickListener {
            try {
                if (operacionActual.isBlank()) {
                    resultado.text = numeroActual + "/"
                    operacionActual = "/"
                    num1 = numeroActual.toInt()
                    numero.setText("0")
                    numeroActual = "0"
                } else {
                    resultado.text = resultado.text.substring(0, resultado.text.length - 1) + "/"
                    operacionActual = "/"
                    num1 = numeroActual.toInt()
                    numero.setText("0")
                    numeroActual = "0"
                }
                error.text = ""
            } catch (e: NumberFormatException) {
                // Manejar la excepción si numeroActual no se puede convertir a un entero
                error.text = "Error: el número no es válido"
            }
        }

        igual.setOnClickListener {
            if (operacionActual.isNotBlank() && numeroActual.isNotBlank()) {
                val num2 = numeroActual.toInt()
                var resultadoOperacion = 0

                when (operacionActual) {
                    "+" -> resultadoOperacion = num1 + num2
                    "-" -> resultadoOperacion = num1 - num2
                    "*" -> resultadoOperacion = num1 * num2
                    "/" -> {
                        // Manejar la división por cero
                        if (num2 != 0) {
                            resultadoOperacion = num1 / num2
                        } else {
                            // Si el segundo número es cero, mostrar un mensaje de error
                            error.text = "Error: división por cero"
                            return@setOnClickListener
                        }
                    }
                }

                // Mostrar el resultado en el TextView correspondiente
                resultado.setText(resultadoOperacion.toString())
                numero.text = "0"

                // Reiniciar las variables para la próxima operación
                numeroActual = resultadoOperacion.toString()
                operacionActual = ""
            } else {
                // Si no se ha seleccionado una operación o número, mostrar un mensaje de error
                error.text = "Error: falta operación o número"
            }
        }



    }
}
package br.com.fiap.interfacegrafica04

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var chkBigmac: CheckBox
    private lateinit var chkQuarteirao: CheckBox
    private lateinit var chkBigtasty: CheckBox
    private lateinit var chkMilkshake: CheckBox
    private lateinit var chkNuggets: CheckBox
    private lateinit var chkSundae: CheckBox
    private lateinit var chkTopSundae: CheckBox
    private lateinit var rdgFormaPagamento: RadioGroup


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chkBigmac = findViewById(R.id.chkBigmac)
        chkQuarteirao = findViewById(R.id.chkQuarteirao)
        chkBigtasty = findViewById(R.id.chkBigtasty)
        chkMilkshake = findViewById(R.id.chkMilkshake)
        chkNuggets = findViewById(R.id.chkNuggets)
        chkSundae = findViewById(R.id.chkSundae)
        chkTopSundae = findViewById(R.id.chkTopSundae)
        rdgFormaPagamento = findViewById(R.id.rdgFormaPagamento)

    }

    fun finalizarPedido(view: View) {
        var total = 0.00

        if (chkBigmac.isChecked){
            total += 10
        }
        if (chkQuarteirao.isChecked){
            total += 11
        }
        if (chkBigtasty.isChecked){
            total += 12
        }
        if (chkMilkshake.isChecked){
            total += 13
        }
        if (chkNuggets.isChecked){
            total += 14
        }
        if (chkSundae.isChecked){
            total += 15
        }
        if (chkTopSundae.isChecked){
            total += 16
        }

        val formaPagamento = rdgFormaPagamento.checkedRadioButtonId

        if (formaPagamento == -1){
            Toast.makeText(this, "Informe uma forma de pagamento!", Toast.LENGTH_SHORT).show()
            return

        }

        if (total > 0 && formaPagamento != R.id.rdbCredito ) {
            total *= 0.85
        }

        Toast.makeText(this, String.format("Total: %.2f", total), Toast.LENGTH_SHORT).show()

    }
}
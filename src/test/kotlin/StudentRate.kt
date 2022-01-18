package br.com.mb.alunonota.test

import model.Aluno
import model.Notas
import model.materia.Mtm
import model.materia.Pt
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StudentRate {

    @Test
    fun getMediaMTMAndLP() {

        val aluno = Aluno(
            Notas(
                mutableListOf(
                    Mtm(8.0,8.0,8.0,8.0),
                    Pt(7.0,7.0,7.0,7.0)
                )
            )
        )


        val mediaPt = aluno.getMedia("Pt")
        val mediaMtm = aluno.getMedia("Mtm")

        val passMTMAndLP = mediaMtm >= 6.0 && mediaPt >= 6.0

        assertEquals(true, passMTMAndLP)
    }
}
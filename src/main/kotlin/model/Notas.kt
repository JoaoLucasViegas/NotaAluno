package model

import model.materia.MateriaEscolar
import model.materia.NullMateria

class Notas(materias: MutableList<MateriaEscolar>): INotas {

    val materiasList: MutableList<MateriaEscolar> = materias

    override fun getMateria(materiaName: String): MateriaEscolar {
        val materia = materiasList.find { materia -> materia.name === materiaName }
        return materia ?: NullMateria()
    }
}

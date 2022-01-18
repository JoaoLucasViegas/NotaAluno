package model

import model.materia.MateriaEscolar

interface INotas {
    fun getMateria(materiaName: String): MateriaEscolar
}

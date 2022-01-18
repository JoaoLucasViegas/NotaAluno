package model

class Aluno(val materias: Notas): IAluno {

    override fun getMedia(materiaName: String): Double {
        val materia = materias.getMateria(materiaName)
        val mediaMateria = materia.getMedia()
        return mediaMateria
    }
}
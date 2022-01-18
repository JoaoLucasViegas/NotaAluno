package model.materia

class NullMateria: MateriaEscolar(
    "", mutableListOf(0.0, 0.0, 0.0, 0.0)
) {
    override fun getMedia(): Double {
        return 0.0
    }
}
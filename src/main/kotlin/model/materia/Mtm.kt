package model.materia

data class Mtm(
    val nota1: Double,
    val nota2: Double,
    val nota3: Double,
    val nota4: Double
): MateriaEscolar("Mtm", mutableListOf(nota1, nota2, nota3, nota4)) {

    override fun getMedia(): Double {
        val somaMedia = nota1 + nota2 + nota3 + nota4
        val media = somaMedia / 4
        return media
    }
}

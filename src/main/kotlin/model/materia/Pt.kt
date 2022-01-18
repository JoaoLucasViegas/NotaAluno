package model.materia

data class Pt(
    val nota1: Double,
    val nota2: Double,
    val nota3: Double,
    val nota4: Double
): MateriaEscolar("Pt", notas = mutableListOf(nota1, nota2, nota3, nota4)) {
    override fun getMedia(): Double {
        val somaNotas = nota1 + nota2 + nota3 + nota4
        val media = somaNotas / 4
        return media
    }
}

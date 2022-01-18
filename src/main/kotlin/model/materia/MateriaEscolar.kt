package model.materia

abstract class MateriaEscolar(
    val name: String,
    val notas: MutableList<Double>
): IMateria

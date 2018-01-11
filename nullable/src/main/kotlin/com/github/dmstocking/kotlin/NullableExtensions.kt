
package com.github.dmstocking.kotlin

fun <T> T?.ifPresent(action: (T) -> Unit) {
    if (this != null) {
        action.invoke(this)
    }
}

fun <T> T?.ifPresentOrElse(action: (T) -> Unit, emptyAction: () -> Unit) {
    if (this != null) {
        action.invoke(this)
    } else {
        emptyAction.invoke()
    }
}

fun <T> T?.or(other: () -> T?): T? {
    return this ?: other.invoke()
}

fun <T> T?.orElse(default: T): T {
    return this ?: default
}

fun <T> T?.orElse(factory: () -> T): T {
    return this ?: factory.invoke()
}

fun <T1, T2, R> zipNullable(o1: T1?, o2: T2?, zipFunction: (T1, T2) -> R?): R? {
    return zipNullableArray(listOf(o1, o2)) {
        return@zipNullableArray zipFunction.invoke(it[0] as T1, it[1] as T2)
    }
}

fun <T1, T2, T3, R> zipNullable(o1: T1?, o2: T2?, o3: T3?, zipFunction: (T1, T2, T3) -> R?): R? {
    return zipNullableArray(listOf(o1, o2, o3)) {
        return@zipNullableArray zipFunction.invoke(it[0] as T1, it[1] as T2, it[2] as T3)
    }
}


fun <T1, T2, T3, T4, R> zipNullable(o1: T1?, o2: T2?, o3: T3?, o4: T4?, zipFunction: (T1, T2, T3, T4) -> R?): R? {
    return zipNullableArray(listOf(o1, o2, o3, o4)) {
        return@zipNullableArray zipFunction.invoke(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4)
    }
}


fun <T1, T2, T3, T4, T5, R>
        zipNullable(o1: T1?, o2: T2?, o3: T3?, o4: T4?, o5: T5?,
            zipFunction: (T1, T2, T3, T4, T5) -> R?): R? {
    return zipNullableArray(listOf(o1, o2, o3, o4, o5)) {
        return@zipNullableArray zipFunction.invoke(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5)
    }
}

fun <T1, T2, T3, T4, T5, T6, R>
        zipNullable(o1: T1?, o2: T2?, o3: T3?, o4: T4?, o5: T5?, o6: T6?,
            zipFunction: (T1, T2, T3, T4, T5, T6) -> R?): R? {
    return zipNullableArray(listOf(o1, o2, o3, o4, o5, o6)) {
        return@zipNullableArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4,
                it[4] as T5,
                it[5] as T6)
    }
}


fun <T1, T2, T3, T4, T5, T6, T7, R>
        zipNullable(o1: T1?, o2: T2?, o3: T3?, o4: T4?, o5: T5?, o6: T6?, o7: T7?,
            zipFunction: (T1, T2, T3, T4, T5, T6, T7) -> R?): R? {
    return zipNullableArray(listOf(o1, o2, o3, o4, o5, o6, o7)) {
        return@zipNullableArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4,
                it[4] as T5,
                it[5] as T6,
                it[6] as T7)
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, R>
        zipNullable(o1: T1?, o2: T2?, o3: T3?, o4: T4?, o5: T5?, o6: T6?, o7: T7?, o8: T8?,
            zipFunction: (T1, T2, T3, T4, T5, T6, T7, T8) -> R?): R? {
    return zipNullableArray(listOf(o1, o2, o3, o4, o5, o6, o7, o8)) {
        return@zipNullableArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4,
                it[4] as T5,
                it[5] as T6,
                it[6] as T7,
                it[7] as T8)
    }
}


fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R>
        zipNullable(o1: T1?, o2: T2?, o3: T3?, o4: T4?, o5: T5?, o6: T6?, o7: T7?, o8: T8?, o9: T9?,
            zipFunction: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R?): R? {
    return zipNullableArray(listOf(o1, o2, o3, o4, o5, o6, o7, o8)) {
        return@zipNullableArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4,
                it[4] as T5,
                it[5] as T6,
                it[6] as T7,
                it[7] as T8,
                it[8] as T9)
    }
}

fun <T1, T2, R> T1?.zipNullableWith(o2: T2?, zipFunction: (T1, T2) -> R?): R? {
    return zipNullableArray(listOf(this, o2)) {
        return@zipNullableArray zipFunction.invoke(it[0] as T1, it[1] as T2)
    }
}

fun <T1, T2, T3, R> T1?.zipNullableWith(o2: T2?, o3: T3?, zipFunction: (T1, T2, T3) -> R?): R? {
    return zipNullableArray(listOf(this, o2, o3)) {
        return@zipNullableArray zipFunction.invoke(it[0] as T1, it[1] as T2, it[2] as T3)
    }
}


fun <T1, T2, T3, T4, R> T1?.zipNullableWith(o2: T2?, o3: T3?, o4: T4?, zipFunction: (T1, T2, T3, T4) -> R?): R? {
    return zipNullableArray(listOf(this, o2, o3, o4)) {
        return@zipNullableArray zipFunction.invoke(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4)
    }
}


fun <T1, T2, T3, T4, T5, R>
        T1?.zipNullableWith(o2: T2?, o3: T3?, o4: T4?, o5: T5?,
            zipFunction: (T1, T2, T3, T4, T5) -> R?): R? {
    return zipNullableArray(listOf(this, o2, o3, o4, o5)) {
        return@zipNullableArray zipFunction.invoke(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5)
    }
}

fun <T1, T2, T3, T4, T5, T6, R>
        T1?.zipNullableWith(o2: T2?, o3: T3?, o4: T4?, o5: T5?, o6: T6?,
            zipFunction: (T1, T2, T3, T4, T5, T6) -> R?): R? {
    return zipNullableArray(listOf(this, o2, o3, o4, o5, o6)) {
        return@zipNullableArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4,
                it[4] as T5,
                it[5] as T6)
    }
}


fun <T1, T2, T3, T4, T5, T6, T7, R>
        T1?.zipNullableWith(o2: T2?, o3: T3?, o4: T4?, o5: T5?, o6: T6?, o7: T7?,
            zipFunction: (T1, T2, T3, T4, T5, T6, T7) -> R?): R? {
    return zipNullableArray(listOf(this, o2, o3, o4, o5, o6, o7)) {
        return@zipNullableArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4,
                it[4] as T5,
                it[5] as T6,
                it[6] as T7)
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, R>
        T1?.zipNullableWith(o2: T2?, o3: T3?, o4: T4?, o5: T5?, o6: T6?, o7: T7?, o8: T8?,
            zipFunction: (T1, T2, T3, T4, T5, T6, T7, T8) -> R?): R? {
    return zipNullableArray(listOf(this, o2, o3, o4, o5, o6, o7, o8)) {
        return@zipNullableArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4,
                it[4] as T5,
                it[5] as T6,
                it[6] as T7,
                it[7] as T8)
    }
}


fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R>
        T1?.zipNullableWith(o2: T2?, o3: T3?, o4: T4?, o5: T5?, o6: T6?, o7: T7?, o8: T8?, o9: T9?,
            zipFunction: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R?): R? {
    return zipNullableArray(listOf(this, o2, o3, o4, o5, o6, o7, o8, o9)) {
        return@zipNullableArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4,
                it[4] as T5,
                it[5] as T6,
                it[6] as T7,
                it[7] as T8,
                it[8] as T9)
    }
}

fun <R> zipNullableArray(objects: List<Any?>, zipFunction: (List<Any>) -> R?): R? {
    val notNulls = objects.filterNotNull()
    if (notNulls.size == objects.size) {
        return zipFunction.invoke(notNulls)
    }

    return null
}

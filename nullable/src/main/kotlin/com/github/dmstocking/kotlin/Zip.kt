package com.github.dmstocking.kotlin

fun <T1, T2, R> zip(o1: Iterable<T1>,
                    o2: Iterable<T2>,
                    zipFunction: (T1, T2) -> R): List<R> {
    return zipArray(listOf(o1, o2)) {
        @Suppress("UNCHECKED_CAST")
        return@zipArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2)
    }
}

fun <T1, T2, T3, R> zip(o1: Iterable<T1>,
                        o2: Iterable<T2>,
                        o3: Iterable<T3>,
                        zipFunction: (T1, T2, T3) -> R): List<R> {
    return zipArray(listOf(o1, o2, o3)) {
        @Suppress("UNCHECKED_CAST")
        return@zipArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3)
    }
}


fun <T1, T2, T3, T4, R> zip(o1: Iterable<T1>,
                            o2: Iterable<T2>,
                            o3: Iterable<T3>,
                            o4: Iterable<T4>,
                            zipFunction: (T1, T2, T3, T4) -> R): List<R> {
    return zipArray(listOf(o1, o2, o3, o4)) {
        @Suppress("UNCHECKED_CAST")
        return@zipArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4)
    }
}


fun <T1, T2, T3, T4, T5, R> zip(o1: Iterable<T1>,
                                o2: Iterable<T2>,
                                o3: Iterable<T3>,
                                o4: Iterable<T4>,
                                o5: Iterable<T5>,
                                zipFunction: (T1, T2, T3, T4, T5) -> R): List<R> {
    return zipArray(listOf(o1, o2, o3, o4, o5)) {
        @Suppress("UNCHECKED_CAST")
        return@zipArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4,
                it[4] as T5)
    }
}

fun <T1, T2, T3, T4, T5, T6, R> zip(o1: Iterable<T1>,
                                    o2: Iterable<T2>,
                                    o3: Iterable<T3>,
                                    o4: Iterable<T4>,
                                    o5: Iterable<T5>,
                                    o6: Iterable<T6>,
                                    zipFunction: (T1, T2, T3, T4, T5, T6) -> R): List<R> {
    return zipArray(listOf(o1, o2, o3, o4, o5, o6)) {
        @Suppress("UNCHECKED_CAST")
        return@zipArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4,
                it[4] as T5,
                it[5] as T6)
    }
}


fun <T1, T2, T3, T4, T5, T6, T7, R> zip(o1: Iterable<T1>,
                                        o2: Iterable<T2>,
                                        o3: Iterable<T3>,
                                        o4: Iterable<T4>,
                                        o5: Iterable<T5>,
                                        o6: Iterable<T6>,
                                        o7: Iterable<T7>,
                                        zipFunction: (T1, T2, T3, T4, T5, T6, T7) -> R): List<R> {
    return zipArray(listOf(o1, o2, o3, o4, o5, o6, o7)) {
        @Suppress("UNCHECKED_CAST")
        return@zipArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4,
                it[4] as T5,
                it[5] as T6,
                it[6] as T7)
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, R> zip(o1: Iterable<T1>,
                                            o2: Iterable<T2>,
                                            o3: Iterable<T3>,
                                            o4: Iterable<T4>,
                                            o5: Iterable<T5>,
                                            o6: Iterable<T6>,
                                            o7: Iterable<T7>,
                                            o8: Iterable<T8>,
                                            zipFunction: (T1, T2, T3, T4, T5, T6, T7, T8) -> R): List<R> {
    return zipArray(listOf(o1, o2, o3, o4, o5, o6, o7, o8)) {
        @Suppress("UNCHECKED_CAST")
        return@zipArray zipFunction.invoke(
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


fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> zip(o1: Iterable<T1>,
                                                o2: Iterable<T2>,
                                                o3: Iterable<T3>,
                                                o4: Iterable<T4>,
                                                o5: Iterable<T5>,
                                                o6: Iterable<T6>,
                                                o7: Iterable<T7>,
                                                o8: Iterable<T8>,
                                                o9: Iterable<T9>,
                                                zipFunction: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R): List<R> {
    return zipArray(listOf(o1, o2, o3, o4, o5, o6, o7, o8, o9)) {
        @Suppress("UNCHECKED_CAST")
        return@zipArray zipFunction.invoke(
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

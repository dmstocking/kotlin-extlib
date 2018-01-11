package com.github.dmstocking.kotlin

sealed class Maybe<T> {
    abstract fun <R> map(transform: (T) -> R): Maybe<R>
    abstract fun <R> flatMap(transform: (T) -> Maybe<R>): Maybe<R>
    abstract fun filter(filter: (T) -> Boolean): Maybe<T>
    abstract fun or(factory: () -> Maybe<T>): Maybe<T>
    abstract fun orElse(value: T): T
    abstract fun orElse(factory: () -> T): T
    abstract fun toList(): List<T>
}

fun <T> just(value: T): Maybe<T> {
    return Just(value)
}

data class Just<T>
internal constructor(private val value: T) : Maybe<T>() {

    fun get(): T {
        return value
    }

    override fun <R> map(transform: (T) -> R): Maybe<R> {
        return just(transform.invoke(value))
    }

    override fun <R> flatMap(transform: (T) -> Maybe<R>): Maybe<R> {
        return transform.invoke(value)
    }

    override fun filter(filter: (T) -> Boolean): Maybe<T> {
        return if (filter.invoke(value)) {
            this
        } else {
            nothing()
        }
    }

    override fun or(factory: () -> Maybe<T>): Maybe<T> {
        return this
    }

    override fun orElse(value: T): T {
        return get()
    }

    override fun orElse(factory: () -> T): T {
        return get()
    }

    override fun toList(): List<T> {
        return listOf(value)
    }
}

private val nothing = Nothing<Any>()

fun <T> nothing(): Maybe<T> {
    @Suppress("UNCHECKED_CAST")
    return nothing as Nothing<T>
}

class Nothing<T>
internal constructor(): Maybe<T>() {

    override fun <R> map(transform: (T) -> R): Maybe<R> {
        return nothing()
    }

    override fun <R> flatMap(transform: (T) -> Maybe<R>): Maybe<R> {
        return nothing()
    }

    override fun filter(filter: (T) -> Boolean): Maybe<T> {
        return nothing()
    }

    override fun or(factory: () -> Maybe<T>): Maybe<T> {
        return factory.invoke()
    }

    override fun orElse(value: T): T {
        return value
    }

    override fun orElse(factory: () -> T): T {
        return factory.invoke()
    }

    override fun toList(): List<T> {
        return listOf()
    }
}

fun <T1, T2> mlet(o1: Maybe<T1>,
                  o2: Maybe<T2>,
                  mletFunction: (T1, T2) -> Unit) {
    return mletArray(listOf(o1, o2)) {
        @Suppress("UNCHECKED_CAST")
        return@mletArray mletFunction.invoke(
                it[0] as T1,
                it[1] as T2)
    }
}

fun <T1, T2, T3> mlet(o1: Maybe<T1>,
                      o2: Maybe<T2>,
                      o3: Maybe<T3>,
                      mletFunction: (T1, T2, T3) -> Unit) {
    return mletArray(listOf(o1, o2, o3)) {
        @Suppress("UNCHECKED_CAST")
        return@mletArray mletFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3)
    }
}


fun <T1, T2, T3, T4> mlet(o1: Maybe<T1>,
                          o2: Maybe<T2>,
                          o3: Maybe<T3>,
                          o4: Maybe<T4>,
                          mletFunction: (T1, T2, T3, T4) -> Unit) {
    return mletArray(listOf(o1, o2, o3, o4)) {
        @Suppress("UNCHECKED_CAST")
        return@mletArray mletFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4)
    }
}


fun <T1, T2, T3, T4, T5> mlet(o1: Maybe<T1>,
                              o2: Maybe<T2>,
                              o3: Maybe<T3>,
                              o4: Maybe<T4>,
                              o5: Maybe<T5>,
                              mletFunction: (T1, T2, T3, T4, T5) -> Unit) {
    return mletArray(listOf(o1, o2, o3, o4, o5)) {
        @Suppress("UNCHECKED_CAST")
        return@mletArray mletFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4,
                it[4] as T5)
    }
}

fun <T1, T2, T3, T4, T5, T6> mlet(o1: Maybe<T1>,
                                  o2: Maybe<T2>,
                                  o3: Maybe<T3>,
                                  o4: Maybe<T4>,
                                  o5: Maybe<T5>,
                                  o6: Maybe<T6>,
                                  mletFunction: (T1, T2, T3, T4, T5, T6) -> Unit) {
    return mletArray(listOf(o1, o2, o3, o4, o5, o6)) {
        @Suppress("UNCHECKED_CAST")
        return@mletArray mletFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4,
                it[4] as T5,
                it[5] as T6)
    }
}


fun <T1, T2, T3, T4, T5, T6, T7> mlet(o1: Maybe<T1>,
                                      o2: Maybe<T2>,
                                      o3: Maybe<T3>,
                                      o4: Maybe<T4>,
                                      o5: Maybe<T5>,
                                      o6: Maybe<T6>,
                                      o7: Maybe<T7>,
                                      mletFunction: (T1, T2, T3, T4, T5, T6, T7) -> Unit) {
    return mletArray(listOf(o1, o2, o3, o4, o5, o6, o7)) {
        @Suppress("UNCHECKED_CAST")
        return@mletArray mletFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4,
                it[4] as T5,
                it[5] as T6,
                it[6] as T7)
    }
}

fun <T1, T2, T3, T4, T5, T6, T7, T8> mlet(o1: Maybe<T1>,
                                          o2: Maybe<T2>,
                                          o3: Maybe<T3>,
                                          o4: Maybe<T4>,
                                          o5: Maybe<T5>,
                                          o6: Maybe<T6>,
                                          o7: Maybe<T7>,
                                          o8: Maybe<T8>,
                                          mletFunction: (T1, T2, T3, T4, T5, T6, T7, T8) -> Unit) {
    return mletArray(listOf(o1, o2, o3, o4, o5, o6, o7, o8)) {
        @Suppress("UNCHECKED_CAST")
        return@mletArray mletFunction.invoke(
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


fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> mlet(o1: Maybe<T1>,
                                              o2: Maybe<T2>,
                                              o3: Maybe<T3>,
                                              o4: Maybe<T4>,
                                              o5: Maybe<T5>,
                                              o6: Maybe<T6>,
                                              o7: Maybe<T7>,
                                              o8: Maybe<T8>,
                                              o9: Maybe<T9>,
                                              mletFunction: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> Unit) {
    return mletArray(listOf(o1, o2, o3, o4, o5, o6, o7, o8, o9)) {
        @Suppress("UNCHECKED_CAST")
        return@mletArray mletFunction.invoke(
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

@Suppress("UNCHECKED_CAST")
internal fun mletArray(objects: List<Maybe<out Any?>>, mletFunction: (List<Any?>) -> Unit) {
    val allJust = objects.all { it is Just }
    objects.takeIf { allJust }
            ?.map { (it as Just<Any?>).get() }
            ?.let(mletFunction)
}

fun <T1, T2, R> zip(o1: Maybe<T1>,
                    o2: Maybe<T2>,
                    zipFunction: (T1, T2) -> R): Maybe<R> {
    return zipArray(listOf(o1, o2)) {
        @Suppress("UNCHECKED_CAST")
        return@zipArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2)
    }
}

fun <T1, T2, T3, R> zip(o1: Maybe<T1>,
                        o2: Maybe<T2>,
                        o3: Maybe<T3>,
                        zipFunction: (T1, T2, T3) -> R): Maybe<R> {
    return zipArray(listOf(o1, o2, o3)) {
        @Suppress("UNCHECKED_CAST")
        return@zipArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3)
    }
}


fun <T1, T2, T3, T4, R> zip(o1: Maybe<T1>,
                            o2: Maybe<T2>,
                            o3: Maybe<T3>,
                            o4: Maybe<T4>,
                            zipFunction: (T1, T2, T3, T4) -> R): Maybe<R> {
    return zipArray(listOf(o1, o2, o3, o4)) {
        @Suppress("UNCHECKED_CAST")
        return@zipArray zipFunction.invoke(
                it[0] as T1,
                it[1] as T2,
                it[2] as T3,
                it[3] as T4)
    }
}


fun <T1, T2, T3, T4, T5, R> zip(o1: Maybe<T1>,
                                o2: Maybe<T2>,
                                o3: Maybe<T3>,
                                o4: Maybe<T4>,
                                o5: Maybe<T5>,
                                zipFunction: (T1, T2, T3, T4, T5) -> R): Maybe<R> {
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

fun <T1, T2, T3, T4, T5, T6, R> zip(o1: Maybe<T1>,
                                    o2: Maybe<T2>,
                                    o3: Maybe<T3>,
                                    o4: Maybe<T4>,
                                    o5: Maybe<T5>,
                                    o6: Maybe<T6>,
                                    zipFunction: (T1, T2, T3, T4, T5, T6) -> R): Maybe<R> {
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


fun <T1, T2, T3, T4, T5, T6, T7, R> zip(o1: Maybe<T1>,
                                        o2: Maybe<T2>,
                                        o3: Maybe<T3>,
                                        o4: Maybe<T4>,
                                        o5: Maybe<T5>,
                                        o6: Maybe<T6>,
                                        o7: Maybe<T7>,
                                        zipFunction: (T1, T2, T3, T4, T5, T6, T7) -> R): Maybe<R> {
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

fun <T1, T2, T3, T4, T5, T6, T7, T8, R> zip(o1: Maybe<T1>,
                                            o2: Maybe<T2>,
                                            o3: Maybe<T3>,
                                            o4: Maybe<T4>,
                                            o5: Maybe<T5>,
                                            o6: Maybe<T6>,
                                            o7: Maybe<T7>,
                                            o8: Maybe<T8>,
                                            zipFunction: (T1, T2, T3, T4, T5, T6, T7, T8) -> R): Maybe<R> {
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


fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> zip(o1: Maybe<T1>,
                                                o2: Maybe<T2>,
                                                o3: Maybe<T3>,
                                                o4: Maybe<T4>,
                                                o5: Maybe<T5>,
                                                o6: Maybe<T6>,
                                                o7: Maybe<T7>,
                                                o8: Maybe<T8>,
                                                o9: Maybe<T9>,
                                                zipFunction: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R): Maybe<R> {
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

@Suppress("UNCHECKED_CAST")
internal fun <R> zipArray(objects: List<Maybe<out Any?>>, zipFunction: (List<Any?>) -> R?): Maybe<R> {
    val allJust = objects.all { it is Just }
    return objects.takeIf { allJust }
            ?.map { (it as Just<Any?>).get() }
            ?.let(zipFunction)
            ?.let { just(it) }
            ?: nothing()
}

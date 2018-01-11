package com.github.dmstocking.kotlin

internal fun <R> zipArray(objects: List<Iterable<Any?>>, zipFunction: (List<Any?>) -> R): List<R> {
    val minSize: Int = objects.map { it.collectionSizeOrDefault(10) }.min() ?: 10
    val results = ArrayList<R>(minSize)
    val iterators = objects.map { it.iterator() }
    while (iterators.all { it.hasNext() }) {
        iterators.map { it.next() }
                .toList()
                .let { zipFunction.invoke(it) }
                .also { results.add(it) }
    }

    return results
}

// Shamelessly copied from the std lib
internal fun <T> Iterable<T>.collectionSizeOrDefault(default: Int): Int = if (this is Collection<*>) this.size else default

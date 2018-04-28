package assertions

fun <T> T?.isNull(): T? {
  if (this == null) {
    return this
  } else {
    throw AssertionError("Expected $this to be null")
  }
}

fun <T> T?.isNotNull(): T {
  if (this == null) {
    throw AssertionError("Expected $this not to be null")
  } else {
    return this
  }
}
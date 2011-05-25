val res = myObject match {
  case i: Int if i == 1 => "Found an int"
  case s: String => "Found a String"
  case other => "Unknown " + other
}
